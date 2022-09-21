package typings.vscodeLanguageserverProtocol.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NotebookDocument {
  
  @JSImport("vscode-languageserver-protocol", "NotebookDocument")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(
    uri: typings.vscodeLanguageserverTypes.mod.URI,
    notebookType: String,
    version: typings.vscodeLanguageserverTypes.mod.integer,
    cells: js.Array[typings.vscodeLanguageserverProtocol.protocolNotebookMod.NotebookCell]
  ): typings.vscodeLanguageserverProtocol.protocolNotebookMod.NotebookDocument = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(uri.asInstanceOf[js.Any], notebookType.asInstanceOf[js.Any], version.asInstanceOf[js.Any], cells.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverProtocol.protocolNotebookMod.NotebookDocument]
  
  inline def is(value: Any): /* is vscode-languageserver-protocol.vscode-languageserver-protocol/lib/common/protocol.notebook.NotebookDocument */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-protocol.vscode-languageserver-protocol/lib/common/protocol.notebook.NotebookDocument */ Boolean]
}
