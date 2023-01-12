package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefinitionClientCapabilities extends StObject {
  
  /**
    * Whether definition supports dynamic registration.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The client supports additional metadata in the form of definition links.
    *
    * @since 3.14.0
    */
  var linkSupport: js.UndefOr[Boolean] = js.undefined
}
object DefinitionClientCapabilities {
  
  inline def apply(): DefinitionClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefinitionClientCapabilities]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefinitionClientCapabilities] (val x: Self) extends AnyVal {
    
    inline def setDynamicRegistration(value: Boolean): Self = StObject.set(x, "dynamicRegistration", value.asInstanceOf[js.Any])
    
    inline def setDynamicRegistrationUndefined: Self = StObject.set(x, "dynamicRegistration", js.undefined)
    
    inline def setLinkSupport(value: Boolean): Self = StObject.set(x, "linkSupport", value.asInstanceOf[js.Any])
    
    inline def setLinkSupportUndefined: Self = StObject.set(x, "linkSupport", js.undefined)
  }
}
