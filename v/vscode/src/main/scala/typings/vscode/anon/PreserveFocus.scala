package typings.vscode.anon

import typings.vscode.mod.ViewColumn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreserveFocus extends StObject {
  
  var preserveFocus: js.UndefOr[Boolean] = js.native
  
  var viewColumn: ViewColumn = js.native
}
object PreserveFocus {
  
  @scala.inline
  def apply(viewColumn: ViewColumn): PreserveFocus = {
    val __obj = js.Dynamic.literal(viewColumn = viewColumn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreserveFocus]
  }
  
  @scala.inline
  implicit class PreserveFocusMutableBuilder[Self <: PreserveFocus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreserveFocus(value: Boolean): Self = StObject.set(x, "preserveFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveFocusUndefined: Self = StObject.set(x, "preserveFocus", js.undefined)
    
    @scala.inline
    def setViewColumn(value: ViewColumn): Self = StObject.set(x, "viewColumn", value.asInstanceOf[js.Any])
  }
}
