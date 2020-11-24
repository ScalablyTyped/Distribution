package typings.strongholdPayJs.mod.global.Stronghold

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdatePaymentSourceOptions extends Options {
  
  var onSuccess: js.UndefOr[UpdatePaymentSourceOnSuccess] = js.native
  
  var paymentSourceId: String = js.native
}
object UpdatePaymentSourceOptions {
  
  @scala.inline
  def apply(paymentSourceId: String): UpdatePaymentSourceOptions = {
    val __obj = js.Dynamic.literal(paymentSourceId = paymentSourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePaymentSourceOptions]
  }
  
  @scala.inline
  implicit class UpdatePaymentSourceOptionsOps[Self <: UpdatePaymentSourceOptions] (val x: Self) extends AnyVal {
    
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
    def setPaymentSourceId(value: String): Self = this.set("paymentSourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSuccess(value: /* paymentSource */ PaymentSource => Unit): Self = this.set("onSuccess", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSuccess: Self = this.set("onSuccess", js.undefined)
  }
}
