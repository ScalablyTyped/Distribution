package typings.weixinApp.wx

import typings.weixinApp.anon.BankAccount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChooseInvoiceTitleOptions
  extends BaseOptions[js.Any, js.Any] {
  
  @JSName("success")
  var success_ChooseInvoiceTitleOptions: js.UndefOr[js.Function1[/* res */ BankAccount, Unit]] = js.native
}
object ChooseInvoiceTitleOptions {
  
  @scala.inline
  def apply(): ChooseInvoiceTitleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChooseInvoiceTitleOptions]
  }
  
  @scala.inline
  implicit class ChooseInvoiceTitleOptionsOps[Self <: ChooseInvoiceTitleOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSuccess(value: /* res */ BankAccount => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
}
