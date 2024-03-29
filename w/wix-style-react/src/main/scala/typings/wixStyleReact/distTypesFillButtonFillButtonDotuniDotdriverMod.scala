package typings.wixStyleReact

import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFillButtonFillButtonDotuniDotdriverMod {
  
  trait FillButtonUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getTooltipText(): js.Promise[String]
  }
  object FillButtonUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[Any],
      exists: () => js.Promise[Boolean],
      getTooltipText: () => js.Promise[String]
    ): FillButtonUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getTooltipText = js.Any.fromFunction0(getTooltipText))
      __obj.asInstanceOf[FillButtonUniDriver]
    }
    
    extension [Self <: FillButtonUniDriver](x: Self) {
      
      inline def setGetTooltipText(value: () => js.Promise[String]): Self = StObject.set(x, "getTooltipText", js.Any.fromFunction0(value))
    }
  }
}
