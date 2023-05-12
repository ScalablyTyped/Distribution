package typings.virtualScroll

import typings.std.HTMLElement
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<virtual-scroll.virtual-scroll.VirtualScrollOptions> */
  trait PartialVirtualScrollOptio extends StObject {
    
    var el: js.UndefOr[Window | HTMLElement] = js.undefined
    
    var firefoxMultiplier: js.UndefOr[Double] = js.undefined
    
    var keyStep: js.UndefOr[Double] = js.undefined
    
    var mouseMultiplier: js.UndefOr[Double] = js.undefined
    
    var passive: js.UndefOr[Boolean] = js.undefined
    
    var preventTouch: js.UndefOr[Boolean] = js.undefined
    
    var touchMultiplier: js.UndefOr[Double] = js.undefined
    
    var unpreventTouchClass: js.UndefOr[String] = js.undefined
    
    var useKeyboard: js.UndefOr[Boolean] = js.undefined
    
    var useTouch: js.UndefOr[Boolean] = js.undefined
  }
  object PartialVirtualScrollOptio {
    
    inline def apply(): PartialVirtualScrollOptio = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialVirtualScrollOptio]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialVirtualScrollOptio] (val x: Self) extends AnyVal {
      
      inline def setEl(value: Window | HTMLElement): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
      
      inline def setElUndefined: Self = StObject.set(x, "el", js.undefined)
      
      inline def setFirefoxMultiplier(value: Double): Self = StObject.set(x, "firefoxMultiplier", value.asInstanceOf[js.Any])
      
      inline def setFirefoxMultiplierUndefined: Self = StObject.set(x, "firefoxMultiplier", js.undefined)
      
      inline def setKeyStep(value: Double): Self = StObject.set(x, "keyStep", value.asInstanceOf[js.Any])
      
      inline def setKeyStepUndefined: Self = StObject.set(x, "keyStep", js.undefined)
      
      inline def setMouseMultiplier(value: Double): Self = StObject.set(x, "mouseMultiplier", value.asInstanceOf[js.Any])
      
      inline def setMouseMultiplierUndefined: Self = StObject.set(x, "mouseMultiplier", js.undefined)
      
      inline def setPassive(value: Boolean): Self = StObject.set(x, "passive", value.asInstanceOf[js.Any])
      
      inline def setPassiveUndefined: Self = StObject.set(x, "passive", js.undefined)
      
      inline def setPreventTouch(value: Boolean): Self = StObject.set(x, "preventTouch", value.asInstanceOf[js.Any])
      
      inline def setPreventTouchUndefined: Self = StObject.set(x, "preventTouch", js.undefined)
      
      inline def setTouchMultiplier(value: Double): Self = StObject.set(x, "touchMultiplier", value.asInstanceOf[js.Any])
      
      inline def setTouchMultiplierUndefined: Self = StObject.set(x, "touchMultiplier", js.undefined)
      
      inline def setUnpreventTouchClass(value: String): Self = StObject.set(x, "unpreventTouchClass", value.asInstanceOf[js.Any])
      
      inline def setUnpreventTouchClassUndefined: Self = StObject.set(x, "unpreventTouchClass", js.undefined)
      
      inline def setUseKeyboard(value: Boolean): Self = StObject.set(x, "useKeyboard", value.asInstanceOf[js.Any])
      
      inline def setUseKeyboardUndefined: Self = StObject.set(x, "useKeyboard", js.undefined)
      
      inline def setUseTouch(value: Boolean): Self = StObject.set(x, "useTouch", value.asInstanceOf[js.Any])
      
      inline def setUseTouchUndefined: Self = StObject.set(x, "useTouch", js.undefined)
    }
  }
}
