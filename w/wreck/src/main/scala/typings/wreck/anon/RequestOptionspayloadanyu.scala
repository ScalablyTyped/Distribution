package typings.wreck.anon

import org.scalablytyped.runtime.StringDictionary
import typings.node.httpMod.ClientRequest
import typings.wreck.wreckBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined wreck.wreck.RequestOptions & {  payload :any | undefined} */
@js.native
trait RequestOptionspayloadanyu extends js.Object {
  
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
  implicit class RequestOptionspayloadanyuOps[Self <: RequestOptionspayloadanyu] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAgent(value: Http | `false`): Self = this.set("agent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgent: Self = this.set("agent", js.undefined)
    
    @scala.inline
    def setBaseUrl(value: String): Self = this.set("baseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseUrl: Self = this.set("baseUrl", js.undefined)
    
    @scala.inline
    def setBeforeRedirect(
      value: (/* redirectMethod */ String, /* statusCode */ Double, /* location */ String, /* resHeaders */ StringDictionary[js.Any], /* redirectOptions */ js.Any, /* next */ js.Function0[js.Object]) => Unit
    ): Self = this.set("beforeRedirect", js.Any.fromFunction6(value))
    
    @scala.inline
    def deleteBeforeRedirect: Self = this.set("beforeRedirect", js.undefined)
    
    @scala.inline
    def setCiphers(value: String): Self = this.set("ciphers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCiphers: Self = this.set("ciphers", js.undefined)
    
    @scala.inline
    def setDownstreamRes(value: js.Any): Self = this.set("downstreamRes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDownstreamRes: Self = this.set("downstreamRes", js.undefined)
    
    @scala.inline
    def setEvents(value: Boolean): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    
    @scala.inline
    def setHeaders(value: StringDictionary[js.Any]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setMaxBytes(value: Double): Self = this.set("maxBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxBytes: Self = this.set("maxBytes", js.undefined)
    
    @scala.inline
    def setPayload(value: js.Any): Self = this.set("payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
    
    @scala.inline
    def setRedirect303(value: Boolean): Self = this.set("redirect303", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedirect303: Self = this.set("redirect303", js.undefined)
    
    @scala.inline
    def setRedirected(value: (/* statusCode */ Double, /* location */ String, /* req */ ClientRequest) => Unit): Self = this.set("redirected", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteRedirected: Self = this.set("redirected", js.undefined)
    
    @scala.inline
    def setRedirects(value: Double): Self = this.set("redirects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedirects: Self = this.set("redirects", js.undefined)
    
    @scala.inline
    def setRejectUnauthorized(value: Boolean): Self = this.set("rejectUnauthorized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRejectUnauthorized: Self = this.set("rejectUnauthorized", js.undefined)
    
    @scala.inline
    def setSecureProtocol(value: String): Self = this.set("secureProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecureProtocol: Self = this.set("secureProtocol", js.undefined)
    
    @scala.inline
    def setSocketPath(value: String): Self = this.set("socketPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSocketPath: Self = this.set("socketPath", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
