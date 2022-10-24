package typings.wixStyleReact

import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSidebarTitleItemNextSidebarTitleItemNextDotuniDotdriverMod {
  
  trait SidebarTitleItemNextUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getSkin(): js.Promise[String]
    
    def getText(): js.Promise[String]
  }
  object SidebarTitleItemNextUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[Any],
      exists: () => js.Promise[Boolean],
      getSkin: () => js.Promise[String],
      getText: () => js.Promise[String]
    ): SidebarTitleItemNextUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getSkin = js.Any.fromFunction0(getSkin), getText = js.Any.fromFunction0(getText))
      __obj.asInstanceOf[SidebarTitleItemNextUniDriver]
    }
    
    extension [Self <: SidebarTitleItemNextUniDriver](x: Self) {
      
      inline def setGetSkin(value: () => js.Promise[String]): Self = StObject.set(x, "getSkin", js.Any.fromFunction0(value))
      
      inline def setGetText(value: () => js.Promise[String]): Self = StObject.set(x, "getText", js.Any.fromFunction0(value))
    }
  }
}
