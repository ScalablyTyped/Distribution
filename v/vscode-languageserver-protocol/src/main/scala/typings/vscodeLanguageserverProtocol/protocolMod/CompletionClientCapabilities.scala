package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverProtocol.anon.CommitCharactersSupport
import typings.vscodeLanguageserverProtocol.anon.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompletionClientCapabilities extends js.Object {
  
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
  implicit class CompletionClientCapabilitiesOps[Self <: CompletionClientCapabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCompletionItem(value: CommitCharactersSupport): Self = this.set("completionItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompletionItem: Self = this.set("completionItem", js.undefined)
    
    @scala.inline
    def setCompletionItemKind(value: `0`): Self = this.set("completionItemKind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompletionItemKind: Self = this.set("completionItemKind", js.undefined)
    
    @scala.inline
    def setContextSupport(value: Boolean): Self = this.set("contextSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextSupport: Self = this.set("contextSupport", js.undefined)
    
    @scala.inline
    def setDynamicRegistration(value: Boolean): Self = this.set("dynamicRegistration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDynamicRegistration: Self = this.set("dynamicRegistration", js.undefined)
  }
}
