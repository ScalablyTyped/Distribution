package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextDocumentShowOptions extends StObject {
  
  /**
    * An optional flag that when `true` will stop the [editor](#TextEditor) from taking focus.
    */
  var preserveFocus: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An optional flag that controls if an [editor](#TextEditor)-tab will be replaced
    * with the next editor or if it will be kept.
    */
  var preview: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An optional selection to apply for the document in the [editor](#TextEditor).
    */
  var selection: js.UndefOr[Range] = js.undefined
  
  /**
    * An optional view column in which the [editor](#TextEditor) should be shown.
    * The default is the [active](#ViewColumn.Active), other values are adjusted to
    * be `Min(column, columnCount + 1)`, the [active](#ViewColumn.Active)-column is
    * not adjusted. Use [`ViewColumn.Beside`](#ViewColumn.Beside) to open the
    * editor to the side of the currently active one.
    */
  var viewColumn: js.UndefOr[ViewColumn] = js.undefined
}
object TextDocumentShowOptions {
  
  inline def apply(): TextDocumentShowOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextDocumentShowOptions]
  }
  
  extension [Self <: TextDocumentShowOptions](x: Self) {
    
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
