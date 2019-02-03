package typings
package wonderDotJsLib.distEs2015EventEventManagerMod

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
  def broadcast(
    target: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    event: wonderDotJsLib.distEs2015EventObjectEventMod.Event
  ): js.Any = js.native
  def broadcast(
    target: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    event: wonderDotJsLib.distEs2015EventObjectEventMod.Event,
    userData: js.Any
  ): js.Any = js.native
  def emit(
    target: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    event: wonderDotJsLib.distEs2015EventObjectEventMod.Event
  ): js.Any = js.native
  def emit(
    target: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    event: wonderDotJsLib.distEs2015EventObjectEventMod.Event,
    userData: js.Any
  ): js.Any = js.native
  def fromEvent(dom: stdLib.HTMLElement, eventName: java.lang.String): wonderDashFrpLib.distEs2015StreamFromEventPatternStreamMod.FromEventPatternStream = js.native
  def fromEvent(dom: stdLib.HTMLElement, eventName: java.lang.String, priority: scala.Double): wonderDashFrpLib.distEs2015StreamFromEventPatternStreamMod.FromEventPatternStream = js.native
  def fromEvent(dom: stdLib.HTMLElement, eventName: wonderDotJsLib.distEs2015EventEEngineEventMod.EEngineEvent): wonderDashFrpLib.distEs2015StreamFromEventPatternStreamMod.FromEventPatternStream = js.native
  def fromEvent(
    dom: stdLib.HTMLElement,
    eventName: wonderDotJsLib.distEs2015EventEEngineEventMod.EEngineEvent,
    priority: scala.Double
  ): wonderDashFrpLib.distEs2015StreamFromEventPatternStreamMod.FromEventPatternStream = js.native
  def fromEvent(
    dom: stdLib.HTMLElement,
    eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName
  ): wonderDashFrpLib.distEs2015StreamFromEventPatternStreamMod.FromEventPatternStream = js.native
  def fromEvent(
    dom: stdLib.HTMLElement,
    eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName,
    priority: scala.Double
  ): wonderDashFrpLib.distEs2015StreamFromEventPatternStreamMod.FromEventPatternStream = js.native
  def fromEvent(eventName: java.lang.String): wonderDashFrpLib.distEs2015StreamFromEventPatternStreamMod.FromEventPatternStream = js.native
  def fromEvent(eventName: java.lang.String, priority: scala.Double): wonderDashFrpLib.distEs2015StreamFromEventPatternStreamMod.FromEventPatternStream = js.native
  def fromEvent(eventName: wonderDotJsLib.distEs2015EventEEngineEventMod.EEngineEvent): wonderDashFrpLib.distEs2015StreamFromEventPatternStreamMod.FromEventPatternStream = js.native
  def fromEvent(eventName: wonderDotJsLib.distEs2015EventEEngineEventMod.EEngineEvent, priority: scala.Double): wonderDashFrpLib.distEs2015StreamFromEventPatternStreamMod.FromEventPatternStream = js.native
  def fromEvent(eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName): wonderDashFrpLib.distEs2015StreamFromEventPatternStreamMod.FromEventPatternStream = js.native
  def fromEvent(
    eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName,
    priority: scala.Double
  ): wonderDashFrpLib.distEs2015StreamFromEventPatternStreamMod.FromEventPatternStream = js.native
  def fromEvent(
    target: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    eventName: java.lang.String
  ): wonderDashFrpLib.distEs2015StreamFromEventPatternStreamMod.FromEventPatternStream = js.native
  def fromEvent(
    target: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    eventName: java.lang.String,
    priority: scala.Double
  ): wonderDashFrpLib.distEs2015StreamFromEventPatternStreamMod.FromEventPatternStream = js.native
  def fromEvent(
    target: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    eventName: wonderDotJsLib.distEs2015EventEEngineEventMod.EEngineEvent
  ): wonderDashFrpLib.distEs2015StreamFromEventPatternStreamMod.FromEventPatternStream = js.native
  def fromEvent(
    target: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    eventName: wonderDotJsLib.distEs2015EventEEngineEventMod.EEngineEvent,
    priority: scala.Double
  ): wonderDashFrpLib.distEs2015StreamFromEventPatternStreamMod.FromEventPatternStream = js.native
  def fromEvent(
    target: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName
  ): wonderDashFrpLib.distEs2015StreamFromEventPatternStreamMod.FromEventPatternStream = js.native
  def fromEvent(
    target: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName,
    priority: scala.Double
  ): wonderDashFrpLib.distEs2015StreamFromEventPatternStreamMod.FromEventPatternStream = js.native
  def off(): scala.Unit = js.native
  def off(dom: stdLib.HTMLElement): scala.Unit = js.native
  def off(
    dom: stdLib.HTMLElement,
    eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName
  ): scala.Unit = js.native
  def off(
    dom: stdLib.HTMLElement,
    eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName,
    handler: js.Function
  ): scala.Unit = js.native
  def off(eventName: java.lang.String): scala.Unit = js.native
  def off(eventName: java.lang.String, handler: js.Function): scala.Unit = js.native
  def off(eventName: wonderDotJsLib.distEs2015EventEEngineEventMod.EEngineEvent): scala.Unit = js.native
  def off(eventName: wonderDotJsLib.distEs2015EventEEngineEventMod.EEngineEvent, handler: js.Function): scala.Unit = js.native
  def off(eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName): scala.Unit = js.native
  def off(
    eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName,
    handler: js.Function
  ): scala.Unit = js.native
  def off(target: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject): scala.Unit = js.native
  def off(
    target: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    eventName: java.lang.String
  ): scala.Unit = js.native
  def off(
    target: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    eventName: java.lang.String,
    handler: js.Function
  ): scala.Unit = js.native
  def off(
    target: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    eventName: wonderDotJsLib.distEs2015EventEEngineEventMod.EEngineEvent
  ): scala.Unit = js.native
  def off(
    target: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    eventName: wonderDotJsLib.distEs2015EventEEngineEventMod.EEngineEvent,
    handler: js.Function
  ): scala.Unit = js.native
  def off(
    target: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName
  ): scala.Unit = js.native
  def off(
    target: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName,
    handler: js.Function
  ): scala.Unit = js.native
  def on(dom: stdLib.HTMLElement, eventName: java.lang.String, handler: js.Function): scala.Unit = js.native
  def on(dom: stdLib.HTMLElement, eventName: java.lang.String, handler: js.Function, priority: scala.Double): scala.Unit = js.native
  def on(
    dom: stdLib.HTMLElement,
    eventName: wonderDotJsLib.distEs2015EventEEngineEventMod.EEngineEvent,
    handler: js.Function
  ): scala.Unit = js.native
  def on(
    dom: stdLib.HTMLElement,
    eventName: wonderDotJsLib.distEs2015EventEEngineEventMod.EEngineEvent,
    handler: js.Function,
    priority: scala.Double
  ): scala.Unit = js.native
  def on(
    dom: stdLib.HTMLElement,
    eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName,
    handler: js.Function
  ): scala.Unit = js.native
  def on(
    dom: stdLib.HTMLElement,
    eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName,
    handler: js.Function,
    priority: scala.Double
  ): scala.Unit = js.native
  def on(eventName: java.lang.String, handler: js.Function): scala.Unit = js.native
  def on(eventName: java.lang.String, handler: js.Function, priority: scala.Double): scala.Unit = js.native
  def on(eventName: wonderDotJsLib.distEs2015EventEEngineEventMod.EEngineEvent, handler: js.Function): scala.Unit = js.native
  def on(
    eventName: wonderDotJsLib.distEs2015EventEEngineEventMod.EEngineEvent,
    handler: js.Function,
    priority: scala.Double
  ): scala.Unit = js.native
  def on(
    eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName,
    handler: js.Function
  ): scala.Unit = js.native
  def on(
    eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName,
    handler: js.Function,
    priority: scala.Double
  ): scala.Unit = js.native
  def on(
    target: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    eventName: java.lang.String,
    handler: js.Function
  ): scala.Unit = js.native
  def on(
    target: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    eventName: java.lang.String,
    handler: js.Function,
    priority: scala.Double
  ): scala.Unit = js.native
  def on(
    target: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    eventName: wonderDotJsLib.distEs2015EventEEngineEventMod.EEngineEvent,
    handler: js.Function
  ): scala.Unit = js.native
  def on(
    target: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    eventName: wonderDotJsLib.distEs2015EventEEngineEventMod.EEngineEvent,
    handler: js.Function,
    priority: scala.Double
  ): scala.Unit = js.native
  def on(
    target: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName,
    handler: js.Function
  ): scala.Unit = js.native
  def on(
    target: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName,
    handler: js.Function,
    priority: scala.Double
  ): scala.Unit = js.native
  def setBubbleParent(target: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject, parent: js.Any): scala.Unit = js.native
  def trigger(dom: stdLib.HTMLElement, event: wonderDotJsLib.distEs2015EventObjectEventMod.Event): scala.Unit = js.native
  def trigger(event: wonderDotJsLib.distEs2015EventObjectEventMod.Event): scala.Unit = js.native
  def trigger(event: wonderDotJsLib.distEs2015EventObjectEventMod.Event, userData: js.Any): scala.Unit = js.native
  def trigger(
    target: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    event: wonderDotJsLib.distEs2015EventObjectEventMod.Event
  ): scala.Unit = js.native
  def trigger(
    target: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    event: wonderDotJsLib.distEs2015EventObjectEventMod.Event,
    userData: js.Any
  ): scala.Unit = js.native
  def trigger(
    target: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    event: wonderDotJsLib.distEs2015EventObjectEventMod.Event,
    userData: js.Any,
    notSetTarget: scala.Boolean
  ): scala.Unit = js.native
}

