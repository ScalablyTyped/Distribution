package typings.victoryBrushLine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxHandle extends StObject {
  
  var brush: Boolean
  
  var maxHandle: Boolean
  
  var minHandle: Boolean
}
object MaxHandle {
  
  inline def apply(brush: Boolean, maxHandle: Boolean, minHandle: Boolean): MaxHandle = {
    val __obj = js.Dynamic.literal(brush = brush.asInstanceOf[js.Any], maxHandle = maxHandle.asInstanceOf[js.Any], minHandle = minHandle.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxHandle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MaxHandle] (val x: Self) extends AnyVal {
    
    inline def setBrush(value: Boolean): Self = StObject.set(x, "brush", value.asInstanceOf[js.Any])
    
    inline def setMaxHandle(value: Boolean): Self = StObject.set(x, "maxHandle", value.asInstanceOf[js.Any])
    
    inline def setMinHandle(value: Boolean): Self = StObject.set(x, "minHandle", value.asInstanceOf[js.Any])
  }
}
