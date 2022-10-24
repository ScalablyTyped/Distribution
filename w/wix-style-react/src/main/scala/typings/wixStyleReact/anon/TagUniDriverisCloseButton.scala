package typings.wixStyleReact.anon

import typings.wixStyleReact.distTypesTextMod.TextSize
import typings.wixStyleReact.distTypesTextMod.TextWeight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined wix-style-react.wix-style-react/dist/types/Tag/Tag.uni.driver.TagUniDriver & {isCloseButtonSmall (): std.Promise<boolean>, isCloseButtonLarge (): std.Promise<boolean>, getTextSize (): wix-style-react.wix-style-react/dist/types/Text.TextSize, getTextWeight (): wix-style-react.wix-style-react/dist/types/Text.TextWeight, isClickable (): std.Promise<boolean>} */
trait TagUniDriverisCloseButton extends StObject {
  
  /** click on the element */
  def click(): js.Promise[Unit]
  
  /** returns the component element */
  def element(): js.Promise[Any]
  
  /** returns true if component exists */
  def exists(): js.Promise[Boolean]
  
  def getLabel(): js.Promise[String]
  
  def getTextSize(): TextSize
  
  def getTextWeight(): TextWeight
  
  def isClickable(): js.Promise[Boolean]
  
  def isCloseButtonLarge(): js.Promise[Boolean]
  
  def isCloseButtonSmall(): js.Promise[Boolean]
  
  def isDarkTheme(): js.Promise[Boolean]
  
  def isDisabled(): js.Promise[Boolean]
  
  def isErrorTheme(): js.Promise[Boolean]
  
  def isLarge(): js.Promise[Boolean]
  
  def isMedium(): js.Promise[Boolean]
  
  def isRemovable(): js.Promise[Boolean]
  
  def isSmall(): js.Promise[Boolean]
  
  def isStandardTheme(): js.Promise[Boolean]
  
  def isSuccessTheme(): js.Promise[Boolean]
  
  def isThumbExists(): js.Promise[Boolean]
  
  def isTiny(): js.Promise[Boolean]
  
  def isWarningTheme(): js.Promise[Boolean]
  
  def removeTag(): js.Promise[Unit]
}
object TagUniDriverisCloseButton {
  
  inline def apply(
    click: () => js.Promise[Unit],
    element: () => js.Promise[Any],
    exists: () => js.Promise[Boolean],
    getLabel: () => js.Promise[String],
    getTextSize: () => TextSize,
    getTextWeight: () => TextWeight,
    isClickable: () => js.Promise[Boolean],
    isCloseButtonLarge: () => js.Promise[Boolean],
    isCloseButtonSmall: () => js.Promise[Boolean],
    isDarkTheme: () => js.Promise[Boolean],
    isDisabled: () => js.Promise[Boolean],
    isErrorTheme: () => js.Promise[Boolean],
    isLarge: () => js.Promise[Boolean],
    isMedium: () => js.Promise[Boolean],
    isRemovable: () => js.Promise[Boolean],
    isSmall: () => js.Promise[Boolean],
    isStandardTheme: () => js.Promise[Boolean],
    isSuccessTheme: () => js.Promise[Boolean],
    isThumbExists: () => js.Promise[Boolean],
    isTiny: () => js.Promise[Boolean],
    isWarningTheme: () => js.Promise[Boolean],
    removeTag: () => js.Promise[Unit]
  ): TagUniDriverisCloseButton = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getLabel = js.Any.fromFunction0(getLabel), getTextSize = js.Any.fromFunction0(getTextSize), getTextWeight = js.Any.fromFunction0(getTextWeight), isClickable = js.Any.fromFunction0(isClickable), isCloseButtonLarge = js.Any.fromFunction0(isCloseButtonLarge), isCloseButtonSmall = js.Any.fromFunction0(isCloseButtonSmall), isDarkTheme = js.Any.fromFunction0(isDarkTheme), isDisabled = js.Any.fromFunction0(isDisabled), isErrorTheme = js.Any.fromFunction0(isErrorTheme), isLarge = js.Any.fromFunction0(isLarge), isMedium = js.Any.fromFunction0(isMedium), isRemovable = js.Any.fromFunction0(isRemovable), isSmall = js.Any.fromFunction0(isSmall), isStandardTheme = js.Any.fromFunction0(isStandardTheme), isSuccessTheme = js.Any.fromFunction0(isSuccessTheme), isThumbExists = js.Any.fromFunction0(isThumbExists), isTiny = js.Any.fromFunction0(isTiny), isWarningTheme = js.Any.fromFunction0(isWarningTheme), removeTag = js.Any.fromFunction0(removeTag))
    __obj.asInstanceOf[TagUniDriverisCloseButton]
  }
  
  extension [Self <: TagUniDriverisCloseButton](x: Self) {
    
    inline def setClick(value: () => js.Promise[Unit]): Self = StObject.set(x, "click", js.Any.fromFunction0(value))
    
    inline def setElement(value: () => js.Promise[Any]): Self = StObject.set(x, "element", js.Any.fromFunction0(value))
    
    inline def setExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "exists", js.Any.fromFunction0(value))
    
    inline def setGetLabel(value: () => js.Promise[String]): Self = StObject.set(x, "getLabel", js.Any.fromFunction0(value))
    
    inline def setGetTextSize(value: () => TextSize): Self = StObject.set(x, "getTextSize", js.Any.fromFunction0(value))
    
    inline def setGetTextWeight(value: () => TextWeight): Self = StObject.set(x, "getTextWeight", js.Any.fromFunction0(value))
    
    inline def setIsClickable(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isClickable", js.Any.fromFunction0(value))
    
    inline def setIsCloseButtonLarge(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isCloseButtonLarge", js.Any.fromFunction0(value))
    
    inline def setIsCloseButtonSmall(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isCloseButtonSmall", js.Any.fromFunction0(value))
    
    inline def setIsDarkTheme(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isDarkTheme", js.Any.fromFunction0(value))
    
    inline def setIsDisabled(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isDisabled", js.Any.fromFunction0(value))
    
    inline def setIsErrorTheme(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isErrorTheme", js.Any.fromFunction0(value))
    
    inline def setIsLarge(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isLarge", js.Any.fromFunction0(value))
    
    inline def setIsMedium(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isMedium", js.Any.fromFunction0(value))
    
    inline def setIsRemovable(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isRemovable", js.Any.fromFunction0(value))
    
    inline def setIsSmall(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isSmall", js.Any.fromFunction0(value))
    
    inline def setIsStandardTheme(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isStandardTheme", js.Any.fromFunction0(value))
    
    inline def setIsSuccessTheme(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isSuccessTheme", js.Any.fromFunction0(value))
    
    inline def setIsThumbExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isThumbExists", js.Any.fromFunction0(value))
    
    inline def setIsTiny(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isTiny", js.Any.fromFunction0(value))
    
    inline def setIsWarningTheme(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isWarningTheme", js.Any.fromFunction0(value))
    
    inline def setRemoveTag(value: () => js.Promise[Unit]): Self = StObject.set(x, "removeTag", js.Any.fromFunction0(value))
  }
}
