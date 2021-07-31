package typings.wixStyleReact

import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listItemActionUniDriverMod {
  
  trait ListItemActionUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getSkin(): js.Promise[String | Null]
    
    def getSubtitleText(): js.Promise[String]
    
    def getTitleText(): js.Promise[String]
    
    def isDisabled(): js.Promise[Boolean]
    
    def isPrefixIconExists(): js.Promise[Boolean]
    
    def isSubtitleExists(): js.Promise[Boolean]
    
    def isTitleExists(): js.Promise[Boolean]
  }
  object ListItemActionUniDriver {
    
    @scala.inline
    def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getSkin: () => js.Promise[String | Null],
      getSubtitleText: () => js.Promise[String],
      getTitleText: () => js.Promise[String],
      isDisabled: () => js.Promise[Boolean],
      isPrefixIconExists: () => js.Promise[Boolean],
      isSubtitleExists: () => js.Promise[Boolean],
      isTitleExists: () => js.Promise[Boolean]
    ): ListItemActionUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getSkin = js.Any.fromFunction0(getSkin), getSubtitleText = js.Any.fromFunction0(getSubtitleText), getTitleText = js.Any.fromFunction0(getTitleText), isDisabled = js.Any.fromFunction0(isDisabled), isPrefixIconExists = js.Any.fromFunction0(isPrefixIconExists), isSubtitleExists = js.Any.fromFunction0(isSubtitleExists), isTitleExists = js.Any.fromFunction0(isTitleExists))
      __obj.asInstanceOf[ListItemActionUniDriver]
    }
    
    @scala.inline
    implicit class ListItemActionUniDriverMutableBuilder[Self <: ListItemActionUniDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetSkin(value: () => js.Promise[String | Null]): Self = StObject.set(x, "getSkin", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSubtitleText(value: () => js.Promise[String]): Self = StObject.set(x, "getSubtitleText", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTitleText(value: () => js.Promise[String]): Self = StObject.set(x, "getTitleText", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsDisabled(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isDisabled", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsPrefixIconExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isPrefixIconExists", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsSubtitleExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isSubtitleExists", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsTitleExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isTitleExists", js.Any.fromFunction0(value))
    }
  }
}
