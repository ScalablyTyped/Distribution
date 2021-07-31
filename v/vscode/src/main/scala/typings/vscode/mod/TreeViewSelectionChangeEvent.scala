package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeViewSelectionChangeEvent[T] extends StObject {
  
  /**
    * Selected elements.
    */
  val selection: js.Array[T]
}
object TreeViewSelectionChangeEvent {
  
  @scala.inline
  def apply[T](selection: js.Array[T]): TreeViewSelectionChangeEvent[T] = {
    val __obj = js.Dynamic.literal(selection = selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeViewSelectionChangeEvent[T]]
  }
  
  @scala.inline
  implicit class TreeViewSelectionChangeEventMutableBuilder[Self <: TreeViewSelectionChangeEvent[?], T] (val x: Self & TreeViewSelectionChangeEvent[T]) extends AnyVal {
    
    @scala.inline
    def setSelection(value: js.Array[T]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionVarargs(value: T*): Self = StObject.set(x, "selection", js.Array(value :_*))
  }
}
