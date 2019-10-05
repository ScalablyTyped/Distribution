package typings.wonderDotJs.distEs2015Mod

import typings.std.HTMLElement
import typings.wonderDashFrp.distEs2015StreamFromEventPatternStreamMod.FromEventPatternStream
import typings.wonderDotJs.distEs2015EventEEngineEventMod.EEngineEvent
import typings.wonderDotJs.distEs2015EventObjectEventNameHandlerMod.EEventName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015", "EventManager")
@js.native
class EventManager ()
  extends typings.wonderDotJs.distEs2015EventEventManagerMod.EventManager

/* static members */
@JSImport("wonder.js/dist/es2015", "EventManager")
@js.native
object EventManager extends js.Object {
  def broadcast(
    target: typings.wonderDotJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    event: typings.wonderDotJs.distEs2015EventObjectEventMod.Event
  ): js.Any = js.native
  def broadcast(
    target: typings.wonderDotJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    event: typings.wonderDotJs.distEs2015EventObjectEventMod.Event,
    userData: js.Any
  ): js.Any = js.native
  def emit(
    target: typings.wonderDotJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    event: typings.wonderDotJs.distEs2015EventObjectEventMod.Event
  ): js.Any = js.native
  def emit(
    target: typings.wonderDotJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    event: typings.wonderDotJs.distEs2015EventObjectEventMod.Event,
    userData: js.Any
  ): js.Any = js.native
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
  def fromEvent(
    target: typings.wonderDotJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    eventName: String
  ): FromEventPatternStream = js.native
  def fromEvent(
    target: typings.wonderDotJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    eventName: String,
    priority: Double
  ): FromEventPatternStream = js.native
  def fromEvent(
    target: typings.wonderDotJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    eventName: EEngineEvent
  ): FromEventPatternStream = js.native
  def fromEvent(
    target: typings.wonderDotJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    eventName: EEngineEvent,
    priority: Double
  ): FromEventPatternStream = js.native
  def fromEvent(
    target: typings.wonderDotJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    eventName: EEventName
  ): FromEventPatternStream = js.native
  def fromEvent(
    target: typings.wonderDotJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    eventName: EEventName,
    priority: Double
  ): FromEventPatternStream = js.native
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
  def off(target: typings.wonderDotJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject): Unit = js.native
  def off(
    target: typings.wonderDotJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    eventName: String
  ): Unit = js.native
  def off(
    target: typings.wonderDotJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    eventName: String,
    handler: js.Function
  ): Unit = js.native
  def off(
    target: typings.wonderDotJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    eventName: EEngineEvent
  ): Unit = js.native
  def off(
    target: typings.wonderDotJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    eventName: EEngineEvent,
    handler: js.Function
  ): Unit = js.native
  def off(
    target: typings.wonderDotJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    eventName: EEventName
  ): Unit = js.native
  def off(
    target: typings.wonderDotJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    eventName: EEventName,
    handler: js.Function
  ): Unit = js.native
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
  def on(
    target: typings.wonderDotJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    eventName: String,
    handler: js.Function
  ): Unit = js.native
  def on(
    target: typings.wonderDotJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    eventName: String,
    handler: js.Function,
    priority: Double
  ): Unit = js.native
  def on(
    target: typings.wonderDotJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    eventName: EEngineEvent,
    handler: js.Function
  ): Unit = js.native
  def on(
    target: typings.wonderDotJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    eventName: EEngineEvent,
    handler: js.Function,
    priority: Double
  ): Unit = js.native
  def on(
    target: typings.wonderDotJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    eventName: EEventName,
    handler: js.Function
  ): Unit = js.native
  def on(
    target: typings.wonderDotJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    eventName: EEventName,
    handler: js.Function,
    priority: Double
  ): Unit = js.native
  def setBubbleParent(target: typings.wonderDotJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject, parent: js.Any): Unit = js.native
  def trigger(dom: HTMLElement, event: typings.wonderDotJs.distEs2015EventObjectEventMod.Event): Unit = js.native
  def trigger(event: typings.wonderDotJs.distEs2015EventObjectEventMod.Event): Unit = js.native
  def trigger(event: typings.wonderDotJs.distEs2015EventObjectEventMod.Event, userData: js.Any): Unit = js.native
  def trigger(
    target: typings.wonderDotJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    event: typings.wonderDotJs.distEs2015EventObjectEventMod.Event
  ): Unit = js.native
  def trigger(
    target: typings.wonderDotJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    event: typings.wonderDotJs.distEs2015EventObjectEventMod.Event,
    userData: js.Any
  ): Unit = js.native
  def trigger(
    target: typings.wonderDotJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    event: typings.wonderDotJs.distEs2015EventObjectEventMod.Event,
    userData: js.Any,
    notSetTarget: Boolean
  ): Unit = js.native
}

