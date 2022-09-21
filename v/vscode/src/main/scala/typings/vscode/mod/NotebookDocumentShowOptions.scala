package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotebookDocumentShowOptions extends StObject {
  
  /**
    * An optional flag that when `true` will stop the {@link NotebookEditor notebook editor} from taking focus.
    */
  val preserveFocus: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An optional flag that controls if an {@link NotebookEditor notebook editor}-tab shows as preview. Preview tabs will
    * be replaced and reused until set to stay - either explicitly or through editing. The default behaviour depends
    * on the `workbench.editor.enablePreview`-setting.
    */
  val preview: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An optional selection to apply for the document in the {@link NotebookEditor notebook editor}.
    */
  val selections: js.UndefOr[js.Array[NotebookRange]] = js.undefined
  
  /**
    * An optional view column in which the {@link NotebookEditor notebook editor} should be shown.
    * The default is the {@link ViewColumn.Active active}. Columns that do not exist
    * will be created as needed up to the maximum of {@linkcode ViewColumn.Nine}.
    * Use {@linkcode ViewColumn.Beside} to open the editor to the side of the currently
    * active one.
    */
  val viewColumn: js.UndefOr[ViewColumn] = js.undefined
}
object NotebookDocumentShowOptions {
  
  inline def apply(): NotebookDocumentShowOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotebookDocumentShowOptions]
  }
  
  extension [Self <: NotebookDocumentShowOptions](x: Self) {
    
    inline def setPreserveFocus(value: Boolean): Self = StObject.set(x, "preserveFocus", value.asInstanceOf[js.Any])
    
    inline def setPreserveFocusUndefined: Self = StObject.set(x, "preserveFocus", js.undefined)
    
    inline def setPreview(value: Boolean): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
    
    inline def setPreviewUndefined: Self = StObject.set(x, "preview", js.undefined)
    
    inline def setSelections(value: js.Array[NotebookRange]): Self = StObject.set(x, "selections", value.asInstanceOf[js.Any])
    
    inline def setSelectionsUndefined: Self = StObject.set(x, "selections", js.undefined)
    
    inline def setSelectionsVarargs(value: NotebookRange*): Self = StObject.set(x, "selections", js.Array(value*))
    
    inline def setViewColumn(value: ViewColumn): Self = StObject.set(x, "viewColumn", value.asInstanceOf[js.Any])
    
    inline def setViewColumnUndefined: Self = StObject.set(x, "viewColumn", js.undefined)
  }
}
