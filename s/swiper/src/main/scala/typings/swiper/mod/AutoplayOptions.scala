package typings.swiper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoplayOptions extends js.Object {
  
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
  var delay: js.UndefOr[Double] = js.native
  
  /**
    * Set to false and autoplay will not be disabled after
    * user interactions (swipes), it will be restarted
    * every time after interaction
    *
    * @default true
    */
  var disableOnInteraction: js.UndefOr[Boolean] = js.native
  
  /**
    * Enables autoplay in reverse direction
    *
    * @default false
    */
  var reverseDirection: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable this parameter and autoplay will be stopped when it reaches last slide (has no effect in loop mode)
    *
    * @default false
    */
  var stopOnLastSlide: js.UndefOr[Boolean] = js.native
  
  /**
    * When enabled autoplay will wait for wrapper transition to continue.
    * Can be disabled in case of using Virtual Translate when your
    * slider may not have transition
    *
    * @default true
    */
  var waitForTransition: js.UndefOr[Boolean] = js.native
}
object AutoplayOptions {
  
  @scala.inline
  def apply(): AutoplayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoplayOptions]
  }
  
  @scala.inline
  implicit class AutoplayOptionsOps[Self <: AutoplayOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setDisableOnInteraction(value: Boolean): Self = this.set("disableOnInteraction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableOnInteraction: Self = this.set("disableOnInteraction", js.undefined)
    
    @scala.inline
    def setReverseDirection(value: Boolean): Self = this.set("reverseDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReverseDirection: Self = this.set("reverseDirection", js.undefined)
    
    @scala.inline
    def setStopOnLastSlide(value: Boolean): Self = this.set("stopOnLastSlide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopOnLastSlide: Self = this.set("stopOnLastSlide", js.undefined)
    
    @scala.inline
    def setWaitForTransition(value: Boolean): Self = this.set("waitForTransition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaitForTransition: Self = this.set("waitForTransition", js.undefined)
  }
}
