package typings.tootallnateOnce

import typings.node.eventsMod.EventEmitter
import typings.std.Parameters
import typings.tootallnateOnce.overloadedParametersMod.OverloadedParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait AbortSignal extends StObject {
    
    def addEventListener(name: String, listener: js.Function1[/* repeated */ Any, Any]): Unit
    
    def removeEventListener(name: String, listener: js.Function1[/* repeated */ Any, Any]): Unit
  }
  object AbortSignal {
    
    inline def apply(
      addEventListener: (String, js.Function1[/* repeated */ Any, Any]) => Unit,
      removeEventListener: (String, js.Function1[/* repeated */ Any, Any]) => Unit
    ): AbortSignal = {
      val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), removeEventListener = js.Any.fromFunction2(removeEventListener))
      __obj.asInstanceOf[AbortSignal]
    }
    
    extension [Self <: AbortSignal](x: Self) {
      
      inline def setAddEventListener(value: (String, js.Function1[/* repeated */ Any, Any]) => Unit): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2(value))
      
      inline def setRemoveEventListener(value: (String, js.Function1[/* repeated */ Any, Any]) => Unit): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction2(value))
    }
  }
  
  type EventListener[F, T /* <: String | js.Symbol */] = Any
  
  type EventListenerParameters[Emitter /* <: EventEmitter */, Event /* <: EventNames[Emitter] */] = WithDefault[Parameters[EventListener[EventParameters[Emitter], Event]], js.Array[Any]]
  
  type EventNames[Emitter /* <: EventEmitter */] = FirstParameter[EventParameters[Emitter]]
  
  type EventParameters[Emitter /* <: EventEmitter */] = OverloadedParameters[
    /* import warning: importer.ImportType#apply Failed type conversion: Emitter['on'] */ js.Any
  ]
  
  type FirstParameter[T] = Any
  
  type WithDefault[T, D] = T | D
}
