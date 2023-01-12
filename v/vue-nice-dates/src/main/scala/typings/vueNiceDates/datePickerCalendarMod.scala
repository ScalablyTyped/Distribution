package typings.vueNiceDates

import org.scalablytyped.runtime.StringDictionary
import typings.vueNiceDates.anon.HandleClickDate
import typings.vueNiceDates.anon.OmitDatePickerPropsisFocu
import typings.vueNiceDates.anon.ReceivedDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datePickerCalendarMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VueConstructor * / any */ trait DatePickerCalendar extends StObject {
    
    def date(): ReceivedDate
    
    var methods: HandleClickDate
    
    var props: OmitDatePickerPropsisFocu
    
    var watch: StringDictionary[js.Function1[/* date */ js.Date, Unit]]
  }
  object DatePickerCalendar {
    
    @JSImport("vue-nice-dates/DatePickerCalendar", "DatePickerCalendar")
    @js.native
    val ^ : DatePickerCalendar = js.native
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DatePickerCalendar] (val x: Self) extends AnyVal {
      
      inline def setDate(value: () => ReceivedDate): Self = StObject.set(x, "date", js.Any.fromFunction0(value))
      
      inline def setMethods(value: HandleClickDate): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setProps(value: OmitDatePickerPropsisFocu): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setWatch(value: StringDictionary[js.Function1[/* date */ js.Date, Unit]]): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
    }
  }
}
