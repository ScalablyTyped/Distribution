package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecuteCommandClientCapabilities extends StObject {
  
  /**
    * Execute command supports dynamic registration.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.undefined
}
object ExecuteCommandClientCapabilities {
  
  inline def apply(): ExecuteCommandClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecuteCommandClientCapabilities]
  }
  
  extension [Self <: ExecuteCommandClientCapabilities](x: Self) {
    
    inline def setDynamicRegistration(value: Boolean): Self = StObject.set(x, "dynamicRegistration", value.asInstanceOf[js.Any])
    
    inline def setDynamicRegistrationUndefined: Self = StObject.set(x, "dynamicRegistration", js.undefined)
  }
}
