package typings.wonderFrp.distEs2015Mod

import typings.wonderFrp.distEs2015ObserverIobserverMod.IObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/es2015", "MergeObserver")
@js.native
open class MergeObserver protected ()
  extends typings.wonderFrp.distEs2015ObserverMergeObserverMod.MergeObserver {
  def this(
    currentObserver: IObserver,
    maxConcurrent: Double,
    groupDisposable: typings.wonderFrp.distEs2015DisposableGroupDisposableMod.GroupDisposable
  ) = this()
}
/* static members */
object MergeObserver {
  
  @JSImport("wonder-frp/dist/es2015", "MergeObserver")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(
    currentObserver: IObserver,
    maxConcurrent: Double,
    groupDisposable: typings.wonderFrp.distEs2015DisposableGroupDisposableMod.GroupDisposable
  ): typings.wonderFrp.distEs2015ObserverMergeObserverMod.MergeObserver = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(currentObserver.asInstanceOf[js.Any], maxConcurrent.asInstanceOf[js.Any], groupDisposable.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.distEs2015ObserverMergeObserverMod.MergeObserver]
}
