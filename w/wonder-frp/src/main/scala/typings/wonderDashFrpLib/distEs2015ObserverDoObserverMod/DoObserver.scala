package typings
package wonderDashFrpLib.distEs2015ObserverDoObserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/observer/DoObserver", "DoObserver")
@js.native
class DoObserver protected ()
  extends wonderDashFrpLib.distEs2015CoreObserverMod.Observer {
  def this(currentObserver: wonderDashFrpLib.distEs2015ObserverIObserverMod.IObserver, prevObserver: wonderDashFrpLib.distEs2015ObserverIObserverMod.IObserver) = this()
  var _currentObserver: js.Any = js.native
  var _prevObserver: js.Any = js.native
}

/* static members */
@JSImport("wonder-frp/dist/es2015/observer/DoObserver", "DoObserver")
@js.native
object DoObserver extends js.Object {
  def create(
    currentObserver: wonderDashFrpLib.distEs2015ObserverIObserverMod.IObserver,
    prevObserver: wonderDashFrpLib.distEs2015ObserverIObserverMod.IObserver
  ): wonderDashFrpLib.distEs2015ObserverDoObserverMod.DoObserver = js.native
}

