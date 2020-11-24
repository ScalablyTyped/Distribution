package typings.webdriverManager.httpUtilsMod

import typings.request.mod.OptionsWithUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webdriver-manager/built/lib/http_utils", "HttpUtils")
@js.native
class HttpUtils () extends js.Object
/* static members */
@JSImport("webdriver-manager/built/lib/http_utils", "HttpUtils")
@js.native
object HttpUtils extends js.Object {
  
  def assignOptions(options: RequestOptionsValue): Unit = js.native
  
  def initOptions(url: String): OptionsWithUrl = js.native
  def initOptions(url: String, timeout: Double): OptionsWithUrl = js.native
  
  def optionsHeader(options: OptionsWithUrl, key: String, value: String): OptionsWithUrl = js.native
  
  def optionsProxy(options: OptionsWithUrl, requestUrl: String, opt_proxy: String): OptionsWithUrl = js.native
  
  def optionsSSL(options: OptionsWithUrl, opt_ignoreSSL: Boolean): OptionsWithUrl = js.native
  
  var requestOpts: RequestOptionsValue = js.native
  
  /**
    * Resolves proxy based on values set
    * @param fileUrl The url to download the file.
    * @param opt_proxy The proxy to connect to to download files.
    * @return Either undefined or the proxy.
    */
  def resolveProxy(fileUrl: String): String = js.native
  def resolveProxy(fileUrl: String, opt_proxy: String): String = js.native
}
