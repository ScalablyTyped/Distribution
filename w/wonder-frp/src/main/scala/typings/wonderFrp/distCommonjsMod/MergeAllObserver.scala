package typings.wonderFrp.distCommonjsMod

import typings.wonderFrp.distCommonjsObserverIobserverMod.IObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/commonjs", "MergeAllObserver")
@js.native
open class MergeAllObserver protected ()
  extends typings.wonderFrp.distCommonjsObserverMergeAllObserverMod.MergeAllObserver {
  def this(
    currentObserver: IObserver,
    groupDisposable: typings.wonderFrp.distCommonjsDisposableGroupDisposableMod.GroupDisposable
  ) = this()
}
/* static members */
object MergeAllObserver {
  
  @JSImport("wonder-frp/dist/commonjs", "MergeAllObserver")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(
    currentObserver: IObserver,
    groupDisposable: typings.wonderFrp.distCommonjsDisposableGroupDisposableMod.GroupDisposable
  ): typings.wonderFrp.distCommonjsObserverMergeAllObserverMod.MergeAllObserver = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(currentObserver.asInstanceOf[js.Any], groupDisposable.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.distCommonjsObserverMergeAllObserverMod.MergeAllObserver]
}
