package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaKeyMessageEventInit extends EventInit {
  var message: js.UndefOr[stdLib.ArrayBuffer | scala.Null] = js.undefined
  var messageType: js.UndefOr[MediaKeyMessageType] = js.undefined
}

object MediaKeyMessageEventInit {
  @scala.inline
  def apply(
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    composed: js.UndefOr[scala.Boolean] = js.undefined,
    message: stdLib.ArrayBuffer = null,
    messageType: MediaKeyMessageType = null
  ): MediaKeyMessageEventInit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles)
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable)
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed)
    if (message != null) __obj.updateDynamic("message")(message)
    if (messageType != null) __obj.updateDynamic("messageType")(messageType)
    __obj.asInstanceOf[MediaKeyMessageEventInit]
  }
}

