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
  
  inline def apply[T](element: T): TreeViewExpansionEvent[T] = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeViewExpansionEvent[T]]
  }
  
  extension [Self <: TreeViewExpansionEvent[?], T](x: Self & TreeViewExpansionEvent[T]) {
    
    inline def setElement(value: T): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
  }
}
