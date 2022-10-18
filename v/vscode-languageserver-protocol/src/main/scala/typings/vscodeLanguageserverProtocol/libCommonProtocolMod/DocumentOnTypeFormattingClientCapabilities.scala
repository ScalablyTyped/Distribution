package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentOnTypeFormattingClientCapabilities extends StObject {
  
  /**
    * Whether on type formatting supports dynamic registration.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.undefined
}
object DocumentOnTypeFormattingClientCapabilities {
  
  inline def apply(): DocumentOnTypeFormattingClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentOnTypeFormattingClientCapabilities]
  }
  
  extension [Self <: DocumentOnTypeFormattingClientCapabilities](x: Self) {
    
    inline def setDynamicRegistration(value: Boolean): Self = StObject.set(x, "dynamicRegistration", value.asInstanceOf[js.Any])
    
    inline def setDynamicRegistrationUndefined: Self = StObject.set(x, "dynamicRegistration", js.undefined)
  }
}
