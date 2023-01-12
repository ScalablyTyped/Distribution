package typings.tizenTvWebapis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerifyInvoiceData extends StObject {
  
  var apiResult: String
}
object VerifyInvoiceData {
  
  inline def apply(apiResult: String): VerifyInvoiceData = {
    val __obj = js.Dynamic.literal(apiResult = apiResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyInvoiceData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VerifyInvoiceData] (val x: Self) extends AnyVal {
    
    inline def setApiResult(value: String): Self = StObject.set(x, "apiResult", value.asInstanceOf[js.Any])
  }
}
