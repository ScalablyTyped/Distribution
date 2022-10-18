package typings.wonderFrp

import typings.wonderFrp.distEs2015CoreObserverMod.Observer
import typings.wonderFrp.distEs2015ObserverIobserverMod.IObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015ObserverTakeUntilObserverMod {
  
  @JSImport("wonder-frp/dist/es2015/observer/TakeUntilObserver", "TakeUntilObserver")
  @js.native
  open class TakeUntilObserver protected () extends Observer {
    def this(prevObserver: IObserver) = this()
    
    /* private */ var _prevObserver: Any = js.native
  }
  /* static members */
  object TakeUntilObserver {
    
    @JSImport("wonder-frp/dist/es2015/observer/TakeUntilObserver", "TakeUntilObserver")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(prevObserver: IObserver): TakeUntilObserver = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(prevObserver.asInstanceOf[js.Any]).asInstanceOf[TakeUntilObserver]
  }
}
