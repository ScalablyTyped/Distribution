package typings.wegameDashApi.wx.types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetKeepScreenOnParams extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  var keepScreenOn: Boolean
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object SetKeepScreenOnParams {
  @scala.inline
  def apply(
    keepScreenOn: Boolean,
    complete: () => Unit = null,
    fail: () => Unit = null,
    success: () => Unit = null
  ): SetKeepScreenOnParams = {
    val __obj = js.Dynamic.literal(keepScreenOn = keepScreenOn)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    __obj.asInstanceOf[SetKeepScreenOnParams]
  }
}

