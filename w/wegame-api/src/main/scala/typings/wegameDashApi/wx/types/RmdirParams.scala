package typings.wegameDashApi.wx.types

import typings.wegameDashApi.Anon_ErrMsg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RmdirParams extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var dirPath: String
  var fail: js.UndefOr[js.Function1[/* res */ Anon_ErrMsg, Unit]] = js.undefined
  var recursive: js.UndefOr[Boolean] = js.undefined
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object RmdirParams {
  @scala.inline
  def apply(
    dirPath: String,
    complete: () => Unit = null,
    fail: /* res */ Anon_ErrMsg => Unit = null,
    recursive: js.UndefOr[Boolean] = js.undefined,
    success: () => Unit = null
  ): RmdirParams = {
    val __obj = js.Dynamic.literal(dirPath = dirPath.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (!js.isUndefined(recursive)) __obj.updateDynamic("recursive")(recursive.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    __obj.asInstanceOf[RmdirParams]
  }
}

