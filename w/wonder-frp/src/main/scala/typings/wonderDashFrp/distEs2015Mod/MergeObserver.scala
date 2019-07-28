package typings.wonderDashFrp.distEs2015Mod

import typings.wonderDashFrp.distEs2015ObserverIObserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "MergeObserver")
@js.native
class MergeObserver protected ()
  extends typings.wonderDashFrp.distEs2015ObserverMergeObserverMod.MergeObserver {
  def this(
    currentObserver: IObserver,
    maxConcurrent: Double,
    groupDisposable: typings.wonderDashFrp.distEs2015DisposableGroupDisposableMod.GroupDisposable
  ) = this()
}

/* static members */
@JSImport("wonder-frp/dist/es2015", "MergeObserver")
@js.native
object MergeObserver extends js.Object {
  def create(
    currentObserver: IObserver,
    maxConcurrent: Double,
    groupDisposable: typings.wonderDashFrp.distEs2015DisposableGroupDisposableMod.GroupDisposable
  ): typings.wonderDashFrp.distEs2015ObserverMergeObserverMod.MergeObserver = js.native
}

