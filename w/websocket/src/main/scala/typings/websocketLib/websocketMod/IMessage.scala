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

object IMessage {
  @scala.inline
  def apply(`type`: java.lang.String, binaryData: nodeLib.Buffer = null, utf8Data: java.lang.String = null): IMessage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (binaryData != null) __obj.updateDynamic("binaryData")(binaryData)
    if (utf8Data != null) __obj.updateDynamic("utf8Data")(utf8Data)
    __obj.asInstanceOf[IMessage]
  }
}

