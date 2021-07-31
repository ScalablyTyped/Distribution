package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeViewExpansionEvent[T] extends StObject {
  
  /**
    * Element that is expanded or collapsed.
    */
  val element: T
}
object TreeViewExpansionEvent {
  
  @scala.inline
  def apply[T](element: T): TreeViewExpansionEvent[T] = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeViewExpansionEvent[T]]
  }
  
  @scala.inline
  implicit class TreeViewExpansionEventMutableBuilder[Self <: TreeViewExpansionEvent[?], T] (val x: Self & TreeViewExpansionEvent[T]) extends AnyVal {
    
    @scala.inline
    def setElement(value: T): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
  }
}
