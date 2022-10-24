package typings.wixStyleReact

import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesListItemActionListItemActionDotuniDotdriverMod {
  
  trait ListItemActionUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getSkin(): js.Promise[String | Null]
    
    def getSubtitleText(): js.Promise[String]
    
    def getSuffixText(): js.Promise[String]
    
    def getTitleText(): js.Promise[String]
    
    def isDisabled(): js.Promise[Boolean]
    
    def isPrefixIconExists(): js.Promise[Boolean]
    
    def isSubtitleExists(): js.Promise[Boolean]
    
    def isSuffixExists(): js.Promise[Boolean]
    
    def isTitleExists(): js.Promise[Boolean]
  }
  object ListItemActionUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[Any],
      exists: () => js.Promise[Boolean],
      getSkin: () => js.Promise[String | Null],
      getSubtitleText: () => js.Promise[String],
      getSuffixText: () => js.Promise[String],
      getTitleText: () => js.Promise[String],
      isDisabled: () => js.Promise[Boolean],
      isPrefixIconExists: () => js.Promise[Boolean],
      isSubtitleExists: () => js.Promise[Boolean],
      isSuffixExists: () => js.Promise[Boolean],
      isTitleExists: () => js.Promise[Boolean]
    ): ListItemActionUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getSkin = js.Any.fromFunction0(getSkin), getSubtitleText = js.Any.fromFunction0(getSubtitleText), getSuffixText = js.Any.fromFunction0(getSuffixText), getTitleText = js.Any.fromFunction0(getTitleText), isDisabled = js.Any.fromFunction0(isDisabled), isPrefixIconExists = js.Any.fromFunction0(isPrefixIconExists), isSubtitleExists = js.Any.fromFunction0(isSubtitleExists), isSuffixExists = js.Any.fromFunction0(isSuffixExists), isTitleExists = js.Any.fromFunction0(isTitleExists))
      __obj.asInstanceOf[ListItemActionUniDriver]
    }
    
    extension [Self <: ListItemActionUniDriver](x: Self) {
      
      inline def setGetSkin(value: () => js.Promise[String | Null]): Self = StObject.set(x, "getSkin", js.Any.fromFunction0(value))
      
      inline def setGetSubtitleText(value: () => js.Promise[String]): Self = StObject.set(x, "getSubtitleText", js.Any.fromFunction0(value))
      
      inline def setGetSuffixText(value: () => js.Promise[String]): Self = StObject.set(x, "getSuffixText", js.Any.fromFunction0(value))
      
      inline def setGetTitleText(value: () => js.Promise[String]): Self = StObject.set(x, "getTitleText", js.Any.fromFunction0(value))
      
      inline def setIsDisabled(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isDisabled", js.Any.fromFunction0(value))
      
      inline def setIsPrefixIconExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isPrefixIconExists", js.Any.fromFunction0(value))
      
      inline def setIsSubtitleExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isSubtitleExists", js.Any.fromFunction0(value))
      
      inline def setIsSuffixExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isSuffixExists", js.Any.fromFunction0(value))
      
      inline def setIsTitleExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isTitleExists", js.Any.fromFunction0(value))
    }
  }
}
