package typings.wixStyleReact

import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object highlighterUniDriverMod {
  
  trait HighlighterUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getElement(): js.Promise[js.Any]
    
    def html(): js.Promise[String]
  }
  object HighlighterUniDriver {
    
    @scala.inline
    def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getElement: () => js.Promise[js.Any],
      html: () => js.Promise[String]
    ): HighlighterUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getElement = js.Any.fromFunction0(getElement), html = js.Any.fromFunction0(html))
      __obj.asInstanceOf[HighlighterUniDriver]
    }
    
    @scala.inline
    implicit class HighlighterUniDriverMutableBuilder[Self <: HighlighterUniDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetElement(value: () => js.Promise[js.Any]): Self = StObject.set(x, "getElement", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHtml(value: () => js.Promise[String]): Self = StObject.set(x, "html", js.Any.fromFunction0(value))
    }
  }
}
