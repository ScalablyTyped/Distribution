package typings.wixStyleReact

import typings.wixStyleReact.calendarUniDriverMod.CalendarUniDriver
import typings.wixStyleReact.dropdownLayoutUniDriverMod.DropdownLayoutUniDriver
import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object calendarPanelUniDriverMod {
  
  trait CalendarPanelUniDriver
    extends StObject
       with BaseUniDriver {
    
    def calendarDriver(): js.Promise[CalendarUniDriver]
    
    def findByDataHook(dataHook: String): js.Promise[Boolean]
    
    def isDropdownExists(): js.Promise[Boolean]
    
    def presetsDropdownLayoutDriver(): DropdownLayoutUniDriver
  }
  object CalendarPanelUniDriver {
    
    inline def apply(
      calendarDriver: () => js.Promise[CalendarUniDriver],
      click: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      findByDataHook: String => js.Promise[Boolean],
      isDropdownExists: () => js.Promise[Boolean],
      presetsDropdownLayoutDriver: () => DropdownLayoutUniDriver
    ): CalendarPanelUniDriver = {
      val __obj = js.Dynamic.literal(calendarDriver = js.Any.fromFunction0(calendarDriver), click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), findByDataHook = js.Any.fromFunction1(findByDataHook), isDropdownExists = js.Any.fromFunction0(isDropdownExists), presetsDropdownLayoutDriver = js.Any.fromFunction0(presetsDropdownLayoutDriver))
      __obj.asInstanceOf[CalendarPanelUniDriver]
    }
    
    extension [Self <: CalendarPanelUniDriver](x: Self) {
      
      inline def setCalendarDriver(value: () => js.Promise[CalendarUniDriver]): Self = StObject.set(x, "calendarDriver", js.Any.fromFunction0(value))
      
      inline def setFindByDataHook(value: String => js.Promise[Boolean]): Self = StObject.set(x, "findByDataHook", js.Any.fromFunction1(value))
      
      inline def setIsDropdownExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isDropdownExists", js.Any.fromFunction0(value))
      
      inline def setPresetsDropdownLayoutDriver(value: () => DropdownLayoutUniDriver): Self = StObject.set(x, "presetsDropdownLayoutDriver", js.Any.fromFunction0(value))
    }
  }
}
