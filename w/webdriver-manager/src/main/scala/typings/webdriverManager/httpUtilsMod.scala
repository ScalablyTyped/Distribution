package typings.webdriverManager

import typings.request.mod.OptionsWithUrl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpUtilsMod {
  
  @JSImport("webdriver-manager/built/lib/http_utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("webdriver-manager/built/lib/http_utils", "HttpUtils")
  @js.native
  class HttpUtils () extends StObject
  /* static members */
  object HttpUtils {
    
    @JSImport("webdriver-manager/built/lib/http_utils", "HttpUtils")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def assignOptions(options: RequestOptionsValue): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assignOptions")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def initOptions(url: String): OptionsWithUrl = ^.asInstanceOf[js.Dynamic].applyDynamic("initOptions")(url.asInstanceOf[js.Any]).asInstanceOf[OptionsWithUrl]
    @scala.inline
    def initOptions(url: String, timeout: Double): OptionsWithUrl = (^.asInstanceOf[js.Dynamic].applyDynamic("initOptions")(url.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[OptionsWithUrl]
    
    @scala.inline
    def optionsHeader(options: OptionsWithUrl, key: String, value: String): OptionsWithUrl = (^.asInstanceOf[js.Dynamic].applyDynamic("optionsHeader")(options.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[OptionsWithUrl]
    
    @scala.inline
    def optionsProxy(options: OptionsWithUrl, requestUrl: String, opt_proxy: String): OptionsWithUrl = (^.asInstanceOf[js.Dynamic].applyDynamic("optionsProxy")(options.asInstanceOf[js.Any], requestUrl.asInstanceOf[js.Any], opt_proxy.asInstanceOf[js.Any])).asInstanceOf[OptionsWithUrl]
    
    @scala.inline
    def optionsSSL(options: OptionsWithUrl, opt_ignoreSSL: Boolean): OptionsWithUrl = (^.asInstanceOf[js.Dynamic].applyDynamic("optionsSSL")(options.asInstanceOf[js.Any], opt_ignoreSSL.asInstanceOf[js.Any])).asInstanceOf[OptionsWithUrl]
    
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
    @scala.inline
    def resolveProxy(fileUrl: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveProxy")(fileUrl.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def resolveProxy(fileUrl: String, opt_proxy: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveProxy")(fileUrl.asInstanceOf[js.Any], opt_proxy.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  @scala.inline
  def requestBody(requestUrl: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestBody")(requestUrl.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  trait RequestOptionsValue extends StObject {
    
    var ignoreSSL: js.UndefOr[Boolean] = js.undefined
    
    var proxy: js.UndefOr[String] = js.undefined
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
