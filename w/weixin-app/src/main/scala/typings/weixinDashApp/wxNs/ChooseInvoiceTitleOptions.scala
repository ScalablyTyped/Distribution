package typings.weixinDashApp.wxNs

import typings.weixinDashApp.Anon_BankAccount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChooseInvoiceTitleOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  var success_ChooseInvoiceTitleOptions: js.UndefOr[js.Function1[/* res */ Anon_BankAccount, Unit]] = js.undefined
}

object ChooseInvoiceTitleOptions {
  @scala.inline
  def apply(
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null,
    success: /* res */ Anon_BankAccount => Unit = null
  ): ChooseInvoiceTitleOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[ChooseInvoiceTitleOptions]
  }
}

