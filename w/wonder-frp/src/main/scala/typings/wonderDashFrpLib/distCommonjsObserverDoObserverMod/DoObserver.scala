package typings
package wonderDashFrpLib.distCommonjsObserverDoObserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/observer/DoObserver", "DoObserver")
@js.native
class DoObserver protected ()
  extends wonderDashFrpLib.distCommonjsCoreObserverMod.Observer {
  def this(currentObserver: wonderDashFrpLib.distCommonjsObserverIObserverMod.IObserver, prevObserver: wonderDashFrpLib.distCommonjsObserverIObserverMod.IObserver) = this()
  var _currentObserver: js.Any = js.native
  var _prevObserver: js.Any = js.native
}

/* static members */
@JSImport("wonder-frp/dist/commonjs/observer/DoObserver", "DoObserver")
@js.native
object DoObserver extends js.Object {
  def create(
    currentObserver: wonderDashFrpLib.distCommonjsObserverIObserverMod.IObserver,
    prevObserver: wonderDashFrpLib.distCommonjsObserverIObserverMod.IObserver
  ): wonderDashFrpLib.distCommonjsObserverDoObserverMod.DoObserver = js.native
}

