package typings.wonderFrp

import typings.wonderFrp.distEs2015CoreObserverMod.Observer
import typings.wonderFrp.distEs2015ObserverIobserverMod.IObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015ObserverDoObserverMod {
  
  @JSImport("wonder-frp/dist/es2015/observer/DoObserver", "DoObserver")
  @js.native
  open class DoObserver protected () extends Observer {
    def this(currentObserver: IObserver, prevObserver: IObserver) = this()
    
    /* private */ var _currentObserver: Any = js.native
    
    /* private */ var _prevObserver: Any = js.native
  }
  /* static members */
  object DoObserver {
    
    @JSImport("wonder-frp/dist/es2015/observer/DoObserver", "DoObserver")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(currentObserver: IObserver, prevObserver: IObserver): DoObserver = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(currentObserver.asInstanceOf[js.Any], prevObserver.asInstanceOf[js.Any])).asInstanceOf[DoObserver]
  }
}
