package typings.typedoc

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsEventsMod {
  
  @JSImport("typedoc/dist/lib/utils/events", "Event")
  @js.native
  open class Event protected () extends StObject {
    /**
      * Create a new Event instance.
      */
    def this(name: String) = this()
    
    /**
      * Has {@link Event.preventDefault} been called?
      */
    /* private */ var _isDefaultPrevented: Any = js.native
    
    /**
      * Has {@link Event.stopPropagation} been called?
      */
    /* private */ var _isPropagationStopped: Any = js.native
    
    /**
      * The name of the event.
      */
    /* private */ var _name: Any = js.native
    
    /**
      * Has {@link Event.preventDefault} been called?
      */
    def isDefaultPrevented: Boolean = js.native
    
    /**
      * Has {@link Event.stopPropagation} been called?
      */
    def isPropagationStopped: Boolean = js.native
    
    /**
      * Return the event name.
      */
    def name: String = js.native
    
    /**
      * Prevent the default action associated with this event from being executed.
      */
    def preventDefault(): Unit = js.native
    
    /**
      * Stop the propagation of this event. Remaining event handlers will not be executed.
      */
    def stopPropagation(): Unit = js.native
  }
  
  @JSImport("typedoc/dist/lib/utils/events", "EventDispatcher")
  @js.native
  open class EventDispatcher () extends StObject {
    
    /**
      * Map of all handlers registered with the "on" function.
      */
    /* private */ var _events: Any = js.native
    
    /**
      * A unique id that identifies this instance.
      */
    /* private */ def _listenId: Any = js.native
    
    /**
      * Map of all objects that are listening to this instance.
      */
    /* private */ var _listeners: Any = js.native
    
    /**
      * Map of all objects this instance is listening to.
      */
    /* private */ var _listeningTo: Any = js.native
    
    /* private */ var _savedListenId: Any = js.native
    
    /**
      * Guard the `listening` argument from the public API.
      */
    /* private */ var internalOn: Any = js.native
    
    def listenTo(obj: EventDispatcher, name: String): this.type = js.native
    def listenTo(obj: EventDispatcher, name: String, callback: Unit, priority: Double): this.type = js.native
    def listenTo(obj: EventDispatcher, name: String, callback: EventCallback): this.type = js.native
    def listenTo(obj: EventDispatcher, name: String, callback: EventCallback, priority: Double): this.type = js.native
    /**
      * Inversion-of-control versions of `on`. Tell *this* object to listen to
      * an event in another object... keeping track of what it's listening to
      * for easier unbinding later.
      */
    def listenTo(obj: EventDispatcher, name: EventMap): this.type = js.native
    def listenTo(obj: EventDispatcher, name: EventMap, callback: Unit, priority: Double): this.type = js.native
    def listenTo(obj: EventDispatcher, name: EventMap, callback: EventCallback): this.type = js.native
    def listenTo(obj: EventDispatcher, name: EventMap, callback: EventCallback, priority: Double): this.type = js.native
    
    /**
      * Inversion-of-control versions of `once`.
      */
    def listenToOnce(obj: EventDispatcher, eventMap: EventMap): this.type = js.native
    def listenToOnce(obj: EventDispatcher, name: String, callback: EventCallback): this.type = js.native
    def listenToOnce(obj: EventDispatcher, name: String, callback: EventCallback, priority: Double): this.type = js.native
    
    /**
      * Remove one or many callbacks. If `context` is null, removes all
      * callbacks with that function. If `callback` is null, removes all
      * callbacks for the event. If `name` is null, removes all bound
      * callbacks for all events.
      */
    def off(): this.type = js.native
    def off(eventMap: Unit, context: Any): this.type = js.native
    def off(eventMap: EventMap): this.type = js.native
    def off(eventMap: EventMap, context: Any): this.type = js.native
    def off(name: String): this.type = js.native
    def off(name: String, callback: Unit, context: Any): this.type = js.native
    def off(name: String, callback: EventCallback): this.type = js.native
    def off(name: String, callback: EventCallback, context: Any): this.type = js.native
    def off(name: Unit, callback: Unit, context: Any): this.type = js.native
    def off(name: Unit, callback: EventCallback): this.type = js.native
    def off(name: Unit, callback: EventCallback, context: Any): this.type = js.native
    
    /**
      * Bind an event to a `callback` function. Passing `"all"` will bind
      * the callback to all events fired.
      */
    def on(eventMap: EventMap): this.type = js.native
    def on(eventMap: EventMap, callback: Unit, context: Any): this.type = js.native
    def on(eventMap: EventMap, callback: Unit, context: Any, priority: Double): this.type = js.native
    def on(eventMap: EventMap, callback: Unit, context: Unit, priority: Double): this.type = js.native
    def on(eventMap: EventMap, callback: EventCallback): this.type = js.native
    def on(eventMap: EventMap, callback: EventCallback, context: Any): this.type = js.native
    def on(eventMap: EventMap, callback: EventCallback, context: Any, priority: Double): this.type = js.native
    def on(eventMap: EventMap, callback: EventCallback, context: Unit, priority: Double): this.type = js.native
    def on(eventMap: EventMap, context: Any): this.type = js.native
    def on(name: String, callback: EventCallback): this.type = js.native
    def on(name: String, callback: EventCallback, context: Any): this.type = js.native
    def on(name: String, callback: EventCallback, context: Any, priority: Double): this.type = js.native
    def on(name: String, callback: EventCallback, context: Unit, priority: Double): this.type = js.native
    
    /**
      * Bind an event to only be triggered a single time. After the first time
      * the callback is invoked, its listener will be removed. If multiple events
      * are passed in using the space-separated syntax, the handler will fire
      * once for each event, not once for a combination of all events.
      */
    def once(eventMap: EventMap): this.type = js.native
    def once(eventMap: EventMap, context: Any): this.type = js.native
    def once(name: String, callback: EventCallback): this.type = js.native
    def once(name: String, callback: EventCallback, context: Any): this.type = js.native
    def once(name: String, callback: EventCallback, context: Any, priority: Any): this.type = js.native
    def once(name: String, callback: EventCallback, context: Unit, priority: Any): this.type = js.native
    
    /**
      * Tell this object to stop listening to either specific events ... or
      * to every object it's currently listening to.
      */
    def stopListening(): this.type = js.native
    def stopListening(obj: Unit, name: String): this.type = js.native
    def stopListening(obj: Unit, name: String, callback: EventCallback): this.type = js.native
    def stopListening(obj: Unit, name: Unit, callback: EventCallback): this.type = js.native
    def stopListening(obj: Unit, name: EventMap): this.type = js.native
    def stopListening(obj: Unit, name: EventMap, callback: EventCallback): this.type = js.native
    def stopListening(obj: EventDispatcher): this.type = js.native
    def stopListening(obj: EventDispatcher, name: String): this.type = js.native
    def stopListening(obj: EventDispatcher, name: String, callback: EventCallback): this.type = js.native
    def stopListening(obj: EventDispatcher, name: Unit, callback: EventCallback): this.type = js.native
    def stopListening(obj: EventDispatcher, name: EventMap): this.type = js.native
    def stopListening(obj: EventDispatcher, name: EventMap, callback: EventCallback): this.type = js.native
    
    def trigger(name: String, args: Any*): this.type = js.native
    def trigger(name: EventMap, args: Any*): this.type = js.native
    /**
      * Trigger one or many events, firing all bound callbacks. Callbacks are
      * passed the same arguments as `trigger` is, apart from the event name
      * (unless you're listening on `"all"`, which will cause your callback to
      * receive the true name of the event as the first argument).
      */
    def trigger(name: Event, args: Any*): this.type = js.native
  }
  
  @js.native
  trait EventCallback
    extends js.Function {
    
    var _callback: js.UndefOr[js.Function] = js.native
  }
  
  type EventMap = StringDictionary[EventCallback]
}
