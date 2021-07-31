package typings.wixStyleReact

import typings.wixUiTestUtils.createDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sectionHelperDriverMod {
  
  trait SectionHelperDriver
    extends StObject
       with BaseDriver {
    
    def actionText(): String
    
    def clickAction(): Unit
    
    def clickClose(): Unit
    
    def isCloseButtonDisplayed(): Boolean
    
    def isDanger(): Boolean
    
    def isExperimentalDark(): Boolean
    
    def isPremium(): Boolean
    
    def isPreview(): Boolean
    
    def isStandard(): Boolean
    
    def isSuccess(): Boolean
    
    def isWarning(): Boolean
    
    def textContent(): String
    
    def titleText(): String
  }
  object SectionHelperDriver {
    
    @scala.inline
    def apply(
      actionText: () => String,
      clickAction: () => Unit,
      clickClose: () => Unit,
      exists: () => Boolean,
      isCloseButtonDisplayed: () => Boolean,
      isDanger: () => Boolean,
      isExperimentalDark: () => Boolean,
      isPremium: () => Boolean,
      isPreview: () => Boolean,
      isStandard: () => Boolean,
      isSuccess: () => Boolean,
      isWarning: () => Boolean,
      textContent: () => String,
      titleText: () => String
    ): SectionHelperDriver = {
      val __obj = js.Dynamic.literal(actionText = js.Any.fromFunction0(actionText), clickAction = js.Any.fromFunction0(clickAction), clickClose = js.Any.fromFunction0(clickClose), exists = js.Any.fromFunction0(exists), isCloseButtonDisplayed = js.Any.fromFunction0(isCloseButtonDisplayed), isDanger = js.Any.fromFunction0(isDanger), isExperimentalDark = js.Any.fromFunction0(isExperimentalDark), isPremium = js.Any.fromFunction0(isPremium), isPreview = js.Any.fromFunction0(isPreview), isStandard = js.Any.fromFunction0(isStandard), isSuccess = js.Any.fromFunction0(isSuccess), isWarning = js.Any.fromFunction0(isWarning), textContent = js.Any.fromFunction0(textContent), titleText = js.Any.fromFunction0(titleText))
      __obj.asInstanceOf[SectionHelperDriver]
    }
    
    @scala.inline
    implicit class SectionHelperDriverMutableBuilder[Self <: SectionHelperDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActionText(value: () => String): Self = StObject.set(x, "actionText", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClickAction(value: () => Unit): Self = StObject.set(x, "clickAction", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClickClose(value: () => Unit): Self = StObject.set(x, "clickClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsCloseButtonDisplayed(value: () => Boolean): Self = StObject.set(x, "isCloseButtonDisplayed", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsDanger(value: () => Boolean): Self = StObject.set(x, "isDanger", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsExperimentalDark(value: () => Boolean): Self = StObject.set(x, "isExperimentalDark", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsPremium(value: () => Boolean): Self = StObject.set(x, "isPremium", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsPreview(value: () => Boolean): Self = StObject.set(x, "isPreview", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsStandard(value: () => Boolean): Self = StObject.set(x, "isStandard", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsSuccess(value: () => Boolean): Self = StObject.set(x, "isSuccess", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsWarning(value: () => Boolean): Self = StObject.set(x, "isWarning", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTextContent(value: () => String): Self = StObject.set(x, "textContent", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTitleText(value: () => String): Self = StObject.set(x, "titleText", js.Any.fromFunction0(value))
    }
  }
}
