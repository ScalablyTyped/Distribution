package typings.vscodeLanguageserverProtocol.protocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentFilter
  - typings.vscodeLanguageserverProtocol.protocolMod.NotebookCellTextDocumentFilter
*/
trait DocumentFilter extends StObject
object DocumentFilter {
  
  inline def Language(language: String): typings.vscodeLanguageserverProtocol.anon.Language = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vscodeLanguageserverProtocol.anon.Language]
  }
  
  inline def NotebookCellTextDocumentFilter(notebook: String | NotebookDocumentFilter): typings.vscodeLanguageserverProtocol.protocolMod.NotebookCellTextDocumentFilter = {
    val __obj = js.Dynamic.literal(notebook = notebook.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vscodeLanguageserverProtocol.protocolMod.NotebookCellTextDocumentFilter]
  }
  
  inline def Pattern(scheme: String): typings.vscodeLanguageserverProtocol.anon.Pattern = {
    val __obj = js.Dynamic.literal(scheme = scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vscodeLanguageserverProtocol.anon.Pattern]
  }
  
  inline def Scheme(pattern: String): typings.vscodeLanguageserverProtocol.anon.Scheme = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vscodeLanguageserverProtocol.anon.Scheme]
  }
}
