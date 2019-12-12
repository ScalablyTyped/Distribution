package typings.vuex

import typings.vuex.vuexMod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vue/types/vue", JSImport.Namespace)
@js.native
object typesVueMod extends js.Object {
  @js.native
  trait Vue extends js.Object {
    @JSName("$store")
    var $store: Store[_] = js.native
  }
  
}

