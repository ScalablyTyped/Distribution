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
  
  inline def apply[T](selection: js.Array[T]): TreeViewSelectionChangeEvent[T] = {
    val __obj = js.Dynamic.literal(selection = selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeViewSelectionChangeEvent[T]]
  }
  
  extension [Self <: TreeViewSelectionChangeEvent[?], T](x: Self & TreeViewSelectionChangeEvent[T]) {
    
    inline def setSelection(value: js.Array[T]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    
    inline def setSelectionVarargs(value: T*): Self = StObject.set(x, "selection", js.Array(value :_*))
  }
}
