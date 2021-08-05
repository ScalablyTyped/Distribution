package typings.swiper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FadeEffectOptions extends StObject {
  
  var crossFade: js.UndefOr[Boolean] = js.undefined
}
object FadeEffectOptions {
  
  inline def apply(): FadeEffectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FadeEffectOptions]
  }
  
  extension [Self <: FadeEffectOptions](x: Self) {
    
    inline def setCrossFade(value: Boolean): Self = StObject.set(x, "crossFade", value.asInstanceOf[js.Any])
    
    inline def setCrossFadeUndefined: Self = StObject.set(x, "crossFade", js.undefined)
  }
}
