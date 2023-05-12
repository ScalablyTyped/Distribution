package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DELETECommandDescriptionParametersRefVariables extends StObject {
  
  var DELETE: CommandDescriptionParametersRefVariables
  
  var GET: ParametersRefReturns
  
  var POST: DescriptionParametersRefVariables
}
object DELETECommandDescriptionParametersRefVariables {
  
  inline def apply(
    DELETE: CommandDescriptionParametersRefVariables,
    GET: ParametersRefReturns,
    POST: DescriptionParametersRefVariables
  ): DELETECommandDescriptionParametersRefVariables = {
    val __obj = js.Dynamic.literal(DELETE = DELETE.asInstanceOf[js.Any], GET = GET.asInstanceOf[js.Any], POST = POST.asInstanceOf[js.Any])
    __obj.asInstanceOf[DELETECommandDescriptionParametersRefVariables]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DELETECommandDescriptionParametersRefVariables] (val x: Self) extends AnyVal {
    
    inline def setDELETE(value: CommandDescriptionParametersRefVariables): Self = StObject.set(x, "DELETE", value.asInstanceOf[js.Any])
    
    inline def setGET(value: ParametersRefReturns): Self = StObject.set(x, "GET", value.asInstanceOf[js.Any])
    
    inline def setPOST(value: DescriptionParametersRefVariables): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
  }
}
