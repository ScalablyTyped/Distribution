package typings.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEnableDebug extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var enableDebug: Boolean
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object AnonEnableDebug {
  @scala.inline
  def apply(
    enableDebug: Boolean,
    complete: () => Unit = null,
    fail: () => Unit = null,
    success: () => Unit = null
  ): AnonEnableDebug = {
    val __obj = js.Dynamic.literal(enableDebug = enableDebug.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    __obj.asInstanceOf[AnonEnableDebug]
  }
}

