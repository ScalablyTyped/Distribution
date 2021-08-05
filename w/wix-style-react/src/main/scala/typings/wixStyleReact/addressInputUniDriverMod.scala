package typings.wixStyleReact

import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addressInputUniDriverMod {
  
  trait AddressInputUniDriver
    extends StObject
       with BaseUniDriver {
    
    def clearText(): js.Promise[Unit]
    
    def clickAtOption(index: Double): js.Promise[Unit]
    
    def clickAtOptionWithValue(value: String): js.Promise[Unit]
    
    def enterText(value: String): js.Promise[Unit]
    
    def getInputValue(): js.Promise[String]
    
    def isDisabled(): js.Promise[Boolean]
  }
  object AddressInputUniDriver {
    
    inline def apply(
      clearText: () => js.Promise[Unit],
      click: () => js.Promise[Unit],
      clickAtOption: Double => js.Promise[Unit],
      clickAtOptionWithValue: String => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      enterText: String => js.Promise[Unit],
      exists: () => js.Promise[Boolean],
      getInputValue: () => js.Promise[String],
      isDisabled: () => js.Promise[Boolean]
    ): AddressInputUniDriver = {
      val __obj = js.Dynamic.literal(clearText = js.Any.fromFunction0(clearText), click = js.Any.fromFunction0(click), clickAtOption = js.Any.fromFunction1(clickAtOption), clickAtOptionWithValue = js.Any.fromFunction1(clickAtOptionWithValue), element = js.Any.fromFunction0(element), enterText = js.Any.fromFunction1(enterText), exists = js.Any.fromFunction0(exists), getInputValue = js.Any.fromFunction0(getInputValue), isDisabled = js.Any.fromFunction0(isDisabled))
      __obj.asInstanceOf[AddressInputUniDriver]
    }
    
    extension [Self <: AddressInputUniDriver](x: Self) {
      
      inline def setClearText(value: () => js.Promise[Unit]): Self = StObject.set(x, "clearText", js.Any.fromFunction0(value))
      
      inline def setClickAtOption(value: Double => js.Promise[Unit]): Self = StObject.set(x, "clickAtOption", js.Any.fromFunction1(value))
      
      inline def setClickAtOptionWithValue(value: String => js.Promise[Unit]): Self = StObject.set(x, "clickAtOptionWithValue", js.Any.fromFunction1(value))
      
      inline def setEnterText(value: String => js.Promise[Unit]): Self = StObject.set(x, "enterText", js.Any.fromFunction1(value))
      
      inline def setGetInputValue(value: () => js.Promise[String]): Self = StObject.set(x, "getInputValue", js.Any.fromFunction0(value))
      
      inline def setIsDisabled(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isDisabled", js.Any.fromFunction0(value))
    }
  }
}
