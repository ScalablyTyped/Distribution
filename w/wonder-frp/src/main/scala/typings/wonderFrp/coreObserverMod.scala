package typings.wonderFrp

import typings.wonderFrp.coreEntityMod.Entity
import typings.wonderFrp.disposableIdisposableMod.IDisposable
import typings.wonderFrp.observerIobserverMod.IObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreObserverMod {
  
  @JSImport("wonder-frp/dist/es2015/core/Observer", "Observer")
  @js.native
  abstract class Observer protected ()
    extends Entity
       with IObserver {
    def this(observer: IObserver) = this()
    def this(onNext: js.Function, onError: js.Function, onCompleted: js.Function) = this()
    
    var _disposable: js.Any = js.native
    
    var _isDisposed: js.Any = js.native
    
    var _isStop: js.Any = js.native
    
    /* CompleteClass */
    override def completed(): js.Any = js.native
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /* CompleteClass */
    override def error(error: js.Any): js.Any = js.native
    
    var isDisposed: Boolean = js.native
    
    /* CompleteClass */
    override def next(value: js.Any): js.Any = js.native
    
    /* protected */ def onCompleted(): js.Any = js.native
    
    /* protected */ def onError(error: js.Any): js.Any = js.native
    
    /* protected */ def onNext(value: js.Any): js.Any = js.native
    
    var onUserCompleted: js.Function = js.native
    
    var onUserError: js.Function = js.native
    
    var onUserNext: js.Function = js.native
    
    def setDisposable(disposable: IDisposable): Unit = js.native
  }
}
