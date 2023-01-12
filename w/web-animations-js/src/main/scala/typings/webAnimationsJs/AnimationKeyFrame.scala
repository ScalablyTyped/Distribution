package typings.webAnimationsJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationKeyFrame extends StObject {
  
  var easing: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var offset: js.UndefOr[Double | (js.Array[Double | Null]) | Null] = js.undefined
  
  var opacity: js.UndefOr[Double | js.Array[Double]] = js.undefined
  
  var transform: js.UndefOr[String | js.Array[String]] = js.undefined
}
object AnimationKeyFrame {
  
  inline def apply(): AnimationKeyFrame = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimationKeyFrame]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnimationKeyFrame] (val x: Self) extends AnyVal {
    
    inline def setEasing(value: String | js.Array[String]): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    inline def setEasingVarargs(value: String*): Self = StObject.set(x, "easing", js.Array(value*))
    
    inline def setOffset(value: Double | (js.Array[Double | Null])): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetNull: Self = StObject.set(x, "offset", null)
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOffsetVarargs(value: (Double | Null)*): Self = StObject.set(x, "offset", js.Array(value*))
    
    inline def setOpacity(value: Double | js.Array[Double]): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setOpacityVarargs(value: Double*): Self = StObject.set(x, "opacity", js.Array(value*))
    
    inline def setTransform(value: String | js.Array[String]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    inline def setTransformVarargs(value: String*): Self = StObject.set(x, "transform", js.Array(value*))
  }
}
