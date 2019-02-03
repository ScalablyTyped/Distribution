package typings
package wonderDashFrpLib.distCommonjsCoreSchedulerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/core/Scheduler", "Scheduler")
@js.native
class Scheduler () extends js.Object {
  var _requestLoopId: js.Any = js.native
  var requestLoopId: js.Any = js.native
  def publishInterval(
    observer: wonderDashFrpLib.distCommonjsObserverIObserverMod.IObserver,
    initial: js.Any,
    interval: scala.Double,
    action: js.Function
  ): scala.Double = js.native
  def publishIntervalRequest(observer: wonderDashFrpLib.distCommonjsObserverIObserverMod.IObserver, action: js.Function): scala.Unit = js.native
  def publishRecursive(
    observer: wonderDashFrpLib.distCommonjsObserverIObserverMod.IObserver,
    initial: js.Any,
    action: js.Function
  ): scala.Unit = js.native
  def publishTimeout(
    observer: wonderDashFrpLib.distCommonjsObserverIObserverMod.IObserver,
    time: scala.Double,
    action: js.Function
  ): scala.Double = js.native
}

/* static members */
@JSImport("wonder-frp/dist/commonjs/core/Scheduler", "Scheduler")
@js.native
object Scheduler extends js.Object {
  def create(args: js.Any*): wonderDashFrpLib.distCommonjsCoreSchedulerMod.Scheduler = js.native
}

