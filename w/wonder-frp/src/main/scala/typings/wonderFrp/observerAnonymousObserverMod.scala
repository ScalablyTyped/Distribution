package typings.wonderFrp

import typings.wonderFrp.coreObserverMod.Observer
import typings.wonderFrp.observerIobserverMod.IObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observerAnonymousObserverMod {
  
  @JSImport("wonder-frp/dist/es2015/observer/AnonymousObserver", "AnonymousObserver")
  @js.native
  class AnonymousObserver protected () extends Observer {
    def this(observer: IObserver) = this()
    def this(onNext: js.Function, onError: js.Function, onCompleted: js.Function) = this()
  }
  /* static members */
  object AnonymousObserver {
    
    @JSImport("wonder-frp/dist/es2015/observer/AnonymousObserver", "AnonymousObserver")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def create(onNext: js.Function, onError: js.Function, onCompleted: js.Function): AnonymousObserver = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompleted.asInstanceOf[js.Any])).asInstanceOf[AnonymousObserver]
  }
}
