package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeViewVisibilityChangeEvent extends StObject {
  
  /**
    * `true` if the {@link TreeView tree view} is visible otherwise `false`.
    */
  val visible: Boolean
}
object TreeViewVisibilityChangeEvent {
  
  inline def apply(visible: Boolean): TreeViewVisibilityChangeEvent = {
    val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeViewVisibilityChangeEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TreeViewVisibilityChangeEvent] (val x: Self) extends AnyVal {
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
