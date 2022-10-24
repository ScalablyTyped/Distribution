package typings.wixStyleReact

import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSidebarNextSidebarNextDotuniDotdriverMod {
  
  trait SidebarNextUniDriver
    extends StObject
       with BaseUniDriver {
    
    def footerExists(): js.Promise[Boolean]
    
    def getSelectedKey(): js.Promise[String]
    
    def getSkin(): js.Promise[String]
    
    def headerExists(): js.Promise[Boolean]
    
    def isHidden(): js.Promise[Boolean]
    
    def isLoading(): js.Promise[Boolean]
  }
  object SidebarNextUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[Any],
      exists: () => js.Promise[Boolean],
      footerExists: () => js.Promise[Boolean],
      getSelectedKey: () => js.Promise[String],
      getSkin: () => js.Promise[String],
      headerExists: () => js.Promise[Boolean],
      isHidden: () => js.Promise[Boolean],
      isLoading: () => js.Promise[Boolean]
    ): SidebarNextUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), footerExists = js.Any.fromFunction0(footerExists), getSelectedKey = js.Any.fromFunction0(getSelectedKey), getSkin = js.Any.fromFunction0(getSkin), headerExists = js.Any.fromFunction0(headerExists), isHidden = js.Any.fromFunction0(isHidden), isLoading = js.Any.fromFunction0(isLoading))
      __obj.asInstanceOf[SidebarNextUniDriver]
    }
    
    extension [Self <: SidebarNextUniDriver](x: Self) {
      
      inline def setFooterExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "footerExists", js.Any.fromFunction0(value))
      
      inline def setGetSelectedKey(value: () => js.Promise[String]): Self = StObject.set(x, "getSelectedKey", js.Any.fromFunction0(value))
      
      inline def setGetSkin(value: () => js.Promise[String]): Self = StObject.set(x, "getSkin", js.Any.fromFunction0(value))
      
      inline def setHeaderExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "headerExists", js.Any.fromFunction0(value))
      
      inline def setIsHidden(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isHidden", js.Any.fromFunction0(value))
      
      inline def setIsLoading(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isLoading", js.Any.fromFunction0(value))
    }
  }
}
