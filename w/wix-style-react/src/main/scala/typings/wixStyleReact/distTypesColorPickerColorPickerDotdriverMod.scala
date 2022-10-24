package typings.wixStyleReact

import typings.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesColorPickerColorPickerDotdriverMod {
  
  trait ColorPickerDriver
    extends StObject
       with BaseDriver {
    
    def cancel(): Unit
    
    def clickOnPreviousColor(): Unit
    
    def confirm(): Unit
    
    def historyCurrentColor(): String
    
    def historyPanelExists(): Boolean
    
    def historyPreviousColor(): String
  }
  object ColorPickerDriver {
    
    inline def apply(
      cancel: () => Unit,
      clickOnPreviousColor: () => Unit,
      confirm: () => Unit,
      exists: () => Boolean,
      historyCurrentColor: () => String,
      historyPanelExists: () => Boolean,
      historyPreviousColor: () => String
    ): ColorPickerDriver = {
      val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), clickOnPreviousColor = js.Any.fromFunction0(clickOnPreviousColor), confirm = js.Any.fromFunction0(confirm), exists = js.Any.fromFunction0(exists), historyCurrentColor = js.Any.fromFunction0(historyCurrentColor), historyPanelExists = js.Any.fromFunction0(historyPanelExists), historyPreviousColor = js.Any.fromFunction0(historyPreviousColor))
      __obj.asInstanceOf[ColorPickerDriver]
    }
    
    extension [Self <: ColorPickerDriver](x: Self) {
      
      inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
      
      inline def setClickOnPreviousColor(value: () => Unit): Self = StObject.set(x, "clickOnPreviousColor", js.Any.fromFunction0(value))
      
      inline def setConfirm(value: () => Unit): Self = StObject.set(x, "confirm", js.Any.fromFunction0(value))
      
      inline def setHistoryCurrentColor(value: () => String): Self = StObject.set(x, "historyCurrentColor", js.Any.fromFunction0(value))
      
      inline def setHistoryPanelExists(value: () => Boolean): Self = StObject.set(x, "historyPanelExists", js.Any.fromFunction0(value))
      
      inline def setHistoryPreviousColor(value: () => String): Self = StObject.set(x, "historyPreviousColor", js.Any.fromFunction0(value))
    }
  }
}
