package typings.wonderFrp

import typings.wonderFrp.distEs2015CoreObserverMod.Observer
import typings.wonderFrp.distEs2015ObserverIobserverMod.IObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015ObserverConcatObserverMod {
  
  @JSImport("wonder-frp/dist/es2015/observer/ConcatObserver", "ConcatObserver")
  @js.native
  open class ConcatObserver protected () extends Observer {
    def this(currentObserver: IObserver, startNextStream: js.Function) = this()
    
    /* private */ var _startNextStream: Any = js.native
    
    /* protected */ var currentObserver: Any = js.native
  }
  /* static members */
  object ConcatObserver {
    
    @JSImport("wonder-frp/dist/es2015/observer/ConcatObserver", "ConcatObserver")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(currentObserver: IObserver, startNextStream: js.Function): ConcatObserver = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(currentObserver.asInstanceOf[js.Any], startNextStream.asInstanceOf[js.Any])).asInstanceOf[ConcatObserver]
  }
}
