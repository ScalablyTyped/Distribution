package typings.tizenTvWebapis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplyInvoiceAPIResult extends StObject {
  
  var AppliedTime: String
  
  var CPResult: String
  
  var CPStatus: String
}
object ApplyInvoiceAPIResult {
  
  inline def apply(AppliedTime: String, CPResult: String, CPStatus: String): ApplyInvoiceAPIResult = {
    val __obj = js.Dynamic.literal(AppliedTime = AppliedTime.asInstanceOf[js.Any], CPResult = CPResult.asInstanceOf[js.Any], CPStatus = CPStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplyInvoiceAPIResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplyInvoiceAPIResult] (val x: Self) extends AnyVal {
    
    inline def setAppliedTime(value: String): Self = StObject.set(x, "AppliedTime", value.asInstanceOf[js.Any])
    
    inline def setCPResult(value: String): Self = StObject.set(x, "CPResult", value.asInstanceOf[js.Any])
    
    inline def setCPStatus(value: String): Self = StObject.set(x, "CPStatus", value.asInstanceOf[js.Any])
  }
}
