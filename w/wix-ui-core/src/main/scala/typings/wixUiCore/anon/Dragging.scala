package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dragging extends StObject {
  
  var dragging: Boolean
  
  var inKeyPress: Boolean
  
  var mouseDown: Boolean
  
  var thumbHover: Boolean
}
object Dragging {
  
  @scala.inline
  def apply(dragging: Boolean, inKeyPress: Boolean, mouseDown: Boolean, thumbHover: Boolean): Dragging = {
    val __obj = js.Dynamic.literal(dragging = dragging.asInstanceOf[js.Any], inKeyPress = inKeyPress.asInstanceOf[js.Any], mouseDown = mouseDown.asInstanceOf[js.Any], thumbHover = thumbHover.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dragging]
  }
  
  @scala.inline
  implicit class DraggingMutableBuilder[Self <: Dragging] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDragging(value: Boolean): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInKeyPress(value: Boolean): Self = StObject.set(x, "inKeyPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseDown(value: Boolean): Self = StObject.set(x, "mouseDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbHover(value: Boolean): Self = StObject.set(x, "thumbHover", value.asInstanceOf[js.Any])
  }
}
