package typings.wonderFrp

import typings.wonderFrp.distEs2015CoreObserverMod.Observer
import typings.wonderFrp.distEs2015CoreStreamMod.Stream
import typings.wonderFrp.distEs2015DisposableGroupDisposableMod.GroupDisposable
import typings.wonderFrp.distEs2015ObserverIobserverMod.IObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015ObserverMergeObserverMod {
  
  @JSImport("wonder-frp/dist/es2015/observer/MergeObserver", "MergeObserver")
  @js.native
  open class MergeObserver protected () extends Observer {
    def this(currentObserver: IObserver, maxConcurrent: Double, groupDisposable: GroupDisposable) = this()
    
    /* private */ var _groupDisposable: Any = js.native
    
    /* private */ def _isNotReachMaxConcurrent(): Any = js.native
    
    /* private */ var _maxConcurrent: Any = js.native
    
    var activeCount: Double = js.native
    
    var currentObserver: IObserver = js.native
    
    var done: Boolean = js.native
    
    def handleSubscribe(innerSource: Any): Unit = js.native
    
    var q: js.Array[Stream] = js.native
  }
  /* static members */
  object MergeObserver {
    
    @JSImport("wonder-frp/dist/es2015/observer/MergeObserver", "MergeObserver")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(currentObserver: IObserver, maxConcurrent: Double, groupDisposable: GroupDisposable): MergeObserver = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(currentObserver.asInstanceOf[js.Any], maxConcurrent.asInstanceOf[js.Any], groupDisposable.asInstanceOf[js.Any])).asInstanceOf[MergeObserver]
  }
}
