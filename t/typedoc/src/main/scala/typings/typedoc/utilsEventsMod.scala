package typings.typedoc

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/utils/events", JSImport.Namespace)
@js.native
object utilsEventsMod extends js.Object {
  @js.native
  class Event protected () extends js.Object {
    def this(name: String) = this()
    var _isDefaultPrevented: js.Any = js.native
    var _isPropagationStopped: js.Any = js.native
    var _name: js.Any = js.native
    def isDefaultPrevented: Boolean = js.native
    def isPropagationStopped: Boolean = js.native
    def name: String = js.native
    def preventDefault(): Unit = js.native
    def stopPropagation(): Unit = js.native
  }
  
  @js.native
  trait EventCallback
    extends js.Function {
    var _callback: js.UndefOr[js.Function] = js.native
  }
  
  @js.native
  class EventDispatcher () extends js.Object {
    var _events: js.UndefOr[js.Any] = js.native
    var _listeners: js.UndefOr[js.Any] = js.native
    var _listeningTo: js.UndefOr[js.Any] = js.native
    var _savedListenId: js.UndefOr[js.Any] = js.native
    var internalOn: js.Any = js.native
    /* private */ def _listenId: js.Any = js.native
    def listenTo(obj: EventDispatcher, name: String): this.type = js.native
    def listenTo(obj: EventDispatcher, name: String, callback: EventCallback): this.type = js.native
    def listenTo(obj: EventDispatcher, name: String, callback: EventCallback, priority: Double): this.type = js.native
    def listenTo(obj: EventDispatcher, name: EventMap): this.type = js.native
    def listenTo(obj: EventDispatcher, name: EventMap, callback: EventCallback): this.type = js.native
    def listenTo(obj: EventDispatcher, name: EventMap, callback: EventCallback, priority: Double): this.type = js.native
    def listenToOnce(obj: EventDispatcher, eventMap: EventMap): js.Any = js.native
    def listenToOnce(obj: EventDispatcher, name: String, callback: EventCallback): js.Any = js.native
    def listenToOnce(obj: EventDispatcher, name: String, callback: EventCallback, priority: Double): js.Any = js.native
    def off(): js.Any = js.native
    def off(eventMap: js.UndefOr[scala.Nothing], context: js.Any): js.Any = js.native
    def off(eventMap: EventMap): js.Any = js.native
    def off(eventMap: EventMap, context: js.Any): js.Any = js.native
    def off(name: js.UndefOr[scala.Nothing], callback: EventCallback): js.Any = js.native
    def off(name: js.UndefOr[scala.Nothing], callback: EventCallback, context: js.Any): js.Any = js.native
    def off(name: String): js.Any = js.native
    def off(name: String, callback: EventCallback): js.Any = js.native
    def off(name: String, callback: EventCallback, context: js.Any): js.Any = js.native
    def on(eventMap: EventMap): js.Any = js.native
    def on(eventMap: EventMap, callback: EventCallback): js.Any = js.native
    def on(eventMap: EventMap, callback: EventCallback, context: js.Any): js.Any = js.native
    def on(eventMap: EventMap, callback: EventCallback, context: js.Any, priority: Double): js.Any = js.native
    def on(eventMap: EventMap, context: js.Any): js.Any = js.native
    def on(name: String, callback: EventCallback): js.Any = js.native
    def on(name: String, callback: EventCallback, context: js.Any): js.Any = js.native
    def on(name: String, callback: EventCallback, context: js.Any, priority: Double): js.Any = js.native
    def once(eventMap: EventMap): js.Any = js.native
    def once(eventMap: EventMap, context: js.Any): js.Any = js.native
    def once(name: String, callback: EventCallback): js.Any = js.native
    def once(name: String, callback: EventCallback, context: js.Any): js.Any = js.native
    def once(name: String, callback: EventCallback, context: js.Any, priority: js.Any): js.Any = js.native
    def stopListening(): this.type = js.native
    def stopListening(obj: EventDispatcher): this.type = js.native
    def stopListening(obj: EventDispatcher, name: String): this.type = js.native
    def stopListening(obj: EventDispatcher, name: String, callback: EventCallback): this.type = js.native
    def stopListening(obj: EventDispatcher, name: EventMap): this.type = js.native
    def stopListening(obj: EventDispatcher, name: EventMap, callback: EventCallback): this.type = js.native
    def trigger(name: String, args: js.Any*): this.type = js.native
    def trigger(name: EventMap, args: js.Any*): this.type = js.native
    def trigger(name: Event, args: js.Any*): this.type = js.native
  }
  
  type EventMap = StringDictionary[EventCallback]
}

