package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessagePortEventMap extends js.Object {
  var message: MessageEvent
  var messageerror: MessageEvent
}

object MessagePortEventMap {
  @scala.inline
  def apply(message: MessageEvent, messageerror: MessageEvent): MessagePortEventMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("messageerror")(messageerror)
    __obj.asInstanceOf[MessagePortEventMap]
  }
}

