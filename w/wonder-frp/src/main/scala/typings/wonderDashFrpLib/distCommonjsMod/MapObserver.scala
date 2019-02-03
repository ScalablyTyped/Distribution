package typings
package wonderDashFrpLib.distCommonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "MapObserver")
@js.native
class MapObserver protected ()
  extends wonderDashFrpLib.distCommonjsObserverMapObserverMod.MapObserver {
  def this(currentObserver: wonderDashFrpLib.distCommonjsObserverIObserverMod.IObserver, selector: js.Function) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "MapObserver")
@js.native
object MapObserver extends js.Object {
  def create(
    currentObserver: wonderDashFrpLib.distCommonjsObserverIObserverMod.IObserver,
    selector: js.Function
  ): wonderDashFrpLib.distCommonjsObserverMapObserverMod.MapObserver = js.native
}

