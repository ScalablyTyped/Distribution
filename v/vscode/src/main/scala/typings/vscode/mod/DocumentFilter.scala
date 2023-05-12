package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentFilter extends StObject {
  
  /**
  		 * A language id, like `typescript`.
  		 */
  val language: js.UndefOr[String] = js.undefined
  
  /**
  		 * The {@link NotebookDocument.notebookType type} of a notebook, like `jupyter-notebook`. This allows
  		 * to narrow down on the type of a notebook that a {@link NotebookCell.document cell document} belongs to.
  		 *
  		 * *Note* that setting the `notebookType`-property changes how `scheme` and `pattern` are interpreted. When set
  		 * they are evaluated against the {@link NotebookDocument.uri notebook uri}, not the document uri.
  		 *
  		 * @example <caption>Match python document inside jupyter notebook that aren't stored yet (`untitled`)</caption>
  		 * { language: 'python', notebookType: 'jupyter-notebook', scheme: 'untitled' }
  		 */
  val notebookType: js.UndefOr[String] = js.undefined
  
  /**
  		 * A {@link GlobPattern glob pattern} that is matched on the absolute path of the document. Use a {@link RelativePattern relative pattern}
  		 * to filter documents to a {@link WorkspaceFolder workspace folder}.
  		 */
  val pattern: js.UndefOr[GlobPattern] = js.undefined
  
  /**
  		 * A Uri {@link Uri.scheme scheme}, like `file` or `untitled`.
  		 */
  val scheme: js.UndefOr[String] = js.undefined
}
object DocumentFilter {
  
  inline def apply(): DocumentFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentFilter] (val x: Self) extends AnyVal {
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setNotebookType(value: String): Self = StObject.set(x, "notebookType", value.asInstanceOf[js.Any])
    
    inline def setNotebookTypeUndefined: Self = StObject.set(x, "notebookType", js.undefined)
    
    inline def setPattern(value: GlobPattern): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    inline def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    
    inline def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
  }
}
