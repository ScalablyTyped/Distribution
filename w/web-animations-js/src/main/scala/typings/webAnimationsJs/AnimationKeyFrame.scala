package typings.webAnimationsJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationKeyFrame extends StObject {
  
  var easing: js.UndefOr[String | js.Array[String]] = js.native
  
  var offset: js.UndefOr[Double | (js.Array[Double | Null]) | Null] = js.native
  
  var opacity: js.UndefOr[Double | js.Array[Double]] = js.native
  
  var transform: js.UndefOr[String | js.Array[String]] = js.native
}
object AnimationKeyFrame {
  
  @scala.inline
  def apply(): AnimationKeyFrame = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimationKeyFrame]
  }
  
  @scala.inline
  implicit class AnimationKeyFrameMutableBuilder[Self <: AnimationKeyFrame] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEasing(value: String | js.Array[String]): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    @scala.inline
    def setEasingVarargs(value: String*): Self = StObject.set(x, "easing", js.Array(value :_*))
    
    @scala.inline
    def setOffset(value: Double | (js.Array[Double | Null])): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetNull: Self = StObject.set(x, "offset", null)
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setOffsetVarargs(value: (Double | Null)*): Self = StObject.set(x, "offset", js.Array(value :_*))
    
    @scala.inline
    def setOpacity(value: Double | js.Array[Double]): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setOpacityVarargs(value: Double*): Self = StObject.set(x, "opacity", js.Array(value :_*))
    
    @scala.inline
    def setTransform(value: String | js.Array[String]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    @scala.inline
    def setTransformVarargs(value: String*): Self = StObject.set(x, "transform", js.Array(value :_*))
  }
}
