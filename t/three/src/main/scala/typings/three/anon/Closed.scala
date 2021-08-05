package typings.three.anon

import typings.three.curveMod.Curve
import typings.three.vector3Mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Closed extends StObject {
  
  var closed: Boolean
  
  var path: Curve[Vector3]
  
  var radialSegments: Double
  
  var radius: Double
  
  var tubularSegments: Double
}
object Closed {
  
  inline def apply(
    closed: Boolean,
    path: Curve[Vector3],
    radialSegments: Double,
    radius: Double,
    tubularSegments: Double
  ): Closed = {
    val __obj = js.Dynamic.literal(closed = closed.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], radialSegments = radialSegments.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], tubularSegments = tubularSegments.asInstanceOf[js.Any])
    __obj.asInstanceOf[Closed]
  }
  
  extension [Self <: Closed](x: Self) {
    
    inline def setClosed(value: Boolean): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
    
    inline def setPath(value: Curve[Vector3]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setRadialSegments(value: Double): Self = StObject.set(x, "radialSegments", value.asInstanceOf[js.Any])
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setTubularSegments(value: Double): Self = StObject.set(x, "tubularSegments", value.asInstanceOf[js.Any])
  }
}
