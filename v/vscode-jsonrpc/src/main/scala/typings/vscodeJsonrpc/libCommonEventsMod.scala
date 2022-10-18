package typings.vscodeJsonrpc

import typings.vscodeJsonrpc.libCommonDisposableMod.Disposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonEventsMod {
  
  @JSImport("vscode-jsonrpc/lib/common/events", "Emitter")
  @js.native
  open class Emitter[T] () extends StObject {
    def this(_options: EmitterOptions) = this()
    
    /* private */ var _callbacks: Any = js.native
    
    /* private */ var _event: Any = js.native
    
    /* private */ var _options: Any = js.native
    
    def dispose(): Unit = js.native
    
    /**
      * For the public to allow to subscribe
      * to events from this Emitter
      */
    def event: Event[T] = js.native
    
    /**
      * To be kept private to fire an event to
      * subscribers
      */
    def fire(event: T): Any = js.native
  }
  /* static members */
  object Emitter {
    
    @JSImport("vscode-jsonrpc/lib/common/events", "Emitter")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("vscode-jsonrpc/lib/common/events", "Emitter._noop")
    @js.native
    def _noop: Any = js.native
    inline def _noop_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_noop")(x.asInstanceOf[js.Any])
  }
  
  object Event {
    
    @JSImport("vscode-jsonrpc/lib/common/events", "Event.None")
    @js.native
    val None: Event[Any] = js.native
  }
  type Event[T] = js.Function3[
    /* listener */ js.Function1[/* e */ T, Any], 
    /* thisArgs */ js.UndefOr[Any], 
    /* disposables */ js.UndefOr[js.Array[Disposable]], 
    Disposable
  ]
  
  trait EmitterOptions extends StObject {
    
    var onFirstListenerAdd: js.UndefOr[js.Function] = js.undefined
    
    var onLastListenerRemove: js.UndefOr[js.Function] = js.undefined
  }
  object EmitterOptions {
    
    inline def apply(): EmitterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EmitterOptions]
    }
    
    extension [Self <: EmitterOptions](x: Self) {
      
      inline def setOnFirstListenerAdd(value: js.Function): Self = StObject.set(x, "onFirstListenerAdd", value.asInstanceOf[js.Any])
      
      inline def setOnFirstListenerAddUndefined: Self = StObject.set(x, "onFirstListenerAdd", js.undefined)
      
      inline def setOnLastListenerRemove(value: js.Function): Self = StObject.set(x, "onLastListenerRemove", value.asInstanceOf[js.Any])
      
      inline def setOnLastListenerRemoveUndefined: Self = StObject.set(x, "onLastListenerRemove", js.undefined)
    }
  }
}
