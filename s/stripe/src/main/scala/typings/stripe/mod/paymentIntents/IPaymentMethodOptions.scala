package typings.stripe.mod.paymentIntents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPaymentMethodOptions extends StObject {
  
  /**
    * Configuration for any card payments attempted on this PaymentIntent.
    */
  var card: js.UndefOr[IPaymentMethodCardOptions] = js.undefined
}
object IPaymentMethodOptions {
  
  inline def apply(): IPaymentMethodOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPaymentMethodOptions]
  }
  
  extension [Self <: IPaymentMethodOptions](x: Self) {
    
    inline def setCard(value: IPaymentMethodCardOptions): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    inline def setCardUndefined: Self = StObject.set(x, "card", js.undefined)
  }
}
