package typings.wonderFrp

import typings.wonderFrp.distEs2015CoreObserverMod.Observer
import typings.wonderFrp.distEs2015ObserverIobserverMod.IObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015ObserverAutoDetachObserverMod {
  
  @JSImport("wonder-frp/dist/es2015/observer/AutoDetachObserver", "AutoDetachObserver")
  @js.native
  open class AutoDetachObserver protected () extends Observer {
    def this(observer: IObserver) = this()
    def this(onNext: js.Function, onError: js.Function, onCompleted: js.Function) = this()
  }
  /* static members */
  object AutoDetachObserver {
    
    @JSImport("wonder-frp/dist/es2015/observer/AutoDetachObserver", "AutoDetachObserver")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(observer: IObserver): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(observer.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def create(onNext: js.Function, onError: js.Function, onCompleted: js.Function): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompleted.asInstanceOf[js.Any])).asInstanceOf[Any]
  }
}
