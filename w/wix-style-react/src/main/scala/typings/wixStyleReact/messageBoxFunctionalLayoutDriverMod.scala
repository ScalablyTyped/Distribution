package typings.wixStyleReact

import typings.std.HTMLButtonElement
import typings.std.HTMLElement
import typings.wixStyleReact.messageBoxFunctionalLayoutMod.MessageBoxFunctionalLayoutTheme
import typings.wixUiTestUtils.createDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageBoxFunctionalLayoutDriverMod {
  
  trait MessageBoxFunctionalLayoutDriver[T]
    extends StObject
       with BaseDriver {
    
    def clickOnCancellationButton(): Unit
    
    def clickOnConfirmationButton(): Unit
    
    def clickOnHeaderCloseButton(): Unit
    
    def element(): T
    
    def getCancellationButton(): HTMLButtonElement
    
    def getCancellationButtonText(): String
    
    def getChildBySelector(selector: String): HTMLElement | Null
    
    def getConfirmationButton(): HTMLButtonElement
    
    def getConfirmationButtonText(): String
    
    def getFooter(): HTMLElement
    
    def getHeaderCloseButton(): HTMLButtonElement
    
    def getTitle(): String
    
    def isCancelEnable(): Boolean
    
    def isCancellationButtonPrefixIconExists(): Boolean
    
    def isCancellationButtonSuffixIconExists(): Boolean
    
    def isConfirmationButtonPrefixIconExists(): Boolean
    
    def isConfirmationButtonSuffixIconExists(): Boolean
    
    def isConfirmationEnable(): Boolean
    
    def isThemeExist(theme: MessageBoxFunctionalLayoutTheme): Boolean
    
    def toHaveBodyPadding(): Boolean
  }
  object MessageBoxFunctionalLayoutDriver {
    
    @scala.inline
    def apply[T](
      clickOnCancellationButton: () => Unit,
      clickOnConfirmationButton: () => Unit,
      clickOnHeaderCloseButton: () => Unit,
      element: () => T,
      exists: () => Boolean,
      getCancellationButton: () => HTMLButtonElement,
      getCancellationButtonText: () => String,
      getChildBySelector: String => HTMLElement | Null,
      getConfirmationButton: () => HTMLButtonElement,
      getConfirmationButtonText: () => String,
      getFooter: () => HTMLElement,
      getHeaderCloseButton: () => HTMLButtonElement,
      getTitle: () => String,
      isCancelEnable: () => Boolean,
      isCancellationButtonPrefixIconExists: () => Boolean,
      isCancellationButtonSuffixIconExists: () => Boolean,
      isConfirmationButtonPrefixIconExists: () => Boolean,
      isConfirmationButtonSuffixIconExists: () => Boolean,
      isConfirmationEnable: () => Boolean,
      isThemeExist: MessageBoxFunctionalLayoutTheme => Boolean,
      toHaveBodyPadding: () => Boolean
    ): MessageBoxFunctionalLayoutDriver[T] = {
      val __obj = js.Dynamic.literal(clickOnCancellationButton = js.Any.fromFunction0(clickOnCancellationButton), clickOnConfirmationButton = js.Any.fromFunction0(clickOnConfirmationButton), clickOnHeaderCloseButton = js.Any.fromFunction0(clickOnHeaderCloseButton), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getCancellationButton = js.Any.fromFunction0(getCancellationButton), getCancellationButtonText = js.Any.fromFunction0(getCancellationButtonText), getChildBySelector = js.Any.fromFunction1(getChildBySelector), getConfirmationButton = js.Any.fromFunction0(getConfirmationButton), getConfirmationButtonText = js.Any.fromFunction0(getConfirmationButtonText), getFooter = js.Any.fromFunction0(getFooter), getHeaderCloseButton = js.Any.fromFunction0(getHeaderCloseButton), getTitle = js.Any.fromFunction0(getTitle), isCancelEnable = js.Any.fromFunction0(isCancelEnable), isCancellationButtonPrefixIconExists = js.Any.fromFunction0(isCancellationButtonPrefixIconExists), isCancellationButtonSuffixIconExists = js.Any.fromFunction0(isCancellationButtonSuffixIconExists), isConfirmationButtonPrefixIconExists = js.Any.fromFunction0(isConfirmationButtonPrefixIconExists), isConfirmationButtonSuffixIconExists = js.Any.fromFunction0(isConfirmationButtonSuffixIconExists), isConfirmationEnable = js.Any.fromFunction0(isConfirmationEnable), isThemeExist = js.Any.fromFunction1(isThemeExist), toHaveBodyPadding = js.Any.fromFunction0(toHaveBodyPadding))
      __obj.asInstanceOf[MessageBoxFunctionalLayoutDriver[T]]
    }
    
    @scala.inline
    implicit class MessageBoxFunctionalLayoutDriverMutableBuilder[Self <: MessageBoxFunctionalLayoutDriver[?], T] (val x: Self & MessageBoxFunctionalLayoutDriver[T]) extends AnyVal {
      
      @scala.inline
      def setClickOnCancellationButton(value: () => Unit): Self = StObject.set(x, "clickOnCancellationButton", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClickOnConfirmationButton(value: () => Unit): Self = StObject.set(x, "clickOnConfirmationButton", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClickOnHeaderCloseButton(value: () => Unit): Self = StObject.set(x, "clickOnHeaderCloseButton", js.Any.fromFunction0(value))
      
      @scala.inline
      def setElement(value: () => T): Self = StObject.set(x, "element", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetCancellationButton(value: () => HTMLButtonElement): Self = StObject.set(x, "getCancellationButton", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetCancellationButtonText(value: () => String): Self = StObject.set(x, "getCancellationButtonText", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetChildBySelector(value: String => HTMLElement | Null): Self = StObject.set(x, "getChildBySelector", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetConfirmationButton(value: () => HTMLButtonElement): Self = StObject.set(x, "getConfirmationButton", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetConfirmationButtonText(value: () => String): Self = StObject.set(x, "getConfirmationButtonText", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetFooter(value: () => HTMLElement): Self = StObject.set(x, "getFooter", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetHeaderCloseButton(value: () => HTMLButtonElement): Self = StObject.set(x, "getHeaderCloseButton", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTitle(value: () => String): Self = StObject.set(x, "getTitle", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsCancelEnable(value: () => Boolean): Self = StObject.set(x, "isCancelEnable", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsCancellationButtonPrefixIconExists(value: () => Boolean): Self = StObject.set(x, "isCancellationButtonPrefixIconExists", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsCancellationButtonSuffixIconExists(value: () => Boolean): Self = StObject.set(x, "isCancellationButtonSuffixIconExists", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsConfirmationButtonPrefixIconExists(value: () => Boolean): Self = StObject.set(x, "isConfirmationButtonPrefixIconExists", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsConfirmationButtonSuffixIconExists(value: () => Boolean): Self = StObject.set(x, "isConfirmationButtonSuffixIconExists", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsConfirmationEnable(value: () => Boolean): Self = StObject.set(x, "isConfirmationEnable", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsThemeExist(value: MessageBoxFunctionalLayoutTheme => Boolean): Self = StObject.set(x, "isThemeExist", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToHaveBodyPadding(value: () => Boolean): Self = StObject.set(x, "toHaveBodyPadding", js.Any.fromFunction0(value))
    }
  }
}
