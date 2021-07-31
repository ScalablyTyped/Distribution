package typings.wonderFrp.mod

import typings.wonderFrp.iobserverMod.IObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/commonjs", "MergeAllObserver")
@js.native
class MergeAllObserver protected ()
  extends typings.wonderFrp.mergeAllObserverMod.MergeAllObserver {
  def this(currentObserver: IObserver, groupDisposable: typings.wonderFrp.groupDisposableMod.GroupDisposable) = this()
}
/* static members */
object MergeAllObserver {
  
  @JSImport("wonder-frp/dist/commonjs", "MergeAllObserver")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def create(currentObserver: IObserver, groupDisposable: typings.wonderFrp.groupDisposableMod.GroupDisposable): typings.wonderFrp.mergeAllObserverMod.MergeAllObserver = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(currentObserver.asInstanceOf[js.Any], groupDisposable.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.mergeAllObserverMod.MergeAllObserver]
}
