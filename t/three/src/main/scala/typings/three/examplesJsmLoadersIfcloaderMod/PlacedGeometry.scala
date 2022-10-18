package typings.three.examplesJsmLoadersIfcloaderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlacedGeometry extends StObject {
  
  var color: Color
  
  var flatTransformation: js.Array[Double]
  
  var geometryExpressID: Double
}
object PlacedGeometry {
  
  inline def apply(color: Color, flatTransformation: js.Array[Double], geometryExpressID: Double): PlacedGeometry = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], flatTransformation = flatTransformation.asInstanceOf[js.Any], geometryExpressID = geometryExpressID.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlacedGeometry]
  }
  
  extension [Self <: PlacedGeometry](x: Self) {
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setFlatTransformation(value: js.Array[Double]): Self = StObject.set(x, "flatTransformation", value.asInstanceOf[js.Any])
    
    inline def setFlatTransformationVarargs(value: Double*): Self = StObject.set(x, "flatTransformation", js.Array(value*))
    
    inline def setGeometryExpressID(value: Double): Self = StObject.set(x, "geometryExpressID", value.asInstanceOf[js.Any])
  }
}
