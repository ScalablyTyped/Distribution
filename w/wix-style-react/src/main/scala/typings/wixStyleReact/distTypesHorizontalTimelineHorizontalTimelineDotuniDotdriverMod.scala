package typings.wixStyleReact

import typings.wixStyleReact.wixStyleReactStrings.dark
import typings.wixStyleReact.wixStyleReactStrings.standard
import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHorizontalTimelineHorizontalTimelineDotuniDotdriverMod {
  
  trait HorizontalTimelineUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getLabel(id: Double): js.Promise[String]
    
    def getSkin(): js.Promise[dark | standard]
  }
  object HorizontalTimelineUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[Any],
      exists: () => js.Promise[Boolean],
      getLabel: Double => js.Promise[String],
      getSkin: () => js.Promise[dark | standard]
    ): HorizontalTimelineUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getLabel = js.Any.fromFunction1(getLabel), getSkin = js.Any.fromFunction0(getSkin))
      __obj.asInstanceOf[HorizontalTimelineUniDriver]
    }
    
    extension [Self <: HorizontalTimelineUniDriver](x: Self) {
      
      inline def setGetLabel(value: Double => js.Promise[String]): Self = StObject.set(x, "getLabel", js.Any.fromFunction1(value))
      
      inline def setGetSkin(value: () => js.Promise[dark | standard]): Self = StObject.set(x, "getSkin", js.Any.fromFunction0(value))
    }
  }
}
