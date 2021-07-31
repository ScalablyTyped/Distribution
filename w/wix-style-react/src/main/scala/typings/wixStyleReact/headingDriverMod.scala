package typings.wixStyleReact

import typings.wixStyleReact.headingMod.HeadingAppearance
import typings.wixUiTestUtils.createDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headingDriverMod {
  
  trait HeadingDriver
    extends StObject
       with BaseDriver {
    
    def getAppearance(): HeadingAppearance | Null
    
    def getText(): String
    
    def isLight(): Boolean
  }
  object HeadingDriver {
    
    @scala.inline
    def apply(
      exists: () => Boolean,
      getAppearance: () => HeadingAppearance | Null,
      getText: () => String,
      isLight: () => Boolean
    ): HeadingDriver = {
      val __obj = js.Dynamic.literal(exists = js.Any.fromFunction0(exists), getAppearance = js.Any.fromFunction0(getAppearance), getText = js.Any.fromFunction0(getText), isLight = js.Any.fromFunction0(isLight))
      __obj.asInstanceOf[HeadingDriver]
    }
    
    @scala.inline
    implicit class HeadingDriverMutableBuilder[Self <: HeadingDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetAppearance(value: () => HeadingAppearance | Null): Self = StObject.set(x, "getAppearance", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetText(value: () => String): Self = StObject.set(x, "getText", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsLight(value: () => Boolean): Self = StObject.set(x, "isLight", js.Any.fromFunction0(value))
    }
  }
}
