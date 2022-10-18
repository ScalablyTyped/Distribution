package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotebookCellTextDocumentFilter
  extends StObject
     with DocumentFilter {
  
  /**
    * A language id like `python`.
    *
    * Will be matched against the language id of the
    * notebook cell document. '*' matches every language.
    */
  var language: js.UndefOr[String] = js.undefined
  
  /**
    * A filter that matches against the notebook
    * containing the notebook cell. If a string
    * value is provided it matches against the
    * notebook type. '*' matches every notebook.
    */
  var notebook: String | NotebookDocumentFilter
}
object NotebookCellTextDocumentFilter {
  
  inline def apply(notebook: String | NotebookDocumentFilter): NotebookCellTextDocumentFilter = {
    val __obj = js.Dynamic.literal(notebook = notebook.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotebookCellTextDocumentFilter]
  }
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "NotebookCellTextDocumentFilter")
  @js.native
  val ^ : js.Any = js.native
  
  inline def is(value: Any): /* is vscode-languageserver-protocol.vscode-languageserver-protocol/lib/common/protocol.NotebookCellTextDocumentFilter */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-protocol.vscode-languageserver-protocol/lib/common/protocol.NotebookCellTextDocumentFilter */ Boolean]
  
  extension [Self <: NotebookCellTextDocumentFilter](x: Self) {
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setNotebook(value: String | NotebookDocumentFilter): Self = StObject.set(x, "notebook", value.asInstanceOf[js.Any])
  }
}
