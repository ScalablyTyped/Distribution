package typings.wixStyleReact

import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sectionHelperUniDriverMod {
  
  trait SectionHelperUniDriver
    extends StObject
       with BaseUniDriver {
    
    def actionText(): js.Promise[String]
    
    def clickAction(): js.Promise[Unit]
    
    def clickClose(): js.Promise[Unit]
    
    def isCloseButtonDisplayed(): js.Promise[Boolean]
    
    def isDanger(): js.Promise[Boolean]
    
    def isExperimentalDark(): js.Promise[Boolean]
    
    def isPremium(): js.Promise[Boolean]
    
    def isPreview(): js.Promise[Boolean]
    
    def isStandard(): js.Promise[Boolean]
    
    def isSuccess(): js.Promise[Boolean]
    
    def isWarning(): js.Promise[Boolean]
    
    def textContent(): js.Promise[String]
    
    def titleText(): js.Promise[String]
  }
  object SectionHelperUniDriver {
    
    @scala.inline
    def apply(
      actionText: () => js.Promise[String],
      click: () => js.Promise[Unit],
      clickAction: () => js.Promise[Unit],
      clickClose: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      isCloseButtonDisplayed: () => js.Promise[Boolean],
      isDanger: () => js.Promise[Boolean],
      isExperimentalDark: () => js.Promise[Boolean],
      isPremium: () => js.Promise[Boolean],
      isPreview: () => js.Promise[Boolean],
      isStandard: () => js.Promise[Boolean],
      isSuccess: () => js.Promise[Boolean],
      isWarning: () => js.Promise[Boolean],
      textContent: () => js.Promise[String],
      titleText: () => js.Promise[String]
    ): SectionHelperUniDriver = {
      val __obj = js.Dynamic.literal(actionText = js.Any.fromFunction0(actionText), click = js.Any.fromFunction0(click), clickAction = js.Any.fromFunction0(clickAction), clickClose = js.Any.fromFunction0(clickClose), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), isCloseButtonDisplayed = js.Any.fromFunction0(isCloseButtonDisplayed), isDanger = js.Any.fromFunction0(isDanger), isExperimentalDark = js.Any.fromFunction0(isExperimentalDark), isPremium = js.Any.fromFunction0(isPremium), isPreview = js.Any.fromFunction0(isPreview), isStandard = js.Any.fromFunction0(isStandard), isSuccess = js.Any.fromFunction0(isSuccess), isWarning = js.Any.fromFunction0(isWarning), textContent = js.Any.fromFunction0(textContent), titleText = js.Any.fromFunction0(titleText))
      __obj.asInstanceOf[SectionHelperUniDriver]
    }
    
    @scala.inline
    implicit class SectionHelperUniDriverMutableBuilder[Self <: SectionHelperUniDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActionText(value: () => js.Promise[String]): Self = StObject.set(x, "actionText", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClickAction(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickAction", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClickClose(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsCloseButtonDisplayed(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isCloseButtonDisplayed", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsDanger(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isDanger", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsExperimentalDark(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isExperimentalDark", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsPremium(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isPremium", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsPreview(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isPreview", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsStandard(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isStandard", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsSuccess(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isSuccess", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsWarning(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isWarning", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTextContent(value: () => js.Promise[String]): Self = StObject.set(x, "textContent", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTitleText(value: () => js.Promise[String]): Self = StObject.set(x, "titleText", js.Any.fromFunction0(value))
    }
  }
}
