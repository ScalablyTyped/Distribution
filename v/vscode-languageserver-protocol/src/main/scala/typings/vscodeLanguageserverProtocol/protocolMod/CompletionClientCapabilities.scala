package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverProtocol.anon.CommitCharactersSupport
import typings.vscodeLanguageserverProtocol.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompletionClientCapabilities extends StObject {
  
  /**
    * The client supports the following `CompletionItem` specific
    * capabilities.
    */
  var completionItem: js.UndefOr[CommitCharactersSupport] = js.undefined
  
  var completionItemKind: js.UndefOr[`0`] = js.undefined
  
  /**
    * The client supports to send additional context information for a
    * `textDocument/completion` requestion.
    */
  var contextSupport: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether completion supports dynamic registration.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.undefined
}
object CompletionClientCapabilities {
  
  inline def apply(): CompletionClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompletionClientCapabilities]
  }
  
  extension [Self <: CompletionClientCapabilities](x: Self) {
    
    inline def setCompletionItem(value: CommitCharactersSupport): Self = StObject.set(x, "completionItem", value.asInstanceOf[js.Any])
    
    inline def setCompletionItemKind(value: `0`): Self = StObject.set(x, "completionItemKind", value.asInstanceOf[js.Any])
    
    inline def setCompletionItemKindUndefined: Self = StObject.set(x, "completionItemKind", js.undefined)
    
    inline def setCompletionItemUndefined: Self = StObject.set(x, "completionItem", js.undefined)
    
    inline def setContextSupport(value: Boolean): Self = StObject.set(x, "contextSupport", value.asInstanceOf[js.Any])
    
    inline def setContextSupportUndefined: Self = StObject.set(x, "contextSupport", js.undefined)
    
    inline def setDynamicRegistration(value: Boolean): Self = StObject.set(x, "dynamicRegistration", value.asInstanceOf[js.Any])
    
    inline def setDynamicRegistrationUndefined: Self = StObject.set(x, "dynamicRegistration", js.undefined)
  }
}
