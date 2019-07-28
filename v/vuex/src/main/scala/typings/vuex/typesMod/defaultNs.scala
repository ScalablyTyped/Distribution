package typings.vuex.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vuex/types", JSImport.Default)
@js.native
object defaultNs extends js.Object {
  @js.native
  class Store[S] protected ()
    extends typings.vuex.typesMod.Store[S] {
    def this(options: StoreOptions[/* import warning: RewrittenClass.unapply cls $anonfun was tparam S */ _]) = this()
  }
  
}

