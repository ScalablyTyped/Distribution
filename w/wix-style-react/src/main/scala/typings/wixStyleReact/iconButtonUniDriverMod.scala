package typings.wixStyleReact

import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconButtonUniDriverMod {
  
  trait IconButtonUniDriver
    extends StObject
       with BaseUniDriver {
    
    var isButtonDisabled: js.Function0[js.Promise[Boolean]]
  }
  object IconButtonUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      isButtonDisabled: () => js.Promise[Boolean]
    ): IconButtonUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), isButtonDisabled = js.Any.fromFunction0(isButtonDisabled))
      __obj.asInstanceOf[IconButtonUniDriver]
    }
    
    extension [Self <: IconButtonUniDriver](x: Self) {
      
      inline def setIsButtonDisabled(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isButtonDisabled", js.Any.fromFunction0(value))
    }
  }
}
