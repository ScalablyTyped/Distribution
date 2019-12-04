package typings.xhrDashMock

import typings.std.AddEventListenerOptions
import typings.std.BodyInit
import typings.std.Document
import typings.std.Event
import typings.std.EventListenerOptions
import typings.std.XMLHttpRequest
import typings.std.XMLHttpRequestResponseType
import typings.std.XMLHttpRequestUpload
import typings.std.stdStrings.readystatechange
import typings.xhrDashMock.libMockXMLHttpRequestEventTargetMod.MockXMLHttpRequestEventTarget
import typings.xhrDashMock.libMockXMLHttpRequestMod.MockXMLHttpRequest
import typings.xhrDashMock.libMockXMLHttpRequestMod.ReadyState
import typings.xhrDashMock.libTypesMod.ErrorCallbackEvent
import typings.xhrDashMock.libTypesMod.MockFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xhr-mock/lib/MockXMLHttpRequest", JSImport.Namespace)
@js.native
object libMockXMLHttpRequestMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.std.EventTarget because Already inherited
  - typings.std.XMLHttpRequestEventTarget because Already inherited
  - typings.std.XMLHttpRequest because var conflicts: onabort, onerror, onload, onloadend, onloadstart, onprogress, ontimeout. Inlined DONE, HEADERS_RECEIVED, LOADING, OPENED, UNSENT, onreadystatechange, readyState, response, responseText, responseType, responseURL, responseXML, status, statusText, timeout, upload, withCredentials, abort, addEventListener_readystatechange, addEventListener_readystatechange, addEventListener_readystatechange, getAllResponseHeaders, getResponseHeader, open, open, open, open, open, overrideMimeType, removeEventListener_readystatechange, removeEventListener_readystatechange, removeEventListener_readystatechange, send, send, send, setRequestHeader */ @js.native
  trait MockXMLHttpRequest extends MockXMLHttpRequestEventTarget {
    val DONE: Double | ReadyState = js.native
    val HEADERS_RECEIVED: Double | ReadyState = js.native
    val LOADING: Double | ReadyState = js.native
    val OPENED: Double | ReadyState = js.native
    val UNSENT: Double | ReadyState = js.native
    var _timeout: js.Any = js.native
    var _timeoutTimer: js.Any = js.native
    var isAborted: js.Any = js.native
    var isSending: js.Any = js.native
    var isSynchronous: js.Any = js.native
    var isTimedOut: js.Any = js.native
    var isUploadComplete: js.Any = js.native
    var onreadystatechange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    var readyState: Double | ReadyState = js.native
    var req: js.Any = js.native
    var res: js.Any = js.native
    val response: js.Any = js.native
    val responseText: String = js.native
    var responseType: XMLHttpRequestResponseType = js.native
    var responseURL: String = js.native
    val responseXML: Document | Null = js.native
    val status: Double = js.native
    val statusText: String = js.native
    var timeout: Double = js.native
    var upload: XMLHttpRequestUpload = js.native
    var withCredentials: Boolean = js.native
    /**
      * Cancels any network activity.
      */
    def abort(): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_readystatechange(`type`: readystatechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_readystatechange(
      `type`: readystatechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_readystatechange(
      `type`: readystatechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    /* private */ def applyNetworkError(): js.Any = js.native
    def getAllResponseHeaders(): String = js.native
    def getResponseHeader(name: String): Null | String = js.native
    /* private */ def handleError(): js.Any = js.native
    /* private */ def handleError(error: js.Any): js.Any = js.native
    /* private */ def handleResponseBody(res: js.Any): js.Any = js.native
    def msCachingEnabled(): Boolean = js.native
    def onreadystatechange(`this`: XMLHttpRequest, ev: Event): js.Any = js.native
    /**
      * Sets the request method, request URL, and synchronous flag.
      * 
      * Throws a "SyntaxError" DOMException if either method is not a valid HTTP method or url cannot be parsed.
      * 
      * Throws a "SecurityError" DOMException if method is a case-insensitive match for `CONNECT`, `TRACE`, or `TRACK`.
      * 
      * Throws an "InvalidAccessError" DOMException if async is false, current global object is a Window object, and the timeout attribute is not zero or the responseType attribute is not the empty string.
      */
    def open(method: String, url: String): Unit = js.native
    def open(method: String, url: String, async: Boolean): Unit = js.native
    def open(method: String, url: String, async: Boolean, username: String): Unit = js.native
    def open(method: String, url: String, async: Boolean, username: String, password: String): Unit = js.native
    def open(method: String, url: String, async: Boolean, username: Null, password: String): Unit = js.native
    /**
      * Acts as if the `Content-Type` header value for response is mime. (It does not actually change the header though.)
      * 
      * Throws an "InvalidStateError" DOMException if state is loading or done.
      */
    def overrideMimeType(mime: String): Unit = js.native
    /* private */ def receiveResponse(res: js.Any): js.Any = js.native
    @JSName("removeEventListener")
    def removeEventListener_readystatechange(`type`: readystatechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_readystatechange(
      `type`: readystatechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_readystatechange(
      `type`: readystatechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    /* private */ def reportError(event: js.Any): js.Any = js.native
    /**
      * Initiates the request. The body argument provides the request body, if any, and is ignored if the request method is GET or HEAD.
      * 
      * Throws an "InvalidStateError" DOMException if either state is not opened or the send() flag is set.
      */
    def send(): Unit = js.native
    def send(body: js.Any): Unit = js.native
    def send(body: BodyInit): Unit = js.native
    def send(body: Document): Unit = js.native
    /* private */ def sendAsync(): js.Any = js.native
    /* private */ def sendRequest(req: js.Any): js.Any = js.native
    /* private */ def sendSync(): js.Any = js.native
    /**
      * Combines a header in author request headers.
      * 
      * Throws an "InvalidStateError" DOMException if either state is not opened or the send() flag is set.
      * 
      * Throws a "SyntaxError" DOMException if name is not a header name or if value is not a header value.
      */
    def setRequestHeader(name: String, value: String): Unit = js.native
  }
  
  @js.native
  sealed trait ReadyState extends js.Object
  
  @js.native
  class default () extends MockXMLHttpRequest
  
  @js.native
  object ReadyState extends js.Object {
    @js.native
    sealed trait DONE extends ReadyState
    
    @js.native
    sealed trait HEADERS_RECEIVED extends ReadyState
    
    @js.native
    sealed trait LOADING extends ReadyState
    
    @js.native
    sealed trait OPENED extends ReadyState
    
    @js.native
    sealed trait UNSENT extends ReadyState
    
    /* 4 */ val DONE: typings.xhrDashMock.libMockXMLHttpRequestMod.ReadyState.DONE with Double = js.native
    /* 2 */ val HEADERS_RECEIVED: typings.xhrDashMock.libMockXMLHttpRequestMod.ReadyState.HEADERS_RECEIVED with Double = js.native
    /* 3 */ val LOADING: typings.xhrDashMock.libMockXMLHttpRequestMod.ReadyState.LOADING with Double = js.native
    /* 1 */ val OPENED: typings.xhrDashMock.libMockXMLHttpRequestMod.ReadyState.OPENED with Double = js.native
    /* 0 */ val UNSENT: typings.xhrDashMock.libMockXMLHttpRequestMod.ReadyState.UNSENT with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ReadyState with Double] = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    val DONE: ReadyState = js.native
    val HEADERS_RECEIVED: ReadyState = js.native
    val LOADING: ReadyState = js.native
    val OPENED: ReadyState = js.native
    val UNSENT: ReadyState = js.native
    var handlers: js.Array[MockFunction] = js.native
    /**
      * Add a mock handler
      */
    def addHandler(fn: MockFunction): Unit = js.native
    def errorCallback(event: ErrorCallbackEvent): Unit = js.native
    /**
      * Remove all request handlers
      */
    def removeAllHandlers(): Unit = js.native
    /**
      * Remove a mock handler
      */
    def removeHandler(fn: MockFunction): Unit = js.native
  }
  
}

