package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextDocumentShowOptions extends StObject {
  
  /**
  		 * An optional flag that when `true` will stop the {@link TextEditor editor} from taking focus.
  		 */
  var preserveFocus: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * An optional flag that controls if an {@link TextEditor editor}-tab shows as preview. Preview tabs will
  		 * be replaced and reused until set to stay - either explicitly or through editing.
  		 *
  		 * *Note* that the flag is ignored if a user has disabled preview editors in settings.
  		 */
  var preview: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * An optional selection to apply for the document in the {@link TextEditor editor}.
  		 */
  var selection: js.UndefOr[Range] = js.undefined
  
  /**
  		 * An optional view column in which the {@link TextEditor editor} should be shown.
  		 * The default is the {@link ViewColumn.Active active}. Columns that do not exist
  		 * will be created as needed up to the maximum of {@linkcode ViewColumn.Nine}.
  		 * Use {@linkcode ViewColumn.Beside} to open the editor to the side of the currently
  		 * active one.
  		 */
  var viewColumn: js.UndefOr[ViewColumn] = js.undefined
}
object TextDocumentShowOptions {
  
  inline def apply(): TextDocumentShowOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextDocumentShowOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextDocumentShowOptions] (val x: Self) extends AnyVal {
    
    inline def setPreserveFocus(value: Boolean): Self = StObject.set(x, "preserveFocus", value.asInstanceOf[js.Any])
    
    inline def setPreserveFocusUndefined: Self = StObject.set(x, "preserveFocus", js.undefined)
    
    inline def setPreview(value: Boolean): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
    
    inline def setPreviewUndefined: Self = StObject.set(x, "preview", js.undefined)
    
    inline def setSelection(value: Range): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    
    inline def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
    
    inline def setViewColumn(value: ViewColumn): Self = StObject.set(x, "viewColumn", value.asInstanceOf[js.Any])
    
    inline def setViewColumnUndefined: Self = StObject.set(x, "viewColumn", js.undefined)
  }
}
