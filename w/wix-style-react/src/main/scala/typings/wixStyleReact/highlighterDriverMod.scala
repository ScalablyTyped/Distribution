package typings.wixStyleReact

import typings.wixUiTestUtils.createDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object highlighterDriverMod {
  
  trait HighlighterDriver[T]
    extends StObject
       with BaseDriver {
    
    def getElement(): T
    
    def html(): String
  }
  object HighlighterDriver {
    
    @scala.inline
    def apply[T](exists: () => Boolean, getElement: () => T, html: () => String): HighlighterDriver[T] = {
      val __obj = js.Dynamic.literal(exists = js.Any.fromFunction0(exists), getElement = js.Any.fromFunction0(getElement), html = js.Any.fromFunction0(html))
      __obj.asInstanceOf[HighlighterDriver[T]]
    }
    
    @scala.inline
    implicit class HighlighterDriverMutableBuilder[Self <: HighlighterDriver[?], T] (val x: Self & HighlighterDriver[T]) extends AnyVal {
      
      @scala.inline
      def setGetElement(value: () => T): Self = StObject.set(x, "getElement", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHtml(value: () => String): Self = StObject.set(x, "html", js.Any.fromFunction0(value))
    }
  }
}
