package typings.three.anon

import typings.three.curveMod.Curve
import typings.three.vector3Mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Closed extends StObject {
  
  var closed: Boolean = js.native
  
  var path: Curve[Vector3] = js.native
  
  var radialSegments: Double = js.native
  
  var radius: Double = js.native
  
  var tubularSegments: Double = js.native
}
object Closed {
  
  @scala.inline
  def apply(
    closed: Boolean,
    path: Curve[Vector3],
    radialSegments: Double,
    radius: Double,
    tubularSegments: Double
  ): Closed = {
    val __obj = js.Dynamic.literal(closed = closed.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], radialSegments = radialSegments.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], tubularSegments = tubularSegments.asInstanceOf[js.Any])
    __obj.asInstanceOf[Closed]
  }
  
  @scala.inline
  implicit class ClosedMutableBuilder[Self <: Closed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClosed(value: Boolean): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: Curve[Vector3]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadialSegments(value: Double): Self = StObject.set(x, "radialSegments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTubularSegments(value: Double): Self = StObject.set(x, "tubularSegments", value.asInstanceOf[js.Any])
  }
}
