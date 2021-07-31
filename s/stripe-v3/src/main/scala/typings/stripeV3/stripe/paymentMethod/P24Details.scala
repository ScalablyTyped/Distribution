package typings.stripeV3.stripe.paymentMethod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait P24Details extends StObject {
  
  var reference: String
  
  var verified_name: String
}
object P24Details {
  
  @scala.inline
  def apply(reference: String, verified_name: String): P24Details = {
    val __obj = js.Dynamic.literal(reference = reference.asInstanceOf[js.Any], verified_name = verified_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[P24Details]
  }
  
  @scala.inline
  implicit class P24DetailsMutableBuilder[Self <: P24Details] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReference(value: String): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerified_name(value: String): Self = StObject.set(x, "verified_name", value.asInstanceOf[js.Any])
  }
}
