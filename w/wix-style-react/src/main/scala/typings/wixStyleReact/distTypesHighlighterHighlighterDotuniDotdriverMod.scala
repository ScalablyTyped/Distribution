package typings.wixStyleReact

import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHighlighterHighlighterDotuniDotdriverMod {
  
  trait HighlighterUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getElement(): js.Promise[Any]
    
    def html(): js.Promise[String]
  }
  object HighlighterUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[Any],
      exists: () => js.Promise[Boolean],
      getElement: () => js.Promise[Any],
      html: () => js.Promise[String]
    ): HighlighterUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getElement = js.Any.fromFunction0(getElement), html = js.Any.fromFunction0(html))
      __obj.asInstanceOf[HighlighterUniDriver]
    }
    
    extension [Self <: HighlighterUniDriver](x: Self) {
      
      inline def setGetElement(value: () => js.Promise[Any]): Self = StObject.set(x, "getElement", js.Any.fromFunction0(value))
      
      inline def setHtml(value: () => js.Promise[String]): Self = StObject.set(x, "html", js.Any.fromFunction0(value))
    }
  }
}
