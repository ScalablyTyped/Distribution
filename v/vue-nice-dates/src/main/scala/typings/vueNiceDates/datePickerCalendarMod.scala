package typings.vueNiceDates

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.std.Date
import typings.vue.vueMod.Vue
import typings.vue.vueMod.VueConstructor
import typings.vueNiceDates.anon.HandleClickDate
import typings.vueNiceDates.anon.OmitDatePickerPropsisFocu
import typings.vueNiceDates.anon.ReceivedDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vue-nice-dates/DatePickerCalendar", JSImport.Namespace)
@js.native
object datePickerCalendarMod extends js.Object {
  
  @js.native
  trait DatePickerCalendar extends VueConstructor[Vue] {
    
    def date(): ReceivedDate = js.native
    
    var methods: HandleClickDate = js.native
    
    var props: OmitDatePickerPropsisFocu = js.native
    
    var watch: StringDictionary[js.Function1[/* date */ Date, Unit]] = js.native
  }
  @js.native
  object DatePickerCalendar extends TopLevel[DatePickerCalendar]
}
