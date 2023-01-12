package typings.virtualScroll

import typings.std.Event
import typings.std.HTMLElement
import typings.virtualScroll.anon.PartialOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("virtual-scroll", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with VirtualScroll {
    def this(options: PartialOptions) = this()
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def off(cb: VirtualScrollCallback): Unit = js.native
    
    /* CompleteClass */
    override def on(cb: VirtualScrollCallback): Unit = js.native
  }
  
  trait Options extends StObject {
    
    var el: HTMLElement
    
    // Mutiply the touch action by this modifier to make scroll faster than finger movement. Defaults to 2.
    var firefoxMultiplier: Double
    
    // Firefox on Windows needs a boost, since scrolling is very slow. Defaults to 15.
    var keyStep: Double
    
    // the target element for mobile touch events. Defaults to window.
    var mouseMultiplier: Double
    
    // Elements with this class won't preventDefault on touchMove. Defaults to vs-touchmove-allowed.
    var passive: js.UndefOr[Boolean] = js.undefined
    
    // How many pixels to move with each key press. Defaults to 120.
    var preventTouch: Boolean
    
    // General multiplier for all mousewheel (including Firefox). Default to 1.
    var touchMultiplier: Double
    
    // If true, automatically call e.preventDefault on touchMove. Defaults to false.
    var unpreventTouchClass: String
    
    // if used, will use passive events declaration for the wheel and touch listeners. Can be true or false. Defaults to undefined.
    var useKeyboard: Boolean
    
    // if true, allows to use arrows to navigate, and space to jump from one screen. Defaults to true
    var useTouch: Boolean
  }
  object Options {
    
    inline def apply(
      el: HTMLElement,
      firefoxMultiplier: Double,
      keyStep: Double,
      mouseMultiplier: Double,
      preventTouch: Boolean,
      touchMultiplier: Double,
      unpreventTouchClass: String,
      useKeyboard: Boolean,
      useTouch: Boolean
    ): Options = {
      val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any], firefoxMultiplier = firefoxMultiplier.asInstanceOf[js.Any], keyStep = keyStep.asInstanceOf[js.Any], mouseMultiplier = mouseMultiplier.asInstanceOf[js.Any], preventTouch = preventTouch.asInstanceOf[js.Any], touchMultiplier = touchMultiplier.asInstanceOf[js.Any], unpreventTouchClass = unpreventTouchClass.asInstanceOf[js.Any], useKeyboard = useKeyboard.asInstanceOf[js.Any], useTouch = useTouch.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setEl(value: HTMLElement): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
      
      inline def setFirefoxMultiplier(value: Double): Self = StObject.set(x, "firefoxMultiplier", value.asInstanceOf[js.Any])
      
      inline def setKeyStep(value: Double): Self = StObject.set(x, "keyStep", value.asInstanceOf[js.Any])
      
      inline def setMouseMultiplier(value: Double): Self = StObject.set(x, "mouseMultiplier", value.asInstanceOf[js.Any])
      
      inline def setPassive(value: Boolean): Self = StObject.set(x, "passive", value.asInstanceOf[js.Any])
      
      inline def setPassiveUndefined: Self = StObject.set(x, "passive", js.undefined)
      
      inline def setPreventTouch(value: Boolean): Self = StObject.set(x, "preventTouch", value.asInstanceOf[js.Any])
      
      inline def setTouchMultiplier(value: Double): Self = StObject.set(x, "touchMultiplier", value.asInstanceOf[js.Any])
      
      inline def setUnpreventTouchClass(value: String): Self = StObject.set(x, "unpreventTouchClass", value.asInstanceOf[js.Any])
      
      inline def setUseKeyboard(value: Boolean): Self = StObject.set(x, "useKeyboard", value.asInstanceOf[js.Any])
      
      inline def setUseTouch(value: Boolean): Self = StObject.set(x, "useTouch", value.asInstanceOf[js.Any])
    }
  }
  
  trait VirtualScroll extends StObject {
    
    def destroy(): Unit
    
    def off(cb: VirtualScrollCallback): Unit
    
    def on(cb: VirtualScrollCallback): Unit
  }
  object VirtualScroll {
    
    inline def apply(destroy: () => Unit, off: VirtualScrollCallback => Unit, on: VirtualScrollCallback => Unit): VirtualScroll = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), off = js.Any.fromFunction1(off), on = js.Any.fromFunction1(on))
      __obj.asInstanceOf[VirtualScroll]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VirtualScroll] (val x: Self) extends AnyVal {
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setOff(value: VirtualScrollCallback => Unit): Self = StObject.set(x, "off", js.Any.fromFunction1(value))
      
      inline def setOn(value: VirtualScrollCallback => Unit): Self = StObject.set(x, "on", js.Any.fromFunction1(value))
    }
  }
  
  type VirtualScrollCallback = js.Function1[/* e */ VirtualScrollEvent, Unit]
  
  trait VirtualScrollEvent extends StObject {
    
    // total distance scrolled on the y axis
    var deltaX: Double
    
    // distance scrolled since the last event on the x axis
    var deltaY: Double
    
    // distance scrolled since the last event on the y axis
    var originalEvent: Event
    
    var x: Double
    
    // total distance scrolled on the x axis
    var y: Double
  }
  object VirtualScrollEvent {
    
    inline def apply(deltaX: Double, deltaY: Double, originalEvent: Event, x: Double, y: Double): VirtualScrollEvent = {
      val __obj = js.Dynamic.literal(deltaX = deltaX.asInstanceOf[js.Any], deltaY = deltaY.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[VirtualScrollEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VirtualScrollEvent] (val x: Self) extends AnyVal {
      
      inline def setDeltaX(value: Double): Self = StObject.set(x, "deltaX", value.asInstanceOf[js.Any])
      
      inline def setDeltaY(value: Double): Self = StObject.set(x, "deltaY", value.asInstanceOf[js.Any])
      
      inline def setOriginalEvent(value: Event): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
