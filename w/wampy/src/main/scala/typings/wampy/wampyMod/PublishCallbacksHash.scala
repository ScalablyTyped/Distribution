package typings.wampy.wampyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublishCallbacksHash extends js.Object {
  var onError: js.UndefOr[ErrorCallback] = js.undefined
  var onSuccess: js.UndefOr[Callback] = js.undefined
}

object PublishCallbacksHash {
  @scala.inline
  def apply(onError: /* args */ ErrorArgs => Unit = null, onSuccess: () => Unit = null): PublishCallbacksHash = {
    val __obj = js.Dynamic.literal()
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(js.Any.fromFunction0(onSuccess))
    __obj.asInstanceOf[PublishCallbacksHash]
  }
}

