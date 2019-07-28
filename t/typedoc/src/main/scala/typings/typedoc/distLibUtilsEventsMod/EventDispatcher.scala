package typings.typedoc.distLibUtilsEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/utils/events", "EventDispatcher")
@js.native
class EventDispatcher () extends js.Object {
  var _events: js.UndefOr[js.Any] = js.native
  val _listenId: js.Any = js.native
  var _listeners: js.UndefOr[js.Any] = js.native
  var _listeningTo: js.UndefOr[js.Any] = js.native
  var _savedListenId: js.UndefOr[js.Any] = js.native
  var internalOn: js.Any = js.native
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

