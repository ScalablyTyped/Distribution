package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XMax_ extends StObject {
  
  var xMax: Double
  
  var xMin: Double
  
  var yMax: Double
  
  var yMin: Double
}
object XMax_ {
  
  inline def apply(xMax: Double, xMin: Double, yMax: Double, yMin: Double): XMax_ = {
    val __obj = js.Dynamic.literal(xMax = xMax.asInstanceOf[js.Any], xMin = xMin.asInstanceOf[js.Any], yMax = yMax.asInstanceOf[js.Any], yMin = yMin.asInstanceOf[js.Any])
    __obj.asInstanceOf[XMax_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XMax_] (val x: Self) extends AnyVal {
    
    inline def setXMax(value: Double): Self = StObject.set(x, "xMax", value.asInstanceOf[js.Any])
    
    inline def setXMin(value: Double): Self = StObject.set(x, "xMin", value.asInstanceOf[js.Any])
    
    inline def setYMax(value: Double): Self = StObject.set(x, "yMax", value.asInstanceOf[js.Any])
    
    inline def setYMin(value: Double): Self = StObject.set(x, "yMin", value.asInstanceOf[js.Any])
  }
}
