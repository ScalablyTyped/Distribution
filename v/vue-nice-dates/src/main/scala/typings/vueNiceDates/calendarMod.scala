package typings.vueNiceDates

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.vue.vueMod.Vue
import typings.vue.vueMod.VueConstructor
import typings.vueNiceDates.anon.Date
import typings.vueNiceDates.anon.GetGridType
import typings.vueNiceDates.anon.GridType
import typings.vueNiceDates.anon.MergedModifiers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vue-nice-dates/Calendar", JSImport.Namespace)
@js.native
object calendarMod extends js.Object {
  
  @js.native
  trait Calendar extends VueConstructor[Vue] {
    
    var computed: MergedModifiers = js.native
    
    def data(): GridType = js.native
    
    var methods: GetGridType = js.native
    
    var props: Date = js.native
    
    var watch: StringDictionary[
        js.Function2[
          /* newValue */ typings.std.Date | String, 
          /* oldValue */ typings.std.Date | String, 
          Unit
        ]
      ] = js.native
  }
  @js.native
  object Calendar extends TopLevel[Calendar]
}
