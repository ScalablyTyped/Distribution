package typings.wixStyleReact

import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object badgeSelectUniDriverMod {
  
  trait BadgeSelectUniDriver
    extends StObject
       with BaseUniDriver {
    
    def clickAtOption(index: Double): js.Promise[Unit]
  }
  object BadgeSelectUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      clickAtOption: Double => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean]
    ): BadgeSelectUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), clickAtOption = js.Any.fromFunction1(clickAtOption), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists))
      __obj.asInstanceOf[BadgeSelectUniDriver]
    }
    
    extension [Self <: BadgeSelectUniDriver](x: Self) {
      
      inline def setClickAtOption(value: Double => js.Promise[Unit]): Self = StObject.set(x, "clickAtOption", js.Any.fromFunction1(value))
    }
  }
}
