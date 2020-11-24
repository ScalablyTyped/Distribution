package typings.typedRestClient.interfacesMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRequestOptions extends js.Object {
  
  var allowRedirectDowngrade: js.UndefOr[Boolean] = js.native
  
  var allowRedirects: js.UndefOr[Boolean] = js.native
  
  var allowRetries: js.UndefOr[Boolean] = js.native
  
  var cert: js.UndefOr[ICertConfiguration] = js.native
  
  var headers: js.UndefOr[IHeaders] = js.native
  
  var ignoreSslError: js.UndefOr[Boolean] = js.native
  
  var keepAlive: js.UndefOr[Boolean] = js.native
  
  var maxRedirects: js.UndefOr[Double] = js.native
  
  var maxRetries: js.UndefOr[Double] = js.native
  
  var maxSockets: js.UndefOr[Double] = js.native
  
  var presignedUrlPatterns: js.UndefOr[js.Array[RegExp]] = js.native
  
  var proxy: js.UndefOr[IProxyConfiguration] = js.native
  
  var socketTimeout: js.UndefOr[Double] = js.native
}
object IRequestOptions {
  
  @scala.inline
  def apply(): IRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRequestOptions]
  }
  
  @scala.inline
  implicit class IRequestOptionsOps[Self <: IRequestOptions] (val x: Self) extends AnyVal {
    
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
    def setAllowRedirectDowngrade(value: Boolean): Self = this.set("allowRedirectDowngrade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowRedirectDowngrade: Self = this.set("allowRedirectDowngrade", js.undefined)
    
    @scala.inline
    def setAllowRedirects(value: Boolean): Self = this.set("allowRedirects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowRedirects: Self = this.set("allowRedirects", js.undefined)
    
    @scala.inline
    def setAllowRetries(value: Boolean): Self = this.set("allowRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowRetries: Self = this.set("allowRetries", js.undefined)
    
    @scala.inline
    def setCert(value: ICertConfiguration): Self = this.set("cert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCert: Self = this.set("cert", js.undefined)
    
    @scala.inline
    def setHeaders(value: IHeaders): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setIgnoreSslError(value: Boolean): Self = this.set("ignoreSslError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreSslError: Self = this.set("ignoreSslError", js.undefined)
    
    @scala.inline
    def setKeepAlive(value: Boolean): Self = this.set("keepAlive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepAlive: Self = this.set("keepAlive", js.undefined)
    
    @scala.inline
    def setMaxRedirects(value: Double): Self = this.set("maxRedirects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRedirects: Self = this.set("maxRedirects", js.undefined)
    
    @scala.inline
    def setMaxRetries(value: Double): Self = this.set("maxRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRetries: Self = this.set("maxRetries", js.undefined)
    
    @scala.inline
    def setMaxSockets(value: Double): Self = this.set("maxSockets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxSockets: Self = this.set("maxSockets", js.undefined)
    
    @scala.inline
    def setPresignedUrlPatternsVarargs(value: RegExp*): Self = this.set("presignedUrlPatterns", js.Array(value :_*))
    
    @scala.inline
    def setPresignedUrlPatterns(value: js.Array[RegExp]): Self = this.set("presignedUrlPatterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePresignedUrlPatterns: Self = this.set("presignedUrlPatterns", js.undefined)
    
    @scala.inline
    def setProxy(value: IProxyConfiguration): Self = this.set("proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxy: Self = this.set("proxy", js.undefined)
    
    @scala.inline
    def setSocketTimeout(value: Double): Self = this.set("socketTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSocketTimeout: Self = this.set("socketTimeout", js.undefined)
  }
}
