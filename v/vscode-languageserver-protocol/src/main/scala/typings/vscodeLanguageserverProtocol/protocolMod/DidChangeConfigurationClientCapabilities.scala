package typings.vscodeLanguageserverProtocol.protocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DidChangeConfigurationClientCapabilities extends StObject {
  
  /**
    * Did change configuration notification supports dynamic registration.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.native
}
object DidChangeConfigurationClientCapabilities {
  
  @scala.inline
  def apply(): DidChangeConfigurationClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DidChangeConfigurationClientCapabilities]
  }
  
  @scala.inline
  implicit class DidChangeConfigurationClientCapabilitiesMutableBuilder[Self <: DidChangeConfigurationClientCapabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDynamicRegistration(value: Boolean): Self = StObject.set(x, "dynamicRegistration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicRegistrationUndefined: Self = StObject.set(x, "dynamicRegistration", js.undefined)
  }
}
