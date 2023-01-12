package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import typings.vscodeLanguageserverProtocol.anon.CommitCharactersSupport
import typings.vscodeLanguageserverProtocol.anon.ItemDefaults
import typings.vscodeLanguageserverProtocol.anon.`1`
import typings.vscodeLanguageserverTypes.mod.InsertTextMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompletionClientCapabilities extends StObject {
  
  /**
    * The client supports the following `CompletionItem` specific
    * capabilities.
    */
  var completionItem: js.UndefOr[CommitCharactersSupport] = js.undefined
  
  var completionItemKind: js.UndefOr[`1`] = js.undefined
  
  /**
    * The client supports the following `CompletionList` specific
    * capabilities.
    *
    * @since 3.17.0
    */
  var completionList: js.UndefOr[ItemDefaults] = js.undefined
  
  /**
    * The client supports to send additional context information for a
    * `textDocument/completion` request.
    */
  var contextSupport: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether completion supports dynamic registration.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defines how the client handles whitespace and indentation
    * when accepting a completion item that uses multi line
    * text in either `insertText` or `textEdit`.
    *
    * @since 3.17.0
    */
  var insertTextMode: js.UndefOr[InsertTextMode] = js.undefined
}
object CompletionClientCapabilities {
  
  inline def apply(): CompletionClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompletionClientCapabilities]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompletionClientCapabilities] (val x: Self) extends AnyVal {
    
    inline def setCompletionItem(value: CommitCharactersSupport): Self = StObject.set(x, "completionItem", value.asInstanceOf[js.Any])
    
    inline def setCompletionItemKind(value: `1`): Self = StObject.set(x, "completionItemKind", value.asInstanceOf[js.Any])
    
    inline def setCompletionItemKindUndefined: Self = StObject.set(x, "completionItemKind", js.undefined)
    
    inline def setCompletionItemUndefined: Self = StObject.set(x, "completionItem", js.undefined)
    
    inline def setCompletionList(value: ItemDefaults): Self = StObject.set(x, "completionList", value.asInstanceOf[js.Any])
    
    inline def setCompletionListUndefined: Self = StObject.set(x, "completionList", js.undefined)
    
    inline def setContextSupport(value: Boolean): Self = StObject.set(x, "contextSupport", value.asInstanceOf[js.Any])
    
    inline def setContextSupportUndefined: Self = StObject.set(x, "contextSupport", js.undefined)
    
    inline def setDynamicRegistration(value: Boolean): Self = StObject.set(x, "dynamicRegistration", value.asInstanceOf[js.Any])
    
    inline def setDynamicRegistrationUndefined: Self = StObject.set(x, "dynamicRegistration", js.undefined)
    
    inline def setInsertTextMode(value: InsertTextMode): Self = StObject.set(x, "insertTextMode", value.asInstanceOf[js.Any])
    
    inline def setInsertTextModeUndefined: Self = StObject.set(x, "insertTextMode", js.undefined)
  }
}
