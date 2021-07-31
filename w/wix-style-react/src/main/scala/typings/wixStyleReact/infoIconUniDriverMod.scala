package typings.wixStyleReact

import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object infoIconUniDriverMod {
  
  trait InfoIconUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getContent(): js.Promise[String]
    
    def getSize(): js.Promise[String]
    
    def hover(): js.Promise[Unit]
  }
  object InfoIconUniDriver {
    
    @scala.inline
    def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getContent: () => js.Promise[String],
      getSize: () => js.Promise[String],
      hover: () => js.Promise[Unit]
    ): InfoIconUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getContent = js.Any.fromFunction0(getContent), getSize = js.Any.fromFunction0(getSize), hover = js.Any.fromFunction0(hover))
      __obj.asInstanceOf[InfoIconUniDriver]
    }
    
    @scala.inline
    implicit class InfoIconUniDriverMutableBuilder[Self <: InfoIconUniDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetContent(value: () => js.Promise[String]): Self = StObject.set(x, "getContent", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSize(value: () => js.Promise[String]): Self = StObject.set(x, "getSize", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHover(value: () => js.Promise[Unit]): Self = StObject.set(x, "hover", js.Any.fromFunction0(value))
    }
  }
}
