package typings
package wonderDashFrpLib.distCommonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "MergeObserver")
@js.native
class MergeObserver protected ()
  extends wonderDashFrpLib.distCommonjsObserverMergeObserverMod.MergeObserver {
  def this(currentObserver: wonderDashFrpLib.distCommonjsObserverIObserverMod.IObserver, maxConcurrent: scala.Double, groupDisposable: wonderDashFrpLib.distCommonjsDisposableGroupDisposableMod.GroupDisposable) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "MergeObserver")
@js.native
object MergeObserver extends js.Object {
  def create(
    currentObserver: wonderDashFrpLib.distCommonjsObserverIObserverMod.IObserver,
    maxConcurrent: scala.Double,
    groupDisposable: wonderDashFrpLib.distCommonjsDisposableGroupDisposableMod.GroupDisposable
  ): wonderDashFrpLib.distCommonjsObserverMergeObserverMod.MergeObserver = js.native
}

