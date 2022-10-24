package typings.wixStyleReact

import typings.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPagePageDotdriverMod {
  
  trait PageDriver
    extends StObject
       with BaseDriver {
    
    def backgroundImageExists(): Boolean
    
    def getPageHtml(): String
    
    def gradientClassNameExists(): Boolean
    
    def gradientContainerHeight(): String
    
    def hasClass(className: String): Boolean
    
    def tailExists(): Boolean
  }
  object PageDriver {
    
    inline def apply(
      backgroundImageExists: () => Boolean,
      exists: () => Boolean,
      getPageHtml: () => String,
      gradientClassNameExists: () => Boolean,
      gradientContainerHeight: () => String,
      hasClass: String => Boolean,
      tailExists: () => Boolean
    ): PageDriver = {
      val __obj = js.Dynamic.literal(backgroundImageExists = js.Any.fromFunction0(backgroundImageExists), exists = js.Any.fromFunction0(exists), getPageHtml = js.Any.fromFunction0(getPageHtml), gradientClassNameExists = js.Any.fromFunction0(gradientClassNameExists), gradientContainerHeight = js.Any.fromFunction0(gradientContainerHeight), hasClass = js.Any.fromFunction1(hasClass), tailExists = js.Any.fromFunction0(tailExists))
      __obj.asInstanceOf[PageDriver]
    }
    
    extension [Self <: PageDriver](x: Self) {
      
      inline def setBackgroundImageExists(value: () => Boolean): Self = StObject.set(x, "backgroundImageExists", js.Any.fromFunction0(value))
      
      inline def setGetPageHtml(value: () => String): Self = StObject.set(x, "getPageHtml", js.Any.fromFunction0(value))
      
      inline def setGradientClassNameExists(value: () => Boolean): Self = StObject.set(x, "gradientClassNameExists", js.Any.fromFunction0(value))
      
      inline def setGradientContainerHeight(value: () => String): Self = StObject.set(x, "gradientContainerHeight", js.Any.fromFunction0(value))
      
      inline def setHasClass(value: String => Boolean): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
      
      inline def setTailExists(value: () => Boolean): Self = StObject.set(x, "tailExists", js.Any.fromFunction0(value))
    }
  }
}
