package typings.wixStyleReact

import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addItemUniDriverMod {
  
  trait AddItemUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getText(): js.Promise[String]
    
    def getTooltipContent(): js.Promise[String]
    
    def textExists(): js.Promise[Boolean]
  }
  object AddItemUniDriver {
    
    @scala.inline
    def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getText: () => js.Promise[String],
      getTooltipContent: () => js.Promise[String],
      textExists: () => js.Promise[Boolean]
    ): AddItemUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getText = js.Any.fromFunction0(getText), getTooltipContent = js.Any.fromFunction0(getTooltipContent), textExists = js.Any.fromFunction0(textExists))
      __obj.asInstanceOf[AddItemUniDriver]
    }
    
    @scala.inline
    implicit class AddItemUniDriverMutableBuilder[Self <: AddItemUniDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetText(value: () => js.Promise[String]): Self = StObject.set(x, "getText", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTooltipContent(value: () => js.Promise[String]): Self = StObject.set(x, "getTooltipContent", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTextExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "textExists", js.Any.fromFunction0(value))
    }
  }
}
