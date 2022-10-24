package typings.wixStyleReact

import typings.unidriverCore.mod.UniDriver
import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesButtonButtonCoreButtonCoreDotuniDotdriverMod {
  
  @JSImport("wix-style-react/dist/types/Button/ButtonCore/ButtonCore.uni.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buttonCoreDriverFactory(base: UniDriver[Any]): ButtonCoreDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("buttonCoreDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[ButtonCoreDriver]
  
  trait ButtonCoreDriver
    extends StObject
       with BaseUniDriver {
    
    def focus(): js.Promise[Unit]
    
    def getButtonTextContent(): js.Promise[String]
    
    def getHref(): js.Promise[String | Null]
    
    def getTabIndex(): js.Promise[String | Null]
    
    def getTagName(): js.Promise[String | Null]
    
    def getType(): js.Promise[String | Null]
    
    def hasPrefixClass(className: String): js.Promise[Boolean]
    
    def hasSuffixClass(className: String): js.Promise[Boolean]
    
    def isButtonDisabled(): js.Promise[Boolean]
    
    def isDisabled(): js.Promise[Boolean]
    
    def isFocused(): js.Promise[Boolean]
    
    def isPrefixIconExists(): js.Promise[Boolean]
    
    def isSuffixIconExists(): js.Promise[Boolean]
  }
  object ButtonCoreDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[Any],
      exists: () => js.Promise[Boolean],
      focus: () => js.Promise[Unit],
      getButtonTextContent: () => js.Promise[String],
      getHref: () => js.Promise[String | Null],
      getTabIndex: () => js.Promise[String | Null],
      getTagName: () => js.Promise[String | Null],
      getType: () => js.Promise[String | Null],
      hasPrefixClass: String => js.Promise[Boolean],
      hasSuffixClass: String => js.Promise[Boolean],
      isButtonDisabled: () => js.Promise[Boolean],
      isDisabled: () => js.Promise[Boolean],
      isFocused: () => js.Promise[Boolean],
      isPrefixIconExists: () => js.Promise[Boolean],
      isSuffixIconExists: () => js.Promise[Boolean]
    ): ButtonCoreDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), focus = js.Any.fromFunction0(focus), getButtonTextContent = js.Any.fromFunction0(getButtonTextContent), getHref = js.Any.fromFunction0(getHref), getTabIndex = js.Any.fromFunction0(getTabIndex), getTagName = js.Any.fromFunction0(getTagName), getType = js.Any.fromFunction0(getType), hasPrefixClass = js.Any.fromFunction1(hasPrefixClass), hasSuffixClass = js.Any.fromFunction1(hasSuffixClass), isButtonDisabled = js.Any.fromFunction0(isButtonDisabled), isDisabled = js.Any.fromFunction0(isDisabled), isFocused = js.Any.fromFunction0(isFocused), isPrefixIconExists = js.Any.fromFunction0(isPrefixIconExists), isSuffixIconExists = js.Any.fromFunction0(isSuffixIconExists))
      __obj.asInstanceOf[ButtonCoreDriver]
    }
    
    extension [Self <: ButtonCoreDriver](x: Self) {
      
      inline def setFocus(value: () => js.Promise[Unit]): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
      
      inline def setGetButtonTextContent(value: () => js.Promise[String]): Self = StObject.set(x, "getButtonTextContent", js.Any.fromFunction0(value))
      
      inline def setGetHref(value: () => js.Promise[String | Null]): Self = StObject.set(x, "getHref", js.Any.fromFunction0(value))
      
      inline def setGetTabIndex(value: () => js.Promise[String | Null]): Self = StObject.set(x, "getTabIndex", js.Any.fromFunction0(value))
      
      inline def setGetTagName(value: () => js.Promise[String | Null]): Self = StObject.set(x, "getTagName", js.Any.fromFunction0(value))
      
      inline def setGetType(value: () => js.Promise[String | Null]): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
      
      inline def setHasPrefixClass(value: String => js.Promise[Boolean]): Self = StObject.set(x, "hasPrefixClass", js.Any.fromFunction1(value))
      
      inline def setHasSuffixClass(value: String => js.Promise[Boolean]): Self = StObject.set(x, "hasSuffixClass", js.Any.fromFunction1(value))
      
      inline def setIsButtonDisabled(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isButtonDisabled", js.Any.fromFunction0(value))
      
      inline def setIsDisabled(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isDisabled", js.Any.fromFunction0(value))
      
      inline def setIsFocused(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isFocused", js.Any.fromFunction0(value))
      
      inline def setIsPrefixIconExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isPrefixIconExists", js.Any.fromFunction0(value))
      
      inline def setIsSuffixIconExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isSuffixIconExists", js.Any.fromFunction0(value))
    }
  }
}
