package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BroadcastChannelEventMap extends js.Object {
  var message: MessageEvent
  var messageerror: MessageEvent
}

object BroadcastChannelEventMap {
  @scala.inline
  def apply(message: MessageEvent, messageerror: MessageEvent): BroadcastChannelEventMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("messageerror")(messageerror)
    __obj.asInstanceOf[BroadcastChannelEventMap]
  }
}

