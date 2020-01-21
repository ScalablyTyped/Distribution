package typings.wampy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallCallbacksHash extends js.Object {
  var onError: js.UndefOr[ErrorCallback] = js.undefined
  var onSuccess: js.UndefOr[SuccessCallback] = js.undefined
}

object CallCallbacksHash {
  @scala.inline
  def apply(onError: /* args */ ErrorArgs => Unit = null, onSuccess: /* args */ DataArgs => Unit = null): CallCallbacksHash = {
    val __obj = js.Dynamic.literal()
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(js.Any.fromFunction1(onSuccess))
    __obj.asInstanceOf[CallCallbacksHash]
  }
}

