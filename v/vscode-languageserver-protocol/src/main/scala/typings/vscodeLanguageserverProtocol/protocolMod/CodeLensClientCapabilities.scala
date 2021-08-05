package typings.vscodeLanguageserverProtocol.protocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeLensClientCapabilities extends StObject {
  
  /**
    * Whether code lens supports dynamic registration.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.undefined
}
object CodeLensClientCapabilities {
  
  inline def apply(): CodeLensClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeLensClientCapabilities]
  }
  
  extension [Self <: CodeLensClientCapabilities](x: Self) {
    
    inline def setDynamicRegistration(value: Boolean): Self = StObject.set(x, "dynamicRegistration", value.asInstanceOf[js.Any])
    
    inline def setDynamicRegistrationUndefined: Self = StObject.set(x, "dynamicRegistration", js.undefined)
  }
}
