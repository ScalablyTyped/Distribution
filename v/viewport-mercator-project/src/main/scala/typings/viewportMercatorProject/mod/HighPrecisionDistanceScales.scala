package typings.viewportMercatorProject.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HighPrecisionDistanceScales
  extends StObject
     with DistanceScales {
  
  var pixelsPerDegree2: js.Tuple3[Double, Double, Double]
  
  var pixelsPerMeter2: js.Tuple3[Double, Double, Double]
}
object HighPrecisionDistanceScales {
  
  inline def apply(
    degreesPerPixel: js.Tuple3[Double, Double, Double],
    metersPerPixel: js.Tuple3[Double, Double, Double],
    pixelsPerDegree: js.Tuple3[Double, Double, Double],
    pixelsPerDegree2: js.Tuple3[Double, Double, Double],
    pixelsPerMeter: js.Tuple3[Double, Double, Double],
    pixelsPerMeter2: js.Tuple3[Double, Double, Double]
  ): HighPrecisionDistanceScales = {
    val __obj = js.Dynamic.literal(degreesPerPixel = degreesPerPixel.asInstanceOf[js.Any], metersPerPixel = metersPerPixel.asInstanceOf[js.Any], pixelsPerDegree = pixelsPerDegree.asInstanceOf[js.Any], pixelsPerDegree2 = pixelsPerDegree2.asInstanceOf[js.Any], pixelsPerMeter = pixelsPerMeter.asInstanceOf[js.Any], pixelsPerMeter2 = pixelsPerMeter2.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighPrecisionDistanceScales]
  }
  
  extension [Self <: HighPrecisionDistanceScales](x: Self) {
    
    inline def setPixelsPerDegree2(value: js.Tuple3[Double, Double, Double]): Self = StObject.set(x, "pixelsPerDegree2", value.asInstanceOf[js.Any])
    
    inline def setPixelsPerMeter2(value: js.Tuple3[Double, Double, Double]): Self = StObject.set(x, "pixelsPerMeter2", value.asInstanceOf[js.Any])
  }
}
