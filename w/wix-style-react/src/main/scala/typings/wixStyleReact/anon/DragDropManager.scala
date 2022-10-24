package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragDropManager extends StObject {
  
  var dragDropManager: Any
}
object DragDropManager {
  
  inline def apply(dragDropManager: Any): DragDropManager = {
    val __obj = js.Dynamic.literal(dragDropManager = dragDropManager.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragDropManager]
  }
  
  extension [Self <: DragDropManager](x: Self) {
    
    inline def setDragDropManager(value: Any): Self = StObject.set(x, "dragDropManager", value.asInstanceOf[js.Any])
  }
}
