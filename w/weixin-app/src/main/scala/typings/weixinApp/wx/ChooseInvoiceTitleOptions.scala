package typings.weixinApp.wx

import typings.weixinApp.anon.BankAccount
import org.scalablytyped.runtime.StObject
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
  implicit class ChooseInvoiceTitleOptionsMutableBuilder[Self <: ChooseInvoiceTitleOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuccess(value: /* res */ BankAccount => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
