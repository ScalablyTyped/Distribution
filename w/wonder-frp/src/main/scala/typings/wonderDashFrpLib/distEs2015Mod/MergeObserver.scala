package typings
package wonderDashFrpLib.distEs2015Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "MergeObserver")
@js.native
class MergeObserver protected ()
  extends wonderDashFrpLib.distEs2015ObserverMergeObserverMod.MergeObserver {
  def this(currentObserver: wonderDashFrpLib.distEs2015ObserverIObserverMod.IObserver, maxConcurrent: scala.Double, groupDisposable: wonderDashFrpLib.distEs2015DisposableGroupDisposableMod.GroupDisposable) = this()
}

/* static members */
@JSImport("wonder-frp/dist/es2015", "MergeObserver")
@js.native
object MergeObserver extends js.Object {
  def create(
    currentObserver: wonderDashFrpLib.distEs2015ObserverIObserverMod.IObserver,
    maxConcurrent: scala.Double,
    groupDisposable: wonderDashFrpLib.distEs2015DisposableGroupDisposableMod.GroupDisposable
  ): wonderDashFrpLib.distEs2015ObserverMergeObserverMod.MergeObserver = js.native
}

