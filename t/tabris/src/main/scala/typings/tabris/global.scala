package typings.tabris

import org.scalablytyped.runtime.StringDictionary
import typings.std.ArrayBuffer
import typings.std.Document
import typings.std.Navigator
import typings.std.Uint8ClampedArray
import typings.tabris.JSX.ElementClass
import typings.tabris.anon.Children
import typings.tabris.anon.LastModified
import typings.tabris.anon.`0`
import typings.tabris.anon.`20`
import typings.tabris.mod.Device_
import typings.tabris.mod.JSXChildren
import typings.tabris.mod.JsxProcessor
import typings.tabris.mod.Module
import typings.tabris.mod.NativeObject
import typings.tabris.mod.Selector
import typings.tabris.mod.Widget
import typings.tabris.mod.WidgetCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  // Blob
  /**
    * Represents raw data of a given type.
    */
  @JSGlobal("Blob")
  @js.native
  class Blob ()
    extends StObject
       with typings.tabris.Blob {
    def this(blobParts: js.Array[js.Any]) = this()
    def this(blobParts: js.Array[js.Any], options: `20`) = this()
    def this(blobParts: Unit, options: `20`) = this()
    
    /**
      * Reads the blob data into an ArrayBuffer and returns it in a promise. Each call creates a new
      * in-memory copy of the data.
      */
    /* CompleteClass */
    override def arrayBuffer(): js.Promise[ArrayBuffer] = js.native
    
    /**
      * Size of the blob data in bytes
      * @constant
      */
    /* CompleteClass */
    override val size: Double = js.native
    
    /**
      * Decodes the blob data as a string and returns it in a promise.
      */
    /* CompleteClass */
    override def text(): js.Promise[String] = js.native
    
    /**
      * The MIME type of the blob data
      * @constant
      */
    /* CompleteClass */
    override val `type`: String = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("CloseEvent")
  @js.native
  class CloseEvent protected ()
    extends StObject
       with typings.tabris.CloseEvent {
    def this(typeArg: String) = this()
    def this(typeArg: String, eventInitDict: CloseEventInit) = this()
    
    /* CompleteClass */
    override val AT_TARGET: Double = js.native
    
    /* CompleteClass */
    override val BUBBLING_PHASE: Double = js.native
    
    /* CompleteClass */
    override val CAPTURING_PHASE: Double = js.native
    
    /* CompleteClass */
    override val bubbles: Boolean = js.native
    
    /* CompleteClass */
    override val cancelable: Boolean = js.native
    
    /* CompleteClass */
    override val code: Double = js.native
    
    /* CompleteClass */
    override val currentTarget: typings.tabris.EventTarget = js.native
    
    /* CompleteClass */
    override val defaultPrevented: Boolean = js.native
    
    /* CompleteClass */
    override val eventPhase: Double = js.native
    
    /* CompleteClass */
    override def initCloseEvent(
      typeArg: String,
      canBubbleArg: Boolean,
      cancelableArg: Boolean,
      wasCleanArg: Boolean,
      codeArg: Double,
      reasonArg: String
    ): Unit = js.native
    
    /* CompleteClass */
    override def initEvent(eventTypeArg: String, canBubbleArg: Boolean, cancelableArg: Boolean): Unit = js.native
    
    /* CompleteClass */
    override val isTrusted: Boolean = js.native
    
    /* CompleteClass */
    override def preventDefault(): Unit = js.native
    
    /* CompleteClass */
    override val reason: String = js.native
    
    /* CompleteClass */
    override def stopImmediatePropagation(): Unit = js.native
    
    /* CompleteClass */
    override def stopPropagation(): Unit = js.native
    
    /* CompleteClass */
    override val target: typings.tabris.EventTarget = js.native
    
    /* CompleteClass */
    override val timeStamp: Double = js.native
    
    /* CompleteClass */
    override val `type`: String = js.native
    
    /* CompleteClass */
    override val wasClean: Boolean = js.native
  }
  
  // Console
  /**
    * The console object provides access to the [debugging console](../debug.md).
    */
  @JSGlobal("Console")
  @js.native
  class Console_ protected ()
    extends StObject
       with Console
  
  @JSGlobal("Crypto")
  @js.native
  class Crypto_ ()
    extends StObject
       with Crypto {
    
    /* CompleteClass */
    override def getRandomValues(typedArray: TypedArray): TypedArray = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("ErrorEvent")
  @js.native
  class ErrorEvent protected ()
    extends StObject
       with typings.tabris.ErrorEvent {
    def this(`type`: String) = this()
    def this(`type`: String, errorEventInitDict: ErrorEventInit) = this()
    
    /* CompleteClass */
    override val AT_TARGET: Double = js.native
    
    /* CompleteClass */
    override val BUBBLING_PHASE: Double = js.native
    
    /* CompleteClass */
    override val CAPTURING_PHASE: Double = js.native
    
    /* CompleteClass */
    override val bubbles: Boolean = js.native
    
    /* CompleteClass */
    override val cancelable: Boolean = js.native
    
    /* CompleteClass */
    override val colno: Double = js.native
    
    /* CompleteClass */
    override val currentTarget: typings.tabris.EventTarget = js.native
    
    /* CompleteClass */
    override val defaultPrevented: Boolean = js.native
    
    /* CompleteClass */
    override val error: js.Any = js.native
    
    /* CompleteClass */
    override val eventPhase: Double = js.native
    
    /* CompleteClass */
    override val filename: String = js.native
    
    /* CompleteClass */
    override def initErrorEvent(
      typeArg: String,
      canBubbleArg: Boolean,
      cancelableArg: Boolean,
      messageArg: String,
      filenameArg: String,
      linenoArg: Double
    ): Unit = js.native
    
    /* CompleteClass */
    override def initEvent(eventTypeArg: String, canBubbleArg: Boolean, cancelableArg: Boolean): Unit = js.native
    
    /* CompleteClass */
    override val isTrusted: Boolean = js.native
    
    /* CompleteClass */
    override val lineno: Double = js.native
    
    /* CompleteClass */
    override val message: String = js.native
    
    /* CompleteClass */
    override def preventDefault(): Unit = js.native
    
    /* CompleteClass */
    override def stopImmediatePropagation(): Unit = js.native
    
    /* CompleteClass */
    override def stopPropagation(): Unit = js.native
    
    /* CompleteClass */
    override val target: typings.tabris.EventTarget = js.native
    
    /* CompleteClass */
    override val timeStamp: Double = js.native
    
    /* CompleteClass */
    override val `type`: String = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("Event")
  @js.native
  class Event protected ()
    extends StObject
       with typings.tabris.Event {
    def this(typeArg: String) = this()
    def this(typeArg: String, eventInitDict: EventInit) = this()
    
    /* CompleteClass */
    override val AT_TARGET: Double = js.native
    
    /* CompleteClass */
    override val BUBBLING_PHASE: Double = js.native
    
    /* CompleteClass */
    override val CAPTURING_PHASE: Double = js.native
    
    /* CompleteClass */
    override val bubbles: Boolean = js.native
    
    /* CompleteClass */
    override val cancelable: Boolean = js.native
    
    /* CompleteClass */
    override val currentTarget: typings.tabris.EventTarget = js.native
    
    /* CompleteClass */
    override val defaultPrevented: Boolean = js.native
    
    /* CompleteClass */
    override val eventPhase: Double = js.native
    
    /* CompleteClass */
    override def initEvent(eventTypeArg: String, canBubbleArg: Boolean, cancelableArg: Boolean): Unit = js.native
    
    /* CompleteClass */
    override val isTrusted: Boolean = js.native
    
    /* CompleteClass */
    override def preventDefault(): Unit = js.native
    
    /* CompleteClass */
    override def stopImmediatePropagation(): Unit = js.native
    
    /* CompleteClass */
    override def stopPropagation(): Unit = js.native
    
    /* CompleteClass */
    override val target: typings.tabris.EventTarget = js.native
    
    /* CompleteClass */
    override val timeStamp: Double = js.native
    
    /* CompleteClass */
    override val `type`: String = js.native
  }
  object Event {
    
    @JSGlobal("Event.AT_TARGET")
    @js.native
    val AT_TARGET: Double = js.native
    
    @JSGlobal("Event.BUBBLING_PHASE")
    @js.native
    val BUBBLING_PHASE: Double = js.native
    
    @JSGlobal("Event.CAPTURING_PHASE")
    @js.native
    val CAPTURING_PHASE: Double = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("EventTarget")
  @js.native
  class EventTarget ()
    extends StObject
       with typings.tabris.EventTarget
  
  // File
  /**
    * Represents raw data of a given type and name.
    */
  @JSGlobal("File")
  @js.native
  class File protected ()
    extends StObject
       with typings.tabris.File {
    def this(blobParts: js.Array[js.Any], name: String) = this()
    def this(blobParts: js.Array[js.Any], name: String, options: LastModified) = this()
    
    /**
      * Reads the blob data into an ArrayBuffer and returns it in a promise. Each call creates a new
      * in-memory copy of the data.
      */
    /* CompleteClass */
    override def arrayBuffer(): js.Promise[ArrayBuffer] = js.native
    
    /**
      * Unix timestamp of the last known modification of the file
      * @constant
      */
    /* CompleteClass */
    override val lastModified: Double = js.native
    
    /**
      * The name or path of the file
      * @constant
      */
    /* CompleteClass */
    override val name: String = js.native
    
    /**
      * Size of the blob data in bytes
      * @constant
      */
    /* CompleteClass */
    override val size: Double = js.native
    
    /**
      * Decodes the blob data as a string and returns it in a promise.
      */
    /* CompleteClass */
    override def text(): js.Promise[String] = js.native
    
    /**
      * The MIME type of the blob data
      * @constant
      */
    /* CompleteClass */
    override val `type`: String = js.native
  }
  
  // FormData
  /**
    * FormData provides a way to construct a set of key/value pairs which can then be sent using fetch() or
    * XMLHttpRequest. It uses the same format a HTML form would use if the encoding type were set to
    * `multipart/form-data`.
    */
  @JSGlobal("FormData")
  @js.native
  class FormData ()
    extends StObject
       with typings.tabris.FormData
  
  // Headers
  /**
    * Represents a set of HTTP headers as used by `fetch()`.
    */
  @JSGlobal("Headers")
  @js.native
  class Headers ()
    extends StObject
       with typings.tabris.Headers {
    def this(headers: js.Array[js.Tuple2[String, String]]) = this()
    def this(headers: StringDictionary[String]) = this()
    def this(headers: typings.tabris.Headers) = this()
  }
  
  /**
    * Represents pixel data of a `Canvas` widget.
    */
  @JSGlobal("ImageData")
  @js.native
  class ImageData protected ()
    extends StObject
       with typings.tabris.ImageData {
    def this(data: Uint8ClampedArray, width: Double) = this()
    def this(width: Double, height: Double) = this()
    def this(data: Uint8ClampedArray, width: Double, height: Double) = this()
    
    /**
      * A one-dimensional array containing the data in RGBA order, with integer values between 0 and 255 (inclusive).
      */
    /* CompleteClass */
    override val data: Uint8ClampedArray = js.native
    
    /**
      * The actual height of the ImageData, in pixels.
      */
    /* CompleteClass */
    override val height: Double = js.native
    
    /**
      * The actual height of the ImageData, in pixels.
      */
    /* CompleteClass */
    override val width: Double = js.native
  }
  
  object JSX {
    
    @JSGlobal("JSX")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def createElement(`type`: String, attributes: js.Object, children: ElementClass*): ElementClass = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ElementClass]
    @scala.inline
    def createElement(`type`: js.Function, attributes: js.Object, children: ElementClass*): ElementClass = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ElementClass]
    
    @scala.inline
    def install(jsxProcessor: JsxProcessor): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("install")(jsxProcessor.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSGlobal("JSX.jsxFactory")
    @js.native
    val jsxFactory: js.Symbol = js.native
    
    @JSGlobal("JSX.jsxType")
    @js.native
    val jsxType: js.Symbol = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("MessageEvent")
  @js.native
  class MessageEvent protected ()
    extends StObject
       with typings.tabris.MessageEvent {
    def this(`type`: String) = this()
    def this(`type`: String, eventInitDict: MessageEventInit) = this()
    
    /* CompleteClass */
    override val AT_TARGET: Double = js.native
    
    /* CompleteClass */
    override val BUBBLING_PHASE: Double = js.native
    
    /* CompleteClass */
    override val CAPTURING_PHASE: Double = js.native
    
    /* CompleteClass */
    override val bubbles: Boolean = js.native
    
    /* CompleteClass */
    override val cancelable: Boolean = js.native
    
    /* CompleteClass */
    override val currentTarget: typings.tabris.EventTarget = js.native
    
    /* CompleteClass */
    override val data: js.Any = js.native
    
    /* CompleteClass */
    override val defaultPrevented: Boolean = js.native
    
    /* CompleteClass */
    override val eventPhase: Double = js.native
    
    /* CompleteClass */
    override def initEvent(eventTypeArg: String, canBubbleArg: Boolean, cancelableArg: Boolean): Unit = js.native
    
    /* CompleteClass */
    override def initMessageEvent(
      typeArg: String,
      canBubbleArg: Boolean,
      cancelableArg: Boolean,
      dataArg: js.Any,
      originArg: String,
      lastEventIdArg: String,
      sourceArg: js.Any
    ): Unit = js.native
    
    /* CompleteClass */
    override val isTrusted: Boolean = js.native
    
    /* CompleteClass */
    override val origin: String = js.native
    
    /* CompleteClass */
    override val ports: js.Any = js.native
    
    /* CompleteClass */
    override def preventDefault(): Unit = js.native
    
    /* CompleteClass */
    override val source: js.Any = js.native
    
    /* CompleteClass */
    override def stopImmediatePropagation(): Unit = js.native
    
    /* CompleteClass */
    override def stopPropagation(): Unit = js.native
    
    /* CompleteClass */
    override val target: typings.tabris.EventTarget = js.native
    
    /* CompleteClass */
    override val timeStamp: Double = js.native
    
    /* CompleteClass */
    override val `type`: String = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("MessagePort")
  @js.native
  class MessagePort ()
    extends StObject
       with typings.tabris.MessagePort
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("ProgressEvent")
  @js.native
  class ProgressEvent protected ()
    extends StObject
       with typings.tabris.ProgressEvent {
    def this(`type`: String) = this()
    def this(`type`: String, eventInitDict: ProgressEventInit) = this()
    
    /* CompleteClass */
    override val AT_TARGET: Double = js.native
    
    /* CompleteClass */
    override val BUBBLING_PHASE: Double = js.native
    
    /* CompleteClass */
    override val CAPTURING_PHASE: Double = js.native
    
    /* CompleteClass */
    override val bubbles: Boolean = js.native
    
    /* CompleteClass */
    override val cancelable: Boolean = js.native
    
    /* CompleteClass */
    override val currentTarget: typings.tabris.EventTarget = js.native
    
    /* CompleteClass */
    override val defaultPrevented: Boolean = js.native
    
    /* CompleteClass */
    override val eventPhase: Double = js.native
    
    /* CompleteClass */
    override def initEvent(eventTypeArg: String, canBubbleArg: Boolean, cancelableArg: Boolean): Unit = js.native
    
    /* CompleteClass */
    override def initProgressEvent(
      typeArg: String,
      canBubbleArg: Boolean,
      cancelableArg: Boolean,
      lengthComputableArg: Boolean,
      loadedArg: Double,
      totalArg: Double
    ): Unit = js.native
    
    /* CompleteClass */
    override val isTrusted: Boolean = js.native
    
    /* CompleteClass */
    override val lengthComputable: Boolean = js.native
    
    /* CompleteClass */
    override val loaded: Double = js.native
    
    /* CompleteClass */
    override def preventDefault(): Unit = js.native
    
    /* CompleteClass */
    override def stopImmediatePropagation(): Unit = js.native
    
    /* CompleteClass */
    override def stopPropagation(): Unit = js.native
    
    /* CompleteClass */
    override val target: typings.tabris.EventTarget = js.native
    
    /* CompleteClass */
    override val timeStamp: Double = js.native
    
    /* CompleteClass */
    override val total: Double = js.native
    
    /* CompleteClass */
    override val `type`: String = js.native
  }
  
  // Request
  /**
    * Represents an HTTP Request as used by `fetch()`.
    */
  @JSGlobal("Request")
  @js.native
  class Request protected ()
    extends StObject
       with typings.tabris.Request {
    def this(input: String) = this()
    def this(input: typings.tabris.Request) = this()
    def this(input: String, init: RequestInit) = this()
    def this(input: typings.tabris.Request, init: RequestInit) = this()
  }
  
  // Response
  /**
    * Represents an HTTP Response as used by `fetch()`.
    */
  @JSGlobal("Response")
  @js.native
  class Response ()
    extends StObject
       with typings.tabris.Response {
    def this(body: String) = this()
    def this(body: typings.tabris.Blob) = this()
    def this(body: typings.tabris.FormData) = this()
    def this(body: String, init: ResponseInit) = this()
    def this(body: Unit, init: ResponseInit) = this()
    def this(body: typings.tabris.Blob, init: ResponseInit) = this()
    def this(body: typings.tabris.FormData, init: ResponseInit) = this()
  }
  object Response {
    
    @JSGlobal("Response")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @scala.inline
    def error(): typings.tabris.Response = ^.asInstanceOf[js.Dynamic].applyDynamic("error")().asInstanceOf[typings.tabris.Response]
    
    /* static member */
    @scala.inline
    def redirect(url: String, status: Double): typings.tabris.Response = (^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[typings.tabris.Response]
  }
  
  // Storage
  /**
    * The `localStorage` object allows storing key-value pairs in a persistent store. Both keys and values
    * are stored as strings.
    * In addition Tabris.js adds support for a `secureStorage` available in the global scope. This is a
    * drop-in replacement for `localStorage` that keeps data encrypted using the Keychain on iOS and the
    * AndroidKeyStore on Android 6+. Note that on Android 5 the store is encrypted but does not use
    * hardware encryption.
    * The `localStorage` is only meant to store relatively short strings. To store larger amounts of data
    * it is recommended to use the [FileSystem](./fs.html) API.
    */
  @JSGlobal("Storage")
  @js.native
  class Storage protected ()
    extends StObject
       with typings.tabris.Storage {
    
    /**
      * Remove all key/value pairs from the storage.
      */
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /**
      * Retrieves the value associated with the given key.
      * @param key
      */
    /* CompleteClass */
    override def getItem(key: String): String | Null = js.native
    
    /**
      * Returns the name of the key at the given index in the storage. The order of keys is platform
      * dependent, you should not rely on it to be deterministic
      * @param index
      */
    /* CompleteClass */
    override def key(index: Double): String = js.native
    
    /**
      * The number of items in the storage.
      * @constant
      */
    /* CompleteClass */
    override val length: Double = js.native
    
    /**
      * Removes the given key/value pair from the storage.
      * @param key
      */
    /* CompleteClass */
    override def removeItem(key: String): Unit = js.native
    
    /**
      * Stores a string value using the given key.
      * @param key
      * @param value
      */
    /* CompleteClass */
    override def setItem(key: String, value: String): Unit = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("WebSocket")
  @js.native
  class WebSocket protected ()
    extends StObject
       with typings.tabris.WebSocket {
    def this(url: String) = this()
    def this(url: String, protocols: String) = this()
    def this(url: String, protocols: js.Array[String]) = this()
  }
  object WebSocket {
    
    @JSGlobal("WebSocket.CLOSED")
    @js.native
    val CLOSED: Double = js.native
    
    @JSGlobal("WebSocket.CLOSING")
    @js.native
    val CLOSING: Double = js.native
    
    @JSGlobal("WebSocket.CONNECTING")
    @js.native
    val CONNECTING: Double = js.native
    
    @JSGlobal("WebSocket.OPEN")
    @js.native
    val OPEN: Double = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("Worker")
  @js.native
  class Worker protected ()
    extends StObject
       with typings.tabris.Worker {
    def this(scriptPath: String) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("XMLHttpRequest")
  @js.native
  class XMLHttpRequest ()
    extends StObject
       with typings.tabris.XMLHttpRequest {
    
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListener): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListener, useCapture: Boolean): Unit = js.native
  }
  object XMLHttpRequest {
    
    @JSGlobal("XMLHttpRequest.DONE")
    @js.native
    val DONE: Double = js.native
    
    @JSGlobal("XMLHttpRequest.HEADERS_RECEIVED")
    @js.native
    val HEADERS_RECEIVED: Double = js.native
    
    @JSGlobal("XMLHttpRequest.LOADING")
    @js.native
    val LOADING: Double = js.native
    
    @JSGlobal("XMLHttpRequest.OPENED")
    @js.native
    val OPENED: Double = js.native
    
    @JSGlobal("XMLHttpRequest.UNSENT")
    @js.native
    val UNSENT: Double = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("XMLHttpRequestUpload")
  @js.native
  class XMLHttpRequestUpload ()
    extends StObject
       with typings.tabris.XMLHttpRequestUpload {
    
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListener): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListener, useCapture: Boolean): Unit = js.native
  }
  
  @scala.inline
  def _empty(attributes: Null, children: String): String = (js.Dynamic.global.applyDynamic("$")(attributes.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def _empty(attributes: Null, children: js.Array[Null | String | Double | Boolean]): String = (js.Dynamic.global.applyDynamic("$")(attributes.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def _empty(attributes: Null, children: Boolean): String = (js.Dynamic.global.applyDynamic("$")(attributes.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def _empty(attributes: Null, children: Double): String = (js.Dynamic.global.applyDynamic("$")(attributes.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def _empty(attributes: Null, children: JSXChildren[Widget]): WidgetCollection[Widget] = (js.Dynamic.global.applyDynamic("$")(attributes.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[WidgetCollection[Widget]]
  /**
    * A JSX stateless functional component that groups all given widgets in a WidgetCollection
    * @param attributes This parameter needs to be null since <$> does not support any attributes
    * @param children The widgets to be included in the resulting WidgetCollection instance.
    */
  @scala.inline
  def _empty(attributes: Children, children: JSXChildren[Widget]): WidgetCollection[Widget] = (js.Dynamic.global.applyDynamic("$")(attributes.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[WidgetCollection[Widget]]
  /**
    * A JSX stateless functional component that joins any given content in to a single string.
    * @param attributes This parameter needs to be null since <$> does not support any attributes.
    * @param children The content of the resulting string.
    */
  @scala.inline
  def _empty(attributes: `0`, children: String): String = (js.Dynamic.global.applyDynamic("$")(attributes.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def _empty(attributes: `0`, children: js.Array[Null | String | Double | Boolean]): String = (js.Dynamic.global.applyDynamic("$")(attributes.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def _empty(attributes: `0`, children: Boolean): String = (js.Dynamic.global.applyDynamic("$")(attributes.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def _empty(attributes: `0`, children: Double): String = (js.Dynamic.global.applyDynamic("$")(attributes.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[String]
  /**
    * Returns the non-disposed `NativeObject` instance (e.g. a widget) associated with the given cid
    * number. The number can be obtained via the [cid](./NativeObject.md#cid) property. Example: If the cid
    * of an object is `'$23'` it can be obtained by `$(23)`. The cid is visible in the log when passing a
    * NativeObject to any log method, e.g. [`console.log(widget)`](./console.md#logvalues), or
    * [`console.dirxml(widget)`](./console.md#dirxmlobject). The native object may then be obtained using
    * the developer console or the interactive console feature for the tabris CLI serve command.
    * This feature is meant for debugging purposes only. **Using it in production code is dangerous since
    * it allows interfering with the internals of the framework or encapsulated components.** Also, the
    * `cid` of a NativeObject is not stable, meaning it can change each time the code is executed.
    * @param cidNumber The cid number is the trailing part of the [cid](./NativeObject.md#cid) property string.
    */
  @scala.inline
  def _empty(cidNumber: Double): NativeObject = js.Dynamic.global.applyDynamic("$")(cidNumber.asInstanceOf[js.Any]).asInstanceOf[NativeObject]
  // $
  /**
    * A shortcut to [`tabris.contentView.find()`](./Composite.md#findselector). Returns a collection
    * containing all descendants of contentView that match the given selector. This does *not* include any
    * widgets in the drawer, a popover, or an encapsulated custom component. A custom component is
    * encapsulated if it overrides the `children()` method or uses the `@component` decorator.
    * @param selector A selector expression or a predicate function to filter the results.
    */
  @scala.inline
  def _empty[Result /* <: Widget */](): WidgetCollection[Result] = js.Dynamic.global.applyDynamic("$")().asInstanceOf[WidgetCollection[Result]]
  @scala.inline
  def _empty[Result /* <: Widget */](selector: Selector[Widget, Result]): WidgetCollection[Result] = js.Dynamic.global.applyDynamic("$")(selector.asInstanceOf[js.Any]).asInstanceOf[WidgetCollection[Result]]
  
  // Timer
  /**
    * Cancels the running interval associated with the given ID. When given an invalid ID, nothing happens.
    * @param id The ID that was returned by `setInterval`.
    */
  @scala.inline
  def clearInterval(id: js.Any): Unit = js.Dynamic.global.applyDynamic("clearInterval")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Cancels the running timeout associated with the given ID. When given an invalid ID, nothing happens.
    * @param id The ID that was returned by `setTimeout`.
    */
  @scala.inline
  def clearTimeout(id: js.Any): Unit = js.Dynamic.global.applyDynamic("clearTimeout")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSGlobal("console")
  @js.native
  def console: Console = js.native
  @scala.inline
  def console_=(x: Console): Unit = js.Dynamic.global.updateDynamic("console")(x.asInstanceOf[js.Any])
  
  @JSGlobal("cordova")
  @js.native
  def cordova: Cordova = js.native
  @scala.inline
  def cordova_=(x: Cordova): Unit = js.Dynamic.global.updateDynamic("cordova")(x.asInstanceOf[js.Any])
  
  @JSGlobal("createImageBitmap")
  @js.native
  def createImageBitmap: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof tabris.ImageBitmap.createImageBitmap */ js.Any = js.native
  @scala.inline
  def createImageBitmap_=(
    x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof tabris.ImageBitmap.createImageBitmap */ js.Any
  ): Unit = js.Dynamic.global.updateDynamic("createImageBitmap")(x.asInstanceOf[js.Any])
  
  @JSGlobal("crypto")
  @js.native
  def crypto: Crypto = js.native
  @scala.inline
  def crypto_=(x: Crypto): Unit = js.Dynamic.global.updateDynamic("crypto")(x.asInstanceOf[js.Any])
  
  @JSGlobal("device")
  @js.native
  def device: Device_ = js.native
  @scala.inline
  def device_=(x: Device_): Unit = js.Dynamic.global.updateDynamic("device")(x.asInstanceOf[js.Any])
  
  @JSGlobal("__dirname")
  @js.native
  def dirname: String = js.native
  
  @scala.inline
  def dirname_=(x: String): Unit = js.Dynamic.global.updateDynamic("__dirname")(x.asInstanceOf[js.Any])
  
  @JSGlobal("document")
  @js.native
  def document: Document = js.native
  @scala.inline
  def document_=(x: Document): Unit = js.Dynamic.global.updateDynamic("document")(x.asInstanceOf[js.Any])
  
  @JSGlobal("exports")
  @js.native
  def exports: js.Object = js.native
  @scala.inline
  def exports_=(x: js.Object): Unit = js.Dynamic.global.updateDynamic("exports")(x.asInstanceOf[js.Any])
  
  // fetch
  @scala.inline
  def fetch(url: String): js.Promise[typings.tabris.Response] = js.Dynamic.global.applyDynamic("fetch")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.tabris.Response]]
  @scala.inline
  def fetch(url: String, init: RequestInit): js.Promise[typings.tabris.Response] = (js.Dynamic.global.applyDynamic("fetch")(url.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.tabris.Response]]
  @scala.inline
  def fetch(url: typings.tabris.Request): js.Promise[typings.tabris.Response] = js.Dynamic.global.applyDynamic("fetch")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.tabris.Response]]
  @scala.inline
  def fetch(url: typings.tabris.Request, init: RequestInit): js.Promise[typings.tabris.Response] = (js.Dynamic.global.applyDynamic("fetch")(url.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.tabris.Response]]
  
  @JSGlobal("__filename")
  @js.native
  def filename: String = js.native
  
  @scala.inline
  def filename_=(x: String): Unit = js.Dynamic.global.updateDynamic("__filename")(x.asInstanceOf[js.Any])
  
  @JSGlobal("localStorage")
  @js.native
  def localStorage: typings.tabris.Storage = js.native
  @scala.inline
  def localStorage_=(x: typings.tabris.Storage): Unit = js.Dynamic.global.updateDynamic("localStorage")(x.asInstanceOf[js.Any])
  
  @JSGlobal("module")
  @js.native
  def module: Module = js.native
  @scala.inline
  def module_=(x: Module): Unit = js.Dynamic.global.updateDynamic("module")(x.asInstanceOf[js.Any])
  
  @JSGlobal("navigator")
  @js.native
  def navigator: Navigator = js.native
  @scala.inline
  def navigator_=(x: Navigator): Unit = js.Dynamic.global.updateDynamic("navigator")(x.asInstanceOf[js.Any])
  
  @JSGlobal("plugins")
  @js.native
  def plugins: CordovaPlugins = js.native
  @scala.inline
  def plugins_=(x: CordovaPlugins): Unit = js.Dynamic.global.updateDynamic("plugins")(x.asInstanceOf[js.Any])
  
  @JSGlobal("require")
  @js.native
  def require: js.Function1[/* request */ String, js.Object] = js.native
  @scala.inline
  def require_=(x: js.Function1[/* request */ String, js.Object]): Unit = js.Dynamic.global.updateDynamic("require")(x.asInstanceOf[js.Any])
  
  @JSGlobal("secureStorage")
  @js.native
  def secureStorage: typings.tabris.Storage = js.native
  @scala.inline
  def secureStorage_=(x: typings.tabris.Storage): Unit = js.Dynamic.global.updateDynamic("secureStorage")(x.asInstanceOf[js.Any])
  
  /**
    * Calls the given function repeatedly, each times waiting the given delay. The actual delay may be
    * slightly longer than the given one.
    * @param callback The function to call.
    * @param delay The delay in milliseconds.
    * @param params One or more values passed on to the callback.
    */
  @scala.inline
  def setInterval(callback: js.Function, delay: Double, params: js.Any*): js.Any = (js.Dynamic.global.applyDynamic("setInterval")(callback.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def setInterval(callback: js.Function, delay: Unit, params: js.Any*): js.Any = (js.Dynamic.global.applyDynamic("setInterval")(callback.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /**
    * Calls the given function with `param` (and all following parameters) after the specified delay. The
    * actual delay may be slightly longer than the given one.
    * @param callback The function to call.
    * @param delay The delay in milliseconds.
    * @param params One or more values passed on to the callback.
    */
  @scala.inline
  def setTimeout(callback: js.Function, delay: Double, params: js.Any*): js.Any = (js.Dynamic.global.applyDynamic("setTimeout")(callback.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def setTimeout(callback: js.Function, delay: Unit, params: js.Any*): js.Any = (js.Dynamic.global.applyDynamic("setTimeout")(callback.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @JSGlobal("window")
  @js.native
  def window: Window = js.native
  @scala.inline
  def window_=(x: Window): Unit = js.Dynamic.global.updateDynamic("window")(x.asInstanceOf[js.Any])
}
