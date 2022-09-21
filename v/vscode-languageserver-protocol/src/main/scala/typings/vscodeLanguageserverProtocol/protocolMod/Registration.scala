package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverTypes.mod.LSPAny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Registration extends StObject {
  
  /**
    * The id used to register the request. The id can be used to deregister
    * the request again.
    */
  var id: String
  
  /**
    * The method / capability to register for.
    */
  var method: String
  
  /**
    * Options necessary for the registration.
    */
  var registerOptions: js.UndefOr[LSPAny] = js.undefined
}
object Registration {
  
  inline def apply(id: String, method: String): Registration = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[Registration]
  }
  
  extension [Self <: Registration](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setRegisterOptions(value: LSPAny): Self = StObject.set(x, "registerOptions", value.asInstanceOf[js.Any])
    
    inline def setRegisterOptionsUndefined: Self = StObject.set(x, "registerOptions", js.undefined)
  }
}
