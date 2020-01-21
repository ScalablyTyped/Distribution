package typings.wegameApi.wx.types

import typings.wegameApi.AnonErrMsg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnzipParams extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fail: js.UndefOr[js.Function1[/* res */ AnonErrMsg, Unit]] = js.undefined
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
  var targetPath: String
  var zipFilePath: String
}

object UnzipParams {
  @scala.inline
  def apply(
    targetPath: String,
    zipFilePath: String,
    complete: () => Unit = null,
    fail: /* res */ AnonErrMsg => Unit = null,
    success: () => Unit = null
  ): UnzipParams = {
    val __obj = js.Dynamic.literal(targetPath = targetPath.asInstanceOf[js.Any], zipFilePath = zipFilePath.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    __obj.asInstanceOf[UnzipParams]
  }
}

