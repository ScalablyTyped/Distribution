package typings.vueNiceDates

import org.scalablytyped.runtime.StringDictionary
import typings.vue.vueMod.Vue
import typings.vue.vueMod.VueConstructor
import typings.vueNiceDates.anon.DisplayedEndDate
import typings.vueNiceDates.anon.HandleMouseEnterDate
import typings.vueNiceDates.anon.HoveredDate
import typings.vueNiceDates.anon.OmitDateRangePickerPropsi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateRangePickerCalendarMod {
  
  @js.native
  trait DateRangePickerCalendar extends VueConstructor[Vue] {
    
    var computed: DisplayedEndDate = js.native
    
    def date(): HoveredDate = js.native
    
    var methods: HandleMouseEnterDate = js.native
    
    var props: OmitDateRangePickerPropsi = js.native
    
    var watch: StringDictionary[js.Function1[/* date */ String, Unit]] = js.native
  }
  @JSImport("vue-nice-dates/DateRangePickerCalendar", "DateRangePickerCalendar")
  @js.native
  val DateRangePickerCalendar: typings.vueNiceDates.dateRangePickerCalendarMod.DateRangePickerCalendar = js.native
}
