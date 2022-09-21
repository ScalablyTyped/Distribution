package typings.typeformEmbed

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setElementSizeMod {
  
  @JSImport("@typeform/embed/types/utils/set-element-size", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setElementSize(element: HTMLElement, hasWidthHeight: ElementSize): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("setElementSize")(element.asInstanceOf[js.Any], hasWidthHeight.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  
  trait ElementSize extends StObject {
    
    var height: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object ElementSize {
    
    inline def apply(): ElementSize = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ElementSize]
    }
    
    extension [Self <: ElementSize](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
