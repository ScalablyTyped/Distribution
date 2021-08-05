package typings.wixStyleReact

import typings.std.HTMLElement
import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rangeUniDriverMod {
  
  trait RangeUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getInput(): js.Promise[HTMLElement]
    
    def getLabel(): js.Promise[HTMLElement]
    
    def hasInput(): js.Promise[Boolean]
    
    def hasLabel(): js.Promise[Boolean]
  }
  object RangeUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getInput: () => js.Promise[HTMLElement],
      getLabel: () => js.Promise[HTMLElement],
      hasInput: () => js.Promise[Boolean],
      hasLabel: () => js.Promise[Boolean]
    ): RangeUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getInput = js.Any.fromFunction0(getInput), getLabel = js.Any.fromFunction0(getLabel), hasInput = js.Any.fromFunction0(hasInput), hasLabel = js.Any.fromFunction0(hasLabel))
      __obj.asInstanceOf[RangeUniDriver]
    }
    
    extension [Self <: RangeUniDriver](x: Self) {
      
      inline def setGetInput(value: () => js.Promise[HTMLElement]): Self = StObject.set(x, "getInput", js.Any.fromFunction0(value))
      
      inline def setGetLabel(value: () => js.Promise[HTMLElement]): Self = StObject.set(x, "getLabel", js.Any.fromFunction0(value))
      
      inline def setHasInput(value: () => js.Promise[Boolean]): Self = StObject.set(x, "hasInput", js.Any.fromFunction0(value))
      
      inline def setHasLabel(value: () => js.Promise[Boolean]): Self = StObject.set(x, "hasLabel", js.Any.fromFunction0(value))
    }
  }
}
