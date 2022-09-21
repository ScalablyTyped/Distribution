package typings.webxr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRMediaEquirectLayerInit
  extends StObject
     with XRMediaLayerInit {
  
  var centralHorizontalAngle: js.UndefOr[Double] = js.undefined
  
  var lowerVerticalAngle: js.UndefOr[Double] = js.undefined
  
  var radius: js.UndefOr[Double] = js.undefined
  
  var transform: js.UndefOr[XRRigidTransform] = js.undefined
  
  var upperVerticalAngle: js.UndefOr[Double] = js.undefined
}
object XRMediaEquirectLayerInit {
  
  inline def apply(space: XRSpace): XRMediaEquirectLayerInit = {
    val __obj = js.Dynamic.literal(space = space.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRMediaEquirectLayerInit]
  }
  
  extension [Self <: XRMediaEquirectLayerInit](x: Self) {
    
    inline def setCentralHorizontalAngle(value: Double): Self = StObject.set(x, "centralHorizontalAngle", value.asInstanceOf[js.Any])
    
    inline def setCentralHorizontalAngleUndefined: Self = StObject.set(x, "centralHorizontalAngle", js.undefined)
    
    inline def setLowerVerticalAngle(value: Double): Self = StObject.set(x, "lowerVerticalAngle", value.asInstanceOf[js.Any])
    
    inline def setLowerVerticalAngleUndefined: Self = StObject.set(x, "lowerVerticalAngle", js.undefined)
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    inline def setTransform(value: XRRigidTransform): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    inline def setUpperVerticalAngle(value: Double): Self = StObject.set(x, "upperVerticalAngle", value.asInstanceOf[js.Any])
    
    inline def setUpperVerticalAngleUndefined: Self = StObject.set(x, "upperVerticalAngle", js.undefined)
  }
}
