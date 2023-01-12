package typings.wreck

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.node.eventsMod.EventEmitter
import typings.node.httpMod.ClientRequest
import typings.node.httpMod.IncomingMessage
import typings.node.streamMod.Readable
import typings.wreck.anon.Http
import typings.wreck.anon.PromiseIncomingMessagereq
import typings.wreck.anon.Req
import typings.wreck.anon.RequestOptionspayloadanyu
import typings.wreck.wreckBooleans.`false`
import typings.wreck.wreckBooleans.`true`
import typings.wreck.wreckStrings.force
import typings.wreck.wreckStrings.request
import typings.wreck.wreckStrings.response
import typings.wreck.wreckStrings.strict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("wreck", JSImport.Namespace)
  @js.native
  val ^ : WreckObject = js.native
  
  trait ReadOptions extends StObject {
    
    var gunzip: js.UndefOr[Boolean | force] = js.undefined
    
    var json: js.UndefOr[`true` | strict | force] = js.undefined
    
    var maxBytes: js.UndefOr[Double] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object ReadOptions {
    
    inline def apply(): ReadOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadOptions] (val x: Self) extends AnyVal {
      
      inline def setGunzip(value: Boolean | force): Self = StObject.set(x, "gunzip", value.asInstanceOf[js.Any])
      
      inline def setGunzipUndefined: Self = StObject.set(x, "gunzip", js.undefined)
      
      inline def setJson(value: `true` | strict | force): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      inline def setMaxBytes(value: Double): Self = StObject.set(x, "maxBytes", value.asInstanceOf[js.Any])
      
      inline def setMaxBytesUndefined: Self = StObject.set(x, "maxBytes", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  type RequestCallback = js.Function2[/* uri */ String, /* options */ RequestOptionspayloadanyu, Unit]
  
  trait RequestOptions extends StObject {
    
    var agent: js.UndefOr[Http | `false`] = js.undefined
    
    var baseUrl: js.UndefOr[String] = js.undefined
    
    var beforeRedirect: js.UndefOr[
        js.Function6[
          /* redirectMethod */ String, 
          /* statusCode */ Double, 
          /* location */ String, 
          /* resHeaders */ StringDictionary[Any], 
          /* redirectOptions */ Any, 
          /* next */ js.Function0[js.Object], 
          Unit
        ]
      ] = js.undefined
    
    var ciphers: js.UndefOr[String] = js.undefined
    
    var downstreamRes: js.UndefOr[Any] = js.undefined
    
    var events: js.UndefOr[Boolean] = js.undefined
    
    var headers: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var maxBytes: js.UndefOr[Double] = js.undefined
    
    var payload: js.UndefOr[Any] = js.undefined
    
    var redirect303: js.UndefOr[Boolean] = js.undefined
    
    var redirected: js.UndefOr[
        js.Function3[/* statusCode */ Double, /* location */ String, /* req */ ClientRequest, Unit]
      ] = js.undefined
    
    var redirects: js.UndefOr[Double] = js.undefined
    
    var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
    
    var secureProtocol: js.UndefOr[String] = js.undefined
    
    var socketPath: js.UndefOr[String] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object RequestOptions {
    
    inline def apply(): RequestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestOptions] (val x: Self) extends AnyVal {
      
      inline def setAgent(value: Http | `false`): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      inline def setBeforeRedirect(
        value: (/* redirectMethod */ String, /* statusCode */ Double, /* location */ String, /* resHeaders */ StringDictionary[Any], /* redirectOptions */ Any, /* next */ js.Function0[js.Object]) => Unit
      ): Self = StObject.set(x, "beforeRedirect", js.Any.fromFunction6(value))
      
      inline def setBeforeRedirectUndefined: Self = StObject.set(x, "beforeRedirect", js.undefined)
      
      inline def setCiphers(value: String): Self = StObject.set(x, "ciphers", value.asInstanceOf[js.Any])
      
      inline def setCiphersUndefined: Self = StObject.set(x, "ciphers", js.undefined)
      
      inline def setDownstreamRes(value: Any): Self = StObject.set(x, "downstreamRes", value.asInstanceOf[js.Any])
      
      inline def setDownstreamResUndefined: Self = StObject.set(x, "downstreamRes", js.undefined)
      
      inline def setEvents(value: Boolean): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setHeaders(value: StringDictionary[Any]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setMaxBytes(value: Double): Self = StObject.set(x, "maxBytes", value.asInstanceOf[js.Any])
      
      inline def setMaxBytesUndefined: Self = StObject.set(x, "maxBytes", js.undefined)
      
      inline def setPayload(value: Any): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
      
      inline def setRedirect303(value: Boolean): Self = StObject.set(x, "redirect303", value.asInstanceOf[js.Any])
      
      inline def setRedirect303Undefined: Self = StObject.set(x, "redirect303", js.undefined)
      
      inline def setRedirected(value: (/* statusCode */ Double, /* location */ String, /* req */ ClientRequest) => Unit): Self = StObject.set(x, "redirected", js.Any.fromFunction3(value))
      
      inline def setRedirectedUndefined: Self = StObject.set(x, "redirected", js.undefined)
      
      inline def setRedirects(value: Double): Self = StObject.set(x, "redirects", value.asInstanceOf[js.Any])
      
      inline def setRedirectsUndefined: Self = StObject.set(x, "redirects", js.undefined)
      
      inline def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
      
      inline def setRejectUnauthorizedUndefined: Self = StObject.set(x, "rejectUnauthorized", js.undefined)
      
      inline def setSecureProtocol(value: String): Self = StObject.set(x, "secureProtocol", value.asInstanceOf[js.Any])
      
      inline def setSecureProtocolUndefined: Self = StObject.set(x, "secureProtocol", js.undefined)
      
      inline def setSocketPath(value: String): Self = StObject.set(x, "socketPath", value.asInstanceOf[js.Any])
      
      inline def setSocketPathUndefined: Self = StObject.set(x, "socketPath", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait RequestResponse extends StObject {
    
    var payload: Any
    
    var res: IncomingMessage
  }
  object RequestResponse {
    
    inline def apply(payload: Any, res: IncomingMessage): RequestResponse = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestResponse] (val x: Self) extends AnyVal {
      
      inline def setPayload(value: Any): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setRes(value: IncomingMessage): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
    }
  }
  
  type ResponseCallback = js.Function2[/* err */ js.UndefOr[typings.boom.mod.^[Any]], /* details */ Req, Unit]
  
  @js.native
  trait WreckEventEmitter extends EventEmitter {
    
    @JSName("on")
    def on_request(event: request, listener: RequestCallback): this.type = js.native
    @JSName("on")
    def on_response(event: response, listener: ResponseCallback): this.type = js.native
  }
  
  @js.native
  trait WreckObject extends StObject {
    
    var agents: Http = js.native
    
    def defaults(options: RequestOptions): WreckObject = js.native
    
    def delete(uri: String, options: RequestOptions & ReadOptions): js.Promise[RequestResponse] = js.native
    
    var events: js.UndefOr[WreckEventEmitter] = js.native
    
    def get(uri: String, options: RequestOptions & ReadOptions): js.Promise[RequestResponse] = js.native
    
    def parseCacheControl(field: String): Any = js.native
    
    def patch(uri: String, options: RequestOptions & ReadOptions): js.Promise[RequestResponse] = js.native
    
    def post(uri: String, options: RequestOptions & ReadOptions): js.Promise[RequestResponse] = js.native
    
    def put(uri: String, options: RequestOptions & ReadOptions): js.Promise[RequestResponse] = js.native
    
    def read(response: IncomingMessage, options: ReadOptions): js.Promise[Any] = js.native
    
    def request(method: String, uri: String, options: RequestOptions): PromiseIncomingMessagereq = js.native
    
    def toReadableStream(payload: Any): Readable = js.native
    def toReadableStream(payload: Any, encoding: String): Readable = js.native
  }
  
  type _To = WreckObject
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: WreckObject = ^
}
