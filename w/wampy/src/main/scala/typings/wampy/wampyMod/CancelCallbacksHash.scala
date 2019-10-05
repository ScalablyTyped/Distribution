package typings.wampy.wampyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelCallbacksHash extends js.Object {
  var onError: js.UndefOr[Callback] = js.undefined
  var onSuccess: js.UndefOr[Callback] = js.undefined
}

object CancelCallbacksHash {
  @scala.inline
  def apply(onError: () => Unit = null, onSuccess: () => Unit = null): CancelCallbacksHash = {
    val __obj = js.Dynamic.literal()
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction0(onError))
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(js.Any.fromFunction0(onSuccess))
    __obj.asInstanceOf[CancelCallbacksHash]
  }
}

