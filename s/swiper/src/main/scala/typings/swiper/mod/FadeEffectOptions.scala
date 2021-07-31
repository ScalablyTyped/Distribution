package typings.swiper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FadeEffectOptions extends StObject {
  
  var crossFade: js.UndefOr[Boolean] = js.undefined
}
object FadeEffectOptions {
  
  @scala.inline
  def apply(): FadeEffectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FadeEffectOptions]
  }
  
  @scala.inline
  implicit class FadeEffectOptionsMutableBuilder[Self <: FadeEffectOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCrossFade(value: Boolean): Self = StObject.set(x, "crossFade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossFadeUndefined: Self = StObject.set(x, "crossFade", js.undefined)
  }
}
