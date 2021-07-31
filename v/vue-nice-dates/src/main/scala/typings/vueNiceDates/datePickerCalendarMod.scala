package typings.vueNiceDates

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import typings.vue.vueMod.Vue
import typings.vue.vueMod.VueConstructor
import typings.vueNiceDates.anon.HandleClickDate
import typings.vueNiceDates.anon.OmitDatePickerPropsisFocu
import typings.vueNiceDates.anon.ReceivedDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datePickerCalendarMod {
  
  @js.native
  trait DatePickerCalendar
    extends StObject
       with VueConstructor[Vue] {
    
    def date(): ReceivedDate = js.native
    
    var methods: HandleClickDate = js.native
    
    var props: OmitDatePickerPropsisFocu = js.native
    
    var watch: StringDictionary[js.Function1[/* date */ Date, Unit]] = js.native
  }
  @JSImport("vue-nice-dates/DatePickerCalendar", "DatePickerCalendar")
  @js.native
  val DatePickerCalendar: typings.vueNiceDates.datePickerCalendarMod.DatePickerCalendar = js.native
}
