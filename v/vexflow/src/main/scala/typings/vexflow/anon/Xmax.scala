package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Xmax extends StObject {
  
  var height: Double
  
  var width: Double
  
  var x_max: Double
  
  var x_min: Double
}
object Xmax {
  
  inline def apply(height: Double, width: Double, x_max: Double, x_min: Double): Xmax = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x_max = x_max.asInstanceOf[js.Any], x_min = x_min.asInstanceOf[js.Any])
    __obj.asInstanceOf[Xmax]
  }
  
  extension [Self <: Xmax](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX_max(value: Double): Self = StObject.set(x, "x_max", value.asInstanceOf[js.Any])
    
    inline def setX_min(value: Double): Self = StObject.set(x, "x_min", value.asInstanceOf[js.Any])
  }
}
