package typings.wonderFrp

import typings.wonderFrp.iobserverMod.IObserver
import typings.wonderFrp.observerMod.Observer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ignoreElementsObserverMod {
  
  @JSImport("wonder-frp/dist/commonjs/observer/IgnoreElementsObserver", "IgnoreElementsObserver")
  @js.native
  open class IgnoreElementsObserver protected () extends Observer {
    def this(currentObserver: IObserver) = this()
    
    /* private */ var _currentObserver: Any = js.native
  }
  /* static members */
  object IgnoreElementsObserver {
    
    @JSImport("wonder-frp/dist/commonjs/observer/IgnoreElementsObserver", "IgnoreElementsObserver")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(currentObserver: IObserver): IgnoreElementsObserver = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(currentObserver.asInstanceOf[js.Any]).asInstanceOf[IgnoreElementsObserver]
  }
}
