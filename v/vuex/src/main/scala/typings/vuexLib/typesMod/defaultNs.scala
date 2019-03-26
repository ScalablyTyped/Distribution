package typings
package vuexLib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vuex/types", JSImport.Default)
@js.native
object defaultNs extends js.Object {
  @js.native
  class Store[S] protected ()
    extends vuexLib.typesMod.Store[S] {
    def this(options: vuexLib.typesMod.StoreOptions[/* import warning: RewrittenClass.unapply cls $anonfun was tparam S */ _]) = this()
  }
  
}

