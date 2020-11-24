package typings.vueNiceDates

import org.scalablytyped.runtime.TopLevel
import typings.vue.vueMod.Vue
import typings.vue.vueMod.VueConstructor
import typings.vueNiceDates.anon.ChangeLastValidEndDate
import typings.vueNiceDates.anon.EndDate
import typings.vueNiceDates.anon.HasTouchedEndDate
import typings.vueNiceDates.sharedMod.DateRangePickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vue-nice-dates/DateRangePicker", JSImport.Namespace)
@js.native
object dateRangePickerMod extends js.Object {
  
  @js.native
  trait DateRangePicker extends VueConstructor[Vue] {
    
    def date(): HasTouchedEndDate = js.native
    
    var methods: ChangeLastValidEndDate = js.native
    
    var props: DateRangePickerProps = js.native
    
    var watch: EndDate = js.native
  }
  @js.native
  object DateRangePicker extends TopLevel[DateRangePicker]
}
