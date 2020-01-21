package typings.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCompleteFailScope extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 需要获取权限的 scope
    */
  var scope: String
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object AnonCompleteFailScope {
  @scala.inline
  def apply(scope: String, complete: () => Unit = null, fail: () => Unit = null, success: () => Unit = null): AnonCompleteFailScope = {
    val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    __obj.asInstanceOf[AnonCompleteFailScope]
  }
}

