package typings.vueNiceDates

import typings.vue.vueMod.Vue
import typings.vue.vueMod.VueConstructor
import typings.vueNiceDates.anon.ChangeLastValidEndDate
import typings.vueNiceDates.anon.EndDate
import typings.vueNiceDates.anon.HasTouchedEndDate
import typings.vueNiceDates.sharedMod.DateRangePickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateRangePickerMod {
  
  @js.native
  trait DateRangePicker extends VueConstructor[Vue] {
    
    def date(): HasTouchedEndDate = js.native
    
    var methods: ChangeLastValidEndDate = js.native
    
    var props: DateRangePickerProps = js.native
    
    var watch: EndDate = js.native
  }
  @JSImport("vue-nice-dates/DateRangePicker", "DateRangePicker")
  @js.native
  val DateRangePicker: typings.vueNiceDates.dateRangePickerMod.DateRangePicker = js.native
}
