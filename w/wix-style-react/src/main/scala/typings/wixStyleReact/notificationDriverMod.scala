package typings.wixStyleReact

import typings.wixStyleReact.notificationMod.NotificationTheme
import typings.wixUiTestUtils.createDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notificationDriverMod {
  
  trait NotificationDriver
    extends StObject
       with BaseDriver {
    
    def clickOnActionButton(): Unit
    
    def clickOnCloseButton(): Unit
    
    def getActionButtonText(): String
    
    def getLabelText(): String
    
    def getZIndex(): Double
    
    def hasActionButton(): Boolean
    
    def hasCloseButton(): Boolean
    
    def hasTheme(theme: NotificationTheme): Boolean
    
    def isAbsolutePositioned(): Boolean
    
    def isErrorNotification(): Boolean
    
    def isFixedPositioned(): Boolean
    
    def isPremiumNotification(): Boolean
    
    def isRelativelyPositioned(): Boolean
    
    def isStandardNotification(): Boolean
    
    def isSuccessNotification(): Boolean
    
    def isWarningNotification(): Boolean
    
    def visible(): Boolean
  }
  object NotificationDriver {
    
    inline def apply(
      clickOnActionButton: () => Unit,
      clickOnCloseButton: () => Unit,
      exists: () => Boolean,
      getActionButtonText: () => String,
      getLabelText: () => String,
      getZIndex: () => Double,
      hasActionButton: () => Boolean,
      hasCloseButton: () => Boolean,
      hasTheme: NotificationTheme => Boolean,
      isAbsolutePositioned: () => Boolean,
      isErrorNotification: () => Boolean,
      isFixedPositioned: () => Boolean,
      isPremiumNotification: () => Boolean,
      isRelativelyPositioned: () => Boolean,
      isStandardNotification: () => Boolean,
      isSuccessNotification: () => Boolean,
      isWarningNotification: () => Boolean,
      visible: () => Boolean
    ): NotificationDriver = {
      val __obj = js.Dynamic.literal(clickOnActionButton = js.Any.fromFunction0(clickOnActionButton), clickOnCloseButton = js.Any.fromFunction0(clickOnCloseButton), exists = js.Any.fromFunction0(exists), getActionButtonText = js.Any.fromFunction0(getActionButtonText), getLabelText = js.Any.fromFunction0(getLabelText), getZIndex = js.Any.fromFunction0(getZIndex), hasActionButton = js.Any.fromFunction0(hasActionButton), hasCloseButton = js.Any.fromFunction0(hasCloseButton), hasTheme = js.Any.fromFunction1(hasTheme), isAbsolutePositioned = js.Any.fromFunction0(isAbsolutePositioned), isErrorNotification = js.Any.fromFunction0(isErrorNotification), isFixedPositioned = js.Any.fromFunction0(isFixedPositioned), isPremiumNotification = js.Any.fromFunction0(isPremiumNotification), isRelativelyPositioned = js.Any.fromFunction0(isRelativelyPositioned), isStandardNotification = js.Any.fromFunction0(isStandardNotification), isSuccessNotification = js.Any.fromFunction0(isSuccessNotification), isWarningNotification = js.Any.fromFunction0(isWarningNotification), visible = js.Any.fromFunction0(visible))
      __obj.asInstanceOf[NotificationDriver]
    }
    
    extension [Self <: NotificationDriver](x: Self) {
      
      inline def setClickOnActionButton(value: () => Unit): Self = StObject.set(x, "clickOnActionButton", js.Any.fromFunction0(value))
      
      inline def setClickOnCloseButton(value: () => Unit): Self = StObject.set(x, "clickOnCloseButton", js.Any.fromFunction0(value))
      
      inline def setGetActionButtonText(value: () => String): Self = StObject.set(x, "getActionButtonText", js.Any.fromFunction0(value))
      
      inline def setGetLabelText(value: () => String): Self = StObject.set(x, "getLabelText", js.Any.fromFunction0(value))
      
      inline def setGetZIndex(value: () => Double): Self = StObject.set(x, "getZIndex", js.Any.fromFunction0(value))
      
      inline def setHasActionButton(value: () => Boolean): Self = StObject.set(x, "hasActionButton", js.Any.fromFunction0(value))
      
      inline def setHasCloseButton(value: () => Boolean): Self = StObject.set(x, "hasCloseButton", js.Any.fromFunction0(value))
      
      inline def setHasTheme(value: NotificationTheme => Boolean): Self = StObject.set(x, "hasTheme", js.Any.fromFunction1(value))
      
      inline def setIsAbsolutePositioned(value: () => Boolean): Self = StObject.set(x, "isAbsolutePositioned", js.Any.fromFunction0(value))
      
      inline def setIsErrorNotification(value: () => Boolean): Self = StObject.set(x, "isErrorNotification", js.Any.fromFunction0(value))
      
      inline def setIsFixedPositioned(value: () => Boolean): Self = StObject.set(x, "isFixedPositioned", js.Any.fromFunction0(value))
      
      inline def setIsPremiumNotification(value: () => Boolean): Self = StObject.set(x, "isPremiumNotification", js.Any.fromFunction0(value))
      
      inline def setIsRelativelyPositioned(value: () => Boolean): Self = StObject.set(x, "isRelativelyPositioned", js.Any.fromFunction0(value))
      
      inline def setIsStandardNotification(value: () => Boolean): Self = StObject.set(x, "isStandardNotification", js.Any.fromFunction0(value))
      
      inline def setIsSuccessNotification(value: () => Boolean): Self = StObject.set(x, "isSuccessNotification", js.Any.fromFunction0(value))
      
      inline def setIsWarningNotification(value: () => Boolean): Self = StObject.set(x, "isWarningNotification", js.Any.fromFunction0(value))
      
      inline def setVisible(value: () => Boolean): Self = StObject.set(x, "visible", js.Any.fromFunction0(value))
    }
  }
}
