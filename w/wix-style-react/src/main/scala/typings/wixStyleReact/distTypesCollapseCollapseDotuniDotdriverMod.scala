package typings.wixStyleReact

import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCollapseCollapseDotuniDotdriverMod {
  
  trait CollapseUniDriver
    extends StObject
       with BaseUniDriver {
    
    def isOpen(): js.Promise[Boolean]
  }
  object CollapseUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[Any],
      exists: () => js.Promise[Boolean],
      isOpen: () => js.Promise[Boolean]
    ): CollapseUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), isOpen = js.Any.fromFunction0(isOpen))
      __obj.asInstanceOf[CollapseUniDriver]
    }
    
    extension [Self <: CollapseUniDriver](x: Self) {
      
      inline def setIsOpen(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isOpen", js.Any.fromFunction0(value))
    }
  }
}
