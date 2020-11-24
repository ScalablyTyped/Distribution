package typings.swiper.mod

import typings.swiper.swiperStrings.container
import typings.swiper.swiperStrings.slide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ControllerOptions extends js.Object {
  
  /**
    * Can be 'slide' or 'container'. Defines a way how to control another slider: slide by slide
    * (with respect to other slider's grid) or depending on all slides/container
    * (depending on total slider percentage).
    *
    * @default 'slide'
    */
  var by: js.UndefOr[slide | container] = js.native
  
  /**
    * Pass here another Swiper instance or array with Swiper instances that should be controlled
    * by this Swiper
    */
  var control: js.UndefOr[Swiper] = js.native
  
  /**
    * Set to true and controlling will be in inverse direction
    *
    * @default false
    */
  var inverse: js.UndefOr[Boolean] = js.native
}
object ControllerOptions {
  
  @scala.inline
  def apply(): ControllerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ControllerOptions]
  }
  
  @scala.inline
  implicit class ControllerOptionsOps[Self <: ControllerOptions] (val x: Self) extends AnyVal {
    
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
    def setBy(value: slide | container): Self = this.set("by", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBy: Self = this.set("by", js.undefined)
    
    @scala.inline
    def setControl(value: Swiper): Self = this.set("control", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControl: Self = this.set("control", js.undefined)
    
    @scala.inline
    def setInverse(value: Boolean): Self = this.set("inverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInverse: Self = this.set("inverse", js.undefined)
  }
}
