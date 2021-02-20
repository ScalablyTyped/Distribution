package typings.vscodeLanguageserverProtocol.protocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait _ClientCapabilities extends StObject {
  
  /**
    * Experimental client capabilities.
    */
  var experimental: js.UndefOr[js.Object] = js.native
  
  /**
    * Text document specific client capabilities.
    */
  var textDocument: js.UndefOr[TextDocumentClientCapabilities] = js.native
  
  /**
    * Window specific client capabilities.
    */
  var window: js.UndefOr[js.Object] = js.native
  
  /**
    * Workspace specific client capabilities.
    */
  var workspace: js.UndefOr[WorkspaceClientCapabilities] = js.native
}
object _ClientCapabilities {
  
  @scala.inline
  def apply(): _ClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[_ClientCapabilities]
  }
  
  @scala.inline
  implicit class _ClientCapabilitiesMutableBuilder[Self <: _ClientCapabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExperimental(value: js.Object): Self = StObject.set(x, "experimental", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExperimentalUndefined: Self = StObject.set(x, "experimental", js.undefined)
    
    @scala.inline
    def setTextDocument(value: TextDocumentClientCapabilities): Self = StObject.set(x, "textDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextDocumentUndefined: Self = StObject.set(x, "textDocument", js.undefined)
    
    @scala.inline
    def setWindow(value: js.Object): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
    
    @scala.inline
    def setWorkspace(value: WorkspaceClientCapabilities): Self = StObject.set(x, "workspace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkspaceUndefined: Self = StObject.set(x, "workspace", js.undefined)
  }
}
