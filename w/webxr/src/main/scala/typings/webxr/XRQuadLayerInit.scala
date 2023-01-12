package typings.webxr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRQuadLayerInit
  extends StObject
     with XRLayerInit {
  
  var height: js.UndefOr[Double] = js.undefined
  
  var textureType: js.UndefOr[XRTextureType] = js.undefined
  
  var transform: js.UndefOr[XRRigidTransform] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object XRQuadLayerInit {
  
  inline def apply(space: XRSpace, viewPixelHeight: Double, viewPixelWidth: Double): XRQuadLayerInit = {
    val __obj = js.Dynamic.literal(space = space.asInstanceOf[js.Any], viewPixelHeight = viewPixelHeight.asInstanceOf[js.Any], viewPixelWidth = viewPixelWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRQuadLayerInit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XRQuadLayerInit] (val x: Self) extends AnyVal {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setTextureType(value: XRTextureType): Self = StObject.set(x, "textureType", value.asInstanceOf[js.Any])
    
    inline def setTextureTypeUndefined: Self = StObject.set(x, "textureType", js.undefined)
    
    inline def setTransform(value: XRRigidTransform): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
