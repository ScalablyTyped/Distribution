package typings.wixStyleReact

import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTimeInputTimeInputDotuniDotdriverMod {
  
  trait TimeInputUniDriver
    extends StObject
       with BaseUniDriver {
    
    def confirmValue(): js.Promise[Unit]
    
    def getLocale(): js.Promise[String]
    
    def getStatusMessage(): js.Promise[String | Null]
    
    def getTimeStyle(): js.Promise[String]
    
    def getValue(): js.Promise[js.Date]
    
    def hasStatus(): js.Promise[Boolean]
    
    def isDisabled(): js.Promise[Boolean]
    
    def setValue(value: String): js.Promise[Unit]
  }
  object TimeInputUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      confirmValue: () => js.Promise[Unit],
      element: () => js.Promise[Any],
      exists: () => js.Promise[Boolean],
      getLocale: () => js.Promise[String],
      getStatusMessage: () => js.Promise[String | Null],
      getTimeStyle: () => js.Promise[String],
      getValue: () => js.Promise[js.Date],
      hasStatus: () => js.Promise[Boolean],
      isDisabled: () => js.Promise[Boolean],
      setValue: String => js.Promise[Unit]
    ): TimeInputUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), confirmValue = js.Any.fromFunction0(confirmValue), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getLocale = js.Any.fromFunction0(getLocale), getStatusMessage = js.Any.fromFunction0(getStatusMessage), getTimeStyle = js.Any.fromFunction0(getTimeStyle), getValue = js.Any.fromFunction0(getValue), hasStatus = js.Any.fromFunction0(hasStatus), isDisabled = js.Any.fromFunction0(isDisabled), setValue = js.Any.fromFunction1(setValue))
      __obj.asInstanceOf[TimeInputUniDriver]
    }
    
    extension [Self <: TimeInputUniDriver](x: Self) {
      
      inline def setConfirmValue(value: () => js.Promise[Unit]): Self = StObject.set(x, "confirmValue", js.Any.fromFunction0(value))
      
      inline def setGetLocale(value: () => js.Promise[String]): Self = StObject.set(x, "getLocale", js.Any.fromFunction0(value))
      
      inline def setGetStatusMessage(value: () => js.Promise[String | Null]): Self = StObject.set(x, "getStatusMessage", js.Any.fromFunction0(value))
      
      inline def setGetTimeStyle(value: () => js.Promise[String]): Self = StObject.set(x, "getTimeStyle", js.Any.fromFunction0(value))
      
      inline def setGetValue(value: () => js.Promise[js.Date]): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
      
      inline def setHasStatus(value: () => js.Promise[Boolean]): Self = StObject.set(x, "hasStatus", js.Any.fromFunction0(value))
      
      inline def setIsDisabled(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isDisabled", js.Any.fromFunction0(value))
      
      inline def setSetValue(value: String => js.Promise[Unit]): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
    }
  }
}
