package typings.wonderDotJs.distEs2015EventEventManagerMod

import typings.std.HTMLElement
import typings.wonderDashFrp.distEs2015StreamFromEventPatternStreamMod.FromEventPatternStream
import typings.wonderDotJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject
import typings.wonderDotJs.distEs2015EventEEngineEventMod.EEngineEvent
import typings.wonderDotJs.distEs2015EventObjectEventMod.Event
import typings.wonderDotJs.distEs2015EventObjectEventNameHandlerMod.EEventName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/EventManager", "EventManager")
@js.native
class EventManager () extends js.Object

/* static members */
@JSImport("wonder.js/dist/es2015/event/EventManager", "EventManager")
@js.native
object EventManager extends js.Object {
  def broadcast(target: EntityObject, event: Event): js.Any = js.native
  def broadcast(target: EntityObject, event: Event, userData: js.Any): js.Any = js.native
  def emit(target: EntityObject, event: Event): js.Any = js.native
  def emit(target: EntityObject, event: Event, userData: js.Any): js.Any = js.native
  def fromEvent(dom: HTMLElement, eventName: String): FromEventPatternStream = js.native
  def fromEvent(dom: HTMLElement, eventName: String, priority: Double): FromEventPatternStream = js.native
  def fromEvent(dom: HTMLElement, eventName: EEngineEvent): FromEventPatternStream = js.native
  def fromEvent(dom: HTMLElement, eventName: EEngineEvent, priority: Double): FromEventPatternStream = js.native
  def fromEvent(dom: HTMLElement, eventName: EEventName): FromEventPatternStream = js.native
  def fromEvent(dom: HTMLElement, eventName: EEventName, priority: Double): FromEventPatternStream = js.native
  def fromEvent(eventName: String): FromEventPatternStream = js.native
  def fromEvent(eventName: String, priority: Double): FromEventPatternStream = js.native
  def fromEvent(eventName: EEngineEvent): FromEventPatternStream = js.native
  def fromEvent(eventName: EEngineEvent, priority: Double): FromEventPatternStream = js.native
  def fromEvent(eventName: EEventName): FromEventPatternStream = js.native
  def fromEvent(eventName: EEventName, priority: Double): FromEventPatternStream = js.native
  def fromEvent(target: EntityObject, eventName: String): FromEventPatternStream = js.native
  def fromEvent(target: EntityObject, eventName: String, priority: Double): FromEventPatternStream = js.native
  def fromEvent(target: EntityObject, eventName: EEngineEvent): FromEventPatternStream = js.native
  def fromEvent(target: EntityObject, eventName: EEngineEvent, priority: Double): FromEventPatternStream = js.native
  def fromEvent(target: EntityObject, eventName: EEventName): FromEventPatternStream = js.native
  def fromEvent(target: EntityObject, eventName: EEventName, priority: Double): FromEventPatternStream = js.native
  def off(): Unit = js.native
  def off(dom: HTMLElement): Unit = js.native
  def off(dom: HTMLElement, eventName: EEventName): Unit = js.native
  def off(dom: HTMLElement, eventName: EEventName, handler: js.Function): Unit = js.native
  def off(eventName: String): Unit = js.native
  def off(eventName: String, handler: js.Function): Unit = js.native
  def off(eventName: EEngineEvent): Unit = js.native
  def off(eventName: EEngineEvent, handler: js.Function): Unit = js.native
  def off(eventName: EEventName): Unit = js.native
  def off(eventName: EEventName, handler: js.Function): Unit = js.native
  def off(target: EntityObject): Unit = js.native
  def off(target: EntityObject, eventName: String): Unit = js.native
  def off(target: EntityObject, eventName: String, handler: js.Function): Unit = js.native
  def off(target: EntityObject, eventName: EEngineEvent): Unit = js.native
  def off(target: EntityObject, eventName: EEngineEvent, handler: js.Function): Unit = js.native
  def off(target: EntityObject, eventName: EEventName): Unit = js.native
  def off(target: EntityObject, eventName: EEventName, handler: js.Function): Unit = js.native
  def on(dom: HTMLElement, eventName: String, handler: js.Function): Unit = js.native
  def on(dom: HTMLElement, eventName: String, handler: js.Function, priority: Double): Unit = js.native
  def on(dom: HTMLElement, eventName: EEngineEvent, handler: js.Function): Unit = js.native
  def on(dom: HTMLElement, eventName: EEngineEvent, handler: js.Function, priority: Double): Unit = js.native
  def on(dom: HTMLElement, eventName: EEventName, handler: js.Function): Unit = js.native
  def on(dom: HTMLElement, eventName: EEventName, handler: js.Function, priority: Double): Unit = js.native
  def on(eventName: String, handler: js.Function): Unit = js.native
  def on(eventName: String, handler: js.Function, priority: Double): Unit = js.native
  def on(eventName: EEngineEvent, handler: js.Function): Unit = js.native
  def on(eventName: EEngineEvent, handler: js.Function, priority: Double): Unit = js.native
  def on(eventName: EEventName, handler: js.Function): Unit = js.native
  def on(eventName: EEventName, handler: js.Function, priority: Double): Unit = js.native
  def on(target: EntityObject, eventName: String, handler: js.Function): Unit = js.native
  def on(target: EntityObject, eventName: String, handler: js.Function, priority: Double): Unit = js.native
  def on(target: EntityObject, eventName: EEngineEvent, handler: js.Function): Unit = js.native
  def on(target: EntityObject, eventName: EEngineEvent, handler: js.Function, priority: Double): Unit = js.native
  def on(target: EntityObject, eventName: EEventName, handler: js.Function): Unit = js.native
  def on(target: EntityObject, eventName: EEventName, handler: js.Function, priority: Double): Unit = js.native
  def setBubbleParent(target: EntityObject, parent: js.Any): Unit = js.native
  def trigger(dom: HTMLElement, event: Event): Unit = js.native
  def trigger(event: Event): Unit = js.native
  def trigger(event: Event, userData: js.Any): Unit = js.native
  def trigger(target: EntityObject, event: Event): Unit = js.native
  def trigger(target: EntityObject, event: Event, userData: js.Any): Unit = js.native
  def trigger(target: EntityObject, event: Event, userData: js.Any, notSetTarget: Boolean): Unit = js.native
}

