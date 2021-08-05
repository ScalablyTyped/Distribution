package typings.uifabricUtilities

import org.scalablytyped.runtime.StringDictionary
import typings.std.AddEventListenerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventGroupMod {
  
  @JSImport("@uifabric/utilities/lib/EventGroup", "EventGroup")
  @js.native
  class EventGroup protected () extends StObject {
    /** parent: the context in which events attached to non-HTMLElements are called */
    def this(parent: js.Any) = this()
    
    /* private */ var _eventRecords: js.Any = js.native
    
    /* private */ var _id: js.Any = js.native
    
    /* private */ var _isDisposed: js.Any = js.native
    
    /* private */ var _parent: js.Any = js.native
    
    /** Declare an event as being supported by this instance of EventGroup. */
    def declare(event: String): Unit = js.native
    def declare(event: js.Array[String]): Unit = js.native
    
    def dispose(): Unit = js.native
    
    def off(): Unit = js.native
    def off(target: js.Any): Unit = js.native
    def off(target: js.Any, eventName: String): Unit = js.native
    def off(target: js.Any, eventName: String, callback: js.Function1[/* args */ js.UndefOr[js.Any], Unit]): Unit = js.native
    def off(
      target: js.Any,
      eventName: String,
      callback: js.Function1[/* args */ js.UndefOr[js.Any], Unit],
      options: Boolean
    ): Unit = js.native
    def off(
      target: js.Any,
      eventName: String,
      callback: js.Function1[/* args */ js.UndefOr[js.Any], Unit],
      options: AddEventListenerOptions
    ): Unit = js.native
    def off(target: js.Any, eventName: String, callback: Unit, options: Boolean): Unit = js.native
    def off(target: js.Any, eventName: String, callback: Unit, options: AddEventListenerOptions): Unit = js.native
    def off(target: js.Any, eventName: Unit, callback: js.Function1[/* args */ js.UndefOr[js.Any], Unit]): Unit = js.native
    def off(
      target: js.Any,
      eventName: Unit,
      callback: js.Function1[/* args */ js.UndefOr[js.Any], Unit],
      options: Boolean
    ): Unit = js.native
    def off(
      target: js.Any,
      eventName: Unit,
      callback: js.Function1[/* args */ js.UndefOr[js.Any], Unit],
      options: AddEventListenerOptions
    ): Unit = js.native
    def off(target: js.Any, eventName: Unit, callback: Unit, options: Boolean): Unit = js.native
    def off(target: js.Any, eventName: Unit, callback: Unit, options: AddEventListenerOptions): Unit = js.native
    def off(target: Unit, eventName: String): Unit = js.native
    def off(target: Unit, eventName: String, callback: js.Function1[/* args */ js.UndefOr[js.Any], Unit]): Unit = js.native
    def off(
      target: Unit,
      eventName: String,
      callback: js.Function1[/* args */ js.UndefOr[js.Any], Unit],
      options: Boolean
    ): Unit = js.native
    def off(
      target: Unit,
      eventName: String,
      callback: js.Function1[/* args */ js.UndefOr[js.Any], Unit],
      options: AddEventListenerOptions
    ): Unit = js.native
    def off(target: Unit, eventName: String, callback: Unit, options: Boolean): Unit = js.native
    def off(target: Unit, eventName: String, callback: Unit, options: AddEventListenerOptions): Unit = js.native
    def off(target: Unit, eventName: Unit, callback: js.Function1[/* args */ js.UndefOr[js.Any], Unit]): Unit = js.native
    def off(
      target: Unit,
      eventName: Unit,
      callback: js.Function1[/* args */ js.UndefOr[js.Any], Unit],
      options: Boolean
    ): Unit = js.native
    def off(
      target: Unit,
      eventName: Unit,
      callback: js.Function1[/* args */ js.UndefOr[js.Any], Unit],
      options: AddEventListenerOptions
    ): Unit = js.native
    def off(target: Unit, eventName: Unit, callback: Unit, options: Boolean): Unit = js.native
    def off(target: Unit, eventName: Unit, callback: Unit, options: AddEventListenerOptions): Unit = js.native
    
    /**
      * On the target, attach an event whose handler will be called in the context of the parent
      * of this instance of EventGroup.
      */
    def on(target: js.Any, eventName: String, callback: js.Function1[/* args */ js.UndefOr[js.Any], Unit]): Unit = js.native
    def on(
      target: js.Any,
      eventName: String,
      callback: js.Function1[/* args */ js.UndefOr[js.Any], Unit],
      options: Boolean
    ): Unit = js.native
    def on(
      target: js.Any,
      eventName: String,
      callback: js.Function1[/* args */ js.UndefOr[js.Any], Unit],
      options: AddEventListenerOptions
    ): Unit = js.native
    
    /** On the target, attach a set of events, where the events object is a name to function mapping. */
    def onAll(target: js.Any, events: StringDictionary[js.Function1[/* args */ js.UndefOr[js.Any], Unit]]): Unit = js.native
    def onAll(
      target: js.Any,
      events: StringDictionary[js.Function1[/* args */ js.UndefOr[js.Any], Unit]],
      useCapture: Boolean
    ): Unit = js.native
    
    /** Trigger the given event in the context of this instance of EventGroup. */
    def raise(eventName: String): js.UndefOr[Boolean] = js.native
    def raise(eventName: String, eventArgs: js.Any): js.UndefOr[Boolean] = js.native
    def raise(eventName: String, eventArgs: js.Any, bubbleEvent: Boolean): js.UndefOr[Boolean] = js.native
    def raise(eventName: String, eventArgs: Unit, bubbleEvent: Boolean): js.UndefOr[Boolean] = js.native
  }
  /* static members */
  object EventGroup {
    
    @JSImport("@uifabric/utilities/lib/EventGroup", "EventGroup")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@uifabric/utilities/lib/EventGroup", "EventGroup._isElement")
    @js.native
    def _isElement: js.Any = js.native
    inline def _isElement_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_isElement")(x.asInstanceOf[js.Any])
    
    @JSImport("@uifabric/utilities/lib/EventGroup", "EventGroup._uniqueId")
    @js.native
    def _uniqueId: js.Any = js.native
    inline def _uniqueId_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_uniqueId")(x.asInstanceOf[js.Any])
    
    /** Check to see if the target has declared support of the given event. */
    inline def isDeclared(target: js.Any, eventName: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDeclared")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def isObserved(target: js.Any, eventName: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isObserved")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /** For IE8, bubbleEvent is ignored here and must be dealt with by the handler.
      *  Events raised here by default have bubbling set to false and cancelable set to true.
      *  This applies also to built-in events being raised manually here on HTMLElements,
      *  which may lead to unexpected behavior if it differs from the defaults.
      *
      */
    inline def raise(target: js.Any, eventName: String): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("raise")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
    inline def raise(target: js.Any, eventName: String, eventArgs: js.Any): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("raise")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventArgs.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
    inline def raise(target: js.Any, eventName: String, eventArgs: js.Any, bubbleEvent: Boolean): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("raise")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventArgs.asInstanceOf[js.Any], bubbleEvent.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
    inline def raise(target: js.Any, eventName: String, eventArgs: Unit, bubbleEvent: Boolean): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("raise")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventArgs.asInstanceOf[js.Any], bubbleEvent.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
    
    inline def stopPropagation(event: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopPropagation")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  type IDeclaredEventsByName = StringDictionary[Boolean]
  
  @js.native
  trait IEventRecord extends StObject {
    
    def callback(): Unit = js.native
    def callback(args: js.Any): Unit = js.native
    
    var elementCallback: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
    
    var eventName: String = js.native
    
    var objectCallback: js.UndefOr[js.Function1[/* args */ js.UndefOr[js.Any], Unit]] = js.native
    
    var options: js.UndefOr[Boolean | AddEventListenerOptions] = js.native
    
    var parent: js.Any = js.native
    
    var target: js.Any = js.native
  }
  
  trait IEventRecordList
    extends StObject
       with /* id */ StringDictionary[js.Array[IEventRecord] | Double] {
    
    var count: Double
  }
  object IEventRecordList {
    
    inline def apply(count: Double): IEventRecordList = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
      __obj.asInstanceOf[IEventRecordList]
    }
    
    extension [Self <: IEventRecordList](x: Self) {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    }
  }
  
  type IEventRecordsByName = StringDictionary[IEventRecordList]
}
