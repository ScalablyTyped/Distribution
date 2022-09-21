package typings.vueNiceDates

import org.scalablytyped.runtime.StringDictionary
import typings.vueNiceDates.anon.DisplayedEndDate
import typings.vueNiceDates.anon.HandleMouseEnterDate
import typings.vueNiceDates.anon.HoveredDate
import typings.vueNiceDates.anon.OmitDateRangePickerPropsi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateRangePickerCalendarMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VueConstructor * / any */ trait DateRangePickerCalendar extends StObject {
    
    var computed: DisplayedEndDate
    
    def date(): HoveredDate
    
    var methods: HandleMouseEnterDate
    
    var props: OmitDateRangePickerPropsi
    
    var watch: StringDictionary[js.Function1[/* date */ String, Unit]]
  }
  object DateRangePickerCalendar {
    
    @JSImport("vue-nice-dates/DateRangePickerCalendar", "DateRangePickerCalendar")
    @js.native
    val ^ : DateRangePickerCalendar = js.native
    
    extension [Self <: DateRangePickerCalendar](x: Self) {
      
      inline def setComputed(value: DisplayedEndDate): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
      
      inline def setDate(value: () => HoveredDate): Self = StObject.set(x, "date", js.Any.fromFunction0(value))
      
      inline def setMethods(value: HandleMouseEnterDate): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setProps(value: OmitDateRangePickerPropsi): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setWatch(value: StringDictionary[js.Function1[/* date */ String, Unit]]): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
    }
  }
}
