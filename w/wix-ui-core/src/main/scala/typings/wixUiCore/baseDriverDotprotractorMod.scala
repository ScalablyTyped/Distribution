package typings.wixUiCore

import typings.protractor.mod.ElementFinder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseDriverDotprotractorMod {
  
  trait BaseDriver extends StObject {
    
    /** Get root element of the component */
    def element(): ElementFinder
  }
  object BaseDriver {
    
    inline def apply(element: () => ElementFinder): BaseDriver = {
      val __obj = js.Dynamic.literal(element = js.Any.fromFunction0(element))
      __obj.asInstanceOf[BaseDriver]
    }
    
    extension [Self <: BaseDriver](x: Self) {
      
      inline def setElement(value: () => ElementFinder): Self = StObject.set(x, "element", js.Any.fromFunction0(value))
    }
  }
  
  type DriverFactory[T /* <: BaseDriver */] = js.Function1[/* element */ ElementFinder, T]
}
