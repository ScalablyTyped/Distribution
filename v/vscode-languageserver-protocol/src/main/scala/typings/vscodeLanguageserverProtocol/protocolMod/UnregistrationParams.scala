package typings.vscodeLanguageserverProtocol.protocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnregistrationParams extends StObject {
  
  var unregisterations: js.Array[Unregistration]
}
object UnregistrationParams {
  
  inline def apply(unregisterations: js.Array[Unregistration]): UnregistrationParams = {
    val __obj = js.Dynamic.literal(unregisterations = unregisterations.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnregistrationParams]
  }
  
  extension [Self <: UnregistrationParams](x: Self) {
    
    inline def setUnregisterations(value: js.Array[Unregistration]): Self = StObject.set(x, "unregisterations", value.asInstanceOf[js.Any])
    
    inline def setUnregisterationsVarargs(value: Unregistration*): Self = StObject.set(x, "unregisterations", js.Array(value :_*))
  }
}
