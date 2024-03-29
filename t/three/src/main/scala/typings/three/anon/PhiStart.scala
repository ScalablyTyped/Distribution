package typings.three.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhiStart extends StObject {
  
  val heightSegments: Double
  
  val phiLength: Double
  
  val phiStart: Double
  
  val radius: Double
  
  val thetaLength: Double
  
  val thetaStart: Double
  
  val widthSegments: Double
}
object PhiStart {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: PhiStart] (val x: Self) extends AnyVal {
    
    inline def setHeightSegments(value: Double): Self = StObject.set(x, "heightSegments", value.asInstanceOf[js.Any])
    
    inline def setPhiLength(value: Double): Self = StObject.set(x, "phiLength", value.asInstanceOf[js.Any])
    
    inline def setPhiStart(value: Double): Self = StObject.set(x, "phiStart", value.asInstanceOf[js.Any])
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setThetaLength(value: Double): Self = StObject.set(x, "thetaLength", value.asInstanceOf[js.Any])
    
    inline def setThetaStart(value: Double): Self = StObject.set(x, "thetaStart", value.asInstanceOf[js.Any])
    
    inline def setWidthSegments(value: Double): Self = StObject.set(x, "widthSegments", value.asInstanceOf[js.Any])
  }
}
