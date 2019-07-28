package typings.wegameDashApi.wxNs.typesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveStorageParams extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  var key: String
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object RemoveStorageParams {
  @scala.inline
  def apply(key: String, complete: () => Unit = null, fail: () => Unit = null, success: () => Unit = null): RemoveStorageParams = {
    val __obj = js.Dynamic.literal(key = key)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    __obj.asInstanceOf[RemoveStorageParams]
  }
}

