package typings.viewportMercatorProject.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DistanceScales extends StObject {
  
  var degreesPerPixel: js.Tuple3[Double, Double, Double]
  
  var metersPerPixel: js.Tuple3[Double, Double, Double]
  
  var pixelsPerDegree: js.Tuple3[Double, Double, Double]
  
  var pixelsPerMeter: js.Tuple3[Double, Double, Double]
}
object DistanceScales {
  
  inline def apply(
    degreesPerPixel: js.Tuple3[Double, Double, Double],
    metersPerPixel: js.Tuple3[Double, Double, Double],
    pixelsPerDegree: js.Tuple3[Double, Double, Double],
    pixelsPerMeter: js.Tuple3[Double, Double, Double]
  ): DistanceScales = {
    val __obj = js.Dynamic.literal(degreesPerPixel = degreesPerPixel.asInstanceOf[js.Any], metersPerPixel = metersPerPixel.asInstanceOf[js.Any], pixelsPerDegree = pixelsPerDegree.asInstanceOf[js.Any], pixelsPerMeter = pixelsPerMeter.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistanceScales]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DistanceScales] (val x: Self) extends AnyVal {
    
    inline def setDegreesPerPixel(value: js.Tuple3[Double, Double, Double]): Self = StObject.set(x, "degreesPerPixel", value.asInstanceOf[js.Any])
    
    inline def setMetersPerPixel(value: js.Tuple3[Double, Double, Double]): Self = StObject.set(x, "metersPerPixel", value.asInstanceOf[js.Any])
    
    inline def setPixelsPerDegree(value: js.Tuple3[Double, Double, Double]): Self = StObject.set(x, "pixelsPerDegree", value.asInstanceOf[js.Any])
    
    inline def setPixelsPerMeter(value: js.Tuple3[Double, Double, Double]): Self = StObject.set(x, "pixelsPerMeter", value.asInstanceOf[js.Any])
  }
}
