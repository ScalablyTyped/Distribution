package typings.vscodeLanguageserverProtocol.protocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefinitionClientCapabilities extends StObject {
  
  /**
    * Whether definition supports dynamic registration.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.native
  
  /**
    * The client supports additional metadata in the form of definition links.
    *
    * @since 3.14.0
    */
  var linkSupport: js.UndefOr[Boolean] = js.native
}
object DefinitionClientCapabilities {
  
  @scala.inline
  def apply(): DefinitionClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefinitionClientCapabilities]
  }
  
  @scala.inline
  implicit class DefinitionClientCapabilitiesMutableBuilder[Self <: DefinitionClientCapabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDynamicRegistration(value: Boolean): Self = StObject.set(x, "dynamicRegistration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicRegistrationUndefined: Self = StObject.set(x, "dynamicRegistration", js.undefined)
    
    @scala.inline
    def setLinkSupport(value: Boolean): Self = StObject.set(x, "linkSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkSupportUndefined: Self = StObject.set(x, "linkSupport", js.undefined)
  }
}
