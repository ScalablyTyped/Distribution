package typings.wixStyleReact

import typings.unidriverCore.mod.UniDriver
import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sidebarSectionItemUniDriverMod {
  
  trait SidebarSectionItemUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getPrefix(): UniDriver[js.Any]
    
    def getSuffix(): UniDriver[js.Any]
    
    def getText(): js.Promise[String]
    
    def hover(): js.Promise[Unit]
  }
  object SidebarSectionItemUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getPrefix: () => UniDriver[js.Any],
      getSuffix: () => UniDriver[js.Any],
      getText: () => js.Promise[String],
      hover: () => js.Promise[Unit]
    ): SidebarSectionItemUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getPrefix = js.Any.fromFunction0(getPrefix), getSuffix = js.Any.fromFunction0(getSuffix), getText = js.Any.fromFunction0(getText), hover = js.Any.fromFunction0(hover))
      __obj.asInstanceOf[SidebarSectionItemUniDriver]
    }
    
    extension [Self <: SidebarSectionItemUniDriver](x: Self) {
      
      inline def setGetPrefix(value: () => UniDriver[js.Any]): Self = StObject.set(x, "getPrefix", js.Any.fromFunction0(value))
      
      inline def setGetSuffix(value: () => UniDriver[js.Any]): Self = StObject.set(x, "getSuffix", js.Any.fromFunction0(value))
      
      inline def setGetText(value: () => js.Promise[String]): Self = StObject.set(x, "getText", js.Any.fromFunction0(value))
      
      inline def setHover(value: () => js.Promise[Unit]): Self = StObject.set(x, "hover", js.Any.fromFunction0(value))
    }
  }
}
