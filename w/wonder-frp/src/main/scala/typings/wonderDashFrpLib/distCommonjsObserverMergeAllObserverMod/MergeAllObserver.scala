package typings
package wonderDashFrpLib.distCommonjsObserverMergeAllObserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/observer/MergeAllObserver", "MergeAllObserver")
@js.native
class MergeAllObserver protected ()
  extends wonderDashFrpLib.distCommonjsCoreObserverMod.Observer {
  def this(currentObserver: wonderDashFrpLib.distCommonjsObserverIObserverMod.IObserver, groupDisposable: wonderDashFrpLib.distCommonjsDisposableGroupDisposableMod.GroupDisposable) = this()
  var _groupDisposable: js.Any = js.native
  var currentObserver: wonderDashFrpLib.distCommonjsObserverIObserverMod.IObserver = js.native
  var done: scala.Boolean = js.native
}

@JSImport("wonder-frp/dist/commonjs/observer/MergeAllObserver", "MergeAllObserver")
@js.native
object MergeAllObserver extends js.Object {
  def create(
    currentObserver: wonderDashFrpLib.distCommonjsObserverIObserverMod.IObserver,
    groupDisposable: wonderDashFrpLib.distCommonjsDisposableGroupDisposableMod.GroupDisposable
  ): wonderDashFrpLib.distCommonjsObserverMergeAllObserverMod.MergeAllObserver = js.native
}

