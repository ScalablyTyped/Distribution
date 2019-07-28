package typings.wonderDashFrp.distCommonjsObserverMapObserverMod

import typings.wonderDashFrp.distCommonjsCoreObserverMod.Observer
import typings.wonderDashFrp.distCommonjsObserverIObserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/observer/MapObserver", "MapObserver")
@js.native
class MapObserver protected () extends Observer {
  def this(currentObserver: IObserver, selector: js.Function) = this()
  var _currentObserver: js.Any = js.native
  var _selector: js.Any = js.native
}

/* static members */
@JSImport("wonder-frp/dist/commonjs/observer/MapObserver", "MapObserver")
@js.native
object MapObserver extends js.Object {
  def create(currentObserver: IObserver, selector: js.Function): MapObserver = js.native
}

