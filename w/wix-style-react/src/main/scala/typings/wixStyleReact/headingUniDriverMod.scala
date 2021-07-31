package typings.wixStyleReact

import typings.wixStyleReact.headingMod.HeadingAppearance
import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headingUniDriverMod {
  
  trait HeadingUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getAppearance(): js.Promise[HeadingAppearance | Null]
    
    def getText(): js.Promise[String]
    
    def isLight(): js.Promise[Boolean]
  }
  object HeadingUniDriver {
    
    @scala.inline
    def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getAppearance: () => js.Promise[HeadingAppearance | Null],
      getText: () => js.Promise[String],
      isLight: () => js.Promise[Boolean]
    ): HeadingUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getAppearance = js.Any.fromFunction0(getAppearance), getText = js.Any.fromFunction0(getText), isLight = js.Any.fromFunction0(isLight))
      __obj.asInstanceOf[HeadingUniDriver]
    }
    
    @scala.inline
    implicit class HeadingUniDriverMutableBuilder[Self <: HeadingUniDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetAppearance(value: () => js.Promise[HeadingAppearance | Null]): Self = StObject.set(x, "getAppearance", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetText(value: () => js.Promise[String]): Self = StObject.set(x, "getText", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsLight(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isLight", js.Any.fromFunction0(value))
    }
  }
}
