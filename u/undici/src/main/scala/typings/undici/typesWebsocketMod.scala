package typings.undici

import org.scalablytyped.runtime.Instantiable0
import typings.node.workerThreadsMod.MessagePort
import typings.std.ArrayBufferLike
import typings.std.Blob
import typings.std.URL
import typings.undici.typesPatchMod.AddEventListenerOptions
import typings.undici.typesPatchMod.Event
import typings.undici.typesPatchMod.EventInit
import typings.undici.typesPatchMod.EventListenerOptions
import typings.undici.typesPatchMod.EventListenerOrEventListenerObject
import typings.undici.undiciStrings.close
import typings.undici.undiciStrings.error
import typings.undici.undiciStrings.message
import typings.undici.undiciStrings.open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesWebsocketMod {
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("undici/types/websocket", "CloseEvent")
  @js.native
  open class CloseEventCls protected ()
    extends StObject
       with CloseEvent {
    def this(`type`: String) = this()
    def this(`type`: String, eventInitDict: CloseEventInit) = this()
    
    /* CompleteClass */
    override val code: Double = js.native
    
    /* CompleteClass */
    override val reason: String = js.native
    
    /* CompleteClass */
    override val wasClean: Boolean = js.native
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("undici/types/websocket", "MessageEvent")
  @js.native
  open class MessageEventCls[T] protected ()
    extends StObject
       with MessageEvent[T] {
    def this(`type`: String) = this()
    def this(`type`: String, eventInitDict: MessageEventInit[T]) = this()
    
    /* CompleteClass */
    override val data: T = js.native
    
    /* CompleteClass */
    override def initMessageEvent(
      `type`: String,
      bubbles: js.UndefOr[Boolean],
      cancelable: js.UndefOr[Boolean],
      data: js.UndefOr[Any],
      origin: js.UndefOr[String],
      lastEventId: js.UndefOr[String],
      source: js.UndefOr[Instantiable0[MessagePort] | Null],
      ports: js.UndefOr[js.Array[Instantiable0[MessagePort]]]
    ): Unit = js.native
    
    /* CompleteClass */
    override val lastEventId: String = js.native
    
    /* CompleteClass */
    override val origin: String = js.native
    
    /* CompleteClass */
    override val ports: js.Array[Instantiable0[MessagePort]] = js.native
    
    /* CompleteClass */
    override val source: Instantiable0[MessagePort] | Null = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * globalThis * / any extends {  EventTarget :infer T} ? T : {addEventListener (type : string, listener : any, options : any | undefined): void, dispatchEvent (event : undici.undici/types/patch.Event): boolean, removeEventListener (type : string, listener : any, options : any | boolean | undefined): void} */ @js.native
  trait WebSocket extends StObject {
    
    val CLOSED: Double = js.native
    
    val CLOSING: Double = js.native
    
    val CONNECTING: Double = js.native
    
    val OPEN: Double = js.native
    
    def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_close(`type`: close, listener: js.ThisFunction1[/* this */ this.type, /* ev */ CloseEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_close(
      `type`: close,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CloseEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_close(
      `type`: close,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CloseEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_error(`type`: error, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_error(
      `type`: error,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_error(
      `type`: error,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_message(`type`: message, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_message(
      `type`: message,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_message(
      `type`: message,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_open(`type`: open, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_open(
      `type`: open,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_open(
      `type`: open,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    
    var binaryType: BinaryType = js.native
    
    val bufferedAmount: Double = js.native
    
    def close(): Unit = js.native
    def close(code: Double): Unit = js.native
    def close(code: Double, reason: String): Unit = js.native
    def close(code: Unit, reason: String): Unit = js.native
    
    val extensions: String = js.native
    
    var onclose: (js.ThisFunction1[/* this */ this.type, /* ev */ CloseEvent, Any]) | Null = js.native
    
    var onerror: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
    
    var onmessage: (js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any]) | Null = js.native
    
    var onopen: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
    
    val protocol: String = js.native
    
    val readyState: Double = js.native
    
    def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_close(`type`: close, listener: js.ThisFunction1[/* this */ this.type, /* ev */ CloseEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_close(
      `type`: close,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CloseEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_close(
      `type`: close,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CloseEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_error(`type`: error, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_error(
      `type`: error,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_error(
      `type`: error,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_message(`type`: message, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_message(
      `type`: message,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_message(
      `type`: message,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_open(`type`: open, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_open(
      `type`: open,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_open(
      `type`: open,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    
    def send(data: String): Unit = js.native
    def send(data: js.typedarray.ArrayBufferView): Unit = js.native
    def send(data: ArrayBufferLike): Unit = js.native
    def send(data: Blob): Unit = js.native
    
    val url: String = js.native
  }
  object WebSocket {
    
    @JSImport("undici/types/websocket", "WebSocket.CLOSED")
    @js.native
    val CLOSED: Double = js.native
    
    @JSImport("undici/types/websocket", "WebSocket.CLOSING")
    @js.native
    val CLOSING: Double = js.native
    
    @JSImport("undici/types/websocket", "WebSocket.CONNECTING")
    @js.native
    val CONNECTING: Double = js.native
    
    @JSImport("undici/types/websocket", "WebSocket.OPEN")
    @js.native
    val OPEN: Double = js.native
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("undici/types/websocket", "WebSocket")
  @js.native
  open class WebSocketCls protected ()
    extends StObject
       with WebSocket {
    def this(url: String) = this()
    def this(url: URL) = this()
    def this(url: String, protocols: String) = this()
    def this(url: String, protocols: js.Array[String]) = this()
    def this(url: URL, protocols: String) = this()
    def this(url: URL, protocols: js.Array[String]) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.undici.undiciStrings.blob
    - typings.undici.undiciStrings.arraybuffer
  */
  trait BinaryType extends StObject
  object BinaryType {
    
    inline def arraybuffer: typings.undici.undiciStrings.arraybuffer = "arraybuffer".asInstanceOf[typings.undici.undiciStrings.arraybuffer]
    
    inline def blob: typings.undici.undiciStrings.blob = "blob".asInstanceOf[typings.undici.undiciStrings.blob]
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * globalThis * / any extends {  Event :infer T} ? T : { readonly bubbles :boolean, cancelBubble (): void,  readonly cancelable :boolean,  readonly composed :boolean, composedPath (): [undici.undici/types/patch.EventTarget | undefined],  readonly currentTarget :undici.undici/types/patch.EventTarget | null,  readonly defaultPrevented :boolean,  readonly eventPhase :0 | 2,  readonly isTrusted :boolean, preventDefault (): void,   returnValue :boolean,  readonly srcElement :undici.undici/types/patch.EventTarget | null, stopImmediatePropagation (): void, stopPropagation (): void,  readonly target :undici.undici/types/patch.EventTarget | null,  readonly timeStamp :number,  readonly type :string} */ trait CloseEvent extends StObject {
    
    val code: Double
    
    val reason: String
    
    val wasClean: Boolean
  }
  object CloseEvent {
    
    inline def apply(code: Double, reason: String, wasClean: Boolean): CloseEvent = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], wasClean = wasClean.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloseEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CloseEvent] (val x: Self) extends AnyVal {
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setWasClean(value: Boolean): Self = StObject.set(x, "wasClean", value.asInstanceOf[js.Any])
    }
  }
  
  trait CloseEventInit
    extends StObject
       with EventInit {
    
    var code: js.UndefOr[Double] = js.undefined
    
    var reason: js.UndefOr[String] = js.undefined
    
    var wasClean: js.UndefOr[Boolean] = js.undefined
  }
  object CloseEventInit {
    
    inline def apply(): CloseEventInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CloseEventInit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CloseEventInit] (val x: Self) extends AnyVal {
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
      
      inline def setWasClean(value: Boolean): Self = StObject.set(x, "wasClean", value.asInstanceOf[js.Any])
      
      inline def setWasCleanUndefined: Self = StObject.set(x, "wasClean", js.undefined)
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * globalThis * / any extends {  Event :infer T} ? T : { readonly bubbles :boolean, cancelBubble (): void,  readonly cancelable :boolean,  readonly composed :boolean, composedPath (): [undici.undici/types/patch.EventTarget | undefined],  readonly currentTarget :undici.undici/types/patch.EventTarget | null,  readonly defaultPrevented :boolean,  readonly eventPhase :0 | 2,  readonly isTrusted :boolean, preventDefault (): void,   returnValue :boolean,  readonly srcElement :undici.undici/types/patch.EventTarget | null, stopImmediatePropagation (): void, stopPropagation (): void,  readonly target :undici.undici/types/patch.EventTarget | null,  readonly timeStamp :number,  readonly type :string} */ trait MessageEvent[T] extends StObject {
    
    val data: T
    
    def initMessageEvent(
      `type`: String,
      bubbles: js.UndefOr[Boolean],
      cancelable: js.UndefOr[Boolean],
      data: js.UndefOr[Any],
      origin: js.UndefOr[String],
      lastEventId: js.UndefOr[String],
      source: js.UndefOr[Instantiable0[MessagePort] | Null],
      ports: js.UndefOr[js.Array[Instantiable0[MessagePort]]]
    ): Unit
    
    val lastEventId: String
    
    val origin: String
    
    val ports: js.Array[Instantiable0[MessagePort]]
    
    val source: Instantiable0[MessagePort] | Null
  }
  object MessageEvent {
    
    inline def apply[T](
      data: T,
      initMessageEvent: (String, js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Any], js.UndefOr[String], js.UndefOr[String], js.UndefOr[Instantiable0[MessagePort] | Null], js.UndefOr[js.Array[Instantiable0[MessagePort]]]) => Unit,
      lastEventId: String,
      origin: String,
      ports: js.Array[Instantiable0[MessagePort]]
    ): MessageEvent[T] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], initMessageEvent = js.Any.fromFunction8(initMessageEvent), lastEventId = lastEventId.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], ports = ports.asInstanceOf[js.Any], source = null)
      __obj.asInstanceOf[MessageEvent[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MessageEvent[?], T] (val x: Self & MessageEvent[T]) extends AnyVal {
      
      inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setInitMessageEvent(
        value: (String, js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Any], js.UndefOr[String], js.UndefOr[String], js.UndefOr[Instantiable0[MessagePort] | Null], js.UndefOr[js.Array[Instantiable0[MessagePort]]]) => Unit
      ): Self = StObject.set(x, "initMessageEvent", js.Any.fromFunction8(value))
      
      inline def setLastEventId(value: String): Self = StObject.set(x, "lastEventId", value.asInstanceOf[js.Any])
      
      inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setPorts(value: js.Array[Instantiable0[MessagePort]]): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
      
      inline def setPortsVarargs(value: Instantiable0[MessagePort]*): Self = StObject.set(x, "ports", js.Array(value*))
      
      inline def setSource(value: Instantiable0[MessagePort]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceNull: Self = StObject.set(x, "source", null)
    }
  }
  
  trait MessageEventInit[T]
    extends StObject
       with EventInit {
    
    var data: js.UndefOr[T] = js.undefined
    
    var lastEventId: js.UndefOr[String] = js.undefined
    
    var origin: js.UndefOr[String] = js.undefined
    
    var ports: js.UndefOr[js.Array[Instantiable0[MessagePort]]] = js.undefined
    
    var source: js.UndefOr[Instantiable0[MessagePort] | Null] = js.undefined
  }
  object MessageEventInit {
    
    inline def apply[T](): MessageEventInit[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageEventInit[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MessageEventInit[?], T] (val x: Self & MessageEventInit[T]) extends AnyVal {
      
      inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setLastEventId(value: String): Self = StObject.set(x, "lastEventId", value.asInstanceOf[js.Any])
      
      inline def setLastEventIdUndefined: Self = StObject.set(x, "lastEventId", js.undefined)
      
      inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      inline def setPorts(value: js.Array[Instantiable0[MessagePort]]): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
      
      inline def setPortsUndefined: Self = StObject.set(x, "ports", js.undefined)
      
      inline def setPortsVarargs(value: Instantiable0[MessagePort]*): Self = StObject.set(x, "ports", js.Array(value*))
      
      inline def setSource(value: Instantiable0[MessagePort]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceNull: Self = StObject.set(x, "source", null)
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    }
  }
  
  trait WebSocketEventMap extends StObject {
    
    var close: CloseEvent
    
    var error: Event
    
    var message: MessageEvent[Any]
    
    var open: Event
  }
  object WebSocketEventMap {
    
    inline def apply(close: CloseEvent, error: Event, message: MessageEvent[Any], open: Event): WebSocketEventMap = {
      val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebSocketEventMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WebSocketEventMap] (val x: Self) extends AnyVal {
      
      inline def setClose(value: CloseEvent): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setError(value: Event): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: MessageEvent[Any]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setOpen(value: Event): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    }
  }
}
