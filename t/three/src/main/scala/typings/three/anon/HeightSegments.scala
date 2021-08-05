package typings.three.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeightSegments extends StObject {
  
  var height: Double
  
  var heightSegments: Double
  
  var openEnded: Boolean
  
  var radialSegments: Double
  
  var radiusBottom: Double
  
  var radiusTop: Double
  
  var thetaLength: Double
  
  var thetaStart: Double
}
object HeightSegments {
  
  inline def apply(
    height: Double,
    heightSegments: Double,
    openEnded: Boolean,
    radialSegments: Double,
    radiusBottom: Double,
    radiusTop: Double,
    thetaLength: Double,
    thetaStart: Double
  ): HeightSegments = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], heightSegments = heightSegments.asInstanceOf[js.Any], openEnded = openEnded.asInstanceOf[js.Any], radialSegments = radialSegments.asInstanceOf[js.Any], radiusBottom = radiusBottom.asInstanceOf[js.Any], radiusTop = radiusTop.asInstanceOf[js.Any], thetaLength = thetaLength.asInstanceOf[js.Any], thetaStart = thetaStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeightSegments]
  }
  
  extension [Self <: HeightSegments](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightSegments(value: Double): Self = StObject.set(x, "heightSegments", value.asInstanceOf[js.Any])
    
    inline def setOpenEnded(value: Boolean): Self = StObject.set(x, "openEnded", value.asInstanceOf[js.Any])
    
    inline def setRadialSegments(value: Double): Self = StObject.set(x, "radialSegments", value.asInstanceOf[js.Any])
    
    inline def setRadiusBottom(value: Double): Self = StObject.set(x, "radiusBottom", value.asInstanceOf[js.Any])
    
    inline def setRadiusTop(value: Double): Self = StObject.set(x, "radiusTop", value.asInstanceOf[js.Any])
    
    inline def setThetaLength(value: Double): Self = StObject.set(x, "thetaLength", value.asInstanceOf[js.Any])
    
    inline def setThetaStart(value: Double): Self = StObject.set(x, "thetaStart", value.asInstanceOf[js.Any])
  }
}
