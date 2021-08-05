package typings.wixStyleReact

import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animateUniDriverMod {
  
  trait AnimateUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getDelay(): js.Promise[String]
  }
  object AnimateUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getDelay: () => js.Promise[String]
    ): AnimateUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getDelay = js.Any.fromFunction0(getDelay))
      __obj.asInstanceOf[AnimateUniDriver]
    }
    
    extension [Self <: AnimateUniDriver](x: Self) {
      
      inline def setGetDelay(value: () => js.Promise[String]): Self = StObject.set(x, "getDelay", js.Any.fromFunction0(value))
    }
  }
}
