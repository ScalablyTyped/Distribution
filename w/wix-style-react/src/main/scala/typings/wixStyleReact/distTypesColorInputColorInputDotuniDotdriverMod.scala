package typings.wixStyleReact

import typings.wixStyleReact.distTypesCommonMod.StatusIndications
import typings.wixStyleReact.distTypesInputMod.InputSize
import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesColorInputColorInputDotuniDotdriverMod {
  
  trait ColorInputUniDriver
    extends StObject
       with BaseUniDriver {
    
    def cancel(): js.Promise[Unit]
    
    def clickColorViewer(): js.Promise[Unit]
    
    def colorPickerVisible(): js.Promise[Boolean]
    
    def confirm(): js.Promise[Unit]
    
    def enterText(text: String): js.Promise[Unit]
    
    def getPlaceholder(): js.Promise[String | Null]
    
    def getSize(): js.Promise[InputSize | Null]
    
    def getStatusMessage(): js.Promise[String | Null]
    
    def getValue(): js.Promise[String]
    
    // Status
    def hasStatus(status: StatusIndications): js.Promise[Boolean]
    
    def isDisabled(): js.Promise[Boolean]
  }
  object ColorInputUniDriver {
    
    inline def apply(
      cancel: () => js.Promise[Unit],
      click: () => js.Promise[Unit],
      clickColorViewer: () => js.Promise[Unit],
      colorPickerVisible: () => js.Promise[Boolean],
      confirm: () => js.Promise[Unit],
      element: () => js.Promise[Any],
      enterText: String => js.Promise[Unit],
      exists: () => js.Promise[Boolean],
      getPlaceholder: () => js.Promise[String | Null],
      getSize: () => js.Promise[InputSize | Null],
      getStatusMessage: () => js.Promise[String | Null],
      getValue: () => js.Promise[String],
      hasStatus: StatusIndications => js.Promise[Boolean],
      isDisabled: () => js.Promise[Boolean]
    ): ColorInputUniDriver = {
      val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), click = js.Any.fromFunction0(click), clickColorViewer = js.Any.fromFunction0(clickColorViewer), colorPickerVisible = js.Any.fromFunction0(colorPickerVisible), confirm = js.Any.fromFunction0(confirm), element = js.Any.fromFunction0(element), enterText = js.Any.fromFunction1(enterText), exists = js.Any.fromFunction0(exists), getPlaceholder = js.Any.fromFunction0(getPlaceholder), getSize = js.Any.fromFunction0(getSize), getStatusMessage = js.Any.fromFunction0(getStatusMessage), getValue = js.Any.fromFunction0(getValue), hasStatus = js.Any.fromFunction1(hasStatus), isDisabled = js.Any.fromFunction0(isDisabled))
      __obj.asInstanceOf[ColorInputUniDriver]
    }
    
    extension [Self <: ColorInputUniDriver](x: Self) {
      
      inline def setCancel(value: () => js.Promise[Unit]): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
      
      inline def setClickColorViewer(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickColorViewer", js.Any.fromFunction0(value))
      
      inline def setColorPickerVisible(value: () => js.Promise[Boolean]): Self = StObject.set(x, "colorPickerVisible", js.Any.fromFunction0(value))
      
      inline def setConfirm(value: () => js.Promise[Unit]): Self = StObject.set(x, "confirm", js.Any.fromFunction0(value))
      
      inline def setEnterText(value: String => js.Promise[Unit]): Self = StObject.set(x, "enterText", js.Any.fromFunction1(value))
      
      inline def setGetPlaceholder(value: () => js.Promise[String | Null]): Self = StObject.set(x, "getPlaceholder", js.Any.fromFunction0(value))
      
      inline def setGetSize(value: () => js.Promise[InputSize | Null]): Self = StObject.set(x, "getSize", js.Any.fromFunction0(value))
      
      inline def setGetStatusMessage(value: () => js.Promise[String | Null]): Self = StObject.set(x, "getStatusMessage", js.Any.fromFunction0(value))
      
      inline def setGetValue(value: () => js.Promise[String]): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
      
      inline def setHasStatus(value: StatusIndications => js.Promise[Boolean]): Self = StObject.set(x, "hasStatus", js.Any.fromFunction1(value))
      
      inline def setIsDisabled(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isDisabled", js.Any.fromFunction0(value))
    }
  }
}
