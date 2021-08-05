package typings.wixStyleReact

import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object verticalTabsItemUniDriverMod {
  
  trait VerticalTabsItemUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getText(): js.Promise[String]
  }
  object VerticalTabsItemUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getText: () => js.Promise[String]
    ): VerticalTabsItemUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getText = js.Any.fromFunction0(getText))
      __obj.asInstanceOf[VerticalTabsItemUniDriver]
    }
    
    extension [Self <: VerticalTabsItemUniDriver](x: Self) {
      
      inline def setGetText(value: () => js.Promise[String]): Self = StObject.set(x, "getText", js.Any.fromFunction0(value))
    }
  }
}
