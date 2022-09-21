package typings.tizenTvWebapis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplyInvoiceData extends StObject {
  
  var apiResult: String
}
object ApplyInvoiceData {
  
  inline def apply(apiResult: String): ApplyInvoiceData = {
    val __obj = js.Dynamic.literal(apiResult = apiResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplyInvoiceData]
  }
  
  extension [Self <: ApplyInvoiceData](x: Self) {
    
    inline def setApiResult(value: String): Self = StObject.set(x, "apiResult", value.asInstanceOf[js.Any])
  }
}
