package typings.tunnel.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProxyOptions extends js.Object {
  
  var headers: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var host: String = js.native
  
  var localAddress: js.UndefOr[String] = js.native
  
  var port: Double = js.native
  
  var proxyAuth: js.UndefOr[String] = js.native
}
object ProxyOptions {
  
  @scala.inline
  def apply(host: String, port: Double): ProxyOptions = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProxyOptions]
  }
  
  @scala.inline
  implicit class ProxyOptionsOps[Self <: ProxyOptions] (val x: Self) extends AnyVal {
    
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
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: StringDictionary[js.Any]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setLocalAddress(value: String): Self = this.set("localAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalAddress: Self = this.set("localAddress", js.undefined)
    
    @scala.inline
    def setProxyAuth(value: String): Self = this.set("proxyAuth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxyAuth: Self = this.set("proxyAuth", js.undefined)
  }
}
