package typings.vueNiceDates

import org.scalablytyped.runtime.TopLevel
import typings.vue.vueMod.Vue
import typings.vue.vueMod.VueConstructor
import typings.vueNiceDates.anon.ChangeLastValidDate
import typings.vueNiceDates.anon.IsFocus
import typings.vueNiceDates.anon.LastValidDate
import typings.vueNiceDates.sharedMod.DatePickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vue-nice-dates/DatePicker", JSImport.Namespace)
@js.native
object datePickerMod extends js.Object {
  
  @js.native
  trait DatePicker extends VueConstructor[Vue] {
    
    def date(): LastValidDate = js.native
    
    var methods: ChangeLastValidDate = js.native
    
    var props: DatePickerProps = js.native
    
    var watch: IsFocus = js.native
  }
  @js.native
  object DatePicker extends TopLevel[DatePicker]
}
