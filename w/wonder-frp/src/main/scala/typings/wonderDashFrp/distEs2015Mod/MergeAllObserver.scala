package typings.wonderDashFrp.distEs2015Mod

import typings.wonderDashFrp.distEs2015ObserverIObserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "MergeAllObserver")
@js.native
class MergeAllObserver protected ()
  extends typings.wonderDashFrp.distEs2015ObserverMergeAllObserverMod.MergeAllObserver {
  def this(
    currentObserver: IObserver,
    groupDisposable: typings.wonderDashFrp.distEs2015DisposableGroupDisposableMod.GroupDisposable
  ) = this()
}

/* static members */
@JSImport("wonder-frp/dist/es2015", "MergeAllObserver")
@js.native
object MergeAllObserver extends js.Object {
  def create(
    currentObserver: IObserver,
    groupDisposable: typings.wonderDashFrp.distEs2015DisposableGroupDisposableMod.GroupDisposable
  ): typings.wonderDashFrp.distEs2015ObserverMergeAllObserverMod.MergeAllObserver = js.native
}

