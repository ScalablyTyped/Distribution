package typings.wonderFrp

import typings.wonderFrp.iobserverMod.IObserver
import typings.wonderFrp.observerMod.Observer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapObserverMod {
  
  @JSImport("wonder-frp/dist/commonjs/observer/MapObserver", "MapObserver")
  @js.native
  open class MapObserver protected () extends Observer {
    def this(currentObserver: IObserver, selector: js.Function) = this()
    
    /* private */ var _currentObserver: Any = js.native
    
    /* private */ var _selector: Any = js.native
  }
  /* static members */
  object MapObserver {
    
    @JSImport("wonder-frp/dist/commonjs/observer/MapObserver", "MapObserver")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(currentObserver: IObserver, selector: js.Function): MapObserver = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(currentObserver.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[MapObserver]
  }
}
