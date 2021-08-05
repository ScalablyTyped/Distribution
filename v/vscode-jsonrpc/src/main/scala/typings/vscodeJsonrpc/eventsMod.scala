package typings.vscodeJsonrpc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventsMod {
  
  trait Disposable extends StObject {
    
    /**
      * Dispose this object.
      */
    def dispose(): Unit
  }
  object Disposable {
    
    inline def apply(dispose: () => Unit): Disposable = {
      val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose))
      __obj.asInstanceOf[Disposable]
    }
    
    @JSImport("vscode-jsonrpc/lib/events", "Disposable")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(func: js.Function0[Unit]): Disposable = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(func.asInstanceOf[js.Any]).asInstanceOf[Disposable]
    
    extension [Self <: Disposable](x: Self) {
      
      inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    }
  }
  
  @JSImport("vscode-jsonrpc/lib/events", "Emitter")
  @js.native
  class Emitter[T] () extends StObject {
    def this(_options: EmitterOptions) = this()
    
    /* private */ var _callbacks: js.Any = js.native
    
    /* private */ var _event: js.Any = js.native
    
    /* private */ var _options: js.Any = js.native
    
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
    def fire(event: T): js.Any = js.native
  }
  /* static members */
  object Emitter {
    
    @JSImport("vscode-jsonrpc/lib/events", "Emitter")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("vscode-jsonrpc/lib/events", "Emitter._noop")
    @js.native
    def _noop: js.Any = js.native
    inline def _noop_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_noop")(x.asInstanceOf[js.Any])
  }
  
  object Event {
    
    @JSImport("vscode-jsonrpc/lib/events", "Event.None")
    @js.native
    val None: Event[js.Any] = js.native
  }
  type Event[T] = js.Function3[
    /* listener */ js.Function1[/* e */ T, js.Any], 
    /* thisArgs */ js.UndefOr[js.Any], 
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
