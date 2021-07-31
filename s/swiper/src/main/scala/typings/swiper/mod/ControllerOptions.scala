package typings.swiper.mod

import typings.swiper.swiperStrings.container
import typings.swiper.swiperStrings.slide
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ControllerOptions extends StObject {
  
  /**
    * Can be 'slide' or 'container'. Defines a way how to control another slider: slide by slide
    * (with respect to other slider's grid) or depending on all slides/container
    * (depending on total slider percentage).
    *
    * @default 'slide'
    */
  var by: js.UndefOr[slide | container] = js.undefined
  
  /**
    * Pass here another Swiper instance or array with Swiper instances that should be controlled
    * by this Swiper
    */
  var control: js.UndefOr[Swiper] = js.undefined
  
  /**
    * Set to true and controlling will be in inverse direction
    *
    * @default false
    */
  var inverse: js.UndefOr[Boolean] = js.undefined
}
object ControllerOptions {
  
  @scala.inline
  def apply(): ControllerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ControllerOptions]
  }
  
  @scala.inline
  implicit class ControllerOptionsMutableBuilder[Self <: ControllerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBy(value: slide | container): Self = StObject.set(x, "by", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setByUndefined: Self = StObject.set(x, "by", js.undefined)
    
    @scala.inline
    def setControl(value: Swiper): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlUndefined: Self = StObject.set(x, "control", js.undefined)
    
    @scala.inline
    def setInverse(value: Boolean): Self = StObject.set(x, "inverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInverseUndefined: Self = StObject.set(x, "inverse", js.undefined)
  }
}
