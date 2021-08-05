package typings.wixStyleReact

import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fluidColumnsUniDriverMod {
  
  trait FluidColumnsUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getNumberOfItems(): js.Promise[Double]
  }
  object FluidColumnsUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getNumberOfItems: () => js.Promise[Double]
    ): FluidColumnsUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getNumberOfItems = js.Any.fromFunction0(getNumberOfItems))
      __obj.asInstanceOf[FluidColumnsUniDriver]
    }
    
    extension [Self <: FluidColumnsUniDriver](x: Self) {
      
      inline def setGetNumberOfItems(value: () => js.Promise[Double]): Self = StObject.set(x, "getNumberOfItems", js.Any.fromFunction0(value))
    }
  }
}
