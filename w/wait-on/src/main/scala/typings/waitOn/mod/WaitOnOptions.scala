package typings.waitOn.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WaitOnOptions extends js.Object {
  
  /**
    * Https specific option.
    * see https://github.com/request/request#readme for specific details
    */
  var auth: js.UndefOr[WaitOnAuth] = js.native
  
  /**
    * Initial delay in ms.
    * @default 0
    */
  var delay: js.UndefOr[Double] = js.native
  
  var followRedirect: js.UndefOr[Boolean] = js.native
  
  var headers: js.UndefOr[Record[String, _]] = js.native
  
  /**
    * http HEAD/GET timeout to wait for request
    * @default 0
    */
  var httpTimeout: js.UndefOr[Double] = js.native
  
  /**
    * Poll resource interval in ms,
    * @default 250ms
    */
  var interval: js.UndefOr[Double] = js.native
  
  /**
    * Flag which outputs to stdout, remaining resources waited on and when complete or any error occurs.
    */
  var log: js.UndefOr[Boolean] = js.native
  
  /**
    * Proxy options.
    * see https://github.com/axios/axios#config-defaults
    */
  var proxy: js.UndefOr[AxiosProxyConfig] = js.native
  
  /**
    * Array of string resources to wait for. prefix determines the type of resource with the default type of file:
    */
  var resources: js.Array[String] = js.native
  
  /**
    * Flag to reverse operation so checks are for resources being NOT available.
    * @default false
    */
  var reverse: js.UndefOr[Boolean] = js.native
  
  /**
    * Limit of concurrent connections to a resource
    * @default Infinity
    */
  var simultaneous: js.UndefOr[Double] = js.native
  
  var strictSSL: js.UndefOr[Boolean] = js.native
  
  /**
    * Tcp timeout in ms.
    * @default 300
    */
  var tcpTimeout: js.UndefOr[Double] = js.native
  
  /**
    * Timeout in ms until it aborts with error.
    * @default Infinity
    */
  var timeout: js.UndefOr[Double] = js.native
  
  /**
    * Validates whether a status is valid.
    */
  var validateStatus: js.UndefOr[ValidateStatus] = js.native
  
  /**
    * Flag which outputs debug output.
    * @default false
    */
  var verbose: js.UndefOr[Boolean] = js.native
  
  /**
    * Stabilization time in ms
    * Waits this amount of time for file sizes to stabilize or other resource availability to remain unchanged.
    * @default 750ms.
    */
  var window: js.UndefOr[Double] = js.native
}
object WaitOnOptions {
  
  @scala.inline
  def apply(resources: js.Array[String]): WaitOnOptions = {
    val __obj = js.Dynamic.literal(resources = resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaitOnOptions]
  }
  
  @scala.inline
  implicit class WaitOnOptionsOps[Self <: WaitOnOptions] (val x: Self) extends AnyVal {
    
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
    def setResourcesVarargs(value: String*): Self = this.set("resources", js.Array(value :_*))
    
    @scala.inline
    def setResources(value: js.Array[String]): Self = this.set("resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuth(value: WaitOnAuth): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setFollowRedirect(value: Boolean): Self = this.set("followRedirect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFollowRedirect: Self = this.set("followRedirect", js.undefined)
    
    @scala.inline
    def setHeaders(value: Record[String, _]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setHttpTimeout(value: Double): Self = this.set("httpTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpTimeout: Self = this.set("httpTimeout", js.undefined)
    
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    
    @scala.inline
    def setLog(value: Boolean): Self = this.set("log", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLog: Self = this.set("log", js.undefined)
    
    @scala.inline
    def setProxy(value: AxiosProxyConfig): Self = this.set("proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxy: Self = this.set("proxy", js.undefined)
    
    @scala.inline
    def setReverse(value: Boolean): Self = this.set("reverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReverse: Self = this.set("reverse", js.undefined)
    
    @scala.inline
    def setSimultaneous(value: Double): Self = this.set("simultaneous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSimultaneous: Self = this.set("simultaneous", js.undefined)
    
    @scala.inline
    def setStrictSSL(value: Boolean): Self = this.set("strictSSL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrictSSL: Self = this.set("strictSSL", js.undefined)
    
    @scala.inline
    def setTcpTimeout(value: Double): Self = this.set("tcpTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTcpTimeout: Self = this.set("tcpTimeout", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setValidateStatus(value: /* status */ Double => Boolean): Self = this.set("validateStatus", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteValidateStatus: Self = this.set("validateStatus", js.undefined)
    
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
    
    @scala.inline
    def setWindow(value: Double): Self = this.set("window", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindow: Self = this.set("window", js.undefined)
  }
}
