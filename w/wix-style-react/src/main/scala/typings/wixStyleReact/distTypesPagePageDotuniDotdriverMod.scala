package typings.wixStyleReact

import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPagePageDotuniDotdriverMod {
  
  trait PageUniDriver
    extends StObject
       with BaseUniDriver {
    
    def backgroundImageExists(): js.Promise[Boolean]
    
    def getPageHtml(): js.Promise[Any]
    
    def gradientClassNameExists(): js.Promise[Boolean]
    
    def gradientContainerHeight(): js.Promise[String]
    
    def hasClass(name: String): js.Promise[Boolean]
    
    def tailExists(): js.Promise[Boolean]
  }
  object PageUniDriver {
    
    inline def apply(
      backgroundImageExists: () => js.Promise[Boolean],
      click: () => js.Promise[Unit],
      element: () => js.Promise[Any],
      exists: () => js.Promise[Boolean],
      getPageHtml: () => js.Promise[Any],
      gradientClassNameExists: () => js.Promise[Boolean],
      gradientContainerHeight: () => js.Promise[String],
      hasClass: String => js.Promise[Boolean],
      tailExists: () => js.Promise[Boolean]
    ): PageUniDriver = {
      val __obj = js.Dynamic.literal(backgroundImageExists = js.Any.fromFunction0(backgroundImageExists), click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getPageHtml = js.Any.fromFunction0(getPageHtml), gradientClassNameExists = js.Any.fromFunction0(gradientClassNameExists), gradientContainerHeight = js.Any.fromFunction0(gradientContainerHeight), hasClass = js.Any.fromFunction1(hasClass), tailExists = js.Any.fromFunction0(tailExists))
      __obj.asInstanceOf[PageUniDriver]
    }
    
    extension [Self <: PageUniDriver](x: Self) {
      
      inline def setBackgroundImageExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "backgroundImageExists", js.Any.fromFunction0(value))
      
      inline def setGetPageHtml(value: () => js.Promise[Any]): Self = StObject.set(x, "getPageHtml", js.Any.fromFunction0(value))
      
      inline def setGradientClassNameExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "gradientClassNameExists", js.Any.fromFunction0(value))
      
      inline def setGradientContainerHeight(value: () => js.Promise[String]): Self = StObject.set(x, "gradientContainerHeight", js.Any.fromFunction0(value))
      
      inline def setHasClass(value: String => js.Promise[Boolean]): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
      
      inline def setTailExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "tailExists", js.Any.fromFunction0(value))
    }
  }
}
