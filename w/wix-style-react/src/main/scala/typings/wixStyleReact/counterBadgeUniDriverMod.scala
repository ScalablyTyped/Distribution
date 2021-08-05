package typings.wixStyleReact

import typings.std.HTMLElement
import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object counterBadgeUniDriverMod {
  
  trait CounterBadgeUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getContent(): js.Promise[HTMLElement]
  }
  object CounterBadgeUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getContent: () => js.Promise[HTMLElement]
    ): CounterBadgeUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getContent = js.Any.fromFunction0(getContent))
      __obj.asInstanceOf[CounterBadgeUniDriver]
    }
    
    extension [Self <: CounterBadgeUniDriver](x: Self) {
      
      inline def setGetContent(value: () => js.Promise[HTMLElement]): Self = StObject.set(x, "getContent", js.Any.fromFunction0(value))
    }
  }
}
