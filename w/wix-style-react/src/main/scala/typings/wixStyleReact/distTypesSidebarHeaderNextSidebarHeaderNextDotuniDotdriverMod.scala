package typings.wixStyleReact

import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSidebarHeaderNextSidebarHeaderNextDotuniDotdriverMod {
  
  trait SidebarHeaderNextUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getSkin(): js.Promise[String]
    
    def getSubtitle(): js.Promise[String]
    
    def getTitle(): js.Promise[String]
  }
  object SidebarHeaderNextUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[Any],
      exists: () => js.Promise[Boolean],
      getSkin: () => js.Promise[String],
      getSubtitle: () => js.Promise[String],
      getTitle: () => js.Promise[String]
    ): SidebarHeaderNextUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getSkin = js.Any.fromFunction0(getSkin), getSubtitle = js.Any.fromFunction0(getSubtitle), getTitle = js.Any.fromFunction0(getTitle))
      __obj.asInstanceOf[SidebarHeaderNextUniDriver]
    }
    
    extension [Self <: SidebarHeaderNextUniDriver](x: Self) {
      
      inline def setGetSkin(value: () => js.Promise[String]): Self = StObject.set(x, "getSkin", js.Any.fromFunction0(value))
      
      inline def setGetSubtitle(value: () => js.Promise[String]): Self = StObject.set(x, "getSubtitle", js.Any.fromFunction0(value))
      
      inline def setGetTitle(value: () => js.Promise[String]): Self = StObject.set(x, "getTitle", js.Any.fromFunction0(value))
    }
  }
}
