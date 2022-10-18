package typings.wonderFrp.distEs2015Mod

import typings.wonderFrp.distEs2015ObserverIobserverMod.IObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/es2015", "MergeAllObserver")
@js.native
open class MergeAllObserver protected ()
  extends typings.wonderFrp.distEs2015ObserverMergeAllObserverMod.MergeAllObserver {
  def this(
    currentObserver: IObserver,
    groupDisposable: typings.wonderFrp.distEs2015DisposableGroupDisposableMod.GroupDisposable
  ) = this()
}
/* static members */
object MergeAllObserver {
  
  @JSImport("wonder-frp/dist/es2015", "MergeAllObserver")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(
    currentObserver: IObserver,
    groupDisposable: typings.wonderFrp.distEs2015DisposableGroupDisposableMod.GroupDisposable
  ): typings.wonderFrp.distEs2015ObserverMergeAllObserverMod.MergeAllObserver = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(currentObserver.asInstanceOf[js.Any], groupDisposable.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.distEs2015ObserverMergeAllObserverMod.MergeAllObserver]
}
