package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DELETEParametersRefVariables extends StObject {
  
  var DELETE: ParametersRefVariables
  
  var GET: DescriptionExampleReferencesParameters
}
object DELETEParametersRefVariables {
  
  inline def apply(DELETE: ParametersRefVariables, GET: DescriptionExampleReferencesParameters): DELETEParametersRefVariables = {
    val __obj = js.Dynamic.literal(DELETE = DELETE.asInstanceOf[js.Any], GET = GET.asInstanceOf[js.Any])
    __obj.asInstanceOf[DELETEParametersRefVariables]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DELETEParametersRefVariables] (val x: Self) extends AnyVal {
    
    inline def setDELETE(value: ParametersRefVariables): Self = StObject.set(x, "DELETE", value.asInstanceOf[js.Any])
    
    inline def setGET(value: DescriptionExampleReferencesParameters): Self = StObject.set(x, "GET", value.asInstanceOf[js.Any])
  }
}
