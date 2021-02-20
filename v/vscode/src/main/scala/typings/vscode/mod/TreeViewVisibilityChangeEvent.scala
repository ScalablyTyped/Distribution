package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeViewVisibilityChangeEvent extends StObject {
  
  /**
    * `true` if the [tree view](#TreeView) is visible otherwise `false`.
    */
  val visible: Boolean = js.native
}
object TreeViewVisibilityChangeEvent {
  
  @scala.inline
  def apply(visible: Boolean): TreeViewVisibilityChangeEvent = {
    val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeViewVisibilityChangeEvent]
  }
  
  @scala.inline
  implicit class TreeViewVisibilityChangeEventMutableBuilder[Self <: TreeViewVisibilityChangeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
