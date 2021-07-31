package typings.wixStyleReact

import typings.wixStyleReact.commonMod.StatusIndications
import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object variableInputUniDriverMod {
  
  trait VariableInputUniDriver
    extends StObject
       with BaseUniDriver {
    
    /** Simulate blur event */
    def blur(): js.Promise[Unit]
    
    /** Enter text as value to the component*/
    def enterText(value: String): js.Promise[Unit]
    
    /** Get the text content of the component*/
    def getContent(): js.Promise[String]
    
    /** Get the error message content */
    def getErrorMessage(): js.Promise[String]
    
    /** Get the text content of the component placeholder*/
    def getPlaceholder(): js.Promise[String]
    
    def getStatusMessage(): js.Promise[String | Null]
    
    /** Get the warning message content */
    def getWarningMessage(): js.Promise[String]
    
    /** Returns true if error indication exists */
    def hasError(): js.Promise[Boolean]
    
    // Status
    def hasStatus(status: StatusIndications): js.Promise[Boolean]
    
    /** Returns true if warning indication exists */
    def hasWarning(): js.Promise[Boolean]
    
    /** Returns true if component is disabled */
    def isDisabled(): js.Promise[Boolean]
  }
  object VariableInputUniDriver {
    
    @scala.inline
    def apply(
      blur: () => js.Promise[Unit],
      click: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      enterText: String => js.Promise[Unit],
      exists: () => js.Promise[Boolean],
      getContent: () => js.Promise[String],
      getErrorMessage: () => js.Promise[String],
      getPlaceholder: () => js.Promise[String],
      getStatusMessage: () => js.Promise[String | Null],
      getWarningMessage: () => js.Promise[String],
      hasError: () => js.Promise[Boolean],
      hasStatus: StatusIndications => js.Promise[Boolean],
      hasWarning: () => js.Promise[Boolean],
      isDisabled: () => js.Promise[Boolean]
    ): VariableInputUniDriver = {
      val __obj = js.Dynamic.literal(blur = js.Any.fromFunction0(blur), click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), enterText = js.Any.fromFunction1(enterText), exists = js.Any.fromFunction0(exists), getContent = js.Any.fromFunction0(getContent), getErrorMessage = js.Any.fromFunction0(getErrorMessage), getPlaceholder = js.Any.fromFunction0(getPlaceholder), getStatusMessage = js.Any.fromFunction0(getStatusMessage), getWarningMessage = js.Any.fromFunction0(getWarningMessage), hasError = js.Any.fromFunction0(hasError), hasStatus = js.Any.fromFunction1(hasStatus), hasWarning = js.Any.fromFunction0(hasWarning), isDisabled = js.Any.fromFunction0(isDisabled))
      __obj.asInstanceOf[VariableInputUniDriver]
    }
    
    @scala.inline
    implicit class VariableInputUniDriverMutableBuilder[Self <: VariableInputUniDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlur(value: () => js.Promise[Unit]): Self = StObject.set(x, "blur", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEnterText(value: String => js.Promise[Unit]): Self = StObject.set(x, "enterText", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetContent(value: () => js.Promise[String]): Self = StObject.set(x, "getContent", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetErrorMessage(value: () => js.Promise[String]): Self = StObject.set(x, "getErrorMessage", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetPlaceholder(value: () => js.Promise[String]): Self = StObject.set(x, "getPlaceholder", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetStatusMessage(value: () => js.Promise[String | Null]): Self = StObject.set(x, "getStatusMessage", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetWarningMessage(value: () => js.Promise[String]): Self = StObject.set(x, "getWarningMessage", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHasError(value: () => js.Promise[Boolean]): Self = StObject.set(x, "hasError", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHasStatus(value: StatusIndications => js.Promise[Boolean]): Self = StObject.set(x, "hasStatus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHasWarning(value: () => js.Promise[Boolean]): Self = StObject.set(x, "hasWarning", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsDisabled(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isDisabled", js.Any.fromFunction0(value))
    }
  }
}
