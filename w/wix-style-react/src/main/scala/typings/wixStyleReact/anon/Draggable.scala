package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Draggable extends StObject {
  
  var content: Any
  
  var disabled: Any
  
  var draggable: Any
}
object Draggable {
  
  inline def apply(content: Any, disabled: Any, draggable: Any): Draggable = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], draggable = draggable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Draggable]
  }
  
  extension [Self <: Draggable](x: Self) {
    
    inline def setContent(value: Any): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: Any): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDraggable(value: Any): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
  }
}
