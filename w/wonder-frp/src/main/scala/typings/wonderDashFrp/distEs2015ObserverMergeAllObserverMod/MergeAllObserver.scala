package typings.wonderDashFrp.distEs2015ObserverMergeAllObserverMod

import typings.wonderDashFrp.distEs2015CoreObserverMod.Observer
import typings.wonderDashFrp.distEs2015DisposableGroupDisposableMod.GroupDisposable
import typings.wonderDashFrp.distEs2015ObserverIObserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/observer/MergeAllObserver", "MergeAllObserver")
@js.native
class MergeAllObserver protected () extends Observer {
  def this(currentObserver: IObserver, groupDisposable: GroupDisposable) = this()
  var _groupDisposable: js.Any = js.native
  var currentObserver: IObserver = js.native
  var done: Boolean = js.native
}

/* static members */
@JSImport("wonder-frp/dist/es2015/observer/MergeAllObserver", "MergeAllObserver")
@js.native
object MergeAllObserver extends js.Object {
  def create(currentObserver: IObserver, groupDisposable: GroupDisposable): MergeAllObserver = js.native
}

