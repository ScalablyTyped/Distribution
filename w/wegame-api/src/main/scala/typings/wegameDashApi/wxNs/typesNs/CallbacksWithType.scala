package typings.wegameDashApi.wxNs.typesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallbacksWithType[T] extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  var success: js.UndefOr[js.Function1[/* res */ T, Unit]] = js.undefined
}

object CallbacksWithType {
  @scala.inline
  def apply[T](complete: () => Unit = null, fail: () => Unit = null, success: /* res */ T => Unit = null): CallbacksWithType[T] = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[CallbacksWithType[T]]
  }
}

