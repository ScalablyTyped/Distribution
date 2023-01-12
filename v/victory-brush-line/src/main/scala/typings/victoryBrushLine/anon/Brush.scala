package typings.victoryBrushLine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Brush extends StObject {
  
  var brush: Boolean
  
  var brushArea: Boolean
  
  var maxHandle: Boolean
  
  var minHandle: Boolean
}
object Brush {
  
  inline def apply(brush: Boolean, brushArea: Boolean, maxHandle: Boolean, minHandle: Boolean): Brush = {
    val __obj = js.Dynamic.literal(brush = brush.asInstanceOf[js.Any], brushArea = brushArea.asInstanceOf[js.Any], maxHandle = maxHandle.asInstanceOf[js.Any], minHandle = minHandle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Brush]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Brush] (val x: Self) extends AnyVal {
    
    inline def setBrush(value: Boolean): Self = StObject.set(x, "brush", value.asInstanceOf[js.Any])
    
    inline def setBrushArea(value: Boolean): Self = StObject.set(x, "brushArea", value.asInstanceOf[js.Any])
    
    inline def setMaxHandle(value: Boolean): Self = StObject.set(x, "maxHandle", value.asInstanceOf[js.Any])
    
    inline def setMinHandle(value: Boolean): Self = StObject.set(x, "minHandle", value.asInstanceOf[js.Any])
  }
}
