package typings.vscodeLanguageserverProtocol.protocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextDocumentSyncClientCapabilities extends StObject {
  
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
  implicit class TextDocumentSyncClientCapabilitiesMutableBuilder[Self <: TextDocumentSyncClientCapabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDidSave(value: Boolean): Self = StObject.set(x, "didSave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDidSaveUndefined: Self = StObject.set(x, "didSave", js.undefined)
    
    @scala.inline
    def setDynamicRegistration(value: Boolean): Self = StObject.set(x, "dynamicRegistration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicRegistrationUndefined: Self = StObject.set(x, "dynamicRegistration", js.undefined)
    
    @scala.inline
    def setWillSave(value: Boolean): Self = StObject.set(x, "willSave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWillSaveUndefined: Self = StObject.set(x, "willSave", js.undefined)
    
    @scala.inline
    def setWillSaveWaitUntil(value: Boolean): Self = StObject.set(x, "willSaveWaitUntil", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWillSaveWaitUntilUndefined: Self = StObject.set(x, "willSaveWaitUntil", js.undefined)
  }
}
