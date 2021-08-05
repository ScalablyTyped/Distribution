package typings.stripeV3.stripe

import typings.stripeV3.stripe.setupIntents.SetupIntent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetupIntentResponse extends StObject {
  
  var error: js.UndefOr[Error] = js.undefined
  
  var setupIntent: js.UndefOr[SetupIntent] = js.undefined
}
object SetupIntentResponse {
  
  inline def apply(): SetupIntentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetupIntentResponse]
  }
  
  extension [Self <: SetupIntentResponse](x: Self) {
    
    inline def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setSetupIntent(value: SetupIntent): Self = StObject.set(x, "setupIntent", value.asInstanceOf[js.Any])
    
    inline def setSetupIntentUndefined: Self = StObject.set(x, "setupIntent", js.undefined)
  }
}
