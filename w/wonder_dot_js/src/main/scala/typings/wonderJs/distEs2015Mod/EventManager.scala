package typings.wonderJs.distEs2015Mod

import typings.std.HTMLElement
import typings.wonderFrp.distEs2015StreamFromEventPatternStreamMod.FromEventPatternStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder.js/dist/es2015", "EventManager")
@js.native
open class EventManager ()
  extends typings.wonderJs.distEs2015EventEventManagerMod.EventManager
/* static members */
object EventManager {
  
  @JSImport("wonder.js/dist/es2015", "EventManager")
  @js.native
  val ^ : js.Any = js.native
  
  inline def broadcast(
    target: typings.wonderJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    event: typings.wonderJs.distEs2015EventObjectEventMod.Event
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("broadcast")(target.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def broadcast(
    target: typings.wonderJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    event: typings.wonderJs.distEs2015EventObjectEventMod.Event,
    userData: Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("broadcast")(target.asInstanceOf[js.Any], event.asInstanceOf[js.Any], userData.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def emit(
    target: typings.wonderJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    event: typings.wonderJs.distEs2015EventObjectEventMod.Event
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("emit")(target.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def emit(
    target: typings.wonderJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    event: typings.wonderJs.distEs2015EventObjectEventMod.Event,
    userData: Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("emit")(target.asInstanceOf[js.Any], event.asInstanceOf[js.Any], userData.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def fromEvent(dom: HTMLElement, eventName: String): FromEventPatternStream = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(dom.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[FromEventPatternStream]
  inline def fromEvent(dom: HTMLElement, eventName: String, priority: Double): FromEventPatternStream = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(dom.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[FromEventPatternStream]
  inline def fromEvent(dom: HTMLElement, eventName: typings.wonderJs.distEs2015EventEengineeventMod.EEngineEvent): FromEventPatternStream = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(dom.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[FromEventPatternStream]
  inline def fromEvent(
    dom: HTMLElement,
    eventName: typings.wonderJs.distEs2015EventEengineeventMod.EEngineEvent,
    priority: Double
  ): FromEventPatternStream = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(dom.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[FromEventPatternStream]
  inline def fromEvent(dom: HTMLElement, eventName: typings.wonderJs.distEs2015EventObjectEventNameHandlerMod.EEventName): FromEventPatternStream = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(dom.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[FromEventPatternStream]
  inline def fromEvent(
    dom: HTMLElement,
    eventName: typings.wonderJs.distEs2015EventObjectEventNameHandlerMod.EEventName,
    priority: Double
  ): FromEventPatternStream = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(dom.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[FromEventPatternStream]
  inline def fromEvent(eventName: String): FromEventPatternStream = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(eventName.asInstanceOf[js.Any]).asInstanceOf[FromEventPatternStream]
  inline def fromEvent(eventName: String, priority: Double): FromEventPatternStream = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(eventName.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[FromEventPatternStream]
  inline def fromEvent(eventName: typings.wonderJs.distEs2015EventEengineeventMod.EEngineEvent): FromEventPatternStream = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(eventName.asInstanceOf[js.Any]).asInstanceOf[FromEventPatternStream]
  inline def fromEvent(eventName: typings.wonderJs.distEs2015EventEengineeventMod.EEngineEvent, priority: Double): FromEventPatternStream = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(eventName.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[FromEventPatternStream]
  inline def fromEvent(eventName: typings.wonderJs.distEs2015EventObjectEventNameHandlerMod.EEventName): FromEventPatternStream = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(eventName.asInstanceOf[js.Any]).asInstanceOf[FromEventPatternStream]
  inline def fromEvent(eventName: typings.wonderJs.distEs2015EventObjectEventNameHandlerMod.EEventName, priority: Double): FromEventPatternStream = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(eventName.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[FromEventPatternStream]
  inline def fromEvent(target: typings.wonderJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject, eventName: String): FromEventPatternStream = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[FromEventPatternStream]
  inline def fromEvent(
    target: typings.wonderJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    eventName: String,
    priority: Double
  ): FromEventPatternStream = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[FromEventPatternStream]
  inline def fromEvent(
    target: typings.wonderJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    eventName: typings.wonderJs.distEs2015EventEengineeventMod.EEngineEvent
  ): FromEventPatternStream = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[FromEventPatternStream]
  inline def fromEvent(
    target: typings.wonderJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    eventName: typings.wonderJs.distEs2015EventEengineeventMod.EEngineEvent,
    priority: Double
  ): FromEventPatternStream = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[FromEventPatternStream]
  inline def fromEvent(
    target: typings.wonderJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    eventName: typings.wonderJs.distEs2015EventObjectEventNameHandlerMod.EEventName
  ): FromEventPatternStream = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[FromEventPatternStream]
  inline def fromEvent(
    target: typings.wonderJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    eventName: typings.wonderJs.distEs2015EventObjectEventNameHandlerMod.EEventName,
    priority: Double
  ): FromEventPatternStream = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[FromEventPatternStream]
  
  inline def off(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("off")().asInstanceOf[Unit]
  inline def off(dom: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("off")(dom.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def off(dom: HTMLElement, eventName: typings.wonderJs.distEs2015EventObjectEventNameHandlerMod.EEventName): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(dom.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def off(
    dom: HTMLElement,
    eventName: typings.wonderJs.distEs2015EventObjectEventNameHandlerMod.EEventName,
    handler: js.Function
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(dom.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def off(eventName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("off")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def off(eventName: String, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def off(eventName: typings.wonderJs.distEs2015EventEengineeventMod.EEngineEvent): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("off")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def off(eventName: typings.wonderJs.distEs2015EventEengineeventMod.EEngineEvent, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def off(eventName: typings.wonderJs.distEs2015EventObjectEventNameHandlerMod.EEventName): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("off")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def off(
    eventName: typings.wonderJs.distEs2015EventObjectEventNameHandlerMod.EEventName,
    handler: js.Function
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def off(target: typings.wonderJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("off")(target.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def off(target: typings.wonderJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject, eventName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def off(
    target: typings.wonderJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    eventName: String,
    handler: js.Function
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def off(
    target: typings.wonderJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    eventName: typings.wonderJs.distEs2015EventEengineeventMod.EEngineEvent
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def off(
    target: typings.wonderJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    eventName: typings.wonderJs.distEs2015EventEengineeventMod.EEngineEvent,
    handler: js.Function
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def off(
    target: typings.wonderJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    eventName: typings.wonderJs.distEs2015EventObjectEventNameHandlerMod.EEventName
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def off(
    target: typings.wonderJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    eventName: typings.wonderJs.distEs2015EventObjectEventNameHandlerMod.EEventName,
    handler: js.Function
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on(dom: HTMLElement, eventName: String, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(dom.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(dom: HTMLElement, eventName: String, handler: js.Function, priority: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(dom.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(
    dom: HTMLElement,
    eventName: typings.wonderJs.distEs2015EventEengineeventMod.EEngineEvent,
    handler: js.Function
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(dom.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(
    dom: HTMLElement,
    eventName: typings.wonderJs.distEs2015EventEengineeventMod.EEngineEvent,
    handler: js.Function,
    priority: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(dom.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(
    dom: HTMLElement,
    eventName: typings.wonderJs.distEs2015EventObjectEventNameHandlerMod.EEventName,
    handler: js.Function
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(dom.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(
    dom: HTMLElement,
    eventName: typings.wonderJs.distEs2015EventObjectEventNameHandlerMod.EEventName,
    handler: js.Function,
    priority: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(dom.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(eventName: String, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(eventName: String, handler: js.Function, priority: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(eventName: typings.wonderJs.distEs2015EventEengineeventMod.EEngineEvent, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(
    eventName: typings.wonderJs.distEs2015EventEengineeventMod.EEngineEvent,
    handler: js.Function,
    priority: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(
    eventName: typings.wonderJs.distEs2015EventObjectEventNameHandlerMod.EEventName,
    handler: js.Function
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(
    eventName: typings.wonderJs.distEs2015EventObjectEventNameHandlerMod.EEventName,
    handler: js.Function,
    priority: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(
    target: typings.wonderJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    eventName: String,
    handler: js.Function
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(
    target: typings.wonderJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    eventName: String,
    handler: js.Function,
    priority: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(
    target: typings.wonderJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    eventName: typings.wonderJs.distEs2015EventEengineeventMod.EEngineEvent,
    handler: js.Function
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(
    target: typings.wonderJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    eventName: typings.wonderJs.distEs2015EventEengineeventMod.EEngineEvent,
    handler: js.Function,
    priority: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(
    target: typings.wonderJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    eventName: typings.wonderJs.distEs2015EventObjectEventNameHandlerMod.EEventName,
    handler: js.Function
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(
    target: typings.wonderJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    eventName: typings.wonderJs.distEs2015EventObjectEventNameHandlerMod.EEventName,
    handler: js.Function,
    priority: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setBubbleParent(target: typings.wonderJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject, parent: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setBubbleParent")(target.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def trigger(dom: HTMLElement, event: typings.wonderJs.distEs2015EventObjectEventMod.Event): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(dom.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def trigger(event: typings.wonderJs.distEs2015EventObjectEventMod.Event): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def trigger(event: typings.wonderJs.distEs2015EventObjectEventMod.Event, userData: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(event.asInstanceOf[js.Any], userData.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def trigger(
    target: typings.wonderJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    event: typings.wonderJs.distEs2015EventObjectEventMod.Event
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(target.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def trigger(
    target: typings.wonderJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    event: typings.wonderJs.distEs2015EventObjectEventMod.Event,
    userData: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(target.asInstanceOf[js.Any], event.asInstanceOf[js.Any], userData.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def trigger(
    target: typings.wonderJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    event: typings.wonderJs.distEs2015EventObjectEventMod.Event,
    userData: Any,
    notSetTarget: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(target.asInstanceOf[js.Any], event.asInstanceOf[js.Any], userData.asInstanceOf[js.Any], notSetTarget.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
