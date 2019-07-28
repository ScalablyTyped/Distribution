package typings.wonderDashFrp.distCommonjsObserverMergeAllObserverMod

import typings.wonderDashFrp.distCommonjsCoreObserverMod.Observer
import typings.wonderDashFrp.distCommonjsDisposableGroupDisposableMod.GroupDisposable
import typings.wonderDashFrp.distCommonjsObserverIObserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/observer/MergeAllObserver", "MergeAllObserver")
@js.native
class MergeAllObserver protected () extends Observer {
  def this(currentObserver: IObserver, groupDisposable: GroupDisposable) = this()
  var _groupDisposable: js.Any = js.native
  var currentObserver: IObserver = js.native
  var done: Boolean = js.native
}

/* static members */
@JSImport("wonder-frp/dist/commonjs/observer/MergeAllObserver", "MergeAllObserver")
@js.native
object MergeAllObserver extends js.Object {
  def create(currentObserver: IObserver, groupDisposable: GroupDisposable): MergeAllObserver = js.native
}

