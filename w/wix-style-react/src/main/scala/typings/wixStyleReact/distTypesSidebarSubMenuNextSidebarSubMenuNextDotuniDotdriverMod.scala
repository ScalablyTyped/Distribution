package typings.wixStyleReact

import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSidebarSubMenuNextSidebarSubMenuNextDotuniDotdriverMod {
  
  trait SidebarSubMenuNextUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getTitleText(): js.Promise[String]
    
    def isDisabled(): js.Promise[Boolean]
    
    def isExpanded(): js.Promise[Boolean]
  }
  object SidebarSubMenuNextUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[Any],
      exists: () => js.Promise[Boolean],
      getTitleText: () => js.Promise[String],
      isDisabled: () => js.Promise[Boolean],
      isExpanded: () => js.Promise[Boolean]
    ): SidebarSubMenuNextUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getTitleText = js.Any.fromFunction0(getTitleText), isDisabled = js.Any.fromFunction0(isDisabled), isExpanded = js.Any.fromFunction0(isExpanded))
      __obj.asInstanceOf[SidebarSubMenuNextUniDriver]
    }
    
    extension [Self <: SidebarSubMenuNextUniDriver](x: Self) {
      
      inline def setGetTitleText(value: () => js.Promise[String]): Self = StObject.set(x, "getTitleText", js.Any.fromFunction0(value))
      
      inline def setIsDisabled(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isDisabled", js.Any.fromFunction0(value))
      
      inline def setIsExpanded(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isExpanded", js.Any.fromFunction0(value))
    }
  }
}
