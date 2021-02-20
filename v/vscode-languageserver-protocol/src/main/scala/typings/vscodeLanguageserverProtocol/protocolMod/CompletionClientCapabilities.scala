package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverProtocol.anon.CommitCharactersSupport
import typings.vscodeLanguageserverProtocol.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompletionClientCapabilities extends StObject {
  
  /**
    * The client supports the following `CompletionItem` specific
    * capabilities.
    */
  var completionItem: js.UndefOr[CommitCharactersSupport] = js.native
  
  var completionItemKind: js.UndefOr[`0`] = js.native
  
  /**
    * The client supports to send additional context information for a
    * `textDocument/completion` requestion.
    */
  var contextSupport: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether completion supports dynamic registration.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.native
}
object CompletionClientCapabilities {
  
  @scala.inline
  def apply(): CompletionClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompletionClientCapabilities]
  }
  
  @scala.inline
  implicit class CompletionClientCapabilitiesMutableBuilder[Self <: CompletionClientCapabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompletionItem(value: CommitCharactersSupport): Self = StObject.set(x, "completionItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletionItemKind(value: `0`): Self = StObject.set(x, "completionItemKind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletionItemKindUndefined: Self = StObject.set(x, "completionItemKind", js.undefined)
    
    @scala.inline
    def setCompletionItemUndefined: Self = StObject.set(x, "completionItem", js.undefined)
    
    @scala.inline
    def setContextSupport(value: Boolean): Self = StObject.set(x, "contextSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextSupportUndefined: Self = StObject.set(x, "contextSupport", js.undefined)
    
    @scala.inline
    def setDynamicRegistration(value: Boolean): Self = StObject.set(x, "dynamicRegistration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicRegistrationUndefined: Self = StObject.set(x, "dynamicRegistration", js.undefined)
  }
}
