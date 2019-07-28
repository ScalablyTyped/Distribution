package typings.wonderDashFrp.distCommonjsMod

import typings.wonderDashFrp.distCommonjsObserverIObserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "MergeObserver")
@js.native
class MergeObserver protected ()
  extends typings.wonderDashFrp.distCommonjsObserverMergeObserverMod.MergeObserver {
  def this(
    currentObserver: IObserver,
    maxConcurrent: Double,
    groupDisposable: typings.wonderDashFrp.distCommonjsDisposableGroupDisposableMod.GroupDisposable
  ) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "MergeObserver")
@js.native
object MergeObserver extends js.Object {
  def create(
    currentObserver: IObserver,
    maxConcurrent: Double,
    groupDisposable: typings.wonderDashFrp.distCommonjsDisposableGroupDisposableMod.GroupDisposable
  ): typings.wonderDashFrp.distCommonjsObserverMergeObserverMod.MergeObserver = js.native
}

