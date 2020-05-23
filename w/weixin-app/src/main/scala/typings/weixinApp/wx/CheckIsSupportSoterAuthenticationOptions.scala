package typings.weixinApp.wx

import typings.weixinApp.anon.SupportMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckIsSupportSoterAuthenticationOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  var success_CheckIsSupportSoterAuthenticationOptions: js.UndefOr[js.Function1[/* res */ SupportMode, Unit]] = js.undefined
}

object CheckIsSupportSoterAuthenticationOptions {
  @scala.inline
  def apply(
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null,
    success: /* res */ SupportMode => Unit = null
  ): CheckIsSupportSoterAuthenticationOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[CheckIsSupportSoterAuthenticationOptions]
  }
}

