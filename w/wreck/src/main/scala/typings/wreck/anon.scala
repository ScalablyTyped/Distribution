package typings.wreck

import org.scalablytyped.runtime.StringDictionary
import typings.node.httpMod.Agent
import typings.node.httpMod.ClientRequest
import typings.node.httpMod.IncomingMessage
import typings.node.urlMod.URL_
import typings.wreck.wreckBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Http extends StObject {
    
    var http: Agent = js.native
    
    var https: Agent = js.native
    
    var httpsAllowUnauthorized: Agent = js.native
  }
  object Http {
    
    @scala.inline
    def apply(http: Agent, https: Agent, httpsAllowUnauthorized: Agent): Http = {
      val __obj = js.Dynamic.literal(http = http.asInstanceOf[js.Any], https = https.asInstanceOf[js.Any], httpsAllowUnauthorized = httpsAllowUnauthorized.asInstanceOf[js.Any])
      __obj.asInstanceOf[Http]
    }
    
    @scala.inline
    implicit class HttpMutableBuilder[Self <: Http] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHttp(value: Agent): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttps(value: Agent): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpsAllowUnauthorized(value: Agent): Self = StObject.set(x, "httpsAllowUnauthorized", value.asInstanceOf[js.Any])
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
    def `catch`[TResult](): js.Promise[IncomingMessage | TResult] = js.native
    def `catch`[TResult](onrejected: js.Function1[/* reason */ js.Any, TResult | js.Thenable[TResult]]): js.Promise[IncomingMessage | TResult] = js.native
    
    /**
      * Attaches a callback that is invoked when the Promise is settled (fulfilled or rejected). The
      * resolved value cannot be modified from the callback.
      * @param onfinally The callback to execute when the Promise is settled (fulfilled or rejected).
      * @returns A Promise for the completion of the callback.
      */
    def `finally`(): js.Promise[IncomingMessage] = js.native
    def `finally`(onfinally: js.Function0[Unit]): js.Promise[IncomingMessage] = js.native
    
    var req: ClientRequest = js.native
    
    /**
      * Attaches callbacks for the resolution and/or rejection of the Promise.
      * @param onfulfilled The callback to execute when the Promise is resolved.
      * @param onrejected The callback to execute when the Promise is rejected.
      * @returns A Promise for the completion of which ever callback is executed.
      */
    def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](
      onfulfilled: js.UndefOr[scala.Nothing],
      onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]
    ): js.Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](onfulfilled: js.Function1[/* value */ IncomingMessage, TResult1 | js.Thenable[TResult1]]): js.Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](
      onfulfilled: js.Function1[/* value */ IncomingMessage, TResult1 | js.Thenable[TResult1]],
      onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]
    ): js.Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](onfulfilled: Null, onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]): js.Promise[TResult1 | TResult2] = js.native
    
    @JSName(js.Symbol.toStringTag)
    val toStringTag: String = js.native
  }
  
  @js.native
  trait Req extends StObject {
    
    var req: ClientRequest = js.native
    
    var res: js.UndefOr[IncomingMessage] = js.native
    
    var start: Double = js.native
    
    var url: URL_ = js.native
  }
  object Req {
    
    @scala.inline
    def apply(req: ClientRequest, start: Double, url: URL_): Req = {
      val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Req]
    }
    
    @scala.inline
    implicit class ReqMutableBuilder[Self <: Req] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReq(value: ClientRequest): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRes(value: IncomingMessage): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResUndefined: Self = StObject.set(x, "res", js.undefined)
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: URL_): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined wreck.wreck.RequestOptions & {  payload :any | undefined} */
  @js.native
  trait RequestOptionspayloadanyu extends StObject {
    
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
  object RequestOptionspayloadanyu {
    
    @scala.inline
    def apply(): RequestOptionspayloadanyu = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestOptionspayloadanyu]
    }
    
    @scala.inline
    implicit class RequestOptionspayloadanyuMutableBuilder[Self <: RequestOptionspayloadanyu] (val x: Self) extends AnyVal {
      
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
}
