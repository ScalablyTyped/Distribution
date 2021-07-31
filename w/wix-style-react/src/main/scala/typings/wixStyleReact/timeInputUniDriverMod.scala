package typings.wixStyleReact

import typings.wixStyleReact.commonMod.StatusIndications
import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timeInputUniDriverMod {
  
  trait TimeInputUniDriver
    extends StObject
       with BaseUniDriver {
    
    def blur(): js.Promise[Unit]
    
    def clickTickerDown(): js.Promise[Unit]
    
    def clickTickerUp(): js.Promise[Unit]
    
    def getAmPmIndicatorText(): js.Promise[String]
    
    def getCustomSuffix(): js.Promise[String]
    
    def getStatusMessage(): js.Promise[String | Null]
    
    def getValue(): js.Promise[String]
    
    // Status
    def hasStatus(status: StatusIndications): js.Promise[Boolean]
    
    def isAmPmIndicatorExist(): js.Promise[Boolean]
    
    def isDisabled(): js.Promise[Boolean]
    
    def isRtl(): js.Promise[Boolean]
    
    def isShowSeconds(): js.Promise[Boolean]
    
    def setValue(text: String): js.Promise[Unit]
    
    def toggleAmPmIndicator(): js.Promise[Unit]
  }
  object TimeInputUniDriver {
    
    @scala.inline
    def apply(
      blur: () => js.Promise[Unit],
      click: () => js.Promise[Unit],
      clickTickerDown: () => js.Promise[Unit],
      clickTickerUp: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getAmPmIndicatorText: () => js.Promise[String],
      getCustomSuffix: () => js.Promise[String],
      getStatusMessage: () => js.Promise[String | Null],
      getValue: () => js.Promise[String],
      hasStatus: StatusIndications => js.Promise[Boolean],
      isAmPmIndicatorExist: () => js.Promise[Boolean],
      isDisabled: () => js.Promise[Boolean],
      isRtl: () => js.Promise[Boolean],
      isShowSeconds: () => js.Promise[Boolean],
      setValue: String => js.Promise[Unit],
      toggleAmPmIndicator: () => js.Promise[Unit]
    ): TimeInputUniDriver = {
      val __obj = js.Dynamic.literal(blur = js.Any.fromFunction0(blur), click = js.Any.fromFunction0(click), clickTickerDown = js.Any.fromFunction0(clickTickerDown), clickTickerUp = js.Any.fromFunction0(clickTickerUp), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getAmPmIndicatorText = js.Any.fromFunction0(getAmPmIndicatorText), getCustomSuffix = js.Any.fromFunction0(getCustomSuffix), getStatusMessage = js.Any.fromFunction0(getStatusMessage), getValue = js.Any.fromFunction0(getValue), hasStatus = js.Any.fromFunction1(hasStatus), isAmPmIndicatorExist = js.Any.fromFunction0(isAmPmIndicatorExist), isDisabled = js.Any.fromFunction0(isDisabled), isRtl = js.Any.fromFunction0(isRtl), isShowSeconds = js.Any.fromFunction0(isShowSeconds), setValue = js.Any.fromFunction1(setValue), toggleAmPmIndicator = js.Any.fromFunction0(toggleAmPmIndicator))
      __obj.asInstanceOf[TimeInputUniDriver]
    }
    
    @scala.inline
    implicit class TimeInputUniDriverMutableBuilder[Self <: TimeInputUniDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlur(value: () => js.Promise[Unit]): Self = StObject.set(x, "blur", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClickTickerDown(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickTickerDown", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClickTickerUp(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickTickerUp", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetAmPmIndicatorText(value: () => js.Promise[String]): Self = StObject.set(x, "getAmPmIndicatorText", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetCustomSuffix(value: () => js.Promise[String]): Self = StObject.set(x, "getCustomSuffix", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetStatusMessage(value: () => js.Promise[String | Null]): Self = StObject.set(x, "getStatusMessage", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetValue(value: () => js.Promise[String]): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHasStatus(value: StatusIndications => js.Promise[Boolean]): Self = StObject.set(x, "hasStatus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsAmPmIndicatorExist(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isAmPmIndicatorExist", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsDisabled(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isDisabled", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsRtl(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isRtl", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsShowSeconds(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isShowSeconds", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetValue(value: String => js.Promise[Unit]): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToggleAmPmIndicator(value: () => js.Promise[Unit]): Self = StObject.set(x, "toggleAmPmIndicator", js.Any.fromFunction0(value))
    }
  }
}
