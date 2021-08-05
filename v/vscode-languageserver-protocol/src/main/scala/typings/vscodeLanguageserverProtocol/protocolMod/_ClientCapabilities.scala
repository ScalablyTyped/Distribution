package typings.vscodeLanguageserverProtocol.protocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _ClientCapabilities extends StObject {
  
  /**
    * Experimental client capabilities.
    */
  var experimental: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Text document specific client capabilities.
    */
  var textDocument: js.UndefOr[TextDocumentClientCapabilities] = js.undefined
  
  /**
    * Window specific client capabilities.
    */
  var window: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Workspace specific client capabilities.
    */
  var workspace: js.UndefOr[WorkspaceClientCapabilities] = js.undefined
}
object _ClientCapabilities {
  
  inline def apply(): _ClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[_ClientCapabilities]
  }
  
  extension [Self <: _ClientCapabilities](x: Self) {
    
    inline def setExperimental(value: js.Object): Self = StObject.set(x, "experimental", value.asInstanceOf[js.Any])
    
    inline def setExperimentalUndefined: Self = StObject.set(x, "experimental", js.undefined)
    
    inline def setTextDocument(value: TextDocumentClientCapabilities): Self = StObject.set(x, "textDocument", value.asInstanceOf[js.Any])
    
    inline def setTextDocumentUndefined: Self = StObject.set(x, "textDocument", js.undefined)
    
    inline def setWindow(value: js.Object): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
    
    inline def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
    
    inline def setWorkspace(value: WorkspaceClientCapabilities): Self = StObject.set(x, "workspace", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceUndefined: Self = StObject.set(x, "workspace", js.undefined)
  }
}
