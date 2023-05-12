package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DELETEParametersGETDescriptionParameters extends StObject {
  
  var DELETE: Parameters
  
  var GET: DescriptionParameters
  
  var POST: CommandDescriptionParameters
}
object DELETEParametersGETDescriptionParameters {
  
  inline def apply(DELETE: Parameters, GET: DescriptionParameters, POST: CommandDescriptionParameters): DELETEParametersGETDescriptionParameters = {
    val __obj = js.Dynamic.literal(DELETE = DELETE.asInstanceOf[js.Any], GET = GET.asInstanceOf[js.Any], POST = POST.asInstanceOf[js.Any])
    __obj.asInstanceOf[DELETEParametersGETDescriptionParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DELETEParametersGETDescriptionParameters] (val x: Self) extends AnyVal {
    
    inline def setDELETE(value: Parameters): Self = StObject.set(x, "DELETE", value.asInstanceOf[js.Any])
    
    inline def setGET(value: DescriptionParameters): Self = StObject.set(x, "GET", value.asInstanceOf[js.Any])
    
    inline def setPOST(value: CommandDescriptionParameters): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
  }
}
