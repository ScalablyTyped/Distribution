package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import typings.vscodeLanguageserverProtocol.anon.Properties
import typings.vscodeLanguageserverProtocol.anon.`2`
import typings.vscodeLanguageserverProtocol.anon.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkspaceSymbolClientCapabilities extends StObject {
  
  /**
    * Symbol request supports dynamic registration.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The client support partial workspace symbols. The client will send the
    * request `workspaceSymbol/resolve` to the server to resolve additional
    * properties.
    *
    * @since 3.17.0
    */
  var resolveSupport: js.UndefOr[Properties] = js.undefined
  
  /**
    * Specific capabilities for the `SymbolKind` in the `workspace/symbol` request.
    */
  var symbolKind: js.UndefOr[`2`] = js.undefined
  
  /**
    * The client supports tags on `SymbolInformation`.
    * Clients supporting tags have to handle unknown tags gracefully.
    *
    * @since 3.16.0
    */
  var tagSupport: js.UndefOr[`3`] = js.undefined
}
object WorkspaceSymbolClientCapabilities {
  
  inline def apply(): WorkspaceSymbolClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceSymbolClientCapabilities]
  }
  
  extension [Self <: WorkspaceSymbolClientCapabilities](x: Self) {
    
    inline def setDynamicRegistration(value: Boolean): Self = StObject.set(x, "dynamicRegistration", value.asInstanceOf[js.Any])
    
    inline def setDynamicRegistrationUndefined: Self = StObject.set(x, "dynamicRegistration", js.undefined)
    
    inline def setResolveSupport(value: Properties): Self = StObject.set(x, "resolveSupport", value.asInstanceOf[js.Any])
    
    inline def setResolveSupportUndefined: Self = StObject.set(x, "resolveSupport", js.undefined)
    
    inline def setSymbolKind(value: `2`): Self = StObject.set(x, "symbolKind", value.asInstanceOf[js.Any])
    
    inline def setSymbolKindUndefined: Self = StObject.set(x, "symbolKind", js.undefined)
    
    inline def setTagSupport(value: `3`): Self = StObject.set(x, "tagSupport", value.asInstanceOf[js.Any])
    
    inline def setTagSupportUndefined: Self = StObject.set(x, "tagSupport", js.undefined)
  }
}
