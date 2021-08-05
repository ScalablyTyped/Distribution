package typings.wonderFrp

import typings.wonderFrp.coreObserverMod.Observer
import typings.wonderFrp.observerIobserverMod.IObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observerIgnoreElementsObserverMod {
  
  @JSImport("wonder-frp/dist/es2015/observer/IgnoreElementsObserver", "IgnoreElementsObserver")
  @js.native
  class IgnoreElementsObserver protected () extends Observer {
    def this(currentObserver: IObserver) = this()
    
    /* private */ var _currentObserver: js.Any = js.native
  }
  /* static members */
  object IgnoreElementsObserver {
    
    @JSImport("wonder-frp/dist/es2015/observer/IgnoreElementsObserver", "IgnoreElementsObserver")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(currentObserver: IObserver): IgnoreElementsObserver = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(currentObserver.asInstanceOf[js.Any]).asInstanceOf[IgnoreElementsObserver]
  }
}
