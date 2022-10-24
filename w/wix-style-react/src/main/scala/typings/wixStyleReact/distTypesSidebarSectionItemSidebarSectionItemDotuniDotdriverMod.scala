package typings.wixStyleReact

import typings.unidriverCore.mod.UniDriver
import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSidebarSectionItemSidebarSectionItemDotuniDotdriverMod {
  
  trait SidebarSectionItemUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getPrefix(): UniDriver[Any]
    
    def getSuffix(): UniDriver[Any]
    
    def getText(): js.Promise[String]
    
    def getTitleText(): js.Promise[String]
    
    def hover(): js.Promise[Unit]
    
    def isDisabled(): js.Promise[Boolean]
    
    def isSelected(): js.Promise[Boolean]
  }
  object SidebarSectionItemUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[Any],
      exists: () => js.Promise[Boolean],
      getPrefix: () => UniDriver[Any],
      getSuffix: () => UniDriver[Any],
      getText: () => js.Promise[String],
      getTitleText: () => js.Promise[String],
      hover: () => js.Promise[Unit],
      isDisabled: () => js.Promise[Boolean],
      isSelected: () => js.Promise[Boolean]
    ): SidebarSectionItemUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getPrefix = js.Any.fromFunction0(getPrefix), getSuffix = js.Any.fromFunction0(getSuffix), getText = js.Any.fromFunction0(getText), getTitleText = js.Any.fromFunction0(getTitleText), hover = js.Any.fromFunction0(hover), isDisabled = js.Any.fromFunction0(isDisabled), isSelected = js.Any.fromFunction0(isSelected))
      __obj.asInstanceOf[SidebarSectionItemUniDriver]
    }
    
    extension [Self <: SidebarSectionItemUniDriver](x: Self) {
      
      inline def setGetPrefix(value: () => UniDriver[Any]): Self = StObject.set(x, "getPrefix", js.Any.fromFunction0(value))
      
      inline def setGetSuffix(value: () => UniDriver[Any]): Self = StObject.set(x, "getSuffix", js.Any.fromFunction0(value))
      
      inline def setGetText(value: () => js.Promise[String]): Self = StObject.set(x, "getText", js.Any.fromFunction0(value))
      
      inline def setGetTitleText(value: () => js.Promise[String]): Self = StObject.set(x, "getTitleText", js.Any.fromFunction0(value))
      
      inline def setHover(value: () => js.Promise[Unit]): Self = StObject.set(x, "hover", js.Any.fromFunction0(value))
      
      inline def setIsDisabled(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isDisabled", js.Any.fromFunction0(value))
      
      inline def setIsSelected(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isSelected", js.Any.fromFunction0(value))
    }
  }
}
