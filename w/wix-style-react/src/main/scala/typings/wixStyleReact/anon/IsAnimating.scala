package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsAnimating extends StObject {
  
  var isAnimating: Boolean
  
  var isLeftArrowDisabled: Boolean
  
  var isLoading: Boolean
  
  var isRightArrowDisabled: Boolean
  
  var isShowEndGradient: Boolean
  
  var isShowStartGradient: Boolean
  
  var visibleSlides: js.Array[scala.Nothing]
}
object IsAnimating {
  
  inline def apply(
    isAnimating: Boolean,
    isLeftArrowDisabled: Boolean,
    isLoading: Boolean,
    isRightArrowDisabled: Boolean,
    isShowEndGradient: Boolean,
    isShowStartGradient: Boolean,
    visibleSlides: js.Array[scala.Nothing]
  ): IsAnimating = {
    val __obj = js.Dynamic.literal(isAnimating = isAnimating.asInstanceOf[js.Any], isLeftArrowDisabled = isLeftArrowDisabled.asInstanceOf[js.Any], isLoading = isLoading.asInstanceOf[js.Any], isRightArrowDisabled = isRightArrowDisabled.asInstanceOf[js.Any], isShowEndGradient = isShowEndGradient.asInstanceOf[js.Any], isShowStartGradient = isShowStartGradient.asInstanceOf[js.Any], visibleSlides = visibleSlides.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsAnimating]
  }
  
  extension [Self <: IsAnimating](x: Self) {
    
    inline def setIsAnimating(value: Boolean): Self = StObject.set(x, "isAnimating", value.asInstanceOf[js.Any])
    
    inline def setIsLeftArrowDisabled(value: Boolean): Self = StObject.set(x, "isLeftArrowDisabled", value.asInstanceOf[js.Any])
    
    inline def setIsLoading(value: Boolean): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
    
    inline def setIsRightArrowDisabled(value: Boolean): Self = StObject.set(x, "isRightArrowDisabled", value.asInstanceOf[js.Any])
    
    inline def setIsShowEndGradient(value: Boolean): Self = StObject.set(x, "isShowEndGradient", value.asInstanceOf[js.Any])
    
    inline def setIsShowStartGradient(value: Boolean): Self = StObject.set(x, "isShowStartGradient", value.asInstanceOf[js.Any])
    
    inline def setVisibleSlides(value: js.Array[scala.Nothing]): Self = StObject.set(x, "visibleSlides", value.asInstanceOf[js.Any])
    
    inline def setVisibleSlidesVarargs(value: scala.Nothing*): Self = StObject.set(x, "visibleSlides", js.Array(value*))
  }
}
