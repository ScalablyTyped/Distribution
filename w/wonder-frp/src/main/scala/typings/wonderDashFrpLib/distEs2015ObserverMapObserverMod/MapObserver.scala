package typings
package wonderDashFrpLib.distEs2015ObserverMapObserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/observer/MapObserver", "MapObserver")
@js.native
class MapObserver protected ()
  extends wonderDashFrpLib.distEs2015CoreObserverMod.Observer {
  def this(currentObserver: wonderDashFrpLib.distEs2015ObserverIObserverMod.IObserver, selector: js.Function) = this()
  var _currentObserver: js.Any = js.native
  var _selector: js.Any = js.native
}

/* static members */
@JSImport("wonder-frp/dist/es2015/observer/MapObserver", "MapObserver")
@js.native
object MapObserver extends js.Object {
  def create(currentObserver: wonderDashFrpLib.distEs2015ObserverIObserverMod.IObserver, selector: js.Function): wonderDashFrpLib.distEs2015ObserverMapObserverMod.MapObserver = js.native
}

