package typings.vueNiceDates

import typings.vueNiceDates.anon.ChangeLastValidDate
import typings.vueNiceDates.anon.IsFocus
import typings.vueNiceDates.anon.LastValidDate
import typings.vueNiceDates.sharedMod.DatePickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datePickerMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VueConstructor * / any */ trait DatePicker extends StObject {
    
    def date(): LastValidDate
    
    var methods: ChangeLastValidDate
    
    var props: DatePickerProps
    
    var watch: IsFocus
  }
  object DatePicker {
    
    @JSImport("vue-nice-dates/DatePicker", "DatePicker")
    @js.native
    val ^ : DatePicker = js.native
    
    extension [Self <: DatePicker](x: Self) {
      
      inline def setDate(value: () => LastValidDate): Self = StObject.set(x, "date", js.Any.fromFunction0(value))
      
      inline def setMethods(value: ChangeLastValidDate): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setProps(value: DatePickerProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setWatch(value: IsFocus): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
    }
  }
}
