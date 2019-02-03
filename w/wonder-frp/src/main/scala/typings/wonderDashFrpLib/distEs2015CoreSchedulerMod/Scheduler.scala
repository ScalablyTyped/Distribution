package typings
package wonderDashFrpLib.distEs2015CoreSchedulerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/core/Scheduler", "Scheduler")
@js.native
class Scheduler () extends js.Object {
  var _requestLoopId: js.Any = js.native
  var requestLoopId: js.Any = js.native
  def publishInterval(
    observer: wonderDashFrpLib.distEs2015ObserverIObserverMod.IObserver,
    initial: js.Any,
    interval: scala.Double,
    action: js.Function
  ): scala.Double = js.native
  def publishIntervalRequest(observer: wonderDashFrpLib.distEs2015ObserverIObserverMod.IObserver, action: js.Function): scala.Unit = js.native
  def publishRecursive(
    observer: wonderDashFrpLib.distEs2015ObserverIObserverMod.IObserver,
    initial: js.Any,
    action: js.Function
  ): scala.Unit = js.native
  def publishTimeout(
    observer: wonderDashFrpLib.distEs2015ObserverIObserverMod.IObserver,
    time: scala.Double,
    action: js.Function
  ): scala.Double = js.native
}

/* static members */
@JSImport("wonder-frp/dist/es2015/core/Scheduler", "Scheduler")
@js.native
object Scheduler extends js.Object {
  def create(args: js.Any*): wonderDashFrpLib.distEs2015CoreSchedulerMod.Scheduler = js.native
}

