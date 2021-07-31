package typings.xhrMock

import typings.std.AddEventListenerOptions
import typings.std.BodyInit
import typings.std.Document
import typings.std.Event
import typings.std.EventListenerOptions
import typings.std.XMLHttpRequestResponseType
import typings.std.XMLHttpRequestUpload
import typings.std.stdStrings.readystatechange
import typings.xhrMock.typesMod.ErrorCallbackEvent
import typings.xhrMock.typesMod.MockFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mockXMLHttpRequestMod {
  
  @JSImport("xhr-mock/lib/MockXMLHttpRequest", JSImport.Default)
  @js.native
  class default () extends MockXMLHttpRequest
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
    @scala.inline
    def addHandler(fn: MockFunction): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addHandler")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def errorCallback(event: ErrorCallbackEvent): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("errorCallback")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("xhr-mock/lib/MockXMLHttpRequest", "default.handlers")
    @js.native
    def handlers: js.Array[MockFunction] = js.native
    @scala.inline
    def handlers_=(x: js.Array[MockFunction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handlers")(x.asInstanceOf[js.Any])
    
    /**
      * Remove all request handlers
      */
    @scala.inline
    def removeAllHandlers(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAllHandlers")().asInstanceOf[Unit]
    
    /**
      * Remove a mock handler
      */
    @scala.inline
    def removeHandler(fn: MockFunction): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeHandler")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
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
    /* 4 */ val DONE: typings.xhrMock.mockXMLHttpRequestMod.ReadyState.DONE & Double = js.native
    
    @js.native
    sealed trait HEADERS_RECEIVED
      extends StObject
         with ReadyState
    /* 2 */ val HEADERS_RECEIVED: typings.xhrMock.mockXMLHttpRequestMod.ReadyState.HEADERS_RECEIVED & Double = js.native
    
    @js.native
    sealed trait LOADING
      extends StObject
         with ReadyState
    /* 3 */ val LOADING: typings.xhrMock.mockXMLHttpRequestMod.ReadyState.LOADING & Double = js.native
    
    @js.native
    sealed trait OPENED
      extends StObject
         with ReadyState
    /* 1 */ val OPENED: typings.xhrMock.mockXMLHttpRequestMod.ReadyState.OPENED & Double = js.native
    
    @js.native
    sealed trait UNSENT
      extends StObject
         with ReadyState
    /* 0 */ val UNSENT: typings.xhrMock.mockXMLHttpRequestMod.ReadyState.UNSENT & Double = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.std.EventTarget because Already inherited
  - typings.std.XMLHttpRequestEventTarget because Already inherited
  - typings.std.XMLHttpRequest because var conflicts: onabort, onerror, onload, onloadend, onloadstart, onprogress, ontimeout. Inlined upload, status, withCredentials, OPENED, LOADING, responseURL, response, readyState, DONE, UNSENT, responseType, HEADERS_RECEIVED, responseText, timeout, responseXML, onreadystatechange, statusText, abort, addEventListener_readystatechange, addEventListener_readystatechange, addEventListener_readystatechange, getAllResponseHeaders, getResponseHeader, open, open, open, open, open, open, overrideMimeType, removeEventListener_readystatechange, removeEventListener_readystatechange, removeEventListener_readystatechange, send, send, send, setRequestHeader */ @js.native
  trait MockXMLHttpRequest
    extends typings.xhrMock.mockXMLHttpRequestEventTargetMod.default {
    
    val DONE: Double | ReadyState = js.native
    
    val HEADERS_RECEIVED: Double | ReadyState = js.native
    
    val LOADING: Double | ReadyState = js.native
    
    val OPENED: Double | ReadyState = js.native
    
    val UNSENT: Double | ReadyState = js.native
    
    var _timeout: js.Any = js.native
    
    var _timeoutTimer: js.Any = js.native
    
    /**
      * Cancels any network activity.
      */
    def abort(): Unit = js.native
    
    @JSName("addEventListener")
    def addEventListener_readystatechange(`type`: readystatechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_readystatechange(
      `type`: readystatechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_readystatechange(
      `type`: readystatechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    
    /* private */ def applyNetworkError(): js.Any = js.native
    
    def getAllResponseHeaders(): String = js.native
    
    def getResponseHeader(name: String): Null | String = js.native
    
    /* private */ def handleError(error: js.Any): js.Any = js.native
    
    /* private */ def handleResponseBody(res: js.Any): js.Any = js.native
    
    var isAborted: js.Any = js.native
    
    var isSending: js.Any = js.native
    
    var isSynchronous: js.Any = js.native
    
    var isTimedOut: js.Any = js.native
    
    var isUploadComplete: js.Any = js.native
    
    def msCachingEnabled(): Boolean = js.native
    
    var onreadystatechange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null = js.native
    def onreadystatechange(ev: Event): js.Any = js.native
    
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
    def open(method: String, url: String, async: Boolean, username: Unit, password: String): Unit = js.native
    def open(method: String, url: String, async: Unit, username: String): Unit = js.native
    def open(method: String, url: String, async: Unit, username: String, password: String): Unit = js.native
    def open(method: String, url: String, async: Unit, username: Null, password: String): Unit = js.native
    def open(method: String, url: String, async: Unit, username: Unit, password: String): Unit = js.native
    
    /**
      * Acts as if the `Content-Type` header value for response is mime. (It does not actually change the header though.)
      * 
      * Throws an "InvalidStateError" DOMException if state is loading or done.
      */
    def overrideMimeType(mime: String): Unit = js.native
    
    var readyState: Double | ReadyState = js.native
    
    /* private */ def receiveResponse(res: js.Any): js.Any = js.native
    
    @JSName("removeEventListener")
    def removeEventListener_readystatechange(`type`: readystatechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_readystatechange(
      `type`: readystatechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_readystatechange(
      `type`: readystatechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
      options: EventListenerOptions
    ): Unit = js.native
    
    /* private */ def reportError(event: js.Any): js.Any = js.native
    
    var req: js.Any = js.native
    
    var res: js.Any = js.native
    
    val response: js.Any = js.native
    
    val responseText: String = js.native
    
    var responseType: XMLHttpRequestResponseType = js.native
    
    var responseURL: String = js.native
    
    val responseXML: Document | Null = js.native
    
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
    
    val status: Double = js.native
    
    val statusText: String = js.native
    
    var timeout: Double = js.native
    
    var upload: XMLHttpRequestUpload = js.native
    
    var withCredentials: Boolean = js.native
  }
}
