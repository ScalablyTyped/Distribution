package typings
package wonderDashFrpLib.distCommonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "DoObserver")
@js.native
class DoObserver protected ()
  extends wonderDashFrpLib.distCommonjsObserverDoObserverMod.DoObserver {
  def this(currentObserver: wonderDashFrpLib.distCommonjsObserverIObserverMod.IObserver, prevObserver: wonderDashFrpLib.distCommonjsObserverIObserverMod.IObserver) = this()
}

@JSImport("wonder-frp/dist/commonjs", "DoObserver")
@js.native
object DoObserver extends js.Object {
  def create(
    currentObserver: wonderDashFrpLib.distCommonjsObserverIObserverMod.IObserver,
    prevObserver: wonderDashFrpLib.distCommonjsObserverIObserverMod.IObserver
  ): wonderDashFrpLib.distCommonjsObserverDoObserverMod.DoObserver = js.native
}

