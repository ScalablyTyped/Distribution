package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OffsetHeight extends StObject {
  
  var offsetHeight: Unit
  
  var offsetLeft: Unit
  
  var offsetTop: Unit
  
  var offsetWidth: Unit
}
object OffsetHeight {
  
  inline def apply(offsetHeight: Unit, offsetLeft: Unit, offsetTop: Unit, offsetWidth: Unit): OffsetHeight = {
    val __obj = js.Dynamic.literal(offsetHeight = offsetHeight.asInstanceOf[js.Any], offsetLeft = offsetLeft.asInstanceOf[js.Any], offsetTop = offsetTop.asInstanceOf[js.Any], offsetWidth = offsetWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[OffsetHeight]
  }
  
  extension [Self <: OffsetHeight](x: Self) {
    
    inline def setOffsetHeight(value: Unit): Self = StObject.set(x, "offsetHeight", value.asInstanceOf[js.Any])
    
    inline def setOffsetLeft(value: Unit): Self = StObject.set(x, "offsetLeft", value.asInstanceOf[js.Any])
    
    inline def setOffsetTop(value: Unit): Self = StObject.set(x, "offsetTop", value.asInstanceOf[js.Any])
    
    inline def setOffsetWidth(value: Unit): Self = StObject.set(x, "offsetWidth", value.asInstanceOf[js.Any])
  }
}
