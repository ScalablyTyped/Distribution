package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReferenceClientCapabilities extends StObject {
  
  /**
    * Whether references supports dynamic registration.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.undefined
}
object ReferenceClientCapabilities {
  
  inline def apply(): ReferenceClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReferenceClientCapabilities]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReferenceClientCapabilities] (val x: Self) extends AnyVal {
    
    inline def setDynamicRegistration(value: Boolean): Self = StObject.set(x, "dynamicRegistration", value.asInstanceOf[js.Any])
    
    inline def setDynamicRegistrationUndefined: Self = StObject.set(x, "dynamicRegistration", js.undefined)
  }
}
