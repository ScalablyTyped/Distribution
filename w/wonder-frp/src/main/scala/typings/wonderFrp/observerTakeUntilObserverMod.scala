package typings.wonderFrp

import typings.wonderFrp.coreObserverMod.Observer
import typings.wonderFrp.observerIobserverMod.IObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observerTakeUntilObserverMod {
  
  @JSImport("wonder-frp/dist/es2015/observer/TakeUntilObserver", "TakeUntilObserver")
  @js.native
  class TakeUntilObserver protected () extends Observer {
    def this(prevObserver: IObserver) = this()
    
    var _prevObserver: js.Any = js.native
  }
  /* static members */
  object TakeUntilObserver {
    
    @JSImport("wonder-frp/dist/es2015/observer/TakeUntilObserver", "TakeUntilObserver")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def create(prevObserver: IObserver): TakeUntilObserver = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(prevObserver.asInstanceOf[js.Any]).asInstanceOf[TakeUntilObserver]
  }
}
