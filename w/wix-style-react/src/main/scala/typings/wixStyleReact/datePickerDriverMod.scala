package typings.wixStyleReact

import typings.wixStyleReact.anon.Exists
import typings.wixStyleReact.calendarDriverMod.CalendarDriver
import typings.wixStyleReact.inputDriverMod.InputDriver
import typings.wixUiTestUtils.createDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datePickerDriverMod {
  
  trait DatePickerDriver
    extends StObject
       with BaseDriver {
    
    var calendarDriver: CalendarDriver
    
    var driver: Exists
    
    var inputDriver: InputDriver
  }
  object DatePickerDriver {
    
    inline def apply(calendarDriver: CalendarDriver, driver: Exists, exists: () => Boolean, inputDriver: InputDriver): DatePickerDriver = {
      val __obj = js.Dynamic.literal(calendarDriver = calendarDriver.asInstanceOf[js.Any], driver = driver.asInstanceOf[js.Any], exists = js.Any.fromFunction0(exists), inputDriver = inputDriver.asInstanceOf[js.Any])
      __obj.asInstanceOf[DatePickerDriver]
    }
    
    extension [Self <: DatePickerDriver](x: Self) {
      
      inline def setCalendarDriver(value: CalendarDriver): Self = StObject.set(x, "calendarDriver", value.asInstanceOf[js.Any])
      
      inline def setDriver(value: Exists): Self = StObject.set(x, "driver", value.asInstanceOf[js.Any])
      
      inline def setInputDriver(value: InputDriver): Self = StObject.set(x, "inputDriver", value.asInstanceOf[js.Any])
    }
  }
}
