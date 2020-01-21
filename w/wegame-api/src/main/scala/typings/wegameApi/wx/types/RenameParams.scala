package typings.wegameApi.wx.types

import typings.wegameApi.AnonErrMsg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenameParams extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fail: js.UndefOr[js.Function1[/* res */ AnonErrMsg, Unit]] = js.undefined
  var newPath: String
  var oldPath: String
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object RenameParams {
  @scala.inline
  def apply(
    newPath: String,
    oldPath: String,
    complete: () => Unit = null,
    fail: /* res */ AnonErrMsg => Unit = null,
    success: () => Unit = null
  ): RenameParams = {
    val __obj = js.Dynamic.literal(newPath = newPath.asInstanceOf[js.Any], oldPath = oldPath.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    __obj.asInstanceOf[RenameParams]
  }
}

