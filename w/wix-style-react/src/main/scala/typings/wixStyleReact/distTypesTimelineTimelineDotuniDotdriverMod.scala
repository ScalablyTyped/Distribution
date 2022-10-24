package typings.wixStyleReact

import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTimelineTimelineDotuniDotdriverMod {
  
  trait TimelineUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getLabelText(idx: Double): js.Promise[String]
    
    def getSuffixText(idx: Double): js.Promise[String]
  }
  object TimelineUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[Any],
      exists: () => js.Promise[Boolean],
      getLabelText: Double => js.Promise[String],
      getSuffixText: Double => js.Promise[String]
    ): TimelineUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getLabelText = js.Any.fromFunction1(getLabelText), getSuffixText = js.Any.fromFunction1(getSuffixText))
      __obj.asInstanceOf[TimelineUniDriver]
    }
    
    extension [Self <: TimelineUniDriver](x: Self) {
      
      inline def setGetLabelText(value: Double => js.Promise[String]): Self = StObject.set(x, "getLabelText", js.Any.fromFunction1(value))
      
      inline def setGetSuffixText(value: Double => js.Promise[String]): Self = StObject.set(x, "getSuffixText", js.Any.fromFunction1(value))
    }
  }
}
