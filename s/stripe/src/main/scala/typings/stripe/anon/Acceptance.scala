package typings.stripe.anon

import typings.stripe.stripeStrings.email
import typings.stripe.stripeStrings.manual
import typings.stripe.stripeStrings.none
import typings.stripe.stripeStrings.one_time
import typings.stripe.stripeStrings.scheduled
import typings.stripe.stripeStrings.variable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Acceptance extends StObject {
  
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
  implicit class AcceptanceMutableBuilder[Self <: Acceptance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceptance(value: Offline): Self = StObject.set(x, "acceptance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptanceUndefined: Self = StObject.set(x, "acceptance", js.undefined)
    
    @scala.inline
    def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountNull: Self = StObject.set(x, "amount", null)
    
    @scala.inline
    def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    @scala.inline
    def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    @scala.inline
    def setInterval(value: one_time | scheduled | variable): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    @scala.inline
    def setNotification_method(value: email | manual | none): Self = StObject.set(x, "notification_method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotification_methodUndefined: Self = StObject.set(x, "notification_method", js.undefined)
  }
}
