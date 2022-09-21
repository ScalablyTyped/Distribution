package typings.wonderFrp

import typings.wonderFrp.coreObserverMod.Observer
import typings.wonderFrp.disposableGroupDisposableMod.GroupDisposable
import typings.wonderFrp.observerIobserverMod.IObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observerMergeAllObserverMod {
  
  @JSImport("wonder-frp/dist/es2015/observer/MergeAllObserver", "MergeAllObserver")
  @js.native
  open class MergeAllObserver protected () extends Observer {
    def this(currentObserver: IObserver, groupDisposable: GroupDisposable) = this()
    
    /* private */ var _groupDisposable: Any = js.native
    
    var currentObserver: IObserver = js.native
    
    var done: Boolean = js.native
  }
  /* static members */
  object MergeAllObserver {
    
    @JSImport("wonder-frp/dist/es2015/observer/MergeAllObserver", "MergeAllObserver")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(currentObserver: IObserver, groupDisposable: GroupDisposable): MergeAllObserver = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(currentObserver.asInstanceOf[js.Any], groupDisposable.asInstanceOf[js.Any])).asInstanceOf[MergeAllObserver]
  }
}
