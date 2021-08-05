package typings.swiper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CubeEffectOptions extends StObject {
  
  var shadow: js.UndefOr[Boolean] = js.undefined
  
  var shadowOffset: js.UndefOr[Double] = js.undefined
  
  var shadowScale: js.UndefOr[Double] = js.undefined
  
  var slideShadows: js.UndefOr[Boolean] = js.undefined
}
object CubeEffectOptions {
  
  inline def apply(): CubeEffectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CubeEffectOptions]
  }
  
  extension [Self <: CubeEffectOptions](x: Self) {
    
    inline def setShadow(value: Boolean): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    
    inline def setShadowOffset(value: Double): Self = StObject.set(x, "shadowOffset", value.asInstanceOf[js.Any])
    
    inline def setShadowOffsetUndefined: Self = StObject.set(x, "shadowOffset", js.undefined)
    
    inline def setShadowScale(value: Double): Self = StObject.set(x, "shadowScale", value.asInstanceOf[js.Any])
    
    inline def setShadowScaleUndefined: Self = StObject.set(x, "shadowScale", js.undefined)
    
    inline def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
    
    inline def setSlideShadows(value: Boolean): Self = StObject.set(x, "slideShadows", value.asInstanceOf[js.Any])
    
    inline def setSlideShadowsUndefined: Self = StObject.set(x, "slideShadows", js.undefined)
  }
}
