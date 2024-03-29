package typings.wixUiCore

import typings.protractor.mod.ElementFinder
import typings.wixUiCore.baseDriverDotprotractorMod.BaseDriver
import typings.wixUiCore.baseDriverDotprotractorMod.DriverFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputDotProtractorDriverMod {
  
  @JSImport("wix-ui-core/dist/standalone/src/components/input/Input.protractor.driver", "inputDriverFactory")
  @js.native
  val inputDriverFactory: DriverFactory[InputDriver] = js.native
  
  trait InputDriver
    extends StObject
       with BaseDriver {
    
    def enterText(text: String): js.Promise[Unit]
    
    def focus(): js.Promise[Unit]
    
    def getText(): js.Promise[String]
    
    def pressKey(key: String): js.Promise[Unit]
  }
  object InputDriver {
    
    inline def apply(
      element: () => ElementFinder,
      enterText: String => js.Promise[Unit],
      focus: () => js.Promise[Unit],
      getText: () => js.Promise[String],
      pressKey: String => js.Promise[Unit]
    ): InputDriver = {
      val __obj = js.Dynamic.literal(element = js.Any.fromFunction0(element), enterText = js.Any.fromFunction1(enterText), focus = js.Any.fromFunction0(focus), getText = js.Any.fromFunction0(getText), pressKey = js.Any.fromFunction1(pressKey))
      __obj.asInstanceOf[InputDriver]
    }
    
    extension [Self <: InputDriver](x: Self) {
      
      inline def setEnterText(value: String => js.Promise[Unit]): Self = StObject.set(x, "enterText", js.Any.fromFunction1(value))
      
      inline def setFocus(value: () => js.Promise[Unit]): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
      
      inline def setGetText(value: () => js.Promise[String]): Self = StObject.set(x, "getText", js.Any.fromFunction0(value))
      
      inline def setPressKey(value: String => js.Promise[Unit]): Self = StObject.set(x, "pressKey", js.Any.fromFunction1(value))
    }
  }
}
