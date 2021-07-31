package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OffsetLeft extends StObject {
  
  var offsetHeight: js.Any
  
  var offsetLeft: Unit
  
  var offsetTop: js.Any
  
  var offsetWidth: Unit
}
object OffsetLeft {
  
  @scala.inline
  def apply(offsetHeight: js.Any, offsetLeft: Unit, offsetTop: js.Any, offsetWidth: Unit): OffsetLeft = {
    val __obj = js.Dynamic.literal(offsetHeight = offsetHeight.asInstanceOf[js.Any], offsetLeft = offsetLeft.asInstanceOf[js.Any], offsetTop = offsetTop.asInstanceOf[js.Any], offsetWidth = offsetWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[OffsetLeft]
  }
  
  @scala.inline
  implicit class OffsetLeftMutableBuilder[Self <: OffsetLeft] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOffsetHeight(value: js.Any): Self = StObject.set(x, "offsetHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetLeft(value: Unit): Self = StObject.set(x, "offsetLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetTop(value: js.Any): Self = StObject.set(x, "offsetTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetWidth(value: Unit): Self = StObject.set(x, "offsetWidth", value.asInstanceOf[js.Any])
  }
}
