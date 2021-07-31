package typings.wonderFrp.es2015Mod

import typings.wonderFrp.observerIobserverMod.IObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/es2015", "MergeObserver")
@js.native
class MergeObserver protected ()
  extends typings.wonderFrp.observerMergeObserverMod.MergeObserver {
  def this(
    currentObserver: IObserver,
    maxConcurrent: Double,
    groupDisposable: typings.wonderFrp.disposableGroupDisposableMod.GroupDisposable
  ) = this()
}
/* static members */
object MergeObserver {
  
  @JSImport("wonder-frp/dist/es2015", "MergeObserver")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def create(
    currentObserver: IObserver,
    maxConcurrent: Double,
    groupDisposable: typings.wonderFrp.disposableGroupDisposableMod.GroupDisposable
  ): typings.wonderFrp.observerMergeObserverMod.MergeObserver = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(currentObserver.asInstanceOf[js.Any], maxConcurrent.asInstanceOf[js.Any], groupDisposable.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.observerMergeObserverMod.MergeObserver]
}
