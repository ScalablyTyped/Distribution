package typings.wixStyleReact

import typings.wixStyleReact.distTypesCommonMod.StatusIndications
import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRichTextInputAreaRichTextInputAreaDotuniDotdriverMod {
  
  trait RichTextInputAreaUniDriver
    extends StObject
       with BaseUniDriver {
    
    def enterText(value: String): js.Promise[Unit]
    
    def getContent(): js.Promise[String]
    
    def getPlaceholder(): js.Promise[String | Null]
    
    def getStatusMessage(): js.Promise[String | Null]
    
    // Status
    def hasStatus(status: StatusIndications): js.Promise[Boolean]
    
    def isDisabled(): js.Promise[Boolean]
  }
  object RichTextInputAreaUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[Any],
      enterText: String => js.Promise[Unit],
      exists: () => js.Promise[Boolean],
      getContent: () => js.Promise[String],
      getPlaceholder: () => js.Promise[String | Null],
      getStatusMessage: () => js.Promise[String | Null],
      hasStatus: StatusIndications => js.Promise[Boolean],
      isDisabled: () => js.Promise[Boolean]
    ): RichTextInputAreaUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), enterText = js.Any.fromFunction1(enterText), exists = js.Any.fromFunction0(exists), getContent = js.Any.fromFunction0(getContent), getPlaceholder = js.Any.fromFunction0(getPlaceholder), getStatusMessage = js.Any.fromFunction0(getStatusMessage), hasStatus = js.Any.fromFunction1(hasStatus), isDisabled = js.Any.fromFunction0(isDisabled))
      __obj.asInstanceOf[RichTextInputAreaUniDriver]
    }
    
    extension [Self <: RichTextInputAreaUniDriver](x: Self) {
      
      inline def setEnterText(value: String => js.Promise[Unit]): Self = StObject.set(x, "enterText", js.Any.fromFunction1(value))
      
      inline def setGetContent(value: () => js.Promise[String]): Self = StObject.set(x, "getContent", js.Any.fromFunction0(value))
      
      inline def setGetPlaceholder(value: () => js.Promise[String | Null]): Self = StObject.set(x, "getPlaceholder", js.Any.fromFunction0(value))
      
      inline def setGetStatusMessage(value: () => js.Promise[String | Null]): Self = StObject.set(x, "getStatusMessage", js.Any.fromFunction0(value))
      
      inline def setHasStatus(value: StatusIndications => js.Promise[Boolean]): Self = StObject.set(x, "hasStatus", js.Any.fromFunction1(value))
      
      inline def setIsDisabled(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isDisabled", js.Any.fromFunction0(value))
    }
  }
}
