package typings.wixStyleReact

import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tagUniDriverMod {
  
  trait TagUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getLabel(): js.Promise[String]
    
    def isDarkTheme(): js.Promise[Boolean]
    
    def isDisabled(): js.Promise[Boolean]
    
    def isErrorTheme(): js.Promise[Boolean]
    
    def isLarge(): js.Promise[Boolean]
    
    def isMedium(): js.Promise[Boolean]
    
    def isRemovable(): js.Promise[Boolean]
    
    def isSmall(): js.Promise[Boolean]
    
    def isStandardTheme(): js.Promise[Boolean]
    
    def isThumbExists(): js.Promise[Boolean]
    
    def isTiny(): js.Promise[Boolean]
    
    def isWarningTheme(): js.Promise[Boolean]
    
    def removeTag(): js.Promise[Unit]
  }
  object TagUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getLabel: () => js.Promise[String],
      isDarkTheme: () => js.Promise[Boolean],
      isDisabled: () => js.Promise[Boolean],
      isErrorTheme: () => js.Promise[Boolean],
      isLarge: () => js.Promise[Boolean],
      isMedium: () => js.Promise[Boolean],
      isRemovable: () => js.Promise[Boolean],
      isSmall: () => js.Promise[Boolean],
      isStandardTheme: () => js.Promise[Boolean],
      isThumbExists: () => js.Promise[Boolean],
      isTiny: () => js.Promise[Boolean],
      isWarningTheme: () => js.Promise[Boolean],
      removeTag: () => js.Promise[Unit]
    ): TagUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getLabel = js.Any.fromFunction0(getLabel), isDarkTheme = js.Any.fromFunction0(isDarkTheme), isDisabled = js.Any.fromFunction0(isDisabled), isErrorTheme = js.Any.fromFunction0(isErrorTheme), isLarge = js.Any.fromFunction0(isLarge), isMedium = js.Any.fromFunction0(isMedium), isRemovable = js.Any.fromFunction0(isRemovable), isSmall = js.Any.fromFunction0(isSmall), isStandardTheme = js.Any.fromFunction0(isStandardTheme), isThumbExists = js.Any.fromFunction0(isThumbExists), isTiny = js.Any.fromFunction0(isTiny), isWarningTheme = js.Any.fromFunction0(isWarningTheme), removeTag = js.Any.fromFunction0(removeTag))
      __obj.asInstanceOf[TagUniDriver]
    }
    
    extension [Self <: TagUniDriver](x: Self) {
      
      inline def setGetLabel(value: () => js.Promise[String]): Self = StObject.set(x, "getLabel", js.Any.fromFunction0(value))
      
      inline def setIsDarkTheme(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isDarkTheme", js.Any.fromFunction0(value))
      
      inline def setIsDisabled(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isDisabled", js.Any.fromFunction0(value))
      
      inline def setIsErrorTheme(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isErrorTheme", js.Any.fromFunction0(value))
      
      inline def setIsLarge(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isLarge", js.Any.fromFunction0(value))
      
      inline def setIsMedium(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isMedium", js.Any.fromFunction0(value))
      
      inline def setIsRemovable(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isRemovable", js.Any.fromFunction0(value))
      
      inline def setIsSmall(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isSmall", js.Any.fromFunction0(value))
      
      inline def setIsStandardTheme(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isStandardTheme", js.Any.fromFunction0(value))
      
      inline def setIsThumbExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isThumbExists", js.Any.fromFunction0(value))
      
      inline def setIsTiny(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isTiny", js.Any.fromFunction0(value))
      
      inline def setIsWarningTheme(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isWarningTheme", js.Any.fromFunction0(value))
      
      inline def setRemoveTag(value: () => js.Promise[Unit]): Self = StObject.set(x, "removeTag", js.Any.fromFunction0(value))
    }
  }
}
