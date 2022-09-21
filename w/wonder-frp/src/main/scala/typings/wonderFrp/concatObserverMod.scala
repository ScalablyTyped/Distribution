package typings.wonderFrp

import typings.wonderFrp.iobserverMod.IObserver
import typings.wonderFrp.observerMod.Observer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object concatObserverMod {
  
  @JSImport("wonder-frp/dist/commonjs/observer/ConcatObserver", "ConcatObserver")
  @js.native
  open class ConcatObserver protected () extends Observer {
    def this(currentObserver: IObserver, startNextStream: js.Function) = this()
    
    /* private */ var _startNextStream: Any = js.native
    
    /* protected */ var currentObserver: Any = js.native
  }
  /* static members */
  object ConcatObserver {
    
    @JSImport("wonder-frp/dist/commonjs/observer/ConcatObserver", "ConcatObserver")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(currentObserver: IObserver, startNextStream: js.Function): ConcatObserver = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(currentObserver.asInstanceOf[js.Any], startNextStream.asInstanceOf[js.Any])).asInstanceOf[ConcatObserver]
  }
}
