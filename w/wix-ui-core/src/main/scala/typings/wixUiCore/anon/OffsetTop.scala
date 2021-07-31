package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OffsetTop extends StObject {
  
  var offsetHeight: Unit
  
  var offsetLeft: js.Any
  
  var offsetTop: Unit
  
  var offsetWidth: js.Any
}
object OffsetTop {
  
  @scala.inline
  def apply(offsetHeight: Unit, offsetLeft: js.Any, offsetTop: Unit, offsetWidth: js.Any): OffsetTop = {
    val __obj = js.Dynamic.literal(offsetHeight = offsetHeight.asInstanceOf[js.Any], offsetLeft = offsetLeft.asInstanceOf[js.Any], offsetTop = offsetTop.asInstanceOf[js.Any], offsetWidth = offsetWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[OffsetTop]
  }
  
  @scala.inline
  implicit class OffsetTopMutableBuilder[Self <: OffsetTop] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOffsetHeight(value: Unit): Self = StObject.set(x, "offsetHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetLeft(value: js.Any): Self = StObject.set(x, "offsetLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetTop(value: Unit): Self = StObject.set(x, "offsetTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetWidth(value: js.Any): Self = StObject.set(x, "offsetWidth", value.asInstanceOf[js.Any])
  }
}
