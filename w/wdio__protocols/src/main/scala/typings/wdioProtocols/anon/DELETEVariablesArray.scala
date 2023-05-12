package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DELETEVariablesArray extends StObject {
  
  var DELETE: VariablesArray
  
  var GET: ParametersRefReturns
  
  var POST: RefStringVariablesArray
}
object DELETEVariablesArray {
  
  inline def apply(DELETE: VariablesArray, GET: ParametersRefReturns, POST: RefStringVariablesArray): DELETEVariablesArray = {
    val __obj = js.Dynamic.literal(DELETE = DELETE.asInstanceOf[js.Any], GET = GET.asInstanceOf[js.Any], POST = POST.asInstanceOf[js.Any])
    __obj.asInstanceOf[DELETEVariablesArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DELETEVariablesArray] (val x: Self) extends AnyVal {
    
    inline def setDELETE(value: VariablesArray): Self = StObject.set(x, "DELETE", value.asInstanceOf[js.Any])
    
    inline def setGET(value: ParametersRefReturns): Self = StObject.set(x, "GET", value.asInstanceOf[js.Any])
    
    inline def setPOST(value: RefStringVariablesArray): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
  }
}
