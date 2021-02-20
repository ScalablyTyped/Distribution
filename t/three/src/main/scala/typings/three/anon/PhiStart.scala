package typings.three.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhiStart extends StObject {
  
  var heightSegments: Double = js.native
  
  var phiLength: Double = js.native
  
  var phiStart: Double = js.native
  
  var radius: Double = js.native
  
  var thetaLength: Double = js.native
  
  var thetaStart: Double = js.native
  
  var widthSegments: Double = js.native
}
object PhiStart {
  
  @scala.inline
  def apply(
    heightSegments: Double,
    phiLength: Double,
    phiStart: Double,
    radius: Double,
    thetaLength: Double,
    thetaStart: Double,
    widthSegments: Double
  ): PhiStart = {
    val __obj = js.Dynamic.literal(heightSegments = heightSegments.asInstanceOf[js.Any], phiLength = phiLength.asInstanceOf[js.Any], phiStart = phiStart.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], thetaLength = thetaLength.asInstanceOf[js.Any], thetaStart = thetaStart.asInstanceOf[js.Any], widthSegments = widthSegments.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhiStart]
  }
  
  @scala.inline
  implicit class PhiStartMutableBuilder[Self <: PhiStart] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeightSegments(value: Double): Self = StObject.set(x, "heightSegments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhiLength(value: Double): Self = StObject.set(x, "phiLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhiStart(value: Double): Self = StObject.set(x, "phiStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThetaLength(value: Double): Self = StObject.set(x, "thetaLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThetaStart(value: Double): Self = StObject.set(x, "thetaStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthSegments(value: Double): Self = StObject.set(x, "widthSegments", value.asInstanceOf[js.Any])
  }
}
