package typings.wixStyleReact

import typings.react.mod.ReactNode
import typings.wixStyleReact.commonMod.StatusIndications
import typings.wixUiTestUtils.createDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timeInputDriverMod {
  
  trait TimeInputDriver
    extends StObject
       with BaseDriver {
    
    def blur(): Unit
    
    def clickTickerDown(): Unit
    
    def clickTickerUp(): Unit
    
    def getAmPmIndicatorText(): String
    
    def getCustomSuffix(): ReactNode
    
    def getStatusMessage(): js.Promise[String | Null]
    
    def getValue(): String
    
    // Status
    def hasStatus(status: StatusIndications): js.Promise[Boolean]
    
    def isAmPmIndicatorExist(): Boolean
    
    def isDisabled(): Boolean
    
    def isRtl(): Boolean
    
    def isShowSeconds(): Boolean
    
    def setValue(text: String): Unit
    
    def toggleAmPmIndicator(): Unit
  }
  object TimeInputDriver {
    
    @scala.inline
    def apply(
      blur: () => Unit,
      clickTickerDown: () => Unit,
      clickTickerUp: () => Unit,
      exists: () => Boolean,
      getAmPmIndicatorText: () => String,
      getCustomSuffix: () => ReactNode,
      getStatusMessage: () => js.Promise[String | Null],
      getValue: () => String,
      hasStatus: StatusIndications => js.Promise[Boolean],
      isAmPmIndicatorExist: () => Boolean,
      isDisabled: () => Boolean,
      isRtl: () => Boolean,
      isShowSeconds: () => Boolean,
      setValue: String => Unit,
      toggleAmPmIndicator: () => Unit
    ): TimeInputDriver = {
      val __obj = js.Dynamic.literal(blur = js.Any.fromFunction0(blur), clickTickerDown = js.Any.fromFunction0(clickTickerDown), clickTickerUp = js.Any.fromFunction0(clickTickerUp), exists = js.Any.fromFunction0(exists), getAmPmIndicatorText = js.Any.fromFunction0(getAmPmIndicatorText), getCustomSuffix = js.Any.fromFunction0(getCustomSuffix), getStatusMessage = js.Any.fromFunction0(getStatusMessage), getValue = js.Any.fromFunction0(getValue), hasStatus = js.Any.fromFunction1(hasStatus), isAmPmIndicatorExist = js.Any.fromFunction0(isAmPmIndicatorExist), isDisabled = js.Any.fromFunction0(isDisabled), isRtl = js.Any.fromFunction0(isRtl), isShowSeconds = js.Any.fromFunction0(isShowSeconds), setValue = js.Any.fromFunction1(setValue), toggleAmPmIndicator = js.Any.fromFunction0(toggleAmPmIndicator))
      __obj.asInstanceOf[TimeInputDriver]
    }
    
    @scala.inline
    implicit class TimeInputDriverMutableBuilder[Self <: TimeInputDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlur(value: () => Unit): Self = StObject.set(x, "blur", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClickTickerDown(value: () => Unit): Self = StObject.set(x, "clickTickerDown", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClickTickerUp(value: () => Unit): Self = StObject.set(x, "clickTickerUp", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetAmPmIndicatorText(value: () => String): Self = StObject.set(x, "getAmPmIndicatorText", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetCustomSuffix(value: () => ReactNode): Self = StObject.set(x, "getCustomSuffix", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetStatusMessage(value: () => js.Promise[String | Null]): Self = StObject.set(x, "getStatusMessage", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetValue(value: () => String): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHasStatus(value: StatusIndications => js.Promise[Boolean]): Self = StObject.set(x, "hasStatus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsAmPmIndicatorExist(value: () => Boolean): Self = StObject.set(x, "isAmPmIndicatorExist", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsDisabled(value: () => Boolean): Self = StObject.set(x, "isDisabled", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsRtl(value: () => Boolean): Self = StObject.set(x, "isRtl", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsShowSeconds(value: () => Boolean): Self = StObject.set(x, "isShowSeconds", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetValue(value: String => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToggleAmPmIndicator(value: () => Unit): Self = StObject.set(x, "toggleAmPmIndicator", js.Any.fromFunction0(value))
    }
  }
}
