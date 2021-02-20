package typings.three.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InnerRadius extends StObject {
  
  var innerRadius: Double = js.native
  
  var outerRadius: Double = js.native
  
  var phiSegments: Double = js.native
  
  var thetaLength: Double = js.native
  
  var thetaSegments: Double = js.native
  
  var thetaStart: Double = js.native
}
object InnerRadius {
  
  @scala.inline
  def apply(
    innerRadius: Double,
    outerRadius: Double,
    phiSegments: Double,
    thetaLength: Double,
    thetaSegments: Double,
    thetaStart: Double
  ): InnerRadius = {
    val __obj = js.Dynamic.literal(innerRadius = innerRadius.asInstanceOf[js.Any], outerRadius = outerRadius.asInstanceOf[js.Any], phiSegments = phiSegments.asInstanceOf[js.Any], thetaLength = thetaLength.asInstanceOf[js.Any], thetaSegments = thetaSegments.asInstanceOf[js.Any], thetaStart = thetaStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[InnerRadius]
  }
  
  @scala.inline
  implicit class InnerRadiusMutableBuilder[Self <: InnerRadius] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInnerRadius(value: Double): Self = StObject.set(x, "innerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOuterRadius(value: Double): Self = StObject.set(x, "outerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhiSegments(value: Double): Self = StObject.set(x, "phiSegments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThetaLength(value: Double): Self = StObject.set(x, "thetaLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThetaSegments(value: Double): Self = StObject.set(x, "thetaSegments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThetaStart(value: Double): Self = StObject.set(x, "thetaStart", value.asInstanceOf[js.Any])
  }
}
