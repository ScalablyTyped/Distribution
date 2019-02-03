package typings
package wonderDashFrpLib.distEs2015ObserverMergeObserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/observer/MergeObserver", "MergeObserver")
@js.native
class MergeObserver protected ()
  extends wonderDashFrpLib.distEs2015CoreObserverMod.Observer {
  def this(currentObserver: wonderDashFrpLib.distEs2015ObserverIObserverMod.IObserver, maxConcurrent: scala.Double, groupDisposable: wonderDashFrpLib.distEs2015DisposableGroupDisposableMod.GroupDisposable) = this()
  var _groupDisposable: js.Any = js.native
  var _maxConcurrent: js.Any = js.native
  var activeCount: scala.Double = js.native
  var currentObserver: wonderDashFrpLib.distEs2015ObserverIObserverMod.IObserver = js.native
  var done: scala.Boolean = js.native
  var q: js.Array[wonderDashFrpLib.distEs2015CoreStreamMod.Stream] = js.native
  /* private */ def _isNotReachMaxConcurrent(): js.Any = js.native
  def handleSubscribe(innerSource: js.Any): scala.Unit = js.native
}

/* static members */
@JSImport("wonder-frp/dist/es2015/observer/MergeObserver", "MergeObserver")
@js.native
object MergeObserver extends js.Object {
  def create(
    currentObserver: wonderDashFrpLib.distEs2015ObserverIObserverMod.IObserver,
    maxConcurrent: scala.Double,
    groupDisposable: wonderDashFrpLib.distEs2015DisposableGroupDisposableMod.GroupDisposable
  ): wonderDashFrpLib.distEs2015ObserverMergeObserverMod.MergeObserver = js.native
}

