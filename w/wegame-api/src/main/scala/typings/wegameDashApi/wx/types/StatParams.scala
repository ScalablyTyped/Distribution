package typings.wegameDashApi.wx.types

import typings.wegameDashApi.Anon_ErrMsg
import typings.wegameDashApi.Anon_Stat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatParams extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fail: js.UndefOr[js.Function1[/* res */ Anon_ErrMsg, Unit]] = js.undefined
  var path: String
  var success: js.UndefOr[js.Function1[/* res */ Anon_Stat, Unit]] = js.undefined
}

object StatParams {
  @scala.inline
  def apply(
    path: String,
    complete: () => Unit = null,
    fail: /* res */ Anon_ErrMsg => Unit = null,
    success: /* res */ Anon_Stat => Unit = null
  ): StatParams = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[StatParams]
  }
}

