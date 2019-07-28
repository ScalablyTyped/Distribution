package typings.wonderDashFrp.distEs2015CoreSchedulerMod

import typings.wonderDashFrp.distEs2015ObserverIObserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/core/Scheduler", "Scheduler")
@js.native
class Scheduler () extends js.Object {
  var _requestLoopId: js.Any = js.native
  var requestLoopId: js.Any = js.native
  def publishInterval(observer: IObserver, initial: js.Any, interval: Double, action: js.Function): Double = js.native
  def publishIntervalRequest(observer: IObserver, action: js.Function): Unit = js.native
  def publishRecursive(observer: IObserver, initial: js.Any, action: js.Function): Unit = js.native
  def publishTimeout(observer: IObserver, time: Double, action: js.Function): Double = js.native
}

/* static members */
@JSImport("wonder-frp/dist/es2015/core/Scheduler", "Scheduler")
@js.native
object Scheduler extends js.Object {
  def create(args: js.Any*): Scheduler = js.native
}

