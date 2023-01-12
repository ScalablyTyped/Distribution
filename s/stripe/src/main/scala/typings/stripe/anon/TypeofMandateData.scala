package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofMandateData extends StObject {
  
  val CustomerAcceptance: Any
}
object TypeofMandateData {
  
  inline def apply(CustomerAcceptance: Any): TypeofMandateData = {
    val __obj = js.Dynamic.literal(CustomerAcceptance = CustomerAcceptance.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofMandateData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofMandateData] (val x: Self) extends AnyVal {
    
    inline def setCustomerAcceptance(value: Any): Self = StObject.set(x, "CustomerAcceptance", value.asInstanceOf[js.Any])
  }
}
