package typings
package wonderDashFrpLib.distCommonjsObserverMapObserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/observer/MapObserver", "MapObserver")
@js.native
class MapObserver protected ()
  extends wonderDashFrpLib.distCommonjsCoreObserverMod.Observer {
  def this(currentObserver: wonderDashFrpLib.distCommonjsObserverIObserverMod.IObserver, selector: js.Function) = this()
  var _currentObserver: js.Any = js.native
  var _selector: js.Any = js.native
}

@JSImport("wonder-frp/dist/commonjs/observer/MapObserver", "MapObserver")
@js.native
object MapObserver extends js.Object {
  def create(
    currentObserver: wonderDashFrpLib.distCommonjsObserverIObserverMod.IObserver,
    selector: js.Function
  ): wonderDashFrpLib.distCommonjsObserverMapObserverMod.MapObserver = js.native
}

