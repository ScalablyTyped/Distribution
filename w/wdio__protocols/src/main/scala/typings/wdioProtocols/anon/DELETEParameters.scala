package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DELETEParameters extends StObject {
  
  var DELETE: Parameters
  
  var GET: DescriptionParameters
}
object DELETEParameters {
  
  inline def apply(DELETE: Parameters, GET: DescriptionParameters): DELETEParameters = {
    val __obj = js.Dynamic.literal(DELETE = DELETE.asInstanceOf[js.Any], GET = GET.asInstanceOf[js.Any])
    __obj.asInstanceOf[DELETEParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DELETEParameters] (val x: Self) extends AnyVal {
    
    inline def setDELETE(value: Parameters): Self = StObject.set(x, "DELETE", value.asInstanceOf[js.Any])
    
    inline def setGET(value: DescriptionParameters): Self = StObject.set(x, "GET", value.asInstanceOf[js.Any])
  }
}
