package typings.wixStyleReact

import typings.unidriverCore.mod.UniDriver
import typings.wixStyleReact.distTypesMessageBoxFunctionalLayoutMod.MessageBoxFunctionalLayoutTheme
import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMessageBoxFunctionalLayoutMessageBoxFunctionalLayoutDotuniDotdriverMod {
  
  trait MessageBoxFunctionalLayoutUniDriver
    extends StObject
       with BaseUniDriver {
    
    def clickOnCancellationButton(): js.Promise[Unit]
    
    def clickOnConfirmationButton(): js.Promise[Unit]
    
    def clickOnHeaderCloseButton(): js.Promise[Unit]
    
    def getCancellationButton(): js.Promise[UniDriver[Any] | Null]
    
    def getCancellationButtonText(): js.Promise[String]
    
    def getChildBySelector(selector: String): js.Promise[UniDriver[Any] | Null]
    
    def getConfirmationButton(): js.Promise[UniDriver[Any] | Null]
    
    def getConfirmationButtonText(): js.Promise[String]
    
    def getFooter(): js.Promise[UniDriver[Any] | Null]
    
    def getHeaderCloseButton(): js.Promise[UniDriver[Any] | Null]
    
    def getTitle(): js.Promise[String]
    
    def isCancelEnable(): js.Promise[Boolean]
    
    def isCancellationButtonPrefixIconExists(): js.Promise[Boolean]
    
    def isCancellationButtonSuffixIconExists(): js.Promise[Boolean]
    
    def isConfirmationButtonPrefixIconExists(): js.Promise[Boolean]
    
    def isConfirmationButtonSuffixIconExists(): js.Promise[Boolean]
    
    def isConfirmationEnable(): js.Promise[Boolean]
    
    def isThemeExist(theme: MessageBoxFunctionalLayoutTheme): js.Promise[Boolean]
    
    def toHaveBodyPadding(): js.Promise[Boolean]
  }
  object MessageBoxFunctionalLayoutUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      clickOnCancellationButton: () => js.Promise[Unit],
      clickOnConfirmationButton: () => js.Promise[Unit],
      clickOnHeaderCloseButton: () => js.Promise[Unit],
      element: () => js.Promise[Any],
      exists: () => js.Promise[Boolean],
      getCancellationButton: () => js.Promise[UniDriver[Any] | Null],
      getCancellationButtonText: () => js.Promise[String],
      getChildBySelector: String => js.Promise[UniDriver[Any] | Null],
      getConfirmationButton: () => js.Promise[UniDriver[Any] | Null],
      getConfirmationButtonText: () => js.Promise[String],
      getFooter: () => js.Promise[UniDriver[Any] | Null],
      getHeaderCloseButton: () => js.Promise[UniDriver[Any] | Null],
      getTitle: () => js.Promise[String],
      isCancelEnable: () => js.Promise[Boolean],
      isCancellationButtonPrefixIconExists: () => js.Promise[Boolean],
      isCancellationButtonSuffixIconExists: () => js.Promise[Boolean],
      isConfirmationButtonPrefixIconExists: () => js.Promise[Boolean],
      isConfirmationButtonSuffixIconExists: () => js.Promise[Boolean],
      isConfirmationEnable: () => js.Promise[Boolean],
      isThemeExist: MessageBoxFunctionalLayoutTheme => js.Promise[Boolean],
      toHaveBodyPadding: () => js.Promise[Boolean]
    ): MessageBoxFunctionalLayoutUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), clickOnCancellationButton = js.Any.fromFunction0(clickOnCancellationButton), clickOnConfirmationButton = js.Any.fromFunction0(clickOnConfirmationButton), clickOnHeaderCloseButton = js.Any.fromFunction0(clickOnHeaderCloseButton), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getCancellationButton = js.Any.fromFunction0(getCancellationButton), getCancellationButtonText = js.Any.fromFunction0(getCancellationButtonText), getChildBySelector = js.Any.fromFunction1(getChildBySelector), getConfirmationButton = js.Any.fromFunction0(getConfirmationButton), getConfirmationButtonText = js.Any.fromFunction0(getConfirmationButtonText), getFooter = js.Any.fromFunction0(getFooter), getHeaderCloseButton = js.Any.fromFunction0(getHeaderCloseButton), getTitle = js.Any.fromFunction0(getTitle), isCancelEnable = js.Any.fromFunction0(isCancelEnable), isCancellationButtonPrefixIconExists = js.Any.fromFunction0(isCancellationButtonPrefixIconExists), isCancellationButtonSuffixIconExists = js.Any.fromFunction0(isCancellationButtonSuffixIconExists), isConfirmationButtonPrefixIconExists = js.Any.fromFunction0(isConfirmationButtonPrefixIconExists), isConfirmationButtonSuffixIconExists = js.Any.fromFunction0(isConfirmationButtonSuffixIconExists), isConfirmationEnable = js.Any.fromFunction0(isConfirmationEnable), isThemeExist = js.Any.fromFunction1(isThemeExist), toHaveBodyPadding = js.Any.fromFunction0(toHaveBodyPadding))
      __obj.asInstanceOf[MessageBoxFunctionalLayoutUniDriver]
    }
    
    extension [Self <: MessageBoxFunctionalLayoutUniDriver](x: Self) {
      
      inline def setClickOnCancellationButton(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickOnCancellationButton", js.Any.fromFunction0(value))
      
      inline def setClickOnConfirmationButton(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickOnConfirmationButton", js.Any.fromFunction0(value))
      
      inline def setClickOnHeaderCloseButton(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickOnHeaderCloseButton", js.Any.fromFunction0(value))
      
      inline def setGetCancellationButton(value: () => js.Promise[UniDriver[Any] | Null]): Self = StObject.set(x, "getCancellationButton", js.Any.fromFunction0(value))
      
      inline def setGetCancellationButtonText(value: () => js.Promise[String]): Self = StObject.set(x, "getCancellationButtonText", js.Any.fromFunction0(value))
      
      inline def setGetChildBySelector(value: String => js.Promise[UniDriver[Any] | Null]): Self = StObject.set(x, "getChildBySelector", js.Any.fromFunction1(value))
      
      inline def setGetConfirmationButton(value: () => js.Promise[UniDriver[Any] | Null]): Self = StObject.set(x, "getConfirmationButton", js.Any.fromFunction0(value))
      
      inline def setGetConfirmationButtonText(value: () => js.Promise[String]): Self = StObject.set(x, "getConfirmationButtonText", js.Any.fromFunction0(value))
      
      inline def setGetFooter(value: () => js.Promise[UniDriver[Any] | Null]): Self = StObject.set(x, "getFooter", js.Any.fromFunction0(value))
      
      inline def setGetHeaderCloseButton(value: () => js.Promise[UniDriver[Any] | Null]): Self = StObject.set(x, "getHeaderCloseButton", js.Any.fromFunction0(value))
      
      inline def setGetTitle(value: () => js.Promise[String]): Self = StObject.set(x, "getTitle", js.Any.fromFunction0(value))
      
      inline def setIsCancelEnable(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isCancelEnable", js.Any.fromFunction0(value))
      
      inline def setIsCancellationButtonPrefixIconExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isCancellationButtonPrefixIconExists", js.Any.fromFunction0(value))
      
      inline def setIsCancellationButtonSuffixIconExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isCancellationButtonSuffixIconExists", js.Any.fromFunction0(value))
      
      inline def setIsConfirmationButtonPrefixIconExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isConfirmationButtonPrefixIconExists", js.Any.fromFunction0(value))
      
      inline def setIsConfirmationButtonSuffixIconExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isConfirmationButtonSuffixIconExists", js.Any.fromFunction0(value))
      
      inline def setIsConfirmationEnable(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isConfirmationEnable", js.Any.fromFunction0(value))
      
      inline def setIsThemeExist(value: MessageBoxFunctionalLayoutTheme => js.Promise[Boolean]): Self = StObject.set(x, "isThemeExist", js.Any.fromFunction1(value))
      
      inline def setToHaveBodyPadding(value: () => js.Promise[Boolean]): Self = StObject.set(x, "toHaveBodyPadding", js.Any.fromFunction0(value))
    }
  }
}
