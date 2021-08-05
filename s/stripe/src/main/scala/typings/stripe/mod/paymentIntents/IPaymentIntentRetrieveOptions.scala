package typings.stripe.mod.paymentIntents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPaymentIntentRetrieveOptions extends StObject {
  
  /**
    * The client secret of the PaymentIntent. Required if a publishable key is used to retrieve the source.
    *
    * REQUIRED IF USING PUBLISHABLE KEY!
    */
  var client_secret: String
}
object IPaymentIntentRetrieveOptions {
  
  inline def apply(client_secret: String): IPaymentIntentRetrieveOptions = {
    val __obj = js.Dynamic.literal(client_secret = client_secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaymentIntentRetrieveOptions]
  }
  
  extension [Self <: IPaymentIntentRetrieveOptions](x: Self) {
    
    inline def setClient_secret(value: String): Self = StObject.set(x, "client_secret", value.asInstanceOf[js.Any])
  }
}
