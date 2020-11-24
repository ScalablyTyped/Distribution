package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverProtocol.anon.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentSymbolClientCapabilities extends js.Object {
  
  /**
    * Whether document symbol supports dynamic registration.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.native
  
  /**
    * The client support hierarchical document symbols.
    */
  var hierarchicalDocumentSymbolSupport: js.UndefOr[Boolean] = js.native
  
  /**
    * Specific capabilities for the `SymbolKind`.
    */
  var symbolKind: js.UndefOr[`1`] = js.native
}
object DocumentSymbolClientCapabilities {
  
  @scala.inline
  def apply(): DocumentSymbolClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentSymbolClientCapabilities]
  }
  
  @scala.inline
  implicit class DocumentSymbolClientCapabilitiesOps[Self <: DocumentSymbolClientCapabilities] (val x: Self) extends AnyVal {
    
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
    def setDynamicRegistration(value: Boolean): Self = this.set("dynamicRegistration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDynamicRegistration: Self = this.set("dynamicRegistration", js.undefined)
    
    @scala.inline
    def setHierarchicalDocumentSymbolSupport(value: Boolean): Self = this.set("hierarchicalDocumentSymbolSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHierarchicalDocumentSymbolSupport: Self = this.set("hierarchicalDocumentSymbolSupport", js.undefined)
    
    @scala.inline
    def setSymbolKind(value: `1`): Self = this.set("symbolKind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbolKind: Self = this.set("symbolKind", js.undefined)
  }
}
