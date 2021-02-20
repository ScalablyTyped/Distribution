package typings.stripeV3.stripe

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StripeServerCheckoutOptions extends StObject {
  
  var sessionId: String = js.native
}
object StripeServerCheckoutOptions {
  
  @scala.inline
  def apply(sessionId: String): StripeServerCheckoutOptions = {
    val __obj = js.Dynamic.literal(sessionId = sessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StripeServerCheckoutOptions]
  }
  
  @scala.inline
  implicit class StripeServerCheckoutOptionsMutableBuilder[Self <: StripeServerCheckoutOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
  }
}
