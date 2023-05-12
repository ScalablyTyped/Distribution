package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GETCommandDescriptionParametersRefVariables extends StObject {
  
  var DELETE: CommandDescriptionParametersRefVariables
  
  var GET: CommandDescriptionParametersRefVariables
}
object GETCommandDescriptionParametersRefVariables {
  
  inline def apply(DELETE: CommandDescriptionParametersRefVariables, GET: CommandDescriptionParametersRefVariables): GETCommandDescriptionParametersRefVariables = {
    val __obj = js.Dynamic.literal(DELETE = DELETE.asInstanceOf[js.Any], GET = GET.asInstanceOf[js.Any])
    __obj.asInstanceOf[GETCommandDescriptionParametersRefVariables]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GETCommandDescriptionParametersRefVariables] (val x: Self) extends AnyVal {
    
    inline def setDELETE(value: CommandDescriptionParametersRefVariables): Self = StObject.set(x, "DELETE", value.asInstanceOf[js.Any])
    
    inline def setGET(value: CommandDescriptionParametersRefVariables): Self = StObject.set(x, "GET", value.asInstanceOf[js.Any])
  }
}
