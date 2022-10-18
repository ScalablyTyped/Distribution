package typings.wonderFrp

import typings.wonderFrp.distCommonjsCoreObserverMod.Observer
import typings.wonderFrp.distCommonjsObserverIobserverMod.IObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsObserverTakeUntilObserverMod {
  
  @JSImport("wonder-frp/dist/commonjs/observer/TakeUntilObserver", "TakeUntilObserver")
  @js.native
  open class TakeUntilObserver protected () extends Observer {
    def this(prevObserver: IObserver) = this()
    
    /* private */ var _prevObserver: Any = js.native
  }
  /* static members */
  object TakeUntilObserver {
    
    @JSImport("wonder-frp/dist/commonjs/observer/TakeUntilObserver", "TakeUntilObserver")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(prevObserver: IObserver): TakeUntilObserver = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(prevObserver.asInstanceOf[js.Any]).asInstanceOf[TakeUntilObserver]
  }
}
