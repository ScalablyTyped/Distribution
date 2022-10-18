package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import typings.vscodeLanguageserverProtocol.anon.`2`
import typings.vscodeLanguageserverProtocol.anon.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentSymbolClientCapabilities extends StObject {
  
  /**
    * Whether document symbol supports dynamic registration.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The client supports hierarchical document symbols.
    */
  var hierarchicalDocumentSymbolSupport: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The client supports an additional label presented in the UI when
    * registering a document symbol provider.
    *
    * @since 3.16.0
    */
  var labelSupport: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specific capabilities for the `SymbolKind` in the
    * `textDocument/documentSymbol` request.
    */
  var symbolKind: js.UndefOr[`2`] = js.undefined
  
  /**
    * The client supports tags on `SymbolInformation`. Tags are supported on
    * `DocumentSymbol` if `hierarchicalDocumentSymbolSupport` is set to true.
    * Clients supporting tags have to handle unknown tags gracefully.
    *
    * @since 3.16.0
    */
  var tagSupport: js.UndefOr[`3`] = js.undefined
}
object DocumentSymbolClientCapabilities {
  
  inline def apply(): DocumentSymbolClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentSymbolClientCapabilities]
  }
  
  extension [Self <: DocumentSymbolClientCapabilities](x: Self) {
    
    inline def setDynamicRegistration(value: Boolean): Self = StObject.set(x, "dynamicRegistration", value.asInstanceOf[js.Any])
    
    inline def setDynamicRegistrationUndefined: Self = StObject.set(x, "dynamicRegistration", js.undefined)
    
    inline def setHierarchicalDocumentSymbolSupport(value: Boolean): Self = StObject.set(x, "hierarchicalDocumentSymbolSupport", value.asInstanceOf[js.Any])
    
    inline def setHierarchicalDocumentSymbolSupportUndefined: Self = StObject.set(x, "hierarchicalDocumentSymbolSupport", js.undefined)
    
    inline def setLabelSupport(value: Boolean): Self = StObject.set(x, "labelSupport", value.asInstanceOf[js.Any])
    
    inline def setLabelSupportUndefined: Self = StObject.set(x, "labelSupport", js.undefined)
    
    inline def setSymbolKind(value: `2`): Self = StObject.set(x, "symbolKind", value.asInstanceOf[js.Any])
    
    inline def setSymbolKindUndefined: Self = StObject.set(x, "symbolKind", js.undefined)
    
    inline def setTagSupport(value: `3`): Self = StObject.set(x, "tagSupport", value.asInstanceOf[js.Any])
    
    inline def setTagSupportUndefined: Self = StObject.set(x, "tagSupport", js.undefined)
  }
}
