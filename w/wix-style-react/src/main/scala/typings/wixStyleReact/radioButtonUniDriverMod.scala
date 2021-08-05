package typings.wixStyleReact

import typings.std.Element
import typings.std.HTMLElement
import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radioButtonUniDriverMod {
  
  trait RadioButtonUniDriver
    extends StObject
       with BaseUniDriver {
    
    def check(): js.Promise[Unit]
    
    def getContent(): js.Promise[HTMLElement]
    
    def getLabel(): js.Promise[String]
    
    def getLabelElement(): js.Promise[Element]
    
    def getTabIndex(): js.Promise[String | Null]
    
    def getValue(): js.Promise[String]
    
    def isChecked(): js.Promise[Boolean]
    
    def isDisabled(): js.Promise[Boolean]
  }
  object RadioButtonUniDriver {
    
    inline def apply(
      check: () => js.Promise[Unit],
      click: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getContent: () => js.Promise[HTMLElement],
      getLabel: () => js.Promise[String],
      getLabelElement: () => js.Promise[Element],
      getTabIndex: () => js.Promise[String | Null],
      getValue: () => js.Promise[String],
      isChecked: () => js.Promise[Boolean],
      isDisabled: () => js.Promise[Boolean]
    ): RadioButtonUniDriver = {
      val __obj = js.Dynamic.literal(check = js.Any.fromFunction0(check), click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getContent = js.Any.fromFunction0(getContent), getLabel = js.Any.fromFunction0(getLabel), getLabelElement = js.Any.fromFunction0(getLabelElement), getTabIndex = js.Any.fromFunction0(getTabIndex), getValue = js.Any.fromFunction0(getValue), isChecked = js.Any.fromFunction0(isChecked), isDisabled = js.Any.fromFunction0(isDisabled))
      __obj.asInstanceOf[RadioButtonUniDriver]
    }
    
    extension [Self <: RadioButtonUniDriver](x: Self) {
      
      inline def setCheck(value: () => js.Promise[Unit]): Self = StObject.set(x, "check", js.Any.fromFunction0(value))
      
      inline def setGetContent(value: () => js.Promise[HTMLElement]): Self = StObject.set(x, "getContent", js.Any.fromFunction0(value))
      
      inline def setGetLabel(value: () => js.Promise[String]): Self = StObject.set(x, "getLabel", js.Any.fromFunction0(value))
      
      inline def setGetLabelElement(value: () => js.Promise[Element]): Self = StObject.set(x, "getLabelElement", js.Any.fromFunction0(value))
      
      inline def setGetTabIndex(value: () => js.Promise[String | Null]): Self = StObject.set(x, "getTabIndex", js.Any.fromFunction0(value))
      
      inline def setGetValue(value: () => js.Promise[String]): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
      
      inline def setIsChecked(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isChecked", js.Any.fromFunction0(value))
      
      inline def setIsDisabled(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isDisabled", js.Any.fromFunction0(value))
    }
  }
}
