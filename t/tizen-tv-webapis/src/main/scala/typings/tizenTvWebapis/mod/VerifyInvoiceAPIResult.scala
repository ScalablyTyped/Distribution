package typings.tizenTvWebapis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerifyInvoiceAPIResult extends StObject {
  
  var AppID: String
  
  var CPResult: String
  
  var CPStatus: String
  
  var InvoiceID: String
}
object VerifyInvoiceAPIResult {
  
  inline def apply(AppID: String, CPResult: String, CPStatus: String, InvoiceID: String): VerifyInvoiceAPIResult = {
    val __obj = js.Dynamic.literal(AppID = AppID.asInstanceOf[js.Any], CPResult = CPResult.asInstanceOf[js.Any], CPStatus = CPStatus.asInstanceOf[js.Any], InvoiceID = InvoiceID.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyInvoiceAPIResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VerifyInvoiceAPIResult] (val x: Self) extends AnyVal {
    
    inline def setAppID(value: String): Self = StObject.set(x, "AppID", value.asInstanceOf[js.Any])
    
    inline def setCPResult(value: String): Self = StObject.set(x, "CPResult", value.asInstanceOf[js.Any])
    
    inline def setCPStatus(value: String): Self = StObject.set(x, "CPStatus", value.asInstanceOf[js.Any])
    
    inline def setInvoiceID(value: String): Self = StObject.set(x, "InvoiceID", value.asInstanceOf[js.Any])
  }
}
