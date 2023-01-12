package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofFinancialAccount extends StObject {
  
  val FinancialAddress: Any
  
  val PlatformRestrictions: Any
  
  val StatusDetails: TypeofStatusDetails
}
object TypeofFinancialAccount {
  
  inline def apply(FinancialAddress: Any, PlatformRestrictions: Any, StatusDetails: TypeofStatusDetails): TypeofFinancialAccount = {
    val __obj = js.Dynamic.literal(FinancialAddress = FinancialAddress.asInstanceOf[js.Any], PlatformRestrictions = PlatformRestrictions.asInstanceOf[js.Any], StatusDetails = StatusDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofFinancialAccount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofFinancialAccount] (val x: Self) extends AnyVal {
    
    inline def setFinancialAddress(value: Any): Self = StObject.set(x, "FinancialAddress", value.asInstanceOf[js.Any])
    
    inline def setPlatformRestrictions(value: Any): Self = StObject.set(x, "PlatformRestrictions", value.asInstanceOf[js.Any])
    
    inline def setStatusDetails(value: TypeofStatusDetails): Self = StObject.set(x, "StatusDetails", value.asInstanceOf[js.Any])
  }
}
