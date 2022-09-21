package typings.typedoc

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hooksMod {
  
  @JSImport("typedoc/dist/lib/utils/hooks", "EventHooks")
  @js.native
  open class EventHooks[T /* <: Record[/* keyof T */ String, js.Array[Any]] */, R] () extends StObject {
    
    /* private */ var _listeners: Any = js.native
    
    /**
      * Emits an event to all currently subscribed listeners.
      * @param event the event to emit.
      * @param args any arguments required for the event.
      */
    def emit[K /* <: /* keyof T */ String */](
      event: K,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T[K] is not an array type */ args: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ): js.Array[R] = js.native
    
    /**
      * Stops listening to an event.
      * @param event the event to stop listening to.
      * @param listener the function to remove from the listener array.
      */
    def off[K /* <: /* keyof T */ String */](
      event: K,
      listener: js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ /* args */ js.Any, 
          R
        ]
    ): Unit = js.native
    
    /**
      * Starts listening to an event.
      * @param event the event to listen to.
      * @param listener function to be called when an this event is emitted.
      * @param order optional order to insert this hook with.
      */
    def on[K /* <: /* keyof T */ String */](
      event: K,
      listener: js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ /* args */ js.Any, 
          R
        ]
    ): Unit = js.native
    def on[K /* <: /* keyof T */ String */](
      event: K,
      listener: js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ /* args */ js.Any, 
          R
        ],
      order: Double
    ): Unit = js.native
    
    /**
      * Listens to a single occurrence of an event.
      * @param event the event to listen to.
      * @param listener function to be called when an this event is emitted.
      * @param order optional order to insert this hook with.
      */
    def once[K /* <: /* keyof T */ String */](
      event: K,
      listener: js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ /* args */ js.Any, 
          R
        ]
    ): Unit = js.native
    def once[K /* <: /* keyof T */ String */](
      event: K,
      listener: js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ /* args */ js.Any, 
          R
        ],
      order: Double
    ): Unit = js.native
    
    def restoreMomento(momento: EventHooksMomento[T, R]): Unit = js.native
    
    def saveMomento(): EventHooksMomento[T, R] = js.native
  }
  
  type EventHooksMomento[T /* <: Record[/* keyof T */ String, js.Array[Any]] */, _R] = js.Object
}
