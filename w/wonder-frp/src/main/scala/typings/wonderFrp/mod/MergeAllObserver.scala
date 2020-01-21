package typings.wonderFrp.mod

import typings.wonderFrp.iobserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "MergeAllObserver")
@js.native
class MergeAllObserver protected ()
  extends typings.wonderFrp.mergeAllObserverMod.MergeAllObserver {
  def this(currentObserver: IObserver, groupDisposable: typings.wonderFrp.groupDisposableMod.GroupDisposable) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "MergeAllObserver")
@js.native
object MergeAllObserver extends js.Object {
  def create(currentObserver: IObserver, groupDisposable: typings.wonderFrp.groupDisposableMod.GroupDisposable): typings.wonderFrp.mergeAllObserverMod.MergeAllObserver = js.native
}

