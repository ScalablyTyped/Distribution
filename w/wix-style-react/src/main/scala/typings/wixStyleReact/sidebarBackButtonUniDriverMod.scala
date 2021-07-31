package typings.wixStyleReact

import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sidebarBackButtonUniDriverMod {
  
  trait SidebarBackButtonUniDriver
    extends StObject
       with BaseUniDriver {
    
    def clickButton(): js.Promise[Unit]
    
    def getButtonText(): js.Promise[String]
  }
  object SidebarBackButtonUniDriver {
    
    @scala.inline
    def apply(
      click: () => js.Promise[Unit],
      clickButton: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getButtonText: () => js.Promise[String]
    ): SidebarBackButtonUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), clickButton = js.Any.fromFunction0(clickButton), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getButtonText = js.Any.fromFunction0(getButtonText))
      __obj.asInstanceOf[SidebarBackButtonUniDriver]
    }
    
    @scala.inline
    implicit class SidebarBackButtonUniDriverMutableBuilder[Self <: SidebarBackButtonUniDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClickButton(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickButton", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetButtonText(value: () => js.Promise[String]): Self = StObject.set(x, "getButtonText", js.Any.fromFunction0(value))
    }
  }
}
