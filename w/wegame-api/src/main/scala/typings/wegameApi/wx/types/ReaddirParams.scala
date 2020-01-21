package typings.wegameApi.wx.types

import typings.wegameApi.AnonErrMsg
import typings.wegameApi.AnonFiles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReaddirParams extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var dirPath: String
  var fail: js.UndefOr[js.Function1[/* res */ AnonErrMsg, Unit]] = js.undefined
  var success: js.UndefOr[js.Function1[/* res */ AnonFiles, Unit]] = js.undefined
}

object ReaddirParams {
  @scala.inline
  def apply(
    dirPath: String,
    complete: () => Unit = null,
    fail: /* res */ AnonErrMsg => Unit = null,
    success: /* res */ AnonFiles => Unit = null
  ): ReaddirParams = {
    val __obj = js.Dynamic.literal(dirPath = dirPath.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[ReaddirParams]
  }
}

