package typings.wixStyleReact

import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCloseButtonCloseButtonDotuniDotdriverMod {
  
  trait CloseButtonUniDriver
    extends StObject
       with BaseUniDriver {
    
    var isButtonDisabled: js.Function0[js.Promise[Boolean]]
  }
  object CloseButtonUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[Any],
      exists: () => js.Promise[Boolean],
      isButtonDisabled: () => js.Promise[Boolean]
    ): CloseButtonUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), isButtonDisabled = js.Any.fromFunction0(isButtonDisabled))
      __obj.asInstanceOf[CloseButtonUniDriver]
    }
    
    extension [Self <: CloseButtonUniDriver](x: Self) {
      
      inline def setIsButtonDisabled(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isButtonDisabled", js.Any.fromFunction0(value))
    }
  }
}
