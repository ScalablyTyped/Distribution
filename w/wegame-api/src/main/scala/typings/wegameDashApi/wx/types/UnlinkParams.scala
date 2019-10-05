package typings.wegameDashApi.wx.types

import typings.wegameDashApi.Anon_ErrMsg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnlinkParams extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fail: js.UndefOr[js.Function1[/* res */ Anon_ErrMsg, Unit]] = js.undefined
  var filePath: String
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object UnlinkParams {
  @scala.inline
  def apply(
    filePath: String,
    complete: () => Unit = null,
    fail: /* res */ Anon_ErrMsg => Unit = null,
    success: () => Unit = null
  ): UnlinkParams = {
    val __obj = js.Dynamic.literal(filePath = filePath)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    __obj.asInstanceOf[UnlinkParams]
  }
}

