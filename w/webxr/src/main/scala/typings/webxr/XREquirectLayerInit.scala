package typings.webxr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XREquirectLayerInit
  extends StObject
     with XRLayerInit {
  
  var centralHorizontalAngle: js.UndefOr[Double] = js.undefined
  
  var lowerVerticalAngle: js.UndefOr[Double] = js.undefined
  
  var radius: js.UndefOr[Double] = js.undefined
  
  var textureType: js.UndefOr[XRTextureType] = js.undefined
  
  var transform: js.UndefOr[XRRigidTransform] = js.undefined
  
  var upperVerticalAngle: js.UndefOr[Double] = js.undefined
}
object XREquirectLayerInit {
  
  inline def apply(space: XRSpace, viewPixelHeight: Double, viewPixelWidth: Double): XREquirectLayerInit = {
    val __obj = js.Dynamic.literal(space = space.asInstanceOf[js.Any], viewPixelHeight = viewPixelHeight.asInstanceOf[js.Any], viewPixelWidth = viewPixelWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[XREquirectLayerInit]
  }
  
  extension [Self <: XREquirectLayerInit](x: Self) {
    
    inline def setCentralHorizontalAngle(value: Double): Self = StObject.set(x, "centralHorizontalAngle", value.asInstanceOf[js.Any])
    
    inline def setCentralHorizontalAngleUndefined: Self = StObject.set(x, "centralHorizontalAngle", js.undefined)
    
    inline def setLowerVerticalAngle(value: Double): Self = StObject.set(x, "lowerVerticalAngle", value.asInstanceOf[js.Any])
    
    inline def setLowerVerticalAngleUndefined: Self = StObject.set(x, "lowerVerticalAngle", js.undefined)
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    inline def setTextureType(value: XRTextureType): Self = StObject.set(x, "textureType", value.asInstanceOf[js.Any])
    
    inline def setTextureTypeUndefined: Self = StObject.set(x, "textureType", js.undefined)
    
    inline def setTransform(value: XRRigidTransform): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    inline def setUpperVerticalAngle(value: Double): Self = StObject.set(x, "upperVerticalAngle", value.asInstanceOf[js.Any])
    
    inline def setUpperVerticalAngleUndefined: Self = StObject.set(x, "upperVerticalAngle", js.undefined)
  }
}
