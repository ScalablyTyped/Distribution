package typings.wonderJs.mod

import typings.std.HTMLElement
import typings.wonderFrp.streamFromEventPatternStreamMod.FromEventPatternStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder.js/dist/es2015", "EventManager")
@js.native
class EventManager ()
  extends typings.wonderJs.eventManagerMod.EventManager
/* static members */
object EventManager {
  
  @JSImport("wonder.js/dist/es2015", "EventManager")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def broadcast(target: typings.wonderJs.entityObjectMod.EntityObject, event: typings.wonderJs.eventMod.Event): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("broadcast")(target.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def broadcast(
    target: typings.wonderJs.entityObjectMod.EntityObject,
    event: typings.wonderJs.eventMod.Event,
    userData: js.Any
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("broadcast")(target.asInstanceOf[js.Any], event.asInstanceOf[js.Any], userData.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def emit(target: typings.wonderJs.entityObjectMod.EntityObject, event: typings.wonderJs.eventMod.Event): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("emit")(target.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def emit(
    target: typings.wonderJs.entityObjectMod.EntityObject,
    event: typings.wonderJs.eventMod.Event,
    userData: js.Any
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("emit")(target.asInstanceOf[js.Any], event.asInstanceOf[js.Any], userData.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def fromEvent(dom: HTMLElement, eventName: String): FromEventPatternStream = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(dom.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[FromEventPatternStream]
  @scala.inline
  def fromEvent(dom: HTMLElement, eventName: String, priority: Double): FromEventPatternStream = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(dom.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[FromEventPatternStream]
  @scala.inline
  def fromEvent(dom: HTMLElement, eventName: typings.wonderJs.eengineeventMod.EEngineEvent): FromEventPatternStream = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(dom.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[FromEventPatternStream]
  @scala.inline
  def fromEvent(dom: HTMLElement, eventName: typings.wonderJs.eengineeventMod.EEngineEvent, priority: Double): FromEventPatternStream = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(dom.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[FromEventPatternStream]
  @scala.inline
  def fromEvent(dom: HTMLElement, eventName: typings.wonderJs.eventNameHandlerMod.EEventName): FromEventPatternStream = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(dom.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[FromEventPatternStream]
  @scala.inline
  def fromEvent(dom: HTMLElement, eventName: typings.wonderJs.eventNameHandlerMod.EEventName, priority: Double): FromEventPatternStream = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(dom.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[FromEventPatternStream]
  @scala.inline
  def fromEvent(eventName: String): FromEventPatternStream = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(eventName.asInstanceOf[js.Any]).asInstanceOf[FromEventPatternStream]
  @scala.inline
  def fromEvent(eventName: String, priority: Double): FromEventPatternStream = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(eventName.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[FromEventPatternStream]
  @scala.inline
  def fromEvent(eventName: typings.wonderJs.eengineeventMod.EEngineEvent): FromEventPatternStream = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(eventName.asInstanceOf[js.Any]).asInstanceOf[FromEventPatternStream]
  @scala.inline
  def fromEvent(eventName: typings.wonderJs.eengineeventMod.EEngineEvent, priority: Double): FromEventPatternStream = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(eventName.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[FromEventPatternStream]
  @scala.inline
  def fromEvent(eventName: typings.wonderJs.eventNameHandlerMod.EEventName): FromEventPatternStream = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(eventName.asInstanceOf[js.Any]).asInstanceOf[FromEventPatternStream]
  @scala.inline
  def fromEvent(eventName: typings.wonderJs.eventNameHandlerMod.EEventName, priority: Double): FromEventPatternStream = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(eventName.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[FromEventPatternStream]
  @scala.inline
  def fromEvent(target: typings.wonderJs.entityObjectMod.EntityObject, eventName: String): FromEventPatternStream = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[FromEventPatternStream]
  @scala.inline
  def fromEvent(target: typings.wonderJs.entityObjectMod.EntityObject, eventName: String, priority: Double): FromEventPatternStream = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[FromEventPatternStream]
  @scala.inline
  def fromEvent(
    target: typings.wonderJs.entityObjectMod.EntityObject,
    eventName: typings.wonderJs.eengineeventMod.EEngineEvent
  ): FromEventPatternStream = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[FromEventPatternStream]
  @scala.inline
  def fromEvent(
    target: typings.wonderJs.entityObjectMod.EntityObject,
    eventName: typings.wonderJs.eengineeventMod.EEngineEvent,
    priority: Double
  ): FromEventPatternStream = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[FromEventPatternStream]
  @scala.inline
  def fromEvent(
    target: typings.wonderJs.entityObjectMod.EntityObject,
    eventName: typings.wonderJs.eventNameHandlerMod.EEventName
  ): FromEventPatternStream = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[FromEventPatternStream]
  @scala.inline
  def fromEvent(
    target: typings.wonderJs.entityObjectMod.EntityObject,
    eventName: typings.wonderJs.eventNameHandlerMod.EEventName,
    priority: Double
  ): FromEventPatternStream = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[FromEventPatternStream]
  
  @scala.inline
  def off(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("off")().asInstanceOf[Unit]
  @scala.inline
  def off(dom: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("off")(dom.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def off(dom: HTMLElement, eventName: typings.wonderJs.eventNameHandlerMod.EEventName): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(dom.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def off(dom: HTMLElement, eventName: typings.wonderJs.eventNameHandlerMod.EEventName, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(dom.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def off(eventName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("off")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def off(eventName: String, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def off(eventName: typings.wonderJs.eengineeventMod.EEngineEvent): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("off")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def off(eventName: typings.wonderJs.eengineeventMod.EEngineEvent, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def off(eventName: typings.wonderJs.eventNameHandlerMod.EEventName): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("off")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def off(eventName: typings.wonderJs.eventNameHandlerMod.EEventName, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def off(target: typings.wonderJs.entityObjectMod.EntityObject): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("off")(target.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def off(target: typings.wonderJs.entityObjectMod.EntityObject, eventName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def off(target: typings.wonderJs.entityObjectMod.EntityObject, eventName: String, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def off(
    target: typings.wonderJs.entityObjectMod.EntityObject,
    eventName: typings.wonderJs.eengineeventMod.EEngineEvent
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def off(
    target: typings.wonderJs.entityObjectMod.EntityObject,
    eventName: typings.wonderJs.eengineeventMod.EEngineEvent,
    handler: js.Function
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def off(
    target: typings.wonderJs.entityObjectMod.EntityObject,
    eventName: typings.wonderJs.eventNameHandlerMod.EEventName
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def off(
    target: typings.wonderJs.entityObjectMod.EntityObject,
    eventName: typings.wonderJs.eventNameHandlerMod.EEventName,
    handler: js.Function
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on(dom: HTMLElement, eventName: String, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(dom.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(dom: HTMLElement, eventName: String, handler: js.Function, priority: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(dom.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(dom: HTMLElement, eventName: typings.wonderJs.eengineeventMod.EEngineEvent, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(dom.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(
    dom: HTMLElement,
    eventName: typings.wonderJs.eengineeventMod.EEngineEvent,
    handler: js.Function,
    priority: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(dom.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(dom: HTMLElement, eventName: typings.wonderJs.eventNameHandlerMod.EEventName, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(dom.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(
    dom: HTMLElement,
    eventName: typings.wonderJs.eventNameHandlerMod.EEventName,
    handler: js.Function,
    priority: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(dom.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(eventName: String, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(eventName: String, handler: js.Function, priority: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(eventName: typings.wonderJs.eengineeventMod.EEngineEvent, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(eventName: typings.wonderJs.eengineeventMod.EEngineEvent, handler: js.Function, priority: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(eventName: typings.wonderJs.eventNameHandlerMod.EEventName, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(eventName: typings.wonderJs.eventNameHandlerMod.EEventName, handler: js.Function, priority: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(target: typings.wonderJs.entityObjectMod.EntityObject, eventName: String, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(
    target: typings.wonderJs.entityObjectMod.EntityObject,
    eventName: String,
    handler: js.Function,
    priority: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(
    target: typings.wonderJs.entityObjectMod.EntityObject,
    eventName: typings.wonderJs.eengineeventMod.EEngineEvent,
    handler: js.Function
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(
    target: typings.wonderJs.entityObjectMod.EntityObject,
    eventName: typings.wonderJs.eengineeventMod.EEngineEvent,
    handler: js.Function,
    priority: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(
    target: typings.wonderJs.entityObjectMod.EntityObject,
    eventName: typings.wonderJs.eventNameHandlerMod.EEventName,
    handler: js.Function
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(
    target: typings.wonderJs.entityObjectMod.EntityObject,
    eventName: typings.wonderJs.eventNameHandlerMod.EEventName,
    handler: js.Function,
    priority: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def setBubbleParent(target: typings.wonderJs.entityObjectMod.EntityObject, parent: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setBubbleParent")(target.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def trigger(dom: HTMLElement, event: typings.wonderJs.eventMod.Event): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(dom.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def trigger(event: typings.wonderJs.eventMod.Event): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def trigger(event: typings.wonderJs.eventMod.Event, userData: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(event.asInstanceOf[js.Any], userData.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def trigger(target: typings.wonderJs.entityObjectMod.EntityObject, event: typings.wonderJs.eventMod.Event): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(target.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def trigger(
    target: typings.wonderJs.entityObjectMod.EntityObject,
    event: typings.wonderJs.eventMod.Event,
    userData: js.Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(target.asInstanceOf[js.Any], event.asInstanceOf[js.Any], userData.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def trigger(
    target: typings.wonderJs.entityObjectMod.EntityObject,
    event: typings.wonderJs.eventMod.Event,
    userData: js.Any,
    notSetTarget: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(target.asInstanceOf[js.Any], event.asInstanceOf[js.Any], userData.asInstanceOf[js.Any], notSetTarget.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
