package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DidChangeConfigurationClientCapabilities extends StObject {
  
  /**
    * Did change configuration notification supports dynamic registration.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.undefined
}
object DidChangeConfigurationClientCapabilities {
  
  inline def apply(): DidChangeConfigurationClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DidChangeConfigurationClientCapabilities]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DidChangeConfigurationClientCapabilities] (val x: Self) extends AnyVal {
    
    inline def setDynamicRegistration(value: Boolean): Self = StObject.set(x, "dynamicRegistration", value.asInstanceOf[js.Any])
    
    inline def setDynamicRegistrationUndefined: Self = StObject.set(x, "dynamicRegistration", js.undefined)
  }
}
