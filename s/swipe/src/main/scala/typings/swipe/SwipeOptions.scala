package typings.swipe

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SwipeOptions extends StObject {
  
  var auto: js.UndefOr[Double] = js.undefined
  
  var callback: js.UndefOr[js.Function2[/* index */ Double, /* elem */ HTMLElement, Unit]] = js.undefined
  
  var continuous: js.UndefOr[Boolean] = js.undefined
  
  var disableScroll: js.UndefOr[Boolean] = js.undefined
  
  var speed: js.UndefOr[Double] = js.undefined
  
  var startSlide: js.UndefOr[Double] = js.undefined
  
  var stopPropagation: js.UndefOr[Boolean] = js.undefined
  
  var transitionEnd: js.UndefOr[js.Function2[/* index */ Double, /* elem */ HTMLElement, Unit]] = js.undefined
}
object SwipeOptions {
  
  @scala.inline
  def apply(): SwipeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwipeOptions]
  }
  
  @scala.inline
  implicit class SwipeOptionsMutableBuilder[Self <: SwipeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuto(value: Double): Self = StObject.set(x, "auto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoUndefined: Self = StObject.set(x, "auto", js.undefined)
    
    @scala.inline
    def setCallback(value: (/* index */ Double, /* elem */ HTMLElement) => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    @scala.inline
    def setContinuous(value: Boolean): Self = StObject.set(x, "continuous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinuousUndefined: Self = StObject.set(x, "continuous", js.undefined)
    
    @scala.inline
    def setDisableScroll(value: Boolean): Self = StObject.set(x, "disableScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableScrollUndefined: Self = StObject.set(x, "disableScroll", js.undefined)
    
    @scala.inline
    def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
    
    @scala.inline
    def setStartSlide(value: Double): Self = StObject.set(x, "startSlide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartSlideUndefined: Self = StObject.set(x, "startSlide", js.undefined)
    
    @scala.inline
    def setStopPropagation(value: Boolean): Self = StObject.set(x, "stopPropagation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopPropagationUndefined: Self = StObject.set(x, "stopPropagation", js.undefined)
    
    @scala.inline
    def setTransitionEnd(value: (/* index */ Double, /* elem */ HTMLElement) => Unit): Self = StObject.set(x, "transitionEnd", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTransitionEndUndefined: Self = StObject.set(x, "transitionEnd", js.undefined)
  }
}
