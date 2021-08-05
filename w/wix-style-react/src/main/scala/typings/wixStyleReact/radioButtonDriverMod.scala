package typings.wixStyleReact

import typings.std.Element
import typings.std.HTMLElement
import typings.wixUiTestUtils.createDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radioButtonDriverMod {
  
  trait RadioButtonDriver
    extends StObject
       with BaseDriver {
    
    def check(): Unit
    
    def getContent(): HTMLElement
    
    def getLabel(): String
    
    def getLabelElement(): Element
    
    def getTabIndex(): String | Null
    
    def getValue(): String
    
    def isChecked(): Boolean
    
    def isDisabled(): Boolean
  }
  object RadioButtonDriver {
    
    inline def apply(
      check: () => Unit,
      exists: () => Boolean,
      getContent: () => HTMLElement,
      getLabel: () => String,
      getLabelElement: () => Element,
      getTabIndex: () => String | Null,
      getValue: () => String,
      isChecked: () => Boolean,
      isDisabled: () => Boolean
    ): RadioButtonDriver = {
      val __obj = js.Dynamic.literal(check = js.Any.fromFunction0(check), exists = js.Any.fromFunction0(exists), getContent = js.Any.fromFunction0(getContent), getLabel = js.Any.fromFunction0(getLabel), getLabelElement = js.Any.fromFunction0(getLabelElement), getTabIndex = js.Any.fromFunction0(getTabIndex), getValue = js.Any.fromFunction0(getValue), isChecked = js.Any.fromFunction0(isChecked), isDisabled = js.Any.fromFunction0(isDisabled))
      __obj.asInstanceOf[RadioButtonDriver]
    }
    
    extension [Self <: RadioButtonDriver](x: Self) {
      
      inline def setCheck(value: () => Unit): Self = StObject.set(x, "check", js.Any.fromFunction0(value))
      
      inline def setGetContent(value: () => HTMLElement): Self = StObject.set(x, "getContent", js.Any.fromFunction0(value))
      
      inline def setGetLabel(value: () => String): Self = StObject.set(x, "getLabel", js.Any.fromFunction0(value))
      
      inline def setGetLabelElement(value: () => Element): Self = StObject.set(x, "getLabelElement", js.Any.fromFunction0(value))
      
      inline def setGetTabIndex(value: () => String | Null): Self = StObject.set(x, "getTabIndex", js.Any.fromFunction0(value))
      
      inline def setGetValue(value: () => String): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
      
      inline def setIsChecked(value: () => Boolean): Self = StObject.set(x, "isChecked", js.Any.fromFunction0(value))
      
      inline def setIsDisabled(value: () => Boolean): Self = StObject.set(x, "isDisabled", js.Any.fromFunction0(value))
    }
  }
}
