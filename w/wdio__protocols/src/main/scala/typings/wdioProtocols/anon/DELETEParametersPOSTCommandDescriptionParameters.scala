package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DELETEParametersPOSTCommandDescriptionParameters extends StObject {
  
  var DELETE: Parameters
  
  var POST: CommandDescriptionParameters
}
object DELETEParametersPOSTCommandDescriptionParameters {
  
  inline def apply(DELETE: Parameters, POST: CommandDescriptionParameters): DELETEParametersPOSTCommandDescriptionParameters = {
    val __obj = js.Dynamic.literal(DELETE = DELETE.asInstanceOf[js.Any], POST = POST.asInstanceOf[js.Any])
    __obj.asInstanceOf[DELETEParametersPOSTCommandDescriptionParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DELETEParametersPOSTCommandDescriptionParameters] (val x: Self) extends AnyVal {
    
    inline def setDELETE(value: Parameters): Self = StObject.set(x, "DELETE", value.asInstanceOf[js.Any])
    
    inline def setPOST(value: CommandDescriptionParameters): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
  }
}
