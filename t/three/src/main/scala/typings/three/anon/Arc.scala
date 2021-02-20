package typings.three.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Arc extends StObject {
  
  var arc: Double = js.native
  
  var radialSegments: Double = js.native
  
  var radius: Double = js.native
  
  var tube: Double = js.native
  
  var tubularSegments: Double = js.native
}
object Arc {
  
  @scala.inline
  def apply(arc: Double, radialSegments: Double, radius: Double, tube: Double, tubularSegments: Double): Arc = {
    val __obj = js.Dynamic.literal(arc = arc.asInstanceOf[js.Any], radialSegments = radialSegments.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], tube = tube.asInstanceOf[js.Any], tubularSegments = tubularSegments.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arc]
  }
  
  @scala.inline
  implicit class ArcMutableBuilder[Self <: Arc] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArc(value: Double): Self = StObject.set(x, "arc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadialSegments(value: Double): Self = StObject.set(x, "radialSegments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTube(value: Double): Self = StObject.set(x, "tube", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTubularSegments(value: Double): Self = StObject.set(x, "tubularSegments", value.asInstanceOf[js.Any])
  }
}
