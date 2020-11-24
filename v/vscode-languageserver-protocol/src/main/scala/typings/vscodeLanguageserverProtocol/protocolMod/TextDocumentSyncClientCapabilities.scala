package typings.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextDocumentSyncClientCapabilities extends js.Object {
  
  /**
    * The client supports did save notifications.
    */
  var didSave: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether text document synchronization supports dynamic registration.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.native
  
  /**
    * The client supports sending will save notifications.
    */
  var willSave: js.UndefOr[Boolean] = js.native
  
  /**
    * The client supports sending a will save request and
    * waits for a response providing text edits which will
    * be applied to the document before it is saved.
    */
  var willSaveWaitUntil: js.UndefOr[Boolean] = js.native
}
object TextDocumentSyncClientCapabilities {
  
  @scala.inline
  def apply(): TextDocumentSyncClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextDocumentSyncClientCapabilities]
  }
  
  @scala.inline
  implicit class TextDocumentSyncClientCapabilitiesOps[Self <: TextDocumentSyncClientCapabilities] (val x: Self) extends AnyVal {
    
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
    def setDidSave(value: Boolean): Self = this.set("didSave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDidSave: Self = this.set("didSave", js.undefined)
    
    @scala.inline
    def setDynamicRegistration(value: Boolean): Self = this.set("dynamicRegistration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDynamicRegistration: Self = this.set("dynamicRegistration", js.undefined)
    
    @scala.inline
    def setWillSave(value: Boolean): Self = this.set("willSave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWillSave: Self = this.set("willSave", js.undefined)
    
    @scala.inline
    def setWillSaveWaitUntil(value: Boolean): Self = this.set("willSaveWaitUntil", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWillSaveWaitUntil: Self = this.set("willSaveWaitUntil", js.undefined)
  }
}
