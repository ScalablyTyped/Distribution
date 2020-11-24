package typings.swipe

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwipeOptions extends js.Object {
  
  var auto: js.UndefOr[Double] = js.native
  
  var callback: js.UndefOr[js.Function2[/* index */ Double, /* elem */ HTMLElement, Unit]] = js.native
  
  var continuous: js.UndefOr[Boolean] = js.native
  
  var disableScroll: js.UndefOr[Boolean] = js.native
  
  var speed: js.UndefOr[Double] = js.native
  
  var startSlide: js.UndefOr[Double] = js.native
  
  var stopPropagation: js.UndefOr[Boolean] = js.native
  
  var transitionEnd: js.UndefOr[js.Function2[/* index */ Double, /* elem */ HTMLElement, Unit]] = js.native
}
object SwipeOptions {
  
  @scala.inline
  def apply(): SwipeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwipeOptions]
  }
  
  @scala.inline
  implicit class SwipeOptionsOps[Self <: SwipeOptions] (val x: Self) extends AnyVal {
    
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
    def setAuto(value: Double): Self = this.set("auto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuto: Self = this.set("auto", js.undefined)
    
    @scala.inline
    def setCallback(value: (/* index */ Double, /* elem */ HTMLElement) => Unit): Self = this.set("callback", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    
    @scala.inline
    def setContinuous(value: Boolean): Self = this.set("continuous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContinuous: Self = this.set("continuous", js.undefined)
    
    @scala.inline
    def setDisableScroll(value: Boolean): Self = this.set("disableScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableScroll: Self = this.set("disableScroll", js.undefined)
    
    @scala.inline
    def setSpeed(value: Double): Self = this.set("speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpeed: Self = this.set("speed", js.undefined)
    
    @scala.inline
    def setStartSlide(value: Double): Self = this.set("startSlide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartSlide: Self = this.set("startSlide", js.undefined)
    
    @scala.inline
    def setStopPropagation(value: Boolean): Self = this.set("stopPropagation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopPropagation: Self = this.set("stopPropagation", js.undefined)
    
    @scala.inline
    def setTransitionEnd(value: (/* index */ Double, /* elem */ HTMLElement) => Unit): Self = this.set("transitionEnd", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteTransitionEnd: Self = this.set("transitionEnd", js.undefined)
  }
}
