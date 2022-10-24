package typings.wixStyleReact

import typings.wixStyleReact.anon.GetWidth
import typings.wixStyleReact.distTypesCalendarCalendarDotuniDotdriverMod.CalendarUniDriver
import typings.wixStyleReact.distTypesInputInputDotuniDotdriverMod.InputUniDriver
import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesDatePickerDatePickerDotuniDotdriverMod {
  
  trait DatePickerUniDriver
    extends StObject
       with BaseUniDriver {
    
    var calendarDriver: CalendarUniDriver
    
    var driver: GetWidth
    
    var inputDriver: InputUniDriver
  }
  object DatePickerUniDriver {
    
    inline def apply(
      calendarDriver: CalendarUniDriver,
      click: () => js.Promise[Unit],
      driver: GetWidth,
      element: () => js.Promise[Any],
      exists: () => js.Promise[Boolean],
      inputDriver: InputUniDriver
    ): DatePickerUniDriver = {
      val __obj = js.Dynamic.literal(calendarDriver = calendarDriver.asInstanceOf[js.Any], click = js.Any.fromFunction0(click), driver = driver.asInstanceOf[js.Any], element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), inputDriver = inputDriver.asInstanceOf[js.Any])
      __obj.asInstanceOf[DatePickerUniDriver]
    }
    
    extension [Self <: DatePickerUniDriver](x: Self) {
      
      inline def setCalendarDriver(value: CalendarUniDriver): Self = StObject.set(x, "calendarDriver", value.asInstanceOf[js.Any])
      
      inline def setDriver(value: GetWidth): Self = StObject.set(x, "driver", value.asInstanceOf[js.Any])
      
      inline def setInputDriver(value: InputUniDriver): Self = StObject.set(x, "inputDriver", value.asInstanceOf[js.Any])
    }
  }
}
