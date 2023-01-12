package typings.stripeV3.stripe.paymentMethod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EpsDetails extends StObject {
  
  var verified_name: String
}
object EpsDetails {
  
  inline def apply(verified_name: String): EpsDetails = {
    val __obj = js.Dynamic.literal(verified_name = verified_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EpsDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EpsDetails] (val x: Self) extends AnyVal {
    
    inline def setVerified_name(value: String): Self = StObject.set(x, "verified_name", value.asInstanceOf[js.Any])
  }
}
