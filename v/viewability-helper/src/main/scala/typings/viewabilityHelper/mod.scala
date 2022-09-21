package typings.viewabilityHelper

import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("viewability-helper", "ViewabilityHelper")
  @js.native
  open class ViewabilityHelper protected () extends StObject {
    def this(element: Element, callback: js.Function0[Unit]) = this()
    def this(element: HTMLElement, callback: js.Function0[Unit]) = this()
    def this(element: Element, callback: js.Function0[Unit], options: Options) = this()
    def this(element: HTMLElement, callback: js.Function0[Unit], options: Options) = this()
    
    def observe(): Unit = js.native
  }
  
  trait Options extends StObject {
    
    var callbackParams: js.UndefOr[js.Array[Any]] = js.undefined
    
    var intersectionPercentage: js.UndefOr[Double] = js.undefined
    
    var rootMargin: js.UndefOr[String] = js.undefined
    
    var scrollDimmer: js.UndefOr[Double] = js.undefined
    
    var threshold: js.UndefOr[js.Array[Double]] = js.undefined
    
    var unobserve: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCallbackParams(value: js.Array[Any]): Self = StObject.set(x, "callbackParams", value.asInstanceOf[js.Any])
      
      inline def setCallbackParamsUndefined: Self = StObject.set(x, "callbackParams", js.undefined)
      
      inline def setCallbackParamsVarargs(value: Any*): Self = StObject.set(x, "callbackParams", js.Array(value*))
      
      inline def setIntersectionPercentage(value: Double): Self = StObject.set(x, "intersectionPercentage", value.asInstanceOf[js.Any])
      
      inline def setIntersectionPercentageUndefined: Self = StObject.set(x, "intersectionPercentage", js.undefined)
      
      inline def setRootMargin(value: String): Self = StObject.set(x, "rootMargin", value.asInstanceOf[js.Any])
      
      inline def setRootMarginUndefined: Self = StObject.set(x, "rootMargin", js.undefined)
      
      inline def setScrollDimmer(value: Double): Self = StObject.set(x, "scrollDimmer", value.asInstanceOf[js.Any])
      
      inline def setScrollDimmerUndefined: Self = StObject.set(x, "scrollDimmer", js.undefined)
      
      inline def setThreshold(value: js.Array[Double]): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
      
      inline def setThresholdVarargs(value: Double*): Self = StObject.set(x, "threshold", js.Array(value*))
      
      inline def setUnobserve(value: Boolean): Self = StObject.set(x, "unobserve", value.asInstanceOf[js.Any])
      
      inline def setUnobserveUndefined: Self = StObject.set(x, "unobserve", js.undefined)
    }
  }
}
