package typings.wegameApi.wx.types

import typings.wegameApi.anon.ErrMsg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessfileParams extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fail: js.UndefOr[js.Function1[/* res */ ErrMsg, Unit]] = js.undefined
  var path: String
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object AccessfileParams {
  @scala.inline
  def apply(
    path: String,
    complete: () => Unit = null,
    fail: /* res */ ErrMsg => Unit = null,
    success: () => Unit = null
  ): AccessfileParams = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    __obj.asInstanceOf[AccessfileParams]
  }
}

