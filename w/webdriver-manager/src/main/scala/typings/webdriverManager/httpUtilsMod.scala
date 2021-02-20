package typings.webdriverManager

import typings.request.mod.OptionsWithUrl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpUtilsMod {
  
  @JSImport("webdriver-manager/built/lib/http_utils", "HttpUtils")
  @js.native
  class HttpUtils () extends StObject
  /* static members */
  object HttpUtils {
    
    @JSImport("webdriver-manager/built/lib/http_utils", "HttpUtils")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("webdriver-manager/built/lib/http_utils", "HttpUtils.assignOptions")
    @js.native
    def assignOptions(options: RequestOptionsValue): Unit = js.native
    
    @JSImport("webdriver-manager/built/lib/http_utils", "HttpUtils.initOptions")
    @js.native
    def initOptions(url: String): OptionsWithUrl = js.native
    @JSImport("webdriver-manager/built/lib/http_utils", "HttpUtils.initOptions")
    @js.native
    def initOptions(url: String, timeout: Double): OptionsWithUrl = js.native
    
    @JSImport("webdriver-manager/built/lib/http_utils", "HttpUtils.optionsHeader")
    @js.native
    def optionsHeader(options: OptionsWithUrl, key: String, value: String): OptionsWithUrl = js.native
    
    @JSImport("webdriver-manager/built/lib/http_utils", "HttpUtils.optionsProxy")
    @js.native
    def optionsProxy(options: OptionsWithUrl, requestUrl: String, opt_proxy: String): OptionsWithUrl = js.native
    
    @JSImport("webdriver-manager/built/lib/http_utils", "HttpUtils.optionsSSL")
    @js.native
    def optionsSSL(options: OptionsWithUrl, opt_ignoreSSL: Boolean): OptionsWithUrl = js.native
    
    @JSImport("webdriver-manager/built/lib/http_utils", "HttpUtils.requestOpts")
    @js.native
    def requestOpts: RequestOptionsValue = js.native
    @scala.inline
    def requestOpts_=(x: RequestOptionsValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("requestOpts")(x.asInstanceOf[js.Any])
    
    /**
      * Resolves proxy based on values set
      * @param fileUrl The url to download the file.
      * @param opt_proxy The proxy to connect to to download files.
      * @return Either undefined or the proxy.
      */
    @JSImport("webdriver-manager/built/lib/http_utils", "HttpUtils.resolveProxy")
    @js.native
    def resolveProxy(fileUrl: String): String = js.native
    @JSImport("webdriver-manager/built/lib/http_utils", "HttpUtils.resolveProxy")
    @js.native
    def resolveProxy(fileUrl: String, opt_proxy: String): String = js.native
  }
  
  @JSImport("webdriver-manager/built/lib/http_utils", "requestBody")
  @js.native
  def requestBody(requestUrl: String): js.Promise[String] = js.native
  
  @js.native
  trait RequestOptionsValue extends StObject {
    
    var ignoreSSL: js.UndefOr[Boolean] = js.native
    
    var proxy: js.UndefOr[String] = js.native
  }
  object RequestOptionsValue {
    
    @scala.inline
    def apply(): RequestOptionsValue = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestOptionsValue]
    }
    
    @scala.inline
    implicit class RequestOptionsValueMutableBuilder[Self <: RequestOptionsValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIgnoreSSL(value: Boolean): Self = StObject.set(x, "ignoreSSL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreSSLUndefined: Self = StObject.set(x, "ignoreSSL", js.undefined)
      
      @scala.inline
      def setProxy(value: String): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    }
  }
}
