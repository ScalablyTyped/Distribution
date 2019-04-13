package typings
package wampyLib.wampyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelCallbacksHash extends js.Object {
  var onError: js.UndefOr[Callback] = js.undefined
  var onSuccess: js.UndefOr[Callback] = js.undefined
}

object CancelCallbacksHash {
  @scala.inline
  def apply(onError: Callback = null, onSuccess: Callback = null): CancelCallbacksHash = {
    val __obj = js.Dynamic.literal()
    if (onError != null) __obj.updateDynamic("onError")(onError)
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(onSuccess)
    __obj.asInstanceOf[CancelCallbacksHash]
  }
}

