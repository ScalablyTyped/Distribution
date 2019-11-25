package typings.wegameDashApi.wx.types

import typings.wegameDashApi.Anon_ErrMsg
import typings.wegameDashApi.Anon_SavedFilePath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SavefileParams extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fail: js.UndefOr[js.Function1[/* res */ Anon_ErrMsg, Unit]] = js.undefined
  var filePath: js.UndefOr[String] = js.undefined
  var success: js.UndefOr[js.Function1[/* res */ Anon_SavedFilePath, Unit]] = js.undefined
  var tempFilePath: String
}

object SavefileParams {
  @scala.inline
  def apply(
    tempFilePath: String,
    complete: () => Unit = null,
    fail: /* res */ Anon_ErrMsg => Unit = null,
    filePath: String = null,
    success: /* res */ Anon_SavedFilePath => Unit = null
  ): SavefileParams = {
    val __obj = js.Dynamic.literal(tempFilePath = tempFilePath.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (filePath != null) __obj.updateDynamic("filePath")(filePath.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[SavefileParams]
  }
}

