package typings.stripe.mod.paymentIntents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPaymentMethodOptions extends StObject {
  
  /**
    * Configuration for any card payments attempted on this PaymentIntent.
    */
  var card: js.UndefOr[IPaymentMethodCardOptions] = js.native
}
object IPaymentMethodOptions {
  
  @scala.inline
  def apply(): IPaymentMethodOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPaymentMethodOptions]
  }
  
  @scala.inline
  implicit class IPaymentMethodOptionsMutableBuilder[Self <: IPaymentMethodOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCard(value: IPaymentMethodCardOptions): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardUndefined: Self = StObject.set(x, "card", js.undefined)
  }
}
