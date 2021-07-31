package typings.wonderFrp

import typings.wonderFrp.iobserverMod.IObserver
import typings.wonderFrp.observerMod.Observer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapObserverMod {
  
  @JSImport("wonder-frp/dist/commonjs/observer/MapObserver", "MapObserver")
  @js.native
  class MapObserver protected () extends Observer {
    def this(currentObserver: IObserver, selector: js.Function) = this()
    
    var _currentObserver: js.Any = js.native
    
    var _selector: js.Any = js.native
  }
  /* static members */
  object MapObserver {
    
    @JSImport("wonder-frp/dist/commonjs/observer/MapObserver", "MapObserver")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def create(currentObserver: IObserver, selector: js.Function): MapObserver = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(currentObserver.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[MapObserver]
  }
}
