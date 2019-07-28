package typings.wonderDashFrp.distCommonjsMod

import typings.wonderDashFrp.distCommonjsObserverIObserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "MapObserver")
@js.native
class MapObserver protected ()
  extends typings.wonderDashFrp.distCommonjsObserverMapObserverMod.MapObserver {
  def this(currentObserver: IObserver, selector: js.Function) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "MapObserver")
@js.native
object MapObserver extends js.Object {
  def create(currentObserver: IObserver, selector: js.Function): typings.wonderDashFrp.distCommonjsObserverMapObserverMod.MapObserver = js.native
}

