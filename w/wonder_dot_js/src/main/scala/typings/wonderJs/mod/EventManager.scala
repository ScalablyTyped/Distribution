package typings.wonderJs.mod

import typings.std.HTMLElement
import typings.wonderFrp.streamFromEventPatternStreamMod.FromEventPatternStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015", "EventManager")
@js.native
class EventManager ()
  extends typings.wonderJs.eventManagerMod.EventManager

/* static members */
@JSImport("wonder.js/dist/es2015", "EventManager")
@js.native
object EventManager extends js.Object {
  def broadcast(target: typings.wonderJs.entityObjectMod.EntityObject, event: typings.wonderJs.eventMod.Event): js.Any = js.native
  def broadcast(
    target: typings.wonderJs.entityObjectMod.EntityObject,
    event: typings.wonderJs.eventMod.Event,
    userData: js.Any
  ): js.Any = js.native
  def emit(target: typings.wonderJs.entityObjectMod.EntityObject, event: typings.wonderJs.eventMod.Event): js.Any = js.native
  def emit(
    target: typings.wonderJs.entityObjectMod.EntityObject,
    event: typings.wonderJs.eventMod.Event,
    userData: js.Any
  ): js.Any = js.native
  def fromEvent(dom: HTMLElement, eventName: String): FromEventPatternStream = js.native
  def fromEvent(dom: HTMLElement, eventName: String, priority: Double): FromEventPatternStream = js.native
  def fromEvent(dom: HTMLElement, eventName: typings.wonderJs.eengineeventMod.EEngineEvent): FromEventPatternStream = js.native
  def fromEvent(dom: HTMLElement, eventName: typings.wonderJs.eengineeventMod.EEngineEvent, priority: Double): FromEventPatternStream = js.native
  def fromEvent(dom: HTMLElement, eventName: typings.wonderJs.eventNameHandlerMod.EEventName): FromEventPatternStream = js.native
  def fromEvent(dom: HTMLElement, eventName: typings.wonderJs.eventNameHandlerMod.EEventName, priority: Double): FromEventPatternStream = js.native
  def fromEvent(eventName: String): FromEventPatternStream = js.native
  def fromEvent(eventName: String, priority: Double): FromEventPatternStream = js.native
  def fromEvent(eventName: typings.wonderJs.eengineeventMod.EEngineEvent): FromEventPatternStream = js.native
  def fromEvent(eventName: typings.wonderJs.eengineeventMod.EEngineEvent, priority: Double): FromEventPatternStream = js.native
  def fromEvent(eventName: typings.wonderJs.eventNameHandlerMod.EEventName): FromEventPatternStream = js.native
  def fromEvent(eventName: typings.wonderJs.eventNameHandlerMod.EEventName, priority: Double): FromEventPatternStream = js.native
  def fromEvent(target: typings.wonderJs.entityObjectMod.EntityObject, eventName: String): FromEventPatternStream = js.native
  def fromEvent(target: typings.wonderJs.entityObjectMod.EntityObject, eventName: String, priority: Double): FromEventPatternStream = js.native
  def fromEvent(
    target: typings.wonderJs.entityObjectMod.EntityObject,
    eventName: typings.wonderJs.eengineeventMod.EEngineEvent
  ): FromEventPatternStream = js.native
  def fromEvent(
    target: typings.wonderJs.entityObjectMod.EntityObject,
    eventName: typings.wonderJs.eengineeventMod.EEngineEvent,
    priority: Double
  ): FromEventPatternStream = js.native
  def fromEvent(
    target: typings.wonderJs.entityObjectMod.EntityObject,
    eventName: typings.wonderJs.eventNameHandlerMod.EEventName
  ): FromEventPatternStream = js.native
  def fromEvent(
    target: typings.wonderJs.entityObjectMod.EntityObject,
    eventName: typings.wonderJs.eventNameHandlerMod.EEventName,
    priority: Double
  ): FromEventPatternStream = js.native
  def off(): Unit = js.native
  def off(dom: HTMLElement): Unit = js.native
  def off(dom: HTMLElement, eventName: typings.wonderJs.eventNameHandlerMod.EEventName): Unit = js.native
  def off(dom: HTMLElement, eventName: typings.wonderJs.eventNameHandlerMod.EEventName, handler: js.Function): Unit = js.native
  def off(eventName: String): Unit = js.native
  def off(eventName: String, handler: js.Function): Unit = js.native
  def off(eventName: typings.wonderJs.eengineeventMod.EEngineEvent): Unit = js.native
  def off(eventName: typings.wonderJs.eengineeventMod.EEngineEvent, handler: js.Function): Unit = js.native
  def off(eventName: typings.wonderJs.eventNameHandlerMod.EEventName): Unit = js.native
  def off(eventName: typings.wonderJs.eventNameHandlerMod.EEventName, handler: js.Function): Unit = js.native
  def off(target: typings.wonderJs.entityObjectMod.EntityObject): Unit = js.native
  def off(target: typings.wonderJs.entityObjectMod.EntityObject, eventName: String): Unit = js.native
  def off(target: typings.wonderJs.entityObjectMod.EntityObject, eventName: String, handler: js.Function): Unit = js.native
  def off(
    target: typings.wonderJs.entityObjectMod.EntityObject,
    eventName: typings.wonderJs.eengineeventMod.EEngineEvent
  ): Unit = js.native
  def off(
    target: typings.wonderJs.entityObjectMod.EntityObject,
    eventName: typings.wonderJs.eengineeventMod.EEngineEvent,
    handler: js.Function
  ): Unit = js.native
  def off(
    target: typings.wonderJs.entityObjectMod.EntityObject,
    eventName: typings.wonderJs.eventNameHandlerMod.EEventName
  ): Unit = js.native
  def off(
    target: typings.wonderJs.entityObjectMod.EntityObject,
    eventName: typings.wonderJs.eventNameHandlerMod.EEventName,
    handler: js.Function
  ): Unit = js.native
  def on(dom: HTMLElement, eventName: String, handler: js.Function): Unit = js.native
  def on(dom: HTMLElement, eventName: String, handler: js.Function, priority: Double): Unit = js.native
  def on(dom: HTMLElement, eventName: typings.wonderJs.eengineeventMod.EEngineEvent, handler: js.Function): Unit = js.native
  def on(
    dom: HTMLElement,
    eventName: typings.wonderJs.eengineeventMod.EEngineEvent,
    handler: js.Function,
    priority: Double
  ): Unit = js.native
  def on(dom: HTMLElement, eventName: typings.wonderJs.eventNameHandlerMod.EEventName, handler: js.Function): Unit = js.native
  def on(
    dom: HTMLElement,
    eventName: typings.wonderJs.eventNameHandlerMod.EEventName,
    handler: js.Function,
    priority: Double
  ): Unit = js.native
  def on(eventName: String, handler: js.Function): Unit = js.native
  def on(eventName: String, handler: js.Function, priority: Double): Unit = js.native
  def on(eventName: typings.wonderJs.eengineeventMod.EEngineEvent, handler: js.Function): Unit = js.native
  def on(eventName: typings.wonderJs.eengineeventMod.EEngineEvent, handler: js.Function, priority: Double): Unit = js.native
  def on(eventName: typings.wonderJs.eventNameHandlerMod.EEventName, handler: js.Function): Unit = js.native
  def on(eventName: typings.wonderJs.eventNameHandlerMod.EEventName, handler: js.Function, priority: Double): Unit = js.native
  def on(target: typings.wonderJs.entityObjectMod.EntityObject, eventName: String, handler: js.Function): Unit = js.native
  def on(
    target: typings.wonderJs.entityObjectMod.EntityObject,
    eventName: String,
    handler: js.Function,
    priority: Double
  ): Unit = js.native
  def on(
    target: typings.wonderJs.entityObjectMod.EntityObject,
    eventName: typings.wonderJs.eengineeventMod.EEngineEvent,
    handler: js.Function
  ): Unit = js.native
  def on(
    target: typings.wonderJs.entityObjectMod.EntityObject,
    eventName: typings.wonderJs.eengineeventMod.EEngineEvent,
    handler: js.Function,
    priority: Double
  ): Unit = js.native
  def on(
    target: typings.wonderJs.entityObjectMod.EntityObject,
    eventName: typings.wonderJs.eventNameHandlerMod.EEventName,
    handler: js.Function
  ): Unit = js.native
  def on(
    target: typings.wonderJs.entityObjectMod.EntityObject,
    eventName: typings.wonderJs.eventNameHandlerMod.EEventName,
    handler: js.Function,
    priority: Double
  ): Unit = js.native
  def setBubbleParent(target: typings.wonderJs.entityObjectMod.EntityObject, parent: js.Any): Unit = js.native
  def trigger(dom: HTMLElement, event: typings.wonderJs.eventMod.Event): Unit = js.native
  def trigger(event: typings.wonderJs.eventMod.Event): Unit = js.native
  def trigger(event: typings.wonderJs.eventMod.Event, userData: js.Any): Unit = js.native
  def trigger(target: typings.wonderJs.entityObjectMod.EntityObject, event: typings.wonderJs.eventMod.Event): Unit = js.native
  def trigger(
    target: typings.wonderJs.entityObjectMod.EntityObject,
    event: typings.wonderJs.eventMod.Event,
    userData: js.Any
  ): Unit = js.native
  def trigger(
    target: typings.wonderJs.entityObjectMod.EntityObject,
    event: typings.wonderJs.eventMod.Event,
    userData: js.Any,
    notSetTarget: Boolean
  ): Unit = js.native
}

