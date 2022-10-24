package typings.wixStyleReact

import typings.wixStyleReact.distTypesNotificationMod.NotificationTheme
import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesNotificationNotificationDotuniDotdriverMod {
  
  trait NotificationUniDriver
    extends StObject
       with BaseUniDriver {
    
    def clickOnActionButton(): js.Promise[Unit]
    
    def clickOnCloseButton(): js.Promise[Unit]
    
    def getActionButtonText(): js.Promise[String]
    
    def getLabelText(): js.Promise[String]
    
    def getZIndex(): js.Promise[Double]
    
    def hasActionButton(): js.Promise[Boolean]
    
    def hasCloseButton(): js.Promise[Boolean]
    
    def hasTheme(theme: NotificationTheme): js.Promise[Boolean]
    
    def isAbsolutePositioned(): js.Promise[Boolean]
    
    def isErrorNotification(): js.Promise[Boolean]
    
    def isFixedPositioned(): js.Promise[Boolean]
    
    def isPremiumNotification(): js.Promise[Boolean]
    
    def isRelativelyPositioned(): js.Promise[Boolean]
    
    def isStandardNotification(): js.Promise[Boolean]
    
    def isSuccessNotification(): js.Promise[Boolean]
    
    def isWarningNotification(): js.Promise[Boolean]
    
    def visible(): js.Promise[Boolean]
  }
  object NotificationUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      clickOnActionButton: () => js.Promise[Unit],
      clickOnCloseButton: () => js.Promise[Unit],
      element: () => js.Promise[Any],
      exists: () => js.Promise[Boolean],
      getActionButtonText: () => js.Promise[String],
      getLabelText: () => js.Promise[String],
      getZIndex: () => js.Promise[Double],
      hasActionButton: () => js.Promise[Boolean],
      hasCloseButton: () => js.Promise[Boolean],
      hasTheme: NotificationTheme => js.Promise[Boolean],
      isAbsolutePositioned: () => js.Promise[Boolean],
      isErrorNotification: () => js.Promise[Boolean],
      isFixedPositioned: () => js.Promise[Boolean],
      isPremiumNotification: () => js.Promise[Boolean],
      isRelativelyPositioned: () => js.Promise[Boolean],
      isStandardNotification: () => js.Promise[Boolean],
      isSuccessNotification: () => js.Promise[Boolean],
      isWarningNotification: () => js.Promise[Boolean],
      visible: () => js.Promise[Boolean]
    ): NotificationUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), clickOnActionButton = js.Any.fromFunction0(clickOnActionButton), clickOnCloseButton = js.Any.fromFunction0(clickOnCloseButton), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getActionButtonText = js.Any.fromFunction0(getActionButtonText), getLabelText = js.Any.fromFunction0(getLabelText), getZIndex = js.Any.fromFunction0(getZIndex), hasActionButton = js.Any.fromFunction0(hasActionButton), hasCloseButton = js.Any.fromFunction0(hasCloseButton), hasTheme = js.Any.fromFunction1(hasTheme), isAbsolutePositioned = js.Any.fromFunction0(isAbsolutePositioned), isErrorNotification = js.Any.fromFunction0(isErrorNotification), isFixedPositioned = js.Any.fromFunction0(isFixedPositioned), isPremiumNotification = js.Any.fromFunction0(isPremiumNotification), isRelativelyPositioned = js.Any.fromFunction0(isRelativelyPositioned), isStandardNotification = js.Any.fromFunction0(isStandardNotification), isSuccessNotification = js.Any.fromFunction0(isSuccessNotification), isWarningNotification = js.Any.fromFunction0(isWarningNotification), visible = js.Any.fromFunction0(visible))
      __obj.asInstanceOf[NotificationUniDriver]
    }
    
    extension [Self <: NotificationUniDriver](x: Self) {
      
      inline def setClickOnActionButton(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickOnActionButton", js.Any.fromFunction0(value))
      
      inline def setClickOnCloseButton(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickOnCloseButton", js.Any.fromFunction0(value))
      
      inline def setGetActionButtonText(value: () => js.Promise[String]): Self = StObject.set(x, "getActionButtonText", js.Any.fromFunction0(value))
      
      inline def setGetLabelText(value: () => js.Promise[String]): Self = StObject.set(x, "getLabelText", js.Any.fromFunction0(value))
      
      inline def setGetZIndex(value: () => js.Promise[Double]): Self = StObject.set(x, "getZIndex", js.Any.fromFunction0(value))
      
      inline def setHasActionButton(value: () => js.Promise[Boolean]): Self = StObject.set(x, "hasActionButton", js.Any.fromFunction0(value))
      
      inline def setHasCloseButton(value: () => js.Promise[Boolean]): Self = StObject.set(x, "hasCloseButton", js.Any.fromFunction0(value))
      
      inline def setHasTheme(value: NotificationTheme => js.Promise[Boolean]): Self = StObject.set(x, "hasTheme", js.Any.fromFunction1(value))
      
      inline def setIsAbsolutePositioned(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isAbsolutePositioned", js.Any.fromFunction0(value))
      
      inline def setIsErrorNotification(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isErrorNotification", js.Any.fromFunction0(value))
      
      inline def setIsFixedPositioned(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isFixedPositioned", js.Any.fromFunction0(value))
      
      inline def setIsPremiumNotification(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isPremiumNotification", js.Any.fromFunction0(value))
      
      inline def setIsRelativelyPositioned(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isRelativelyPositioned", js.Any.fromFunction0(value))
      
      inline def setIsStandardNotification(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isStandardNotification", js.Any.fromFunction0(value))
      
      inline def setIsSuccessNotification(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isSuccessNotification", js.Any.fromFunction0(value))
      
      inline def setIsWarningNotification(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isWarningNotification", js.Any.fromFunction0(value))
      
      inline def setVisible(value: () => js.Promise[Boolean]): Self = StObject.set(x, "visible", js.Any.fromFunction0(value))
    }
  }
}
