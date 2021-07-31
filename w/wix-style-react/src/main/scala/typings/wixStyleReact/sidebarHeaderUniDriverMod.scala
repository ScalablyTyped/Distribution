package typings.wixStyleReact

import typings.unidriverCore.mod.UniDriver
import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sidebarHeaderUniDriverMod {
  
  trait SidebarHeaderUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getChildren(): UniDriver[js.Any]
    
    def getSubtitle(): js.Promise[String]
    
    def getTitle(): js.Promise[String]
  }
  object SidebarHeaderUniDriver {
    
    @scala.inline
    def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getChildren: () => UniDriver[js.Any],
      getSubtitle: () => js.Promise[String],
      getTitle: () => js.Promise[String]
    ): SidebarHeaderUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getChildren = js.Any.fromFunction0(getChildren), getSubtitle = js.Any.fromFunction0(getSubtitle), getTitle = js.Any.fromFunction0(getTitle))
      __obj.asInstanceOf[SidebarHeaderUniDriver]
    }
    
    @scala.inline
    implicit class SidebarHeaderUniDriverMutableBuilder[Self <: SidebarHeaderUniDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetChildren(value: () => UniDriver[js.Any]): Self = StObject.set(x, "getChildren", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSubtitle(value: () => js.Promise[String]): Self = StObject.set(x, "getSubtitle", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTitle(value: () => js.Promise[String]): Self = StObject.set(x, "getTitle", js.Any.fromFunction0(value))
    }
  }
}
