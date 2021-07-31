package typings.wixStyleReact

import typings.wixUiTestUtils.createDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tagDriverMod {
  
  trait TagDriver
    extends StObject
       with BaseDriver {
    
    def click(): Unit
    
    def getLabel(): String
    
    def isDarkTheme(): Boolean
    
    def isDisabled(): Boolean
    
    def isErrorTheme(): Boolean
    
    def isLarge(): Boolean
    
    def isMedium(): Boolean
    
    def isRemovable(): Boolean
    
    def isSmall(): Boolean
    
    def isStandardTheme(): Boolean
    
    def isThumbExists(): Boolean
    
    def isTiny(): Boolean
    
    def isWarningTheme(): Boolean
    
    def removeTag(): Unit
  }
  object TagDriver {
    
    @scala.inline
    def apply(
      click: () => Unit,
      exists: () => Boolean,
      getLabel: () => String,
      isDarkTheme: () => Boolean,
      isDisabled: () => Boolean,
      isErrorTheme: () => Boolean,
      isLarge: () => Boolean,
      isMedium: () => Boolean,
      isRemovable: () => Boolean,
      isSmall: () => Boolean,
      isStandardTheme: () => Boolean,
      isThumbExists: () => Boolean,
      isTiny: () => Boolean,
      isWarningTheme: () => Boolean,
      removeTag: () => Unit
    ): TagDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), exists = js.Any.fromFunction0(exists), getLabel = js.Any.fromFunction0(getLabel), isDarkTheme = js.Any.fromFunction0(isDarkTheme), isDisabled = js.Any.fromFunction0(isDisabled), isErrorTheme = js.Any.fromFunction0(isErrorTheme), isLarge = js.Any.fromFunction0(isLarge), isMedium = js.Any.fromFunction0(isMedium), isRemovable = js.Any.fromFunction0(isRemovable), isSmall = js.Any.fromFunction0(isSmall), isStandardTheme = js.Any.fromFunction0(isStandardTheme), isThumbExists = js.Any.fromFunction0(isThumbExists), isTiny = js.Any.fromFunction0(isTiny), isWarningTheme = js.Any.fromFunction0(isWarningTheme), removeTag = js.Any.fromFunction0(removeTag))
      __obj.asInstanceOf[TagDriver]
    }
    
    @scala.inline
    implicit class TagDriverMutableBuilder[Self <: TagDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClick(value: () => Unit): Self = StObject.set(x, "click", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetLabel(value: () => String): Self = StObject.set(x, "getLabel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsDarkTheme(value: () => Boolean): Self = StObject.set(x, "isDarkTheme", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsDisabled(value: () => Boolean): Self = StObject.set(x, "isDisabled", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsErrorTheme(value: () => Boolean): Self = StObject.set(x, "isErrorTheme", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsLarge(value: () => Boolean): Self = StObject.set(x, "isLarge", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsMedium(value: () => Boolean): Self = StObject.set(x, "isMedium", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsRemovable(value: () => Boolean): Self = StObject.set(x, "isRemovable", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsSmall(value: () => Boolean): Self = StObject.set(x, "isSmall", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsStandardTheme(value: () => Boolean): Self = StObject.set(x, "isStandardTheme", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsThumbExists(value: () => Boolean): Self = StObject.set(x, "isThumbExists", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsTiny(value: () => Boolean): Self = StObject.set(x, "isTiny", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsWarningTheme(value: () => Boolean): Self = StObject.set(x, "isWarningTheme", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRemoveTag(value: () => Unit): Self = StObject.set(x, "removeTag", js.Any.fromFunction0(value))
    }
  }
}
