package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DELETECommandDescriptionParametersRefVariablesGETParametersRefReturns extends StObject {
  
  var DELETE: CommandDescriptionParametersRefVariables
  
  var GET: ParametersRefReturns
}
object DELETECommandDescriptionParametersRefVariablesGETParametersRefReturns {
  
  inline def apply(DELETE: CommandDescriptionParametersRefVariables, GET: ParametersRefReturns): DELETECommandDescriptionParametersRefVariablesGETParametersRefReturns = {
    val __obj = js.Dynamic.literal(DELETE = DELETE.asInstanceOf[js.Any], GET = GET.asInstanceOf[js.Any])
    __obj.asInstanceOf[DELETECommandDescriptionParametersRefVariablesGETParametersRefReturns]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DELETECommandDescriptionParametersRefVariablesGETParametersRefReturns] (val x: Self) extends AnyVal {
    
    inline def setDELETE(value: CommandDescriptionParametersRefVariables): Self = StObject.set(x, "DELETE", value.asInstanceOf[js.Any])
    
    inline def setGET(value: ParametersRefReturns): Self = StObject.set(x, "GET", value.asInstanceOf[js.Any])
  }
}
