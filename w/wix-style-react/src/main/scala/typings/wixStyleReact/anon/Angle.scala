package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Angle extends StObject {
  
  var angle: Any
  
  var className: Any
  
  var strokeWidth: Any
  
  var viewBoxSize: Any
}
object Angle {
  
  inline def apply(angle: Any, className: Any, strokeWidth: Any, viewBoxSize: Any): Angle = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], strokeWidth = strokeWidth.asInstanceOf[js.Any], viewBoxSize = viewBoxSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Angle]
  }
  
  extension [Self <: Angle](x: Self) {
    
    inline def setAngle(value: Any): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setClassName(value: Any): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setStrokeWidth(value: Any): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    
    inline def setViewBoxSize(value: Any): Self = StObject.set(x, "viewBoxSize", value.asInstanceOf[js.Any])
  }
}
