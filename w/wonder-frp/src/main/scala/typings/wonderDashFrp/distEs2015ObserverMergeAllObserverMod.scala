package typings.wonderDashFrp

import typings.wonderDashFrp.distEs2015CoreObserverMod.Observer
import typings.wonderDashFrp.distEs2015DisposableGroupDisposableMod.GroupDisposable
import typings.wonderDashFrp.distEs2015ObserverIObserverMod.IObserver
import typings.wonderDashFrp.distEs2015ObserverMergeAllObserverMod.MergeAllObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/observer/MergeAllObserver", JSImport.Namespace)
@js.native
object distEs2015ObserverMergeAllObserverMod extends js.Object {
  @js.native
  class MergeAllObserver protected () extends Observer {
    def this(currentObserver: IObserver, groupDisposable: GroupDisposable) = this()
    var _groupDisposable: js.Any = js.native
    var currentObserver: IObserver = js.native
    var done: Boolean = js.native
  }
  
  /* static members */
  @js.native
  object MergeAllObserver extends js.Object {
    def create(currentObserver: IObserver, groupDisposable: GroupDisposable): MergeAllObserver = js.native
  }
  
}

