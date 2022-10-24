package typings.wixStyleReact

import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesAddressInputAddressInputDotuniDotdriverMod {
  
  trait AddressInputUniDriver
    extends StObject
       with BaseUniDriver {
    
    def clickAtOption(index: Double): js.Promise[Unit]
    
    def clickAtOptionWithValue(value: String): js.Promise[Unit]
    
    def clickClear(): js.Promise[Unit]
    
    def clickInput(): js.Promise[Unit]
    
    def enterText(value: String): js.Promise[Unit]
    
    def getAmountOfItems(): js.Promise[Double]
    
    def getInputValue(): js.Promise[String]
    
    def getItemMainLabelAt(index: Double): js.Promise[String]
    
    def getItemSecondaryLabelAt(index: Double): js.Promise[String]
    
    def isDisabled(): js.Promise[Boolean]
    
    def isFocused(): js.Promise[Boolean]
    
    def isLoading(): js.Promise[Boolean]
    
    def pressEnter(): js.Promise[Unit]
  }
  object AddressInputUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      clickAtOption: Double => js.Promise[Unit],
      clickAtOptionWithValue: String => js.Promise[Unit],
      clickClear: () => js.Promise[Unit],
      clickInput: () => js.Promise[Unit],
      element: () => js.Promise[Any],
      enterText: String => js.Promise[Unit],
      exists: () => js.Promise[Boolean],
      getAmountOfItems: () => js.Promise[Double],
      getInputValue: () => js.Promise[String],
      getItemMainLabelAt: Double => js.Promise[String],
      getItemSecondaryLabelAt: Double => js.Promise[String],
      isDisabled: () => js.Promise[Boolean],
      isFocused: () => js.Promise[Boolean],
      isLoading: () => js.Promise[Boolean],
      pressEnter: () => js.Promise[Unit]
    ): AddressInputUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), clickAtOption = js.Any.fromFunction1(clickAtOption), clickAtOptionWithValue = js.Any.fromFunction1(clickAtOptionWithValue), clickClear = js.Any.fromFunction0(clickClear), clickInput = js.Any.fromFunction0(clickInput), element = js.Any.fromFunction0(element), enterText = js.Any.fromFunction1(enterText), exists = js.Any.fromFunction0(exists), getAmountOfItems = js.Any.fromFunction0(getAmountOfItems), getInputValue = js.Any.fromFunction0(getInputValue), getItemMainLabelAt = js.Any.fromFunction1(getItemMainLabelAt), getItemSecondaryLabelAt = js.Any.fromFunction1(getItemSecondaryLabelAt), isDisabled = js.Any.fromFunction0(isDisabled), isFocused = js.Any.fromFunction0(isFocused), isLoading = js.Any.fromFunction0(isLoading), pressEnter = js.Any.fromFunction0(pressEnter))
      __obj.asInstanceOf[AddressInputUniDriver]
    }
    
    extension [Self <: AddressInputUniDriver](x: Self) {
      
      inline def setClickAtOption(value: Double => js.Promise[Unit]): Self = StObject.set(x, "clickAtOption", js.Any.fromFunction1(value))
      
      inline def setClickAtOptionWithValue(value: String => js.Promise[Unit]): Self = StObject.set(x, "clickAtOptionWithValue", js.Any.fromFunction1(value))
      
      inline def setClickClear(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickClear", js.Any.fromFunction0(value))
      
      inline def setClickInput(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickInput", js.Any.fromFunction0(value))
      
      inline def setEnterText(value: String => js.Promise[Unit]): Self = StObject.set(x, "enterText", js.Any.fromFunction1(value))
      
      inline def setGetAmountOfItems(value: () => js.Promise[Double]): Self = StObject.set(x, "getAmountOfItems", js.Any.fromFunction0(value))
      
      inline def setGetInputValue(value: () => js.Promise[String]): Self = StObject.set(x, "getInputValue", js.Any.fromFunction0(value))
      
      inline def setGetItemMainLabelAt(value: Double => js.Promise[String]): Self = StObject.set(x, "getItemMainLabelAt", js.Any.fromFunction1(value))
      
      inline def setGetItemSecondaryLabelAt(value: Double => js.Promise[String]): Self = StObject.set(x, "getItemSecondaryLabelAt", js.Any.fromFunction1(value))
      
      inline def setIsDisabled(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isDisabled", js.Any.fromFunction0(value))
      
      inline def setIsFocused(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isFocused", js.Any.fromFunction0(value))
      
      inline def setIsLoading(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isLoading", js.Any.fromFunction0(value))
      
      inline def setPressEnter(value: () => js.Promise[Unit]): Self = StObject.set(x, "pressEnter", js.Any.fromFunction0(value))
    }
  }
}
