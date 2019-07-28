package typings.yandexDashMoneyDashSdk

import typings.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object yandexDashMoneyDashSdkMod {
  type ResponseCallback[TBody] = js.Function3[/* err */ js.Any, /* body */ TBody, /* response */ IncomingMessage, js.Any]
}
