package typings.swiper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoverflowEffectOptions extends StObject {
  
  var depth: js.UndefOr[Double] = js.undefined
  
  var modifier: js.UndefOr[Double] = js.undefined
  
  var rotate: js.UndefOr[Double] = js.undefined
  
  var slideShadows: js.UndefOr[Boolean] = js.undefined
  
  var stretch: js.UndefOr[Double] = js.undefined
}
object CoverflowEffectOptions {
  
  @scala.inline
  def apply(): CoverflowEffectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoverflowEffectOptions]
  }
  
  @scala.inline
  implicit class CoverflowEffectOptionsMutableBuilder[Self <: CoverflowEffectOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
    
    @scala.inline
    def setModifier(value: Double): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifierUndefined: Self = StObject.set(x, "modifier", js.undefined)
    
    @scala.inline
    def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
    
    @scala.inline
    def setSlideShadows(value: Boolean): Self = StObject.set(x, "slideShadows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlideShadowsUndefined: Self = StObject.set(x, "slideShadows", js.undefined)
    
    @scala.inline
    def setStretch(value: Double): Self = StObject.set(x, "stretch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStretchUndefined: Self = StObject.set(x, "stretch", js.undefined)
  }
}
