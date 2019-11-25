package typings.wegameDashApi.wx.types

import typings.wegameDashApi.Anon_DataAny
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetStorageParams extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  var key: String
  var success: js.UndefOr[js.Function1[/* res */ Anon_DataAny, Unit]] = js.undefined
}

object GetStorageParams {
  @scala.inline
  def apply(
    key: String,
    complete: () => Unit = null,
    fail: () => Unit = null,
    success: /* res */ Anon_DataAny => Unit = null
  ): GetStorageParams = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetStorageParams]
  }
}

