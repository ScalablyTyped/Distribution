package typings.wonderFrp.distCommonjsMod

import typings.wonderFrp.distCommonjsObserverIobserverMod.IObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/commonjs", "MergeObserver")
@js.native
open class MergeObserver protected ()
  extends typings.wonderFrp.distCommonjsObserverMergeObserverMod.MergeObserver {
  def this(
    currentObserver: IObserver,
    maxConcurrent: Double,
    groupDisposable: typings.wonderFrp.distCommonjsDisposableGroupDisposableMod.GroupDisposable
  ) = this()
}
/* static members */
object MergeObserver {
  
  @JSImport("wonder-frp/dist/commonjs", "MergeObserver")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(
    currentObserver: IObserver,
    maxConcurrent: Double,
    groupDisposable: typings.wonderFrp.distCommonjsDisposableGroupDisposableMod.GroupDisposable
  ): typings.wonderFrp.distCommonjsObserverMergeObserverMod.MergeObserver = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(currentObserver.asInstanceOf[js.Any], maxConcurrent.asInstanceOf[js.Any], groupDisposable.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.distCommonjsObserverMergeObserverMod.MergeObserver]
}
