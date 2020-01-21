package typings.wegameApi.wx.types

import typings.wegameApi.AnonErrMsg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyfileParams extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var destPath: String
  var fail: js.UndefOr[js.Function1[/* res */ AnonErrMsg, Unit]] = js.undefined
  var srcPath: String
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object CopyfileParams {
  @scala.inline
  def apply(
    destPath: String,
    srcPath: String,
    complete: () => Unit = null,
    fail: /* res */ AnonErrMsg => Unit = null,
    success: () => Unit = null
  ): CopyfileParams = {
    val __obj = js.Dynamic.literal(destPath = destPath.asInstanceOf[js.Any], srcPath = srcPath.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    __obj.asInstanceOf[CopyfileParams]
  }
}

