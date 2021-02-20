package typings.stripeV3.stripe

import typings.stripeV3.stripe.setupIntents.SetupIntent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetupIntentResponse extends StObject {
  
  var error: js.UndefOr[Error] = js.native
  
  var setupIntent: js.UndefOr[SetupIntent] = js.native
}
object SetupIntentResponse {
  
  @scala.inline
  def apply(): SetupIntentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetupIntentResponse]
  }
  
  @scala.inline
  implicit class SetupIntentResponseMutableBuilder[Self <: SetupIntentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setSetupIntent(value: SetupIntent): Self = StObject.set(x, "setupIntent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetupIntentUndefined: Self = StObject.set(x, "setupIntent", js.undefined)
  }
}
