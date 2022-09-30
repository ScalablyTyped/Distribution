package typings.subscribeUiEvent

import typings.std.AddEventListenerOptions
import typings.std.Document
import typings.std.EventListenerOrEventListenerObject
import typings.std.EventTarget
import typings.std.HTMLElement
import typings.std.TouchEvent
import typings.std.UIEvent
import typings.std.Window
import typings.subscribeUiEvent.anon.AxisIntention
import typings.subscribeUiEvent.anon.Delta
import typings.subscribeUiEvent.anon.Height
import typings.subscribeUiEvent.anon.Remove
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("subscribe-ui-event", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def listen(target: EventTarget, eventType: String, handler: EventListenerOrEventListenerObject): Remove = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(target.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Remove]
  inline def listen(
    target: EventTarget,
    eventType: String,
    handler: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): Remove = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(target.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Remove]
  
  inline def subscribe[T /* <: UIEventType */](eventType: T, callback: TouchEventCallback[T] | UIEventCallback[T]): Subscription = (^.asInstanceOf[js.Dynamic].applyDynamic("subscribe")(eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Subscription]
  inline def subscribe[T /* <: UIEventType */](eventType: T, callback: TouchEventCallback[T] | UIEventCallback[T], options: SubscribeOptions): Subscription = (^.asInstanceOf[js.Dynamic].applyDynamic("subscribe")(eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Subscription]
  
  inline def unsubscribe[T /* <: UIEventType */](eventType: T, callback: TouchEventCallback[T] | UIEventCallback[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unsubscribe")(eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait ArgmentedEvent[T /* <: EventType */] extends StObject {
    
    var mainType: String
    
    var resize: Height
    
    var scroll: Delta
    
    var subType: String
    
    var touch: AxisIntention
    
    var `type`: T
  }
  object ArgmentedEvent {
    
    inline def apply[T /* <: EventType */](mainType: String, resize: Height, scroll: Delta, subType: String, touch: AxisIntention, `type`: T): ArgmentedEvent[T] = {
      val __obj = js.Dynamic.literal(mainType = mainType.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], subType = subType.asInstanceOf[js.Any], touch = touch.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArgmentedEvent[T]]
    }
    
    extension [Self <: ArgmentedEvent[?], T /* <: EventType */](x: Self & ArgmentedEvent[T]) {
      
      inline def setMainType(value: String): Self = StObject.set(x, "mainType", value.asInstanceOf[js.Any])
      
      inline def setResize(value: Height): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
      
      inline def setScroll(value: Delta): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
      
      inline def setSubType(value: String): Self = StObject.set(x, "subType", value.asInstanceOf[js.Any])
      
      inline def setTouch(value: AxisIntention): Self = StObject.set(x, "touch", value.asInstanceOf[js.Any])
      
      inline def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.subscribeUiEvent.subscribeUiEventStrings.resize
    - typings.subscribeUiEvent.subscribeUiEventStrings.resizeEnd
    - typings.subscribeUiEvent.subscribeUiEventStrings.resizeStart
    - typings.subscribeUiEvent.subscribeUiEventStrings.scroll
    - typings.subscribeUiEvent.subscribeUiEventStrings.scrollEnd
    - typings.subscribeUiEvent.subscribeUiEventStrings.scrollStart
    - typings.subscribeUiEvent.subscribeUiEventStrings.visibilitychange
    - typings.subscribeUiEvent.subscribeUiEventStrings.touchend
    - typings.subscribeUiEvent.subscribeUiEventStrings.touchmove
    - typings.subscribeUiEvent.subscribeUiEventStrings.touchmoveEnd
    - typings.subscribeUiEvent.subscribeUiEventStrings.touchmoveStart
    - typings.subscribeUiEvent.subscribeUiEventStrings.touchstart
  */
  trait EventType extends StObject
  object EventType {
    
    inline def resize: typings.subscribeUiEvent.subscribeUiEventStrings.resize = "resize".asInstanceOf[typings.subscribeUiEvent.subscribeUiEventStrings.resize]
    
    inline def resizeEnd: typings.subscribeUiEvent.subscribeUiEventStrings.resizeEnd = "resizeEnd".asInstanceOf[typings.subscribeUiEvent.subscribeUiEventStrings.resizeEnd]
    
    inline def resizeStart: typings.subscribeUiEvent.subscribeUiEventStrings.resizeStart = "resizeStart".asInstanceOf[typings.subscribeUiEvent.subscribeUiEventStrings.resizeStart]
    
    inline def scroll: typings.subscribeUiEvent.subscribeUiEventStrings.scroll = "scroll".asInstanceOf[typings.subscribeUiEvent.subscribeUiEventStrings.scroll]
    
    inline def scrollEnd: typings.subscribeUiEvent.subscribeUiEventStrings.scrollEnd = "scrollEnd".asInstanceOf[typings.subscribeUiEvent.subscribeUiEventStrings.scrollEnd]
    
    inline def scrollStart: typings.subscribeUiEvent.subscribeUiEventStrings.scrollStart = "scrollStart".asInstanceOf[typings.subscribeUiEvent.subscribeUiEventStrings.scrollStart]
    
    inline def touchend: typings.subscribeUiEvent.subscribeUiEventStrings.touchend = "touchend".asInstanceOf[typings.subscribeUiEvent.subscribeUiEventStrings.touchend]
    
    inline def touchmove: typings.subscribeUiEvent.subscribeUiEventStrings.touchmove = "touchmove".asInstanceOf[typings.subscribeUiEvent.subscribeUiEventStrings.touchmove]
    
    inline def touchmoveEnd: typings.subscribeUiEvent.subscribeUiEventStrings.touchmoveEnd = "touchmoveEnd".asInstanceOf[typings.subscribeUiEvent.subscribeUiEventStrings.touchmoveEnd]
    
    inline def touchmoveStart: typings.subscribeUiEvent.subscribeUiEventStrings.touchmoveStart = "touchmoveStart".asInstanceOf[typings.subscribeUiEvent.subscribeUiEventStrings.touchmoveStart]
    
    inline def touchstart: typings.subscribeUiEvent.subscribeUiEventStrings.touchstart = "touchstart".asInstanceOf[typings.subscribeUiEvent.subscribeUiEventStrings.touchstart]
    
    inline def visibilitychange: typings.subscribeUiEvent.subscribeUiEventStrings.visibilitychange = "visibilitychange".asInstanceOf[typings.subscribeUiEvent.subscribeUiEventStrings.visibilitychange]
  }
  
  trait SubscribeOptions extends StObject {
    
    var context: js.UndefOr[Any] = js.undefined
    
    var enableResizeInfo: js.UndefOr[Boolean] = js.undefined
    
    var enableScrollInfo: js.UndefOr[Boolean] = js.undefined
    
    var enableTouchInfo: js.UndefOr[Boolean] = js.undefined
    
    var eventOptions: js.UndefOr[AddEventListenerOptions] = js.undefined
    
    var target: js.UndefOr[HTMLElement | Window | Document | Null] = js.undefined
    
    var throttleRate: js.UndefOr[Double] = js.undefined
    
    var useRAF: js.UndefOr[Boolean] = js.undefined
  }
  object SubscribeOptions {
    
    inline def apply(): SubscribeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubscribeOptions]
    }
    
    extension [Self <: SubscribeOptions](x: Self) {
      
      inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setEnableResizeInfo(value: Boolean): Self = StObject.set(x, "enableResizeInfo", value.asInstanceOf[js.Any])
      
      inline def setEnableResizeInfoUndefined: Self = StObject.set(x, "enableResizeInfo", js.undefined)
      
      inline def setEnableScrollInfo(value: Boolean): Self = StObject.set(x, "enableScrollInfo", value.asInstanceOf[js.Any])
      
      inline def setEnableScrollInfoUndefined: Self = StObject.set(x, "enableScrollInfo", js.undefined)
      
      inline def setEnableTouchInfo(value: Boolean): Self = StObject.set(x, "enableTouchInfo", value.asInstanceOf[js.Any])
      
      inline def setEnableTouchInfoUndefined: Self = StObject.set(x, "enableTouchInfo", js.undefined)
      
      inline def setEventOptions(value: AddEventListenerOptions): Self = StObject.set(x, "eventOptions", value.asInstanceOf[js.Any])
      
      inline def setEventOptionsUndefined: Self = StObject.set(x, "eventOptions", js.undefined)
      
      inline def setTarget(value: HTMLElement | Window | Document): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetNull: Self = StObject.set(x, "target", null)
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setThrottleRate(value: Double): Self = StObject.set(x, "throttleRate", value.asInstanceOf[js.Any])
      
      inline def setThrottleRateUndefined: Self = StObject.set(x, "throttleRate", js.undefined)
      
      inline def setUseRAF(value: Boolean): Self = StObject.set(x, "useRAF", value.asInstanceOf[js.Any])
      
      inline def setUseRAFUndefined: Self = StObject.set(x, "useRAF", js.undefined)
    }
  }
  
  trait Subscription extends StObject {
    
    def unsubscribe(): Unit
  }
  object Subscription {
    
    inline def apply(unsubscribe: () => Unit): Subscription = {
      val __obj = js.Dynamic.literal(unsubscribe = js.Any.fromFunction0(unsubscribe))
      __obj.asInstanceOf[Subscription]
    }
    
    extension [Self <: Subscription](x: Self) {
      
      inline def setUnsubscribe(value: () => Unit): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction0(value))
    }
  }
  
  type TouchEventCallback[T /* <: TouchEventType */] = js.Function2[/* event */ TouchEvent, /* payload */ ArgmentedEvent[T], Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.subscribeUiEvent.subscribeUiEventStrings.touchend
    - typings.subscribeUiEvent.subscribeUiEventStrings.touchmove
    - typings.subscribeUiEvent.subscribeUiEventStrings.touchmoveEnd
    - typings.subscribeUiEvent.subscribeUiEventStrings.touchmoveStart
    - typings.subscribeUiEvent.subscribeUiEventStrings.touchstart
  */
  trait TouchEventType extends StObject
  object TouchEventType {
    
    inline def touchend: typings.subscribeUiEvent.subscribeUiEventStrings.touchend = "touchend".asInstanceOf[typings.subscribeUiEvent.subscribeUiEventStrings.touchend]
    
    inline def touchmove: typings.subscribeUiEvent.subscribeUiEventStrings.touchmove = "touchmove".asInstanceOf[typings.subscribeUiEvent.subscribeUiEventStrings.touchmove]
    
    inline def touchmoveEnd: typings.subscribeUiEvent.subscribeUiEventStrings.touchmoveEnd = "touchmoveEnd".asInstanceOf[typings.subscribeUiEvent.subscribeUiEventStrings.touchmoveEnd]
    
    inline def touchmoveStart: typings.subscribeUiEvent.subscribeUiEventStrings.touchmoveStart = "touchmoveStart".asInstanceOf[typings.subscribeUiEvent.subscribeUiEventStrings.touchmoveStart]
    
    inline def touchstart: typings.subscribeUiEvent.subscribeUiEventStrings.touchstart = "touchstart".asInstanceOf[typings.subscribeUiEvent.subscribeUiEventStrings.touchstart]
  }
  
  type UIEventCallback[T /* <: UIEventType */] = js.Function2[/* event */ UIEvent, /* payload */ ArgmentedEvent[T], Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.subscribeUiEvent.subscribeUiEventStrings.resize
    - typings.subscribeUiEvent.subscribeUiEventStrings.resizeEnd
    - typings.subscribeUiEvent.subscribeUiEventStrings.resizeStart
    - typings.subscribeUiEvent.subscribeUiEventStrings.scroll
    - typings.subscribeUiEvent.subscribeUiEventStrings.scrollEnd
    - typings.subscribeUiEvent.subscribeUiEventStrings.scrollStart
    - typings.subscribeUiEvent.subscribeUiEventStrings.visibilitychange
  */
  trait UIEventType extends StObject
  object UIEventType {
    
    inline def resize: typings.subscribeUiEvent.subscribeUiEventStrings.resize = "resize".asInstanceOf[typings.subscribeUiEvent.subscribeUiEventStrings.resize]
    
    inline def resizeEnd: typings.subscribeUiEvent.subscribeUiEventStrings.resizeEnd = "resizeEnd".asInstanceOf[typings.subscribeUiEvent.subscribeUiEventStrings.resizeEnd]
    
    inline def resizeStart: typings.subscribeUiEvent.subscribeUiEventStrings.resizeStart = "resizeStart".asInstanceOf[typings.subscribeUiEvent.subscribeUiEventStrings.resizeStart]
    
    inline def scroll: typings.subscribeUiEvent.subscribeUiEventStrings.scroll = "scroll".asInstanceOf[typings.subscribeUiEvent.subscribeUiEventStrings.scroll]
    
    inline def scrollEnd: typings.subscribeUiEvent.subscribeUiEventStrings.scrollEnd = "scrollEnd".asInstanceOf[typings.subscribeUiEvent.subscribeUiEventStrings.scrollEnd]
    
    inline def scrollStart: typings.subscribeUiEvent.subscribeUiEventStrings.scrollStart = "scrollStart".asInstanceOf[typings.subscribeUiEvent.subscribeUiEventStrings.scrollStart]
    
    inline def visibilitychange: typings.subscribeUiEvent.subscribeUiEventStrings.visibilitychange = "visibilitychange".asInstanceOf[typings.subscribeUiEvent.subscribeUiEventStrings.visibilitychange]
  }
}
