package typings.wixStyleReact

import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBadgeSelectItemBadgeSelectItemDotuniDotdriverMod {
  
  trait BadgeSelectItemUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getSubtitleText(): js.Promise[String]
    
    def getText(): js.Promise[String]
  }
  object BadgeSelectItemUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[Any],
      exists: () => js.Promise[Boolean],
      getSubtitleText: () => js.Promise[String],
      getText: () => js.Promise[String]
    ): BadgeSelectItemUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getSubtitleText = js.Any.fromFunction0(getSubtitleText), getText = js.Any.fromFunction0(getText))
      __obj.asInstanceOf[BadgeSelectItemUniDriver]
    }
    
    extension [Self <: BadgeSelectItemUniDriver](x: Self) {
      
      inline def setGetSubtitleText(value: () => js.Promise[String]): Self = StObject.set(x, "getSubtitleText", js.Any.fromFunction0(value))
      
      inline def setGetText(value: () => js.Promise[String]): Self = StObject.set(x, "getText", js.Any.fromFunction0(value))
    }
  }
}
