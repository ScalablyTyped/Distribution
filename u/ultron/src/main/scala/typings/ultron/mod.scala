package typings.ultron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * @param ee EventEmitter instance we need to wrap.
    */
  inline def apply(ee: EventEmitter): Ultron = ^.asInstanceOf[js.Dynamic].apply(ee.asInstanceOf[js.Any]).asInstanceOf[Ultron]
  
  @JSImport("ultron", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("ultron", JSImport.Namespace)
  @js.native
  open class Class protected ()
    extends StObject
       with Ultron {
    /**
      * @param ee EventEmitter instance we need to wrap.
      */
    def this(ee: EventEmitter) = this()
  }
  
  /**
    * A Node.js EventEmitter instance or an `eventemitter3` instance.
    */
  @js.native
  trait EventEmitter extends StObject {
    
    var eventNames: js.UndefOr[js.Function0[js.Array[String | js.Symbol]]] = js.native
    
    def listeners(event: String): js.Array[Any] = js.native
    def listeners(event: js.Symbol): js.Array[Any] = js.native
    
    def on(event: String, fn: Listener): Unit = js.native
    def on(event: js.Symbol, fn: Listener): Unit = js.native
    
    def once(event: String, fn: Listener): Unit = js.native
    def once(event: js.Symbol, fn: Listener): Unit = js.native
    
    def removeListener(event: String, fn: Listener): Unit = js.native
    def removeListener(event: js.Symbol, fn: Listener): Unit = js.native
  }
  
  @js.native
  trait Listener extends StObject {
    
    def apply(args: Any*): Unit = js.native
  }
  
  /**
    * Ultron is high-intelligence robot. It gathers intelligence so it can start improving
    * upon his rudimentary design. It will learn from your EventEmitting patterns
    * and exterminate them.
    */
  @js.native
  trait Ultron extends StObject {
    
    /**
      * Destroy the Ultron instance, remove all listeners and release all references.
      */
    def destroy(): Boolean = js.native
    
    /**
      * Register a new EventListener for the given event.
      *
      * @param event Name of the event.
      * @param fn Callback function.
      * @param context The context of the function.
      */
    def on(event: String, fn: Listener): this.type = js.native
    def on(event: String, fn: Listener, context: Any): this.type = js.native
    def on(event: js.Symbol, fn: Listener): this.type = js.native
    def on(event: js.Symbol, fn: Listener, context: Any): this.type = js.native
    
    /**
      * Add an EventListener that's only called once.
      *
      * @param event Name of the event.
      * @param fn Callback function.
      * @param context The context of the function.
      */
    def once(event: String, fn: Listener): this.type = js.native
    def once(event: String, fn: Listener, context: Any): this.type = js.native
    def once(event: js.Symbol, fn: Listener): this.type = js.native
    def once(event: js.Symbol, fn: Listener, context: Any): this.type = js.native
    
    /**
      * Remove the listeners we assigned for the given event(s).
      */
    def remove(names: (String | js.Symbol)*): this.type = js.native
  }
}
