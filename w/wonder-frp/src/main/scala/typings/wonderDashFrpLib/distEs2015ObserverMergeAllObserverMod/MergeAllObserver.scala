package typings
package wonderDashFrpLib.distEs2015ObserverMergeAllObserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/observer/MergeAllObserver", "MergeAllObserver")
@js.native
class MergeAllObserver protected ()
  extends wonderDashFrpLib.distEs2015CoreObserverMod.Observer {
  def this(currentObserver: wonderDashFrpLib.distEs2015ObserverIObserverMod.IObserver, groupDisposable: wonderDashFrpLib.distEs2015DisposableGroupDisposableMod.GroupDisposable) = this()
  var _groupDisposable: js.Any = js.native
  var currentObserver: wonderDashFrpLib.distEs2015ObserverIObserverMod.IObserver = js.native
  var done: scala.Boolean = js.native
}

/* static members */
@JSImport("wonder-frp/dist/es2015/observer/MergeAllObserver", "MergeAllObserver")
@js.native
object MergeAllObserver extends js.Object {
  def create(
    currentObserver: wonderDashFrpLib.distEs2015ObserverIObserverMod.IObserver,
    groupDisposable: wonderDashFrpLib.distEs2015DisposableGroupDisposableMod.GroupDisposable
  ): wonderDashFrpLib.distEs2015ObserverMergeAllObserverMod.MergeAllObserver = js.native
}

