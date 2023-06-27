package typings.xhrMock

import typings.std.AddEventListenerOptions
import typings.std.Document
import typings.std.Event
import typings.std.EventListenerOptions
import typings.std.URL
import typings.std.XMLHttpRequestBodyInit
import typings.std.XMLHttpRequestResponseType
import typings.std.XMLHttpRequestUpload
import typings.std.stdInts.`0`
import typings.std.stdInts.`1`
import typings.std.stdInts.`2`
import typings.std.stdInts.`3`
import typings.std.stdInts.`4`
import typings.std.stdStrings.readystatechange
import typings.xhrMock.libTypesMod.ErrorCallbackEvent
import typings.xhrMock.libTypesMod.MockFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMockXMLHttpRequestMod {
  
  @JSImport("xhr-mock/lib/MockXMLHttpRequest", JSImport.Default)
  @js.native
  open class default () extends MockXMLHttpRequest
  /* static members */
  object default {
    
    @JSImport("xhr-mock/lib/MockXMLHttpRequest", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("xhr-mock/lib/MockXMLHttpRequest", "default.DONE")
    @js.native
    val DONE: ReadyState = js.native
    
    @JSImport("xhr-mock/lib/MockXMLHttpRequest", "default.HEADERS_RECEIVED")
    @js.native
    val HEADERS_RECEIVED: ReadyState = js.native
    
    @JSImport("xhr-mock/lib/MockXMLHttpRequest", "default.LOADING")
    @js.native
    val LOADING: ReadyState = js.native
    
    @JSImport("xhr-mock/lib/MockXMLHttpRequest", "default.OPENED")
    @js.native
    val OPENED: ReadyState = js.native
    
    @JSImport("xhr-mock/lib/MockXMLHttpRequest", "default.UNSENT")
    @js.native
    val UNSENT: ReadyState = js.native
    
    /**
      * Add a mock handler
      */
    inline def addHandler(fn: MockFunction): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addHandler")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def errorCallback(event: ErrorCallbackEvent): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("errorCallback")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("xhr-mock/lib/MockXMLHttpRequest", "default.handlers")
    @js.native
    def handlers: js.Array[MockFunction] = js.native
    inline def handlers_=(x: js.Array[MockFunction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handlers")(x.asInstanceOf[js.Any])
    
    /**
      * Remove all request handlers
      */
    inline def removeAllHandlers(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAllHandlers")().asInstanceOf[Unit]
    
    /**
      * Remove a mock handler
      */
    inline def removeHandler(fn: MockFunction): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeHandler")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @js.native
  sealed trait ReadyState extends StObject
  @JSImport("xhr-mock/lib/MockXMLHttpRequest", "ReadyState")
  @js.native
  object ReadyState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ReadyState & Double] = js.native
    
    @js.native
    sealed trait DONE
      extends StObject
         with ReadyState
    /* 4 */ val DONE: typings.xhrMock.libMockXMLHttpRequestMod.ReadyState.DONE & Double = js.native
    
    @js.native
    sealed trait HEADERS_RECEIVED
      extends StObject
         with ReadyState
    /* 2 */ val HEADERS_RECEIVED: typings.xhrMock.libMockXMLHttpRequestMod.ReadyState.HEADERS_RECEIVED & Double = js.native
    
    @js.native
    sealed trait LOADING
      extends StObject
         with ReadyState
    /* 3 */ val LOADING: typings.xhrMock.libMockXMLHttpRequestMod.ReadyState.LOADING & Double = js.native
    
    @js.native
    sealed trait OPENED
      extends StObject
         with ReadyState
    /* 1 */ val OPENED: typings.xhrMock.libMockXMLHttpRequestMod.ReadyState.OPENED & Double = js.native
    
    @js.native
    sealed trait UNSENT
      extends StObject
         with ReadyState
    /* 0 */ val UNSENT: typings.xhrMock.libMockXMLHttpRequestMod.ReadyState.UNSENT & Double = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.std.EventTarget because Already inherited
  - typings.std.XMLHttpRequestEventTarget because Already inherited
  - typings.std.XMLHttpRequest because var conflicts: onabort, onerror, onload, onloadend, onloadstart, onprogress, ontimeout. Inlined upload, status, withCredentials, OPENED, LOADING, responseURL, response, readyState, DONE, UNSENT, responseType, HEADERS_RECEIVED, responseText, timeout, responseXML, onreadystatechange, statusText, abort, addEventListener_readystatechange, addEventListener_readystatechange, addEventListener_readystatechange, getAllResponseHeaders, getResponseHeader, open, open, open, open, open, open, open, open, open, open, open, open, overrideMimeType, removeEventListener_readystatechange, removeEventListener_readystatechange, removeEventListener_readystatechange, send, send, send, setRequestHeader */ @js.native
  trait MockXMLHttpRequest
    extends typings.xhrMock.libMockXMLHttpRequestEventTargetMod.default {
    
    val DONE: `4` | ReadyState = js.native
    
    val HEADERS_RECEIVED: `2` | ReadyState = js.native
    
    val LOADING: `3` | ReadyState = js.native
    
    val OPENED: `1` | ReadyState = js.native
    
    val UNSENT: `0` | ReadyState = js.native
    
    /* private */ var _timeout: Any = js.native
    
    /* private */ var _timeoutTimer: Any = js.native
    
    /**
      * Cancels any network activity.
      *
      * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/abort)
      */
    /* standard dom */
    def abort(): Unit = js.native
    
    /* standard dom */
    @JSName("addEventListener")
    def addEventListener_readystatechange(`type`: readystatechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_readystatechange(
      `type`: readystatechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_readystatechange(
      `type`: readystatechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    
    /* private */ def applyNetworkError(): Any = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/getAllResponseHeaders) */
    /* standard dom */
    def getAllResponseHeaders(): String = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/getResponseHeader) */
    /* standard dom */
    def getResponseHeader(name: String): Null | String = js.native
    
    /* private */ def handleError(error: Any): Any = js.native
    
    /* private */ def handleResponseBody(res: Any): Any = js.native
    
    /* private */ var isAborted: Any = js.native
    
    /* private */ var isSending: Any = js.native
    
    /* private */ var isSynchronous: Any = js.native
    
    /* private */ var isTimedOut: Any = js.native
    
    /* private */ var isUploadComplete: Any = js.native
    
    def msCachingEnabled(): Boolean = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/readystatechange_event) */
    /* standard dom */
    var onreadystatechange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
    def onreadystatechange(ev: Event): Any = js.native
    
    /**
      * Sets the request method, request URL, and synchronous flag.
      *
      * Throws a "SyntaxError" DOMException if either method is not a valid method or url cannot be parsed.
      *
      * Throws a "SecurityError" DOMException if method is a case-insensitive match for `CONNECT`, `TRACE`, or `TRACK`.
      *
      * Throws an "InvalidAccessError" DOMException if async is false, current global object is a Window object, and the timeout attribute is not zero or the responseType attribute is not the empty string.
      *
      * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/open)
      */
    /* standard dom */
    def open(method: String, url: String): Unit = js.native
    /* standard dom */
    def open(method: String, url: String, async: Boolean): Unit = js.native
    def open(method: String, url: String, async: Boolean, username: String): Unit = js.native
    def open(method: String, url: String, async: Boolean, username: String, password: String): Unit = js.native
    def open(method: String, url: String, async: Boolean, username: Null, password: String): Unit = js.native
    def open(method: String, url: String, async: Boolean, username: Unit, password: String): Unit = js.native
    def open(method: String, url: String, async: Unit, username: String): Unit = js.native
    def open(method: String, url: String, async: Unit, username: String, password: String): Unit = js.native
    def open(method: String, url: String, async: Unit, username: Null, password: String): Unit = js.native
    def open(method: String, url: String, async: Unit, username: Unit, password: String): Unit = js.native
    def open(method: String, url: URL): Unit = js.native
    def open(method: String, url: URL, async: Boolean): Unit = js.native
    def open(method: String, url: URL, async: Boolean, username: String): Unit = js.native
    def open(method: String, url: URL, async: Boolean, username: String, password: String): Unit = js.native
    def open(method: String, url: URL, async: Boolean, username: Null, password: String): Unit = js.native
    def open(method: String, url: URL, async: Boolean, username: Unit, password: String): Unit = js.native
    
    /**
      * Acts as if the `Content-Type` header value for a response is mime. (It does not change the header.)
      *
      * Throws an "InvalidStateError" DOMException if state is loading or done.
      *
      * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/overrideMimeType)
      */
    /* standard dom */
    def overrideMimeType(mime: String): Unit = js.native
    
    var readyState: Double | ReadyState = js.native
    
    /* private */ def receiveResponse(res: Any): Any = js.native
    
    /* standard dom */
    @JSName("removeEventListener")
    def removeEventListener_readystatechange(`type`: readystatechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_readystatechange(
      `type`: readystatechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_readystatechange(
      `type`: readystatechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    
    /* private */ def reportError(event: Any): Any = js.native
    
    /* private */ var req: Any = js.native
    
    /* private */ var res: Any = js.native
    
    val response: Any = js.native
    
    val responseText: String = js.native
    
    var responseType: XMLHttpRequestResponseType = js.native
    
    var responseURL: String = js.native
    
    val responseXML: Document | Null = js.native
    
    /**
      * Initiates the request. The body argument provides the request body, if any, and is ignored if the request method is GET or HEAD.
      *
      * Throws an "InvalidStateError" DOMException if either state is not opened or the send() flag is set.
      *
      * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/send)
      */
    /* standard dom */
    def send(): Unit = js.native
    def send(body: Any | XMLHttpRequestBodyInit): Unit = js.native
    def send(body: Document): Unit = js.native
    
    /* private */ def sendAsync(): Any = js.native
    
    /* private */ def sendRequest(req: Any): Any = js.native
    
    /* private */ def sendSync(): Any = js.native
    
    /**
      * Combines a header in author request headers.
      *
      * Throws an "InvalidStateError" DOMException if either state is not opened or the send() flag is set.
      *
      * Throws a "SyntaxError" DOMException if name is not a header name or if value is not a header value.
      *
      * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/setRequestHeader)
      */
    /* standard dom */
    def setRequestHeader(name: String, value: String): Unit = js.native
    
    val status: Double = js.native
    
    val statusText: String = js.native
    
    var timeout: Double = js.native
    
    var upload: XMLHttpRequestUpload = js.native
    
    var withCredentials: Boolean = js.native
  }
}
