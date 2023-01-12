package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import typings.vscodeLanguageserverTypes.mod.LSPAny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientCapabilities extends StObject {
  
  /**
    * Experimental client capabilities.
    */
  var experimental: js.UndefOr[LSPAny] = js.undefined
  
  /**
    * General client capabilities.
    *
    * @since 3.16.0
    */
  var general: js.UndefOr[GeneralClientCapabilities] = js.undefined
  
  /**
    * Capabilities specific to the notebook document support.
    *
    * @since 3.17.0
    */
  var notebookDocument: js.UndefOr[NotebookDocumentClientCapabilities] = js.undefined
  
  /**
    * Text document specific client capabilities.
    */
  var textDocument: js.UndefOr[TextDocumentClientCapabilities] = js.undefined
  
  /**
    * Window specific client capabilities.
    */
  var window: js.UndefOr[WindowClientCapabilities] = js.undefined
  
  /**
    * Workspace specific client capabilities.
    */
  var workspace: js.UndefOr[WorkspaceClientCapabilities] = js.undefined
}
object ClientCapabilities {
  
  inline def apply(): ClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientCapabilities]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClientCapabilities] (val x: Self) extends AnyVal {
    
    inline def setExperimental(value: LSPAny): Self = StObject.set(x, "experimental", value.asInstanceOf[js.Any])
    
    inline def setExperimentalUndefined: Self = StObject.set(x, "experimental", js.undefined)
    
    inline def setGeneral(value: GeneralClientCapabilities): Self = StObject.set(x, "general", value.asInstanceOf[js.Any])
    
    inline def setGeneralUndefined: Self = StObject.set(x, "general", js.undefined)
    
    inline def setNotebookDocument(value: NotebookDocumentClientCapabilities): Self = StObject.set(x, "notebookDocument", value.asInstanceOf[js.Any])
    
    inline def setNotebookDocumentUndefined: Self = StObject.set(x, "notebookDocument", js.undefined)
    
    inline def setTextDocument(value: TextDocumentClientCapabilities): Self = StObject.set(x, "textDocument", value.asInstanceOf[js.Any])
    
    inline def setTextDocumentUndefined: Self = StObject.set(x, "textDocument", js.undefined)
    
    inline def setWindow(value: WindowClientCapabilities): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
    
    inline def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
    
    inline def setWorkspace(value: WorkspaceClientCapabilities): Self = StObject.set(x, "workspace", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceUndefined: Self = StObject.set(x, "workspace", js.undefined)
  }
}
