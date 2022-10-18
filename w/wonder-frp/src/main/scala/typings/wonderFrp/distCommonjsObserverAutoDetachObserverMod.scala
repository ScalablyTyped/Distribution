package typings.wonderFrp

import typings.wonderFrp.distCommonjsCoreObserverMod.Observer
import typings.wonderFrp.distCommonjsObserverIobserverMod.IObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsObserverAutoDetachObserverMod {
  
  @JSImport("wonder-frp/dist/commonjs/observer/AutoDetachObserver", "AutoDetachObserver")
  @js.native
  open class AutoDetachObserver protected () extends Observer {
    def this(observer: IObserver) = this()
    def this(onNext: js.Function, onError: js.Function, onCompleted: js.Function) = this()
  }
  /* static members */
  object AutoDetachObserver {
    
    @JSImport("wonder-frp/dist/commonjs/observer/AutoDetachObserver", "AutoDetachObserver")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(observer: IObserver): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(observer.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def create(onNext: js.Function, onError: js.Function, onCompleted: js.Function): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompleted.asInstanceOf[js.Any])).asInstanceOf[Any]
  }
}
