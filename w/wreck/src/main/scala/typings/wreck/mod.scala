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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("wreck", JSImport.Namespace)
  @js.native
  val ^ : WreckObject = js.native
  
  @js.native
  trait ReadOptions extends StObject {
    
    var gunzip: js.UndefOr[Boolean | force] = js.native
    
    var json: js.UndefOr[`true` | strict | force] = js.native
    
    var maxBytes: js.UndefOr[Double] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
  }
  object ReadOptions {
    
    @scala.inline
    def apply(): ReadOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadOptions]
    }
    
    @scala.inline
    implicit class ReadOptionsMutableBuilder[Self <: ReadOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGunzip(value: Boolean | force): Self = StObject.set(x, "gunzip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGunzipUndefined: Self = StObject.set(x, "gunzip", js.undefined)
      
      @scala.inline
      def setJson(value: `true` | strict | force): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      @scala.inline
      def setMaxBytes(value: Double): Self = StObject.set(x, "maxBytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxBytesUndefined: Self = StObject.set(x, "maxBytes", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  type RequestCallback = js.Function2[/* uri */ String, /* options */ RequestOptionspayloadanyu, Unit]
  
  @js.native
  trait RequestOptions extends StObject {
    
    var agent: js.UndefOr[Http | `false`] = js.native
    
    var baseUrl: js.UndefOr[String] = js.native
    
    var beforeRedirect: js.UndefOr[
        js.Function6[
          /* redirectMethod */ String, 
          /* statusCode */ Double, 
          /* location */ String, 
          /* resHeaders */ StringDictionary[js.Any], 
          /* redirectOptions */ js.Any, 
          /* next */ js.Function0[js.Object], 
          Unit
        ]
      ] = js.native
    
    var ciphers: js.UndefOr[String] = js.native
    
    var downstreamRes: js.UndefOr[js.Any] = js.native
    
    var events: js.UndefOr[Boolean] = js.native
    
    var headers: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    var maxBytes: js.UndefOr[Double] = js.native
    
    var payload: js.UndefOr[js.Any] = js.native
    
    var redirect303: js.UndefOr[Boolean] = js.native
    
    var redirected: js.UndefOr[
        js.Function3[/* statusCode */ Double, /* location */ String, /* req */ ClientRequest, Unit]
      ] = js.native
    
    var redirects: js.UndefOr[Double] = js.native
    
    var rejectUnauthorized: js.UndefOr[Boolean] = js.native
    
    var secureProtocol: js.UndefOr[String] = js.native
    
    var socketPath: js.UndefOr[String] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
  }
  object RequestOptions {
    
    @scala.inline
    def apply(): RequestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestOptions]
    }
    
    @scala.inline
    implicit class RequestOptionsMutableBuilder[Self <: RequestOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAgent(value: Http | `false`): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      @scala.inline
      def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      @scala.inline
      def setBeforeRedirect(
        value: (/* redirectMethod */ String, /* statusCode */ Double, /* location */ String, /* resHeaders */ StringDictionary[js.Any], /* redirectOptions */ js.Any, /* next */ js.Function0[js.Object]) => Unit
      ): Self = StObject.set(x, "beforeRedirect", js.Any.fromFunction6(value))
      
      @scala.inline
      def setBeforeRedirectUndefined: Self = StObject.set(x, "beforeRedirect", js.undefined)
      
      @scala.inline
      def setCiphers(value: String): Self = StObject.set(x, "ciphers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCiphersUndefined: Self = StObject.set(x, "ciphers", js.undefined)
      
      @scala.inline
      def setDownstreamRes(value: js.Any): Self = StObject.set(x, "downstreamRes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownstreamResUndefined: Self = StObject.set(x, "downstreamRes", js.undefined)
      
      @scala.inline
      def setEvents(value: Boolean): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      @scala.inline
      def setHeaders(value: StringDictionary[js.Any]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setMaxBytes(value: Double): Self = StObject.set(x, "maxBytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxBytesUndefined: Self = StObject.set(x, "maxBytes", js.undefined)
      
      @scala.inline
      def setPayload(value: js.Any): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
      
      @scala.inline
      def setRedirect303(value: Boolean): Self = StObject.set(x, "redirect303", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirect303Undefined: Self = StObject.set(x, "redirect303", js.undefined)
      
      @scala.inline
      def setRedirected(value: (/* statusCode */ Double, /* location */ String, /* req */ ClientRequest) => Unit): Self = StObject.set(x, "redirected", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRedirectedUndefined: Self = StObject.set(x, "redirected", js.undefined)
      
      @scala.inline
      def setRedirects(value: Double): Self = StObject.set(x, "redirects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirectsUndefined: Self = StObject.set(x, "redirects", js.undefined)
      
      @scala.inline
      def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRejectUnauthorizedUndefined: Self = StObject.set(x, "rejectUnauthorized", js.undefined)
      
      @scala.inline
      def setSecureProtocol(value: String): Self = StObject.set(x, "secureProtocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecureProtocolUndefined: Self = StObject.set(x, "secureProtocol", js.undefined)
      
      @scala.inline
      def setSocketPath(value: String): Self = StObject.set(x, "socketPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocketPathUndefined: Self = StObject.set(x, "socketPath", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  @js.native
  trait RequestResponse extends StObject {
    
    var payload: js.Any = js.native
    
    var res: IncomingMessage = js.native
  }
  object RequestResponse {
    
    @scala.inline
    def apply(payload: js.Any, res: IncomingMessage): RequestResponse = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestResponse]
    }
    
    @scala.inline
    implicit class RequestResponseMutableBuilder[Self <: RequestResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPayload(value: js.Any): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRes(value: IncomingMessage): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
    }
  }
  
  type ResponseCallback = js.Function2[/* err */ js.UndefOr[typings.boom.mod.^[js.Any]], /* details */ Req, Unit]
  
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
    
    def delete(uri: String, options: RequestOptions with ReadOptions): js.Promise[RequestResponse] = js.native
    
    var events: js.UndefOr[WreckEventEmitter] = js.native
    
    def get(uri: String, options: RequestOptions with ReadOptions): js.Promise[RequestResponse] = js.native
    
    def parseCacheControl(field: String): js.Any = js.native
    
    def patch(uri: String, options: RequestOptions with ReadOptions): js.Promise[RequestResponse] = js.native
    
    def post(uri: String, options: RequestOptions with ReadOptions): js.Promise[RequestResponse] = js.native
    
    def put(uri: String, options: RequestOptions with ReadOptions): js.Promise[RequestResponse] = js.native
    
    def read(response: IncomingMessage, options: ReadOptions): js.Promise[_] = js.native
    
    def request(method: String, uri: String, options: RequestOptions): PromiseIncomingMessagereq = js.native
    
    def toReadableStream(payload: js.Any): Readable = js.native
    def toReadableStream(payload: js.Any, encoding: String): Readable = js.native
  }
  
  type _To = WreckObject
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: WreckObject = ^
}
