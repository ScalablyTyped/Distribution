package typings.wegameDashApi.wx.types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetStorageParams extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var data: js.Any
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  var key: String
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object SetStorageParams {
  @scala.inline
  def apply(
    data: js.Any,
    key: String,
    complete: () => Unit = null,
    fail: () => Unit = null,
    success: () => Unit = null
  ): SetStorageParams = {
    val __obj = js.Dynamic.literal(data = data, key = key)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    __obj.asInstanceOf[SetStorageParams]
  }
}

