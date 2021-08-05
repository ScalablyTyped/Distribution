package typings.wixStyleReact

import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardFolderTabsUniDriverMod {
  
  trait CardFolderTabsUniDriver
    extends StObject
       with BaseUniDriver {
    
    def isTabDisabledById(tabId: String): js.Promise[Boolean]
    
    def selectTabById(tabId: String): js.Promise[Unit]
  }
  object CardFolderTabsUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      isTabDisabledById: String => js.Promise[Boolean],
      selectTabById: String => js.Promise[Unit]
    ): CardFolderTabsUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), isTabDisabledById = js.Any.fromFunction1(isTabDisabledById), selectTabById = js.Any.fromFunction1(selectTabById))
      __obj.asInstanceOf[CardFolderTabsUniDriver]
    }
    
    extension [Self <: CardFolderTabsUniDriver](x: Self) {
      
      inline def setIsTabDisabledById(value: String => js.Promise[Boolean]): Self = StObject.set(x, "isTabDisabledById", js.Any.fromFunction1(value))
      
      inline def setSelectTabById(value: String => js.Promise[Unit]): Self = StObject.set(x, "selectTabById", js.Any.fromFunction1(value))
    }
  }
}
