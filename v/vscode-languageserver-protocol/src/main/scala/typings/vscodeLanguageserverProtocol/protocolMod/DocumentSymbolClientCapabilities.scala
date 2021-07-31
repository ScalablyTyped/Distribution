package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverProtocol.anon.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentSymbolClientCapabilities extends StObject {
  
  /**
    * Whether document symbol supports dynamic registration.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The client support hierarchical document symbols.
    */
  var hierarchicalDocumentSymbolSupport: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specific capabilities for the `SymbolKind`.
    */
  var symbolKind: js.UndefOr[`1`] = js.undefined
}
object DocumentSymbolClientCapabilities {
  
  @scala.inline
  def apply(): DocumentSymbolClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentSymbolClientCapabilities]
  }
  
  @scala.inline
  implicit class DocumentSymbolClientCapabilitiesMutableBuilder[Self <: DocumentSymbolClientCapabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDynamicRegistration(value: Boolean): Self = StObject.set(x, "dynamicRegistration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicRegistrationUndefined: Self = StObject.set(x, "dynamicRegistration", js.undefined)
    
    @scala.inline
    def setHierarchicalDocumentSymbolSupport(value: Boolean): Self = StObject.set(x, "hierarchicalDocumentSymbolSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHierarchicalDocumentSymbolSupportUndefined: Self = StObject.set(x, "hierarchicalDocumentSymbolSupport", js.undefined)
    
    @scala.inline
    def setSymbolKind(value: `1`): Self = StObject.set(x, "symbolKind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolKindUndefined: Self = StObject.set(x, "symbolKind", js.undefined)
  }
}
