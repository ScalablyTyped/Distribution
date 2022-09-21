package typings.vscodeLanguageserverProtocol.protocolNotebookMod

import typings.vscodeLanguageserverTypes.mod.LSPObject
import typings.vscodeLanguageserverTypes.mod.URI
import typings.vscodeLanguageserverTypes.mod.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotebookDocument extends StObject {
  
  /**
    * The cells of a notebook.
    */
  var cells: js.Array[NotebookCell]
  
  /**
    * Additional metadata stored with the notebook
    * document.
    *
    * Note: should always be an object literal (e.g. LSPObject)
    */
  var metadata: js.UndefOr[LSPObject] = js.undefined
  
  /**
    * The type of the notebook.
    */
  var notebookType: String
  
  /**
    * The notebook document's uri.
    */
  var uri: URI
  
  /**
    * The version number of this document (it will increase after each
    * change, including undo/redo).
    */
  var version: integer
}
object NotebookDocument {
  
  inline def apply(cells: js.Array[NotebookCell], notebookType: String, uri: URI, version: integer): NotebookDocument = {
    val __obj = js.Dynamic.literal(cells = cells.asInstanceOf[js.Any], notebookType = notebookType.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotebookDocument]
  }
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol.notebook", "NotebookDocument")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(uri: URI, notebookType: String, version: integer, cells: js.Array[NotebookCell]): NotebookDocument = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(uri.asInstanceOf[js.Any], notebookType.asInstanceOf[js.Any], version.asInstanceOf[js.Any], cells.asInstanceOf[js.Any])).asInstanceOf[NotebookDocument]
  
  inline def is(value: Any): /* is vscode-languageserver-protocol.vscode-languageserver-protocol/lib/common/protocol.notebook.NotebookDocument */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-protocol.vscode-languageserver-protocol/lib/common/protocol.notebook.NotebookDocument */ Boolean]
  
  extension [Self <: NotebookDocument](x: Self) {
    
    inline def setCells(value: js.Array[NotebookCell]): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
    
    inline def setCellsVarargs(value: NotebookCell*): Self = StObject.set(x, "cells", js.Array(value*))
    
    inline def setMetadata(value: LSPObject): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setNotebookType(value: String): Self = StObject.set(x, "notebookType", value.asInstanceOf[js.Any])
    
    inline def setUri(value: URI): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: integer): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
