package typings.vueNiceDates

import typings.vue.vueMod.Vue
import typings.vue.vueMod.VueConstructor
import typings.vueNiceDates.anon.ChangeLastValidDate
import typings.vueNiceDates.anon.IsFocus
import typings.vueNiceDates.anon.LastValidDate
import typings.vueNiceDates.sharedMod.DatePickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datePickerMod {
  
  @js.native
  trait DatePicker extends VueConstructor[Vue] {
    
    def date(): LastValidDate = js.native
    
    var methods: ChangeLastValidDate = js.native
    
    var props: DatePickerProps = js.native
    
    var watch: IsFocus = js.native
  }
  @JSImport("vue-nice-dates/DatePicker", "DatePicker")
  @js.native
  val DatePicker: typings.vueNiceDates.datePickerMod.DatePicker = js.native
}
