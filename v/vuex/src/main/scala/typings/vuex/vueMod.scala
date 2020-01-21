package typings.vuex

import typings.vuex.mod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vue/types/vue", JSImport.Namespace)
@js.native
object vueMod extends js.Object {
  @js.native
  trait Vue extends js.Object {
    @JSName("$store")
    var $store: Store[_] = js.native
  }
  
}

