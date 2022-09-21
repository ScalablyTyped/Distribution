package typings.tizenTvWebapis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelSubscriptionAPIResult extends StObject {
  
  var CPResult: String
  
  var CPStatus: String
  
  var InvoiceID: String
  
  var SubsCancelTime: String
  
  var SubsStatus: String
}
object CancelSubscriptionAPIResult {
  
  inline def apply(CPResult: String, CPStatus: String, InvoiceID: String, SubsCancelTime: String, SubsStatus: String): CancelSubscriptionAPIResult = {
    val __obj = js.Dynamic.literal(CPResult = CPResult.asInstanceOf[js.Any], CPStatus = CPStatus.asInstanceOf[js.Any], InvoiceID = InvoiceID.asInstanceOf[js.Any], SubsCancelTime = SubsCancelTime.asInstanceOf[js.Any], SubsStatus = SubsStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelSubscriptionAPIResult]
  }
  
  extension [Self <: CancelSubscriptionAPIResult](x: Self) {
    
    inline def setCPResult(value: String): Self = StObject.set(x, "CPResult", value.asInstanceOf[js.Any])
    
    inline def setCPStatus(value: String): Self = StObject.set(x, "CPStatus", value.asInstanceOf[js.Any])
    
    inline def setInvoiceID(value: String): Self = StObject.set(x, "InvoiceID", value.asInstanceOf[js.Any])
    
    inline def setSubsCancelTime(value: String): Self = StObject.set(x, "SubsCancelTime", value.asInstanceOf[js.Any])
    
    inline def setSubsStatus(value: String): Self = StObject.set(x, "SubsStatus", value.asInstanceOf[js.Any])
  }
}
