package typings.wampy.mod

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
  def apply(
    onError: /* args */ ErrorArgs => Unit = null,
    onEvent: /* args */ DataArgs => Unit = null,
    onSuccess: () => Unit = null
  ): SubscribeCallbacksHash = {
    val __obj = js.Dynamic.literal()
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onEvent != null) __obj.updateDynamic("onEvent")(js.Any.fromFunction1(onEvent))
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(js.Any.fromFunction0(onSuccess))
    __obj.asInstanceOf[SubscribeCallbacksHash]
  }
}

