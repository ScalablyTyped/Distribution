package typings.wonderDashFrp.distCommonjsMod

import typings.wonderDashFrp.distCommonjsObserverIObserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "MergeAllObserver")
@js.native
class MergeAllObserver protected ()
  extends typings.wonderDashFrp.distCommonjsObserverMergeAllObserverMod.MergeAllObserver {
  def this(
    currentObserver: IObserver,
    groupDisposable: typings.wonderDashFrp.distCommonjsDisposableGroupDisposableMod.GroupDisposable
  ) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "MergeAllObserver")
@js.native
object MergeAllObserver extends js.Object {
  def create(
    currentObserver: IObserver,
    groupDisposable: typings.wonderDashFrp.distCommonjsDisposableGroupDisposableMod.GroupDisposable
  ): typings.wonderDashFrp.distCommonjsObserverMergeAllObserverMod.MergeAllObserver = js.native
}

