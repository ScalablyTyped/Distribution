package typings.three.examplesJsmLoadersIfcloaderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlatMesh extends StObject {
  
  var expressID: Double
  
  var geometries: Vector[PlacedGeometry]
}
object FlatMesh {
  
  inline def apply(expressID: Double, geometries: Vector[PlacedGeometry]): FlatMesh = {
    val __obj = js.Dynamic.literal(expressID = expressID.asInstanceOf[js.Any], geometries = geometries.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlatMesh]
  }
  
  extension [Self <: FlatMesh](x: Self) {
    
    inline def setExpressID(value: Double): Self = StObject.set(x, "expressID", value.asInstanceOf[js.Any])
    
    inline def setGeometries(value: Vector[PlacedGeometry]): Self = StObject.set(x, "geometries", value.asInstanceOf[js.Any])
  }
}
