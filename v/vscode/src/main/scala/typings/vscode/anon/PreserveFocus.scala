package typings.vscode.anon

import typings.vscode.mod.ViewColumn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreserveFocus extends StObject {
  
  val preserveFocus: js.UndefOr[Boolean] = js.undefined
  
  val viewColumn: ViewColumn
}
object PreserveFocus {
  
  inline def apply(viewColumn: ViewColumn): PreserveFocus = {
    val __obj = js.Dynamic.literal(viewColumn = viewColumn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreserveFocus]
  }
  
  extension [Self <: PreserveFocus](x: Self) {
    
    inline def setPreserveFocus(value: Boolean): Self = StObject.set(x, "preserveFocus", value.asInstanceOf[js.Any])
    
    inline def setPreserveFocusUndefined: Self = StObject.set(x, "preserveFocus", js.undefined)
    
    inline def setViewColumn(value: ViewColumn): Self = StObject.set(x, "viewColumn", value.asInstanceOf[js.Any])
  }
}
