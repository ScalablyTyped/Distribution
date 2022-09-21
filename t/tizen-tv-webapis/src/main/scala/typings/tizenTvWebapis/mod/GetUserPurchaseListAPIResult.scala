package typings.tizenTvWebapis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetUserPurchaseListAPIResult extends StObject {
  
  var CPResult: String
  
  var CPStatus: String
  
  var CheckValue: String
  
  var InvoiceDetails: typings.tizenTvWebapis.mod.InvoiceDetails
  
  var TotalCount: Double
}
object GetUserPurchaseListAPIResult {
  
  inline def apply(
    CPResult: String,
    CPStatus: String,
    CheckValue: String,
    InvoiceDetails: InvoiceDetails,
    TotalCount: Double
  ): GetUserPurchaseListAPIResult = {
    val __obj = js.Dynamic.literal(CPResult = CPResult.asInstanceOf[js.Any], CPStatus = CPStatus.asInstanceOf[js.Any], CheckValue = CheckValue.asInstanceOf[js.Any], InvoiceDetails = InvoiceDetails.asInstanceOf[js.Any], TotalCount = TotalCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUserPurchaseListAPIResult]
  }
  
  extension [Self <: GetUserPurchaseListAPIResult](x: Self) {
    
    inline def setCPResult(value: String): Self = StObject.set(x, "CPResult", value.asInstanceOf[js.Any])
    
    inline def setCPStatus(value: String): Self = StObject.set(x, "CPStatus", value.asInstanceOf[js.Any])
    
    inline def setCheckValue(value: String): Self = StObject.set(x, "CheckValue", value.asInstanceOf[js.Any])
    
    inline def setInvoiceDetails(value: InvoiceDetails): Self = StObject.set(x, "InvoiceDetails", value.asInstanceOf[js.Any])
    
    inline def setTotalCount(value: Double): Self = StObject.set(x, "TotalCount", value.asInstanceOf[js.Any])
  }
}
