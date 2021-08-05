package typings.swiper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlipEffectOptions extends StObject {
  
  var limitRotation: js.UndefOr[Boolean] = js.undefined
  
  var slideShadows: js.UndefOr[Boolean] = js.undefined
}
object FlipEffectOptions {
  
  inline def apply(): FlipEffectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlipEffectOptions]
  }
  
  extension [Self <: FlipEffectOptions](x: Self) {
    
    inline def setLimitRotation(value: Boolean): Self = StObject.set(x, "limitRotation", value.asInstanceOf[js.Any])
    
    inline def setLimitRotationUndefined: Self = StObject.set(x, "limitRotation", js.undefined)
    
    inline def setSlideShadows(value: Boolean): Self = StObject.set(x, "slideShadows", value.asInstanceOf[js.Any])
    
    inline def setSlideShadowsUndefined: Self = StObject.set(x, "slideShadows", js.undefined)
  }
}
