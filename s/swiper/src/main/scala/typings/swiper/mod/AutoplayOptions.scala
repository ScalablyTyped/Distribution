package typings.swiper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoplayOptions extends StObject {
  
  /**
    * Delay between transitions (in ms). If this parameter is not specified, auto play will be disabled
    *
    * If you need to specify different delay for specifi slides you can do it by using
    * data-swiper-autoplay (in ms) attribute on slide.
    *
    * @example
    * <!-- hold this slide for 2 seconds -->
    * <div class="swiper-slide" data-swiper-autoplay="2000">
    *
    * @default 3000
    */
  var delay: js.UndefOr[Double] = js.undefined
  
  /**
    * Set to false and autoplay will not be disabled after
    * user interactions (swipes), it will be restarted
    * every time after interaction
    *
    * @default true
    */
  var disableOnInteraction: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enables autoplay in reverse direction
    *
    * @default false
    */
  var reverseDirection: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enable this parameter and autoplay will be stopped when it reaches last slide (has no effect in loop mode)
    *
    * @default false
    */
  var stopOnLastSlide: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When enabled autoplay will wait for wrapper transition to continue.
    * Can be disabled in case of using Virtual Translate when your
    * slider may not have transition
    *
    * @default true
    */
  var waitForTransition: js.UndefOr[Boolean] = js.undefined
}
object AutoplayOptions {
  
  @scala.inline
  def apply(): AutoplayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoplayOptions]
  }
  
  @scala.inline
  implicit class AutoplayOptionsMutableBuilder[Self <: AutoplayOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    @scala.inline
    def setDisableOnInteraction(value: Boolean): Self = StObject.set(x, "disableOnInteraction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableOnInteractionUndefined: Self = StObject.set(x, "disableOnInteraction", js.undefined)
    
    @scala.inline
    def setReverseDirection(value: Boolean): Self = StObject.set(x, "reverseDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReverseDirectionUndefined: Self = StObject.set(x, "reverseDirection", js.undefined)
    
    @scala.inline
    def setStopOnLastSlide(value: Boolean): Self = StObject.set(x, "stopOnLastSlide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopOnLastSlideUndefined: Self = StObject.set(x, "stopOnLastSlide", js.undefined)
    
    @scala.inline
    def setWaitForTransition(value: Boolean): Self = StObject.set(x, "waitForTransition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitForTransitionUndefined: Self = StObject.set(x, "waitForTransition", js.undefined)
  }
}
