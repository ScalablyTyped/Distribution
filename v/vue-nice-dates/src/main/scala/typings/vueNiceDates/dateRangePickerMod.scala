package typings.vueNiceDates

import typings.vueNiceDates.anon.ChangeLastValidEndDate
import typings.vueNiceDates.anon.EndDate
import typings.vueNiceDates.anon.HasTouchedEndDate
import typings.vueNiceDates.sharedMod.DateRangePickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateRangePickerMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VueConstructor * / any */ trait DateRangePicker extends StObject {
    
    def date(): HasTouchedEndDate
    
    var methods: ChangeLastValidEndDate
    
    var props: DateRangePickerProps
    
    var watch: EndDate
  }
  object DateRangePicker {
    
    @JSImport("vue-nice-dates/DateRangePicker", "DateRangePicker")
    @js.native
    val ^ : DateRangePicker = js.native
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DateRangePicker] (val x: Self) extends AnyVal {
      
      inline def setDate(value: () => HasTouchedEndDate): Self = StObject.set(x, "date", js.Any.fromFunction0(value))
      
      inline def setMethods(value: ChangeLastValidEndDate): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setProps(value: DateRangePickerProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setWatch(value: EndDate): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
    }
  }
}
