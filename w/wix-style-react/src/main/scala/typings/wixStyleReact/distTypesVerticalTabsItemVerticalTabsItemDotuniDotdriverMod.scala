package typings.wixStyleReact

import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesVerticalTabsItemVerticalTabsItemDotuniDotdriverMod {
  
  trait VerticalTabsItemUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getText(): js.Promise[String]
    
    def pressEnterKey(): js.Promise[Unit]
  }
  object VerticalTabsItemUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[Any],
      exists: () => js.Promise[Boolean],
      getText: () => js.Promise[String],
      pressEnterKey: () => js.Promise[Unit]
    ): VerticalTabsItemUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getText = js.Any.fromFunction0(getText), pressEnterKey = js.Any.fromFunction0(pressEnterKey))
      __obj.asInstanceOf[VerticalTabsItemUniDriver]
    }
    
    extension [Self <: VerticalTabsItemUniDriver](x: Self) {
      
      inline def setGetText(value: () => js.Promise[String]): Self = StObject.set(x, "getText", js.Any.fromFunction0(value))
      
      inline def setPressEnterKey(value: () => js.Promise[Unit]): Self = StObject.set(x, "pressEnterKey", js.Any.fromFunction0(value))
    }
  }
}
