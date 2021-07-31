package typings.three.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Radius extends StObject {
  
  var radius: Double
  
  var segments: Double
  
  var thetaLength: Double
  
  var thetaStart: Double
}
object Radius {
  
  @scala.inline
  def apply(radius: Double, segments: Double, thetaLength: Double, thetaStart: Double): Radius = {
    val __obj = js.Dynamic.literal(radius = radius.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any], thetaLength = thetaLength.asInstanceOf[js.Any], thetaStart = thetaStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[Radius]
  }
  
  @scala.inline
  implicit class RadiusMutableBuilder[Self <: Radius] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegments(value: Double): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThetaLength(value: Double): Self = StObject.set(x, "thetaLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThetaStart(value: Double): Self = StObject.set(x, "thetaStart", value.asInstanceOf[js.Any])
  }
}
