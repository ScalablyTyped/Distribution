package typings.stripe.mod.paymentIntents

import typings.stripe.stripeStrings.any
import typings.stripe.stripeStrings.automatic
import typings.stripe.stripeStrings.challenge_only
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPaymentMethodCardOptions extends StObject {
  
  /**
    * We strongly recommend that you rely on our SCA Engine to automatically prompt your customers for authentication based on risk level and other requirements. However, if you wish to request 3D Secure based on
    * logic from your own fraud engine, provide this option. Permitted values include: automatic, any, or challenge_only. If not provided, defaults to automatic.
    */
  var request_three_d_secure: js.UndefOr[automatic | challenge_only | any] = js.undefined
}
object IPaymentMethodCardOptions {
  
  @scala.inline
  def apply(): IPaymentMethodCardOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPaymentMethodCardOptions]
  }
  
  @scala.inline
  implicit class IPaymentMethodCardOptionsMutableBuilder[Self <: IPaymentMethodCardOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequest_three_d_secure(value: automatic | challenge_only | any): Self = StObject.set(x, "request_three_d_secure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest_three_d_secureUndefined: Self = StObject.set(x, "request_three_d_secure", js.undefined)
  }
}
