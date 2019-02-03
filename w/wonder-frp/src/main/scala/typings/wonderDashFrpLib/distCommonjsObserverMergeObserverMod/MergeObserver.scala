package typings
package wonderDashFrpLib.distCommonjsObserverMergeObserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/observer/MergeObserver", "MergeObserver")
@js.native
class MergeObserver protected ()
  extends wonderDashFrpLib.distCommonjsCoreObserverMod.Observer {
  def this(currentObserver: wonderDashFrpLib.distCommonjsObserverIObserverMod.IObserver, maxConcurrent: scala.Double, groupDisposable: wonderDashFrpLib.distCommonjsDisposableGroupDisposableMod.GroupDisposable) = this()
  var _groupDisposable: js.Any = js.native
  var _maxConcurrent: js.Any = js.native
  var activeCount: scala.Double = js.native
  var currentObserver: wonderDashFrpLib.distCommonjsObserverIObserverMod.IObserver = js.native
  var done: scala.Boolean = js.native
  var q: js.Array[wonderDashFrpLib.distCommonjsCoreStreamMod.Stream] = js.native
  /* private */ def _isNotReachMaxConcurrent(): js.Any = js.native
  def handleSubscribe(innerSource: js.Any): scala.Unit = js.native
}

/* static members */
@JSImport("wonder-frp/dist/commonjs/observer/MergeObserver", "MergeObserver")
@js.native
object MergeObserver extends js.Object {
  def create(
    currentObserver: wonderDashFrpLib.distCommonjsObserverIObserverMod.IObserver,
    maxConcurrent: scala.Double,
    groupDisposable: wonderDashFrpLib.distCommonjsDisposableGroupDisposableMod.GroupDisposable
  ): wonderDashFrpLib.distCommonjsObserverMergeObserverMod.MergeObserver = js.native
}

