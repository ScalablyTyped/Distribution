package typings.wixUiCore

import typings.protractor.mod.ElementFinder
import typings.wixUiCore.baseDriverProtractorMod.BaseDriver
import typings.wixUiCore.baseDriverProtractorMod.DriverFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timePickerProtractorDriverMod {
  
  @JSImport("wix-ui-core/dist/src/components/time-picker/TimePicker.protractor.driver", "timePickerDriverFactory")
  @js.native
  val timePickerDriverFactory: DriverFactory[TimePickerDriver] = js.native
  
  trait TimePickerDriver
    extends StObject
       with BaseDriver {
    
    def blur(): js.Promise[Unit]
    
    def clickTickerDown(): js.Promise[Unit]
    
    def clickTickerUp(): js.Promise[Unit]
    
    def focus(): js.Promise[Unit]
    
    def getValue(): js.Promise[String]
    
    def mouseEnter(): js.Promise[Unit]
    
    def pressKeyArrowLeft(): js.Promise[Unit]
    
    def pressKeyArrowRight(): js.Promise[Unit]
  }
  object TimePickerDriver {
    
    inline def apply(
      blur: () => js.Promise[Unit],
      clickTickerDown: () => js.Promise[Unit],
      clickTickerUp: () => js.Promise[Unit],
      element: () => ElementFinder,
      focus: () => js.Promise[Unit],
      getValue: () => js.Promise[String],
      mouseEnter: () => js.Promise[Unit],
      pressKeyArrowLeft: () => js.Promise[Unit],
      pressKeyArrowRight: () => js.Promise[Unit]
    ): TimePickerDriver = {
      val __obj = js.Dynamic.literal(blur = js.Any.fromFunction0(blur), clickTickerDown = js.Any.fromFunction0(clickTickerDown), clickTickerUp = js.Any.fromFunction0(clickTickerUp), element = js.Any.fromFunction0(element), focus = js.Any.fromFunction0(focus), getValue = js.Any.fromFunction0(getValue), mouseEnter = js.Any.fromFunction0(mouseEnter), pressKeyArrowLeft = js.Any.fromFunction0(pressKeyArrowLeft), pressKeyArrowRight = js.Any.fromFunction0(pressKeyArrowRight))
      __obj.asInstanceOf[TimePickerDriver]
    }
    
    extension [Self <: TimePickerDriver](x: Self) {
      
      inline def setBlur(value: () => js.Promise[Unit]): Self = StObject.set(x, "blur", js.Any.fromFunction0(value))
      
      inline def setClickTickerDown(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickTickerDown", js.Any.fromFunction0(value))
      
      inline def setClickTickerUp(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickTickerUp", js.Any.fromFunction0(value))
      
      inline def setFocus(value: () => js.Promise[Unit]): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
      
      inline def setGetValue(value: () => js.Promise[String]): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
      
      inline def setMouseEnter(value: () => js.Promise[Unit]): Self = StObject.set(x, "mouseEnter", js.Any.fromFunction0(value))
      
      inline def setPressKeyArrowLeft(value: () => js.Promise[Unit]): Self = StObject.set(x, "pressKeyArrowLeft", js.Any.fromFunction0(value))
      
      inline def setPressKeyArrowRight(value: () => js.Promise[Unit]): Self = StObject.set(x, "pressKeyArrowRight", js.Any.fromFunction0(value))
    }
  }
}
