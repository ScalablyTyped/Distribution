package typings.wonderFrp

import typings.wonderFrp.distCommonjsCoreObserverMod.Observer
import typings.wonderFrp.distCommonjsDisposableGroupDisposableMod.GroupDisposable
import typings.wonderFrp.distCommonjsObserverIobserverMod.IObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsObserverMergeAllObserverMod {
  
  @JSImport("wonder-frp/dist/commonjs/observer/MergeAllObserver", "MergeAllObserver")
  @js.native
  open class MergeAllObserver protected () extends Observer {
    def this(currentObserver: IObserver, groupDisposable: GroupDisposable) = this()
    
    /* private */ var _groupDisposable: Any = js.native
    
    var currentObserver: IObserver = js.native
    
    var done: Boolean = js.native
  }
  /* static members */
  object MergeAllObserver {
    
    @JSImport("wonder-frp/dist/commonjs/observer/MergeAllObserver", "MergeAllObserver")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(currentObserver: IObserver, groupDisposable: GroupDisposable): MergeAllObserver = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(currentObserver.asInstanceOf[js.Any], groupDisposable.asInstanceOf[js.Any])).asInstanceOf[MergeAllObserver]
  }
}
