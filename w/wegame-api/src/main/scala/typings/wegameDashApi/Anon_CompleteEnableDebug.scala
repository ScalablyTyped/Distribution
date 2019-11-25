package typings.wegameDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CompleteEnableDebug extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var enableDebug: Boolean
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object Anon_CompleteEnableDebug {
  @scala.inline
  def apply(
    enableDebug: Boolean,
    complete: () => Unit = null,
    fail: () => Unit = null,
    success: () => Unit = null
  ): Anon_CompleteEnableDebug = {
    val __obj = js.Dynamic.literal(enableDebug = enableDebug.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    __obj.asInstanceOf[Anon_CompleteEnableDebug]
  }
}

