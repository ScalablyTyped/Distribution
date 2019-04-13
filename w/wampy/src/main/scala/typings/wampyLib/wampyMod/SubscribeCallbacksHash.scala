package typings
package wampyLib.wampyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscribeCallbacksHash extends js.Object {
  var onError: js.UndefOr[ErrorCallback] = js.undefined
  var onEvent: js.UndefOr[EventCallback] = js.undefined
  var onSuccess: js.UndefOr[Callback] = js.undefined
}

object SubscribeCallbacksHash {
  @scala.inline
  def apply(onError: ErrorCallback = null, onEvent: EventCallback = null, onSuccess: Callback = null): SubscribeCallbacksHash = {
    val __obj = js.Dynamic.literal()
    if (onError != null) __obj.updateDynamic("onError")(onError)
    if (onEvent != null) __obj.updateDynamic("onEvent")(onEvent)
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(onSuccess)
    __obj.asInstanceOf[SubscribeCallbacksHash]
  }
}

