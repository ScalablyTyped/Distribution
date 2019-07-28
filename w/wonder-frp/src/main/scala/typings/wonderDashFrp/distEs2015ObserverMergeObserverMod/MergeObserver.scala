package typings.wonderDashFrp.distEs2015ObserverMergeObserverMod

import typings.wonderDashFrp.distEs2015CoreObserverMod.Observer
import typings.wonderDashFrp.distEs2015CoreStreamMod.Stream
import typings.wonderDashFrp.distEs2015DisposableGroupDisposableMod.GroupDisposable
import typings.wonderDashFrp.distEs2015ObserverIObserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/observer/MergeObserver", "MergeObserver")
@js.native
class MergeObserver protected () extends Observer {
  def this(currentObserver: IObserver, maxConcurrent: Double, groupDisposable: GroupDisposable) = this()
  var _groupDisposable: js.Any = js.native
  var _maxConcurrent: js.Any = js.native
  var activeCount: Double = js.native
  var currentObserver: IObserver = js.native
  var done: Boolean = js.native
  var q: js.Array[Stream] = js.native
  /* private */ def _isNotReachMaxConcurrent(): js.Any = js.native
  def handleSubscribe(innerSource: js.Any): Unit = js.native
}

/* static members */
@JSImport("wonder-frp/dist/es2015/observer/MergeObserver", "MergeObserver")
@js.native
object MergeObserver extends js.Object {
  def create(currentObserver: IObserver, maxConcurrent: Double, groupDisposable: GroupDisposable): MergeObserver = js.native
}

