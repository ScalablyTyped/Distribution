package typings.stripe.anon

import typings.stripe.stripeStrings.email
import typings.stripe.stripeStrings.manual
import typings.stripe.stripeStrings.none
import typings.stripe.stripeStrings.one_time
import typings.stripe.stripeStrings.scheduled
import typings.stripe.stripeStrings.variable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Acceptance extends js.Object {
  
  var acceptance: js.UndefOr[Offline] = js.native
  
  var amount: js.UndefOr[Double | Null] = js.native
  
  var currency: js.UndefOr[String] = js.native
  
  var interval: js.UndefOr[one_time | scheduled | variable] = js.native
  
  var notification_method: js.UndefOr[email | manual | none] = js.native
}
object Acceptance {
  
  @scala.inline
  def apply(): Acceptance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Acceptance]
  }
  
  @scala.inline
  implicit class AcceptanceOps[Self <: Acceptance] (val x: Self) extends AnyVal {
    
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
    def setAcceptance(value: Offline): Self = this.set("acceptance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcceptance: Self = this.set("acceptance", js.undefined)
    
    @scala.inline
    def setAmount(value: Double): Self = this.set("amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmount: Self = this.set("amount", js.undefined)
    
    @scala.inline
    def setAmountNull: Self = this.set("amount", null)
    
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrency: Self = this.set("currency", js.undefined)
    
    @scala.inline
    def setInterval(value: one_time | scheduled | variable): Self = this.set("interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    
    @scala.inline
    def setNotification_method(value: email | manual | none): Self = this.set("notification_method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotification_method: Self = this.set("notification_method", js.undefined)
  }
}
