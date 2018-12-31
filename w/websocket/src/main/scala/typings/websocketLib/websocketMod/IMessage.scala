package typings
package websocketLib.websocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMessage extends js.Object {
  var binaryData: js.UndefOr[nodeLib.Buffer] = js.undefined
  var `type`: java.lang.String
  var utf8Data: js.UndefOr[java.lang.String] = js.undefined
}

