package typings.swiper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CubeEffectOptions extends StObject {
  
  var shadow: js.UndefOr[Boolean] = js.native
  
  var shadowOffset: js.UndefOr[Double] = js.native
  
  var shadowScale: js.UndefOr[Double] = js.native
  
  var slideShadows: js.UndefOr[Boolean] = js.native
}
object CubeEffectOptions {
  
  @scala.inline
  def apply(): CubeEffectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CubeEffectOptions]
  }
  
  @scala.inline
  implicit class CubeEffectOptionsMutableBuilder[Self <: CubeEffectOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShadow(value: Boolean): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowOffset(value: Double): Self = StObject.set(x, "shadowOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowOffsetUndefined: Self = StObject.set(x, "shadowOffset", js.undefined)
    
    @scala.inline
    def setShadowScale(value: Double): Self = StObject.set(x, "shadowScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowScaleUndefined: Self = StObject.set(x, "shadowScale", js.undefined)
    
    @scala.inline
    def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
    
    @scala.inline
    def setSlideShadows(value: Boolean): Self = StObject.set(x, "slideShadows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlideShadowsUndefined: Self = StObject.set(x, "slideShadows", js.undefined)
  }
}
