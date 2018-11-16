package typings
package yandexDashMoneyDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object yandexDashMoneyDashSdkMod {
  type ResponseCallback[TBody] = js.Function3[
    /* err */ js.Any, 
    /* body */ TBody, 
    /* response */ nodeLib.httpMod.IncomingMessage, 
    js.Any
  ]
}
