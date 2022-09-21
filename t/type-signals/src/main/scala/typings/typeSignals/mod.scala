package typings.typeSignals

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("type-signals", "Signal")
  @js.native
  open class Signal[T /* <: js.Function */] () extends StObject {
    
    /* private */ var _addSignalBinding: Any = js.native
    
    /* private */ var _filter: Any = js.native
    
    /* private */ var _head: Any = js.native
    
    /* private */ var _tail: Any = js.native
    
    def add(fn: WithVoidReturn[T]): SignalBinding = js.native
    def add(fn: WithVoidReturn[T], thisArg: Any): SignalBinding = js.native
    
    def detach(node_ : SignalBinding): this.type = js.native
    
    def detachAll(): this.type = js.native
    
    def dispatch(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ArgumentTypes<T> is not an array type */ args: ArgumentTypes[T]
    ): Boolean = js.native
    
    def filter(filter: WithBoolReturn[T]): Unit = js.native
    
    def handlers(): js.Array[SignalBinding] = js.native
    
    def has(node: SignalBinding): Boolean = js.native
    
    def hasAny(): Boolean = js.native
    
    def once(fn: WithVoidReturn[T]): SignalBinding = js.native
    def once(fn: WithVoidReturn[T], thisArg: Any): SignalBinding = js.native
    
    def proxy(signals: Signal[T]*): this.type = js.native
  }
  
  type ArgumentTypes[T] = Any
  
  type ReplaceReturnType[T, TNewReturn] = js.Function1[/* a */ ArgumentTypes[T], TNewReturn]
  
  trait SignalBinding extends StObject {
    
    def detach(): Boolean
    
    def dispose(): Unit
  }
  object SignalBinding {
    
    inline def apply(detach: () => Boolean, dispose: () => Unit): SignalBinding = {
      val __obj = js.Dynamic.literal(detach = js.Any.fromFunction0(detach), dispose = js.Any.fromFunction0(dispose))
      __obj.asInstanceOf[SignalBinding]
    }
    
    extension [Self <: SignalBinding](x: Self) {
      
      inline def setDetach(value: () => Boolean): Self = StObject.set(x, "detach", js.Any.fromFunction0(value))
      
      inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    }
  }
  
  type WithBoolReturn[T] = ReplaceReturnType[T, Boolean]
  
  type WithVoidReturn[T] = ReplaceReturnType[T, Unit]
}
