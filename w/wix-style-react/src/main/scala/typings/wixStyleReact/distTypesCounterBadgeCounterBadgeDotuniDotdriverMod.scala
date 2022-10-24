package typings.wixStyleReact

import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCounterBadgeCounterBadgeDotuniDotdriverMod {
  
  trait CounterBadgeUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getContentText(): js.Promise[String]
  }
  object CounterBadgeUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[Any],
      exists: () => js.Promise[Boolean],
      getContentText: () => js.Promise[String]
    ): CounterBadgeUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getContentText = js.Any.fromFunction0(getContentText))
      __obj.asInstanceOf[CounterBadgeUniDriver]
    }
    
    extension [Self <: CounterBadgeUniDriver](x: Self) {
      
      inline def setGetContentText(value: () => js.Promise[String]): Self = StObject.set(x, "getContentText", js.Any.fromFunction0(value))
    }
  }
}
