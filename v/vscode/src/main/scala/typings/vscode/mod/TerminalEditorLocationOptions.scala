package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TerminalEditorLocationOptions extends StObject {
  
  /**
    * An optional flag that when `true` will stop the {@link Terminal} from taking focus.
    */
  var preserveFocus: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A view column in which the {@link Terminal terminal} should be shown in the editor area.
    * The default is the {@link ViewColumn.Active active}. Columns that do not exist
    * will be created as needed up to the maximum of {@linkcode ViewColumn.Nine}.
    * Use {@linkcode ViewColumn.Beside} to open the editor to the side of the currently
    * active one.
    */
  var viewColumn: ViewColumn
}
object TerminalEditorLocationOptions {
  
  inline def apply(viewColumn: ViewColumn): TerminalEditorLocationOptions = {
    val __obj = js.Dynamic.literal(viewColumn = viewColumn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerminalEditorLocationOptions]
  }
  
  extension [Self <: TerminalEditorLocationOptions](x: Self) {
    
    inline def setPreserveFocus(value: Boolean): Self = StObject.set(x, "preserveFocus", value.asInstanceOf[js.Any])
    
    inline def setPreserveFocusUndefined: Self = StObject.set(x, "preserveFocus", js.undefined)
    
    inline def setViewColumn(value: ViewColumn): Self = StObject.set(x, "viewColumn", value.asInstanceOf[js.Any])
  }
}
