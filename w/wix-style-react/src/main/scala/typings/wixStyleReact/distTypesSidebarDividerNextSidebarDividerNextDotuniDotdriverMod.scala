package typings.wixStyleReact

import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSidebarDividerNextSidebarDividerNextDotuniDotdriverMod {
  
  trait SidebarDividerNextUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getSkin(): js.Promise[String]
    
    def isFullWidth(): js.Promise[Boolean]
  }
  object SidebarDividerNextUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[Any],
      exists: () => js.Promise[Boolean],
      getSkin: () => js.Promise[String],
      isFullWidth: () => js.Promise[Boolean]
    ): SidebarDividerNextUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getSkin = js.Any.fromFunction0(getSkin), isFullWidth = js.Any.fromFunction0(isFullWidth))
      __obj.asInstanceOf[SidebarDividerNextUniDriver]
    }
    
    extension [Self <: SidebarDividerNextUniDriver](x: Self) {
      
      inline def setGetSkin(value: () => js.Promise[String]): Self = StObject.set(x, "getSkin", js.Any.fromFunction0(value))
      
      inline def setIsFullWidth(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isFullWidth", js.Any.fromFunction0(value))
    }
  }
}
