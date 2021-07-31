package typings.wonderFrp

import typings.wonderFrp.coreObserverMod.Observer
import typings.wonderFrp.observerIobserverMod.IObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observerConcatObserverMod {
  
  @JSImport("wonder-frp/dist/es2015/observer/ConcatObserver", "ConcatObserver")
  @js.native
  class ConcatObserver protected () extends Observer {
    def this(currentObserver: IObserver, startNextStream: js.Function) = this()
    
    var _startNextStream: js.Any = js.native
    
    var currentObserver: js.Any = js.native
  }
  /* static members */
  object ConcatObserver {
    
    @JSImport("wonder-frp/dist/es2015/observer/ConcatObserver", "ConcatObserver")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def create(currentObserver: IObserver, startNextStream: js.Function): ConcatObserver = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(currentObserver.asInstanceOf[js.Any], startNextStream.asInstanceOf[js.Any])).asInstanceOf[ConcatObserver]
  }
}
