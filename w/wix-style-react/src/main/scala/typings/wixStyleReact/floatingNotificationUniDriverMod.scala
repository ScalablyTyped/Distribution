package typings.wixStyleReact

import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object floatingNotificationUniDriverMod {
  
  trait FloatingNotificationUniDriver
    extends StObject
       with BaseUniDriver {
    
    def clickButton(): js.Promise[Unit]
    
    def clickCloseButton(): js.Promise[Unit]
    
    def clickTextButton(): js.Promise[Unit]
    
    def getButtonAttr(attrName: String): js.Promise[String | Null]
    
    def getButtonHref(): js.Promise[String | Null]
    
    def getButtonLabel(): js.Promise[String]
    
    def getText(): js.Promise[String]
    
    def getTextButtonAttr(attrName: String): js.Promise[String | Null]
    
    def getTextButtonHref(): js.Promise[String | Null]
    
    def getTextButtonLabel(): js.Promise[String]
    
    def isButtonAs(as: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any): js.Promise[Boolean]
    
    def isTextButtonAs(as: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any): js.Promise[Boolean]
  }
  object FloatingNotificationUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      clickButton: () => js.Promise[Unit],
      clickCloseButton: () => js.Promise[Unit],
      clickTextButton: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getButtonAttr: String => js.Promise[String | Null],
      getButtonHref: () => js.Promise[String | Null],
      getButtonLabel: () => js.Promise[String],
      getText: () => js.Promise[String],
      getTextButtonAttr: String => js.Promise[String | Null],
      getTextButtonHref: () => js.Promise[String | Null],
      getTextButtonLabel: () => js.Promise[String],
      isButtonAs: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any => js.Promise[Boolean],
      isTextButtonAs: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any => js.Promise[Boolean]
    ): FloatingNotificationUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), clickButton = js.Any.fromFunction0(clickButton), clickCloseButton = js.Any.fromFunction0(clickCloseButton), clickTextButton = js.Any.fromFunction0(clickTextButton), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getButtonAttr = js.Any.fromFunction1(getButtonAttr), getButtonHref = js.Any.fromFunction0(getButtonHref), getButtonLabel = js.Any.fromFunction0(getButtonLabel), getText = js.Any.fromFunction0(getText), getTextButtonAttr = js.Any.fromFunction1(getTextButtonAttr), getTextButtonHref = js.Any.fromFunction0(getTextButtonHref), getTextButtonLabel = js.Any.fromFunction0(getTextButtonLabel), isButtonAs = js.Any.fromFunction1(isButtonAs), isTextButtonAs = js.Any.fromFunction1(isTextButtonAs))
      __obj.asInstanceOf[FloatingNotificationUniDriver]
    }
    
    extension [Self <: FloatingNotificationUniDriver](x: Self) {
      
      inline def setClickButton(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickButton", js.Any.fromFunction0(value))
      
      inline def setClickCloseButton(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickCloseButton", js.Any.fromFunction0(value))
      
      inline def setClickTextButton(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickTextButton", js.Any.fromFunction0(value))
      
      inline def setGetButtonAttr(value: String => js.Promise[String | Null]): Self = StObject.set(x, "getButtonAttr", js.Any.fromFunction1(value))
      
      inline def setGetButtonHref(value: () => js.Promise[String | Null]): Self = StObject.set(x, "getButtonHref", js.Any.fromFunction0(value))
      
      inline def setGetButtonLabel(value: () => js.Promise[String]): Self = StObject.set(x, "getButtonLabel", js.Any.fromFunction0(value))
      
      inline def setGetText(value: () => js.Promise[String]): Self = StObject.set(x, "getText", js.Any.fromFunction0(value))
      
      inline def setGetTextButtonAttr(value: String => js.Promise[String | Null]): Self = StObject.set(x, "getTextButtonAttr", js.Any.fromFunction1(value))
      
      inline def setGetTextButtonHref(value: () => js.Promise[String | Null]): Self = StObject.set(x, "getTextButtonHref", js.Any.fromFunction0(value))
      
      inline def setGetTextButtonLabel(value: () => js.Promise[String]): Self = StObject.set(x, "getTextButtonLabel", js.Any.fromFunction0(value))
      
      inline def setIsButtonAs(
        value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any => js.Promise[Boolean]
      ): Self = StObject.set(x, "isButtonAs", js.Any.fromFunction1(value))
      
      inline def setIsTextButtonAs(
        value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any => js.Promise[Boolean]
      ): Self = StObject.set(x, "isTextButtonAs", js.Any.fromFunction1(value))
    }
  }
}
