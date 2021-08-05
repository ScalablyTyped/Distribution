package typings.wonderFrp.es2015Mod

import typings.wonderFrp.observerIobserverMod.IObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/es2015", "MergeAllObserver")
@js.native
class MergeAllObserver protected ()
  extends typings.wonderFrp.observerMergeAllObserverMod.MergeAllObserver {
  def this(
    currentObserver: IObserver,
    groupDisposable: typings.wonderFrp.disposableGroupDisposableMod.GroupDisposable
  ) = this()
}
/* static members */
object MergeAllObserver {
  
  @JSImport("wonder-frp/dist/es2015", "MergeAllObserver")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(
    currentObserver: IObserver,
    groupDisposable: typings.wonderFrp.disposableGroupDisposableMod.GroupDisposable
  ): typings.wonderFrp.observerMergeAllObserverMod.MergeAllObserver = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(currentObserver.asInstanceOf[js.Any], groupDisposable.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.observerMergeAllObserverMod.MergeAllObserver]
}
