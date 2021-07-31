package typings.wixStyleReact

import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkToggleUniDriverMod {
  
  trait CheckToggleUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getTooltipContent(): js.Promise[String]
    
    def isChecked(): js.Promise[Boolean]
  }
  object CheckToggleUniDriver {
    
    @scala.inline
    def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getTooltipContent: () => js.Promise[String],
      isChecked: () => js.Promise[Boolean]
    ): CheckToggleUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getTooltipContent = js.Any.fromFunction0(getTooltipContent), isChecked = js.Any.fromFunction0(isChecked))
      __obj.asInstanceOf[CheckToggleUniDriver]
    }
    
    @scala.inline
    implicit class CheckToggleUniDriverMutableBuilder[Self <: CheckToggleUniDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetTooltipContent(value: () => js.Promise[String]): Self = StObject.set(x, "getTooltipContent", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsChecked(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isChecked", js.Any.fromFunction0(value))
    }
  }
}
