package typings.wixStyleReact

import typings.wixStyleReact.distTypesCalendarCalendarDotdriverMod.CalendarDriver
import typings.wixStyleReact.distTypesDropdownLayoutDropdownLayoutDotdriverMod.DropdownLayoutDriver
import typings.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCalendarPanelCalendarPanelDotdriverMod {
  
  trait CalendarPanelDriver
    extends StObject
       with BaseDriver {
    
    def calendarDriver(): CalendarDriver
    
    def isDropdownExists(): Boolean
    
    def presetsDropdownLayoutDriver(): DropdownLayoutDriver
  }
  object CalendarPanelDriver {
    
    inline def apply(
      calendarDriver: () => CalendarDriver,
      exists: () => Boolean,
      isDropdownExists: () => Boolean,
      presetsDropdownLayoutDriver: () => DropdownLayoutDriver
    ): CalendarPanelDriver = {
      val __obj = js.Dynamic.literal(calendarDriver = js.Any.fromFunction0(calendarDriver), exists = js.Any.fromFunction0(exists), isDropdownExists = js.Any.fromFunction0(isDropdownExists), presetsDropdownLayoutDriver = js.Any.fromFunction0(presetsDropdownLayoutDriver))
      __obj.asInstanceOf[CalendarPanelDriver]
    }
    
    extension [Self <: CalendarPanelDriver](x: Self) {
      
      inline def setCalendarDriver(value: () => CalendarDriver): Self = StObject.set(x, "calendarDriver", js.Any.fromFunction0(value))
      
      inline def setIsDropdownExists(value: () => Boolean): Self = StObject.set(x, "isDropdownExists", js.Any.fromFunction0(value))
      
      inline def setPresetsDropdownLayoutDriver(value: () => DropdownLayoutDriver): Self = StObject.set(x, "presetsDropdownLayoutDriver", js.Any.fromFunction0(value))
    }
  }
}
