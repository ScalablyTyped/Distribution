package typings.wixStyleReact

import typings.wixStyleReact.distTypesInputInputDotuniDotdriverMod.InputUniDriver
import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesEditableTitleEditableTitleDotuniDotdriverMod {
  
  trait EditableTitleUniDriver
    extends StObject
       with BaseUniDriver {
    
    def clickHeading(idx: Double): js.Promise[Unit]
    
    def getHeadingText(idx: Double): js.Promise[String]
    
    def getInput(): InputUniDriver
  }
  object EditableTitleUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      clickHeading: Double => js.Promise[Unit],
      element: () => js.Promise[Any],
      exists: () => js.Promise[Boolean],
      getHeadingText: Double => js.Promise[String],
      getInput: () => InputUniDriver
    ): EditableTitleUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), clickHeading = js.Any.fromFunction1(clickHeading), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getHeadingText = js.Any.fromFunction1(getHeadingText), getInput = js.Any.fromFunction0(getInput))
      __obj.asInstanceOf[EditableTitleUniDriver]
    }
    
    extension [Self <: EditableTitleUniDriver](x: Self) {
      
      inline def setClickHeading(value: Double => js.Promise[Unit]): Self = StObject.set(x, "clickHeading", js.Any.fromFunction1(value))
      
      inline def setGetHeadingText(value: Double => js.Promise[String]): Self = StObject.set(x, "getHeadingText", js.Any.fromFunction1(value))
      
      inline def setGetInput(value: () => InputUniDriver): Self = StObject.set(x, "getInput", js.Any.fromFunction0(value))
    }
  }
}
