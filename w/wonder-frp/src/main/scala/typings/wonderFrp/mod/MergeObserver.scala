package typings.wonderFrp.mod

import typings.wonderFrp.iobserverMod.IObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/commonjs", "MergeObserver")
@js.native
class MergeObserver protected ()
  extends typings.wonderFrp.mergeObserverMod.MergeObserver {
  def this(
    currentObserver: IObserver,
    maxConcurrent: Double,
    groupDisposable: typings.wonderFrp.groupDisposableMod.GroupDisposable
  ) = this()
}
/* static members */
object MergeObserver {
  
  @JSImport("wonder-frp/dist/commonjs", "MergeObserver")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def create(
    currentObserver: IObserver,
    maxConcurrent: Double,
    groupDisposable: typings.wonderFrp.groupDisposableMod.GroupDisposable
  ): typings.wonderFrp.mergeObserverMod.MergeObserver = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(currentObserver.asInstanceOf[js.Any], maxConcurrent.asInstanceOf[js.Any], groupDisposable.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.mergeObserverMod.MergeObserver]
}
