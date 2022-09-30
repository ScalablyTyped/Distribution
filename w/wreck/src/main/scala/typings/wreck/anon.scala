package typings.wreck

import org.scalablytyped.runtime.StringDictionary
import typings.node.httpMod.Agent
import typings.node.httpMod.ClientRequest
import typings.node.httpMod.IncomingMessage
import typings.node.urlMod.URL_
import typings.std.PromiseLike
import typings.wreck.wreckBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Http extends StObject {
    
    var http: Agent
    
    var https: Agent
    
    var httpsAllowUnauthorized: Agent
  }
  object Http {
    
    inline def apply(http: Agent, https: Agent, httpsAllowUnauthorized: Agent): Http = {
      val __obj = js.Dynamic.literal(http = http.asInstanceOf[js.Any], https = https.asInstanceOf[js.Any], httpsAllowUnauthorized = httpsAllowUnauthorized.asInstanceOf[js.Any])
      __obj.asInstanceOf[Http]
    }
    
    extension [Self <: Http](x: Self) {
      
      inline def setHttp(value: Agent): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
      
      inline def setHttps(value: Agent): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
      
      inline def setHttpsAllowUnauthorized(value: Agent): Self = StObject.set(x, "httpsAllowUnauthorized", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Promise<node.http.IncomingMessage> & {  req :node.http.ClientRequest} */
  @js.native
  trait PromiseIncomingMessagereq extends StObject {
    
    /**
      * Attaches a callback for only the rejection of the Promise.
      * @param onrejected The callback to execute when the Promise is rejected.
      * @returns A Promise for the completion of the callback.
      */
    /* standard es5 */
    def `catch`[TResult](): js.Promise[IncomingMessage | TResult] = js.native
    def `catch`[TResult](onrejected: js.Function1[/* reason */ Any, TResult | PromiseLike[TResult]]): js.Promise[IncomingMessage | TResult] = js.native
    
    /**
      * Attaches a callback that is invoked when the Promise is settled (fulfilled or rejected). The
      * resolved value cannot be modified from the callback.
      * @param onfinally The callback to execute when the Promise is settled (fulfilled or rejected).
      * @returns A Promise for the completion of the callback.
      */
    /* standard es2018.promise */
    def `finally`(): js.Promise[IncomingMessage] = js.native
    def `finally`(onfinally: js.Function0[Unit]): js.Promise[IncomingMessage] = js.native
    
    var req: ClientRequest = js.native
    
    /**
      * Attaches callbacks for the resolution and/or rejection of the Promise.
      * @param onfulfilled The callback to execute when the Promise is resolved.
      * @param onrejected The callback to execute when the Promise is rejected.
      * @returns A Promise for the completion of which ever callback is executed.
      */
    /* standard es5 */
    def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](onfulfilled: js.Function1[/* value */ IncomingMessage, TResult1 | PromiseLike[TResult1]]): js.Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](
      onfulfilled: js.Function1[/* value */ IncomingMessage, TResult1 | PromiseLike[TResult1]],
      onrejected: js.Function1[/* reason */ Any, TResult2 | PromiseLike[TResult2]]
    ): js.Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](onfulfilled: Null, onrejected: js.Function1[/* reason */ Any, TResult2 | PromiseLike[TResult2]]): js.Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](onfulfilled: Unit, onrejected: js.Function1[/* reason */ Any, TResult2 | PromiseLike[TResult2]]): js.Promise[TResult1 | TResult2] = js.native
    
    /* standard es2015.symbol.wellknown */
    @JSName(js.Symbol.toStringTag)
    val toStringTag: String = js.native
  }
  
  trait Req extends StObject {
    
    var req: ClientRequest
    
    var res: js.UndefOr[IncomingMessage] = js.undefined
    
    var start: Double
    
    var url: URL_
  }
  object Req {
    
    inline def apply(req: ClientRequest, start: Double, url: URL_): Req = {
      val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Req]
    }
    
    extension [Self <: Req](x: Self) {
      
      inline def setReq(value: ClientRequest): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
      
      inline def setRes(value: IncomingMessage): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
      
      inline def setResUndefined: Self = StObject.set(x, "res", js.undefined)
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: URL_): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined wreck.wreck.RequestOptions & {  payload :any | undefined} */
  trait RequestOptionspayloadanyu extends StObject {
    
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
  object RequestOptionspayloadanyu {
    
    inline def apply(): RequestOptionspayloadanyu = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestOptionspayloadanyu]
    }
    
    extension [Self <: RequestOptionspayloadanyu](x: Self) {
      
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
}
