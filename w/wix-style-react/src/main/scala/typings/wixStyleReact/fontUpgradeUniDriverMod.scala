package typings.wixStyleReact

import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fontUpgradeUniDriverMod {
  
  trait FontUpgradeUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getElement(selector: String): js.Promise[js.Any]
    
    def isActive(): js.Promise[Boolean]
  }
  object FontUpgradeUniDriver {
    
    @scala.inline
    def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getElement: String => js.Promise[js.Any],
      isActive: () => js.Promise[Boolean]
    ): FontUpgradeUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getElement = js.Any.fromFunction1(getElement), isActive = js.Any.fromFunction0(isActive))
      __obj.asInstanceOf[FontUpgradeUniDriver]
    }
    
    @scala.inline
    implicit class FontUpgradeUniDriverMutableBuilder[Self <: FontUpgradeUniDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetElement(value: String => js.Promise[js.Any]): Self = StObject.set(x, "getElement", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsActive(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isActive", js.Any.fromFunction0(value))
    }
  }
}
