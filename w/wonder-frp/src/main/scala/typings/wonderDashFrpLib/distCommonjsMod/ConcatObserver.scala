package typings
package wonderDashFrpLib.distCommonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "ConcatObserver")
@js.native
class ConcatObserver protected ()
  extends wonderDashFrpLib.distCommonjsObserverConcatObserverMod.ConcatObserver {
  def this(currentObserver: wonderDashFrpLib.distCommonjsObserverIObserverMod.IObserver, startNextStream: js.Function) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "ConcatObserver")
@js.native
object ConcatObserver extends js.Object {
  def create(
    currentObserver: wonderDashFrpLib.distCommonjsObserverIObserverMod.IObserver,
    startNextStream: js.Function
  ): wonderDashFrpLib.distCommonjsObserverConcatObserverMod.ConcatObserver = js.native
}

