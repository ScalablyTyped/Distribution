package typings.wixStyleReact

import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sidebarDividerUniDriverMod {
  
  trait SidebarDividerUniDriver
    extends StObject
       with BaseUniDriver {
    
    def isFullWidth(): js.Promise[Boolean]
  }
  object SidebarDividerUniDriver {
    
    @scala.inline
    def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      isFullWidth: () => js.Promise[Boolean]
    ): SidebarDividerUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), isFullWidth = js.Any.fromFunction0(isFullWidth))
      __obj.asInstanceOf[SidebarDividerUniDriver]
    }
    
    @scala.inline
    implicit class SidebarDividerUniDriverMutableBuilder[Self <: SidebarDividerUniDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsFullWidth(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isFullWidth", js.Any.fromFunction0(value))
    }
  }
}
