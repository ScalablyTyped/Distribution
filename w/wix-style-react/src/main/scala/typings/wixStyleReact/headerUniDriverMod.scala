package typings.wixStyleReact

import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headerUniDriverMod {
  
  trait HeaderUniDriver
    extends StObject
       with BaseUniDriver {
    
    def subtitle(): js.Promise[String]
    
    def title(): js.Promise[String]
  }
  object HeaderUniDriver {
    
    @scala.inline
    def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      subtitle: () => js.Promise[String],
      title: () => js.Promise[String]
    ): HeaderUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), subtitle = js.Any.fromFunction0(subtitle), title = js.Any.fromFunction0(title))
      __obj.asInstanceOf[HeaderUniDriver]
    }
    
    @scala.inline
    implicit class HeaderUniDriverMutableBuilder[Self <: HeaderUniDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSubtitle(value: () => js.Promise[String]): Self = StObject.set(x, "subtitle", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTitle(value: () => js.Promise[String]): Self = StObject.set(x, "title", js.Any.fromFunction0(value))
    }
  }
}
