package typings
package webdriverDashManagerLib.builtLibHttpUnderscoreUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webdriver-manager/built/lib/http_utils", "HttpUtils")
@js.native
class HttpUtils () extends js.Object

@JSImport("webdriver-manager/built/lib/http_utils", "HttpUtils")
@js.native
object HttpUtils extends js.Object {
  var requestOpts: webdriverDashManagerLib.builtLibHttpUnderscoreUtilsMod.RequestOptionsValue = js.native
  def assignOptions(options: webdriverDashManagerLib.builtLibHttpUnderscoreUtilsMod.RequestOptionsValue): scala.Unit = js.native
  def initOptions(url: java.lang.String): requestLib.requestMod.requestNs.OptionsWithUrl = js.native
  def initOptions(url: java.lang.String, timeout: scala.Double): requestLib.requestMod.requestNs.OptionsWithUrl = js.native
  def optionsHeader(
    options: requestLib.requestMod.requestNs.OptionsWithUrl,
    key: java.lang.String,
    value: java.lang.String
  ): requestLib.requestMod.requestNs.OptionsWithUrl = js.native
  def optionsProxy(
    options: requestLib.requestMod.requestNs.OptionsWithUrl,
    requestUrl: java.lang.String,
    opt_proxy: java.lang.String
  ): requestLib.requestMod.requestNs.OptionsWithUrl = js.native
  def optionsSSL(options: requestLib.requestMod.requestNs.OptionsWithUrl, opt_ignoreSSL: scala.Boolean): requestLib.requestMod.requestNs.OptionsWithUrl = js.native
  /**
       * Resolves proxy based on values set
       * @param fileUrl The url to download the file.
       * @param opt_proxy The proxy to connect to to download files.
       * @return Either undefined or the proxy.
       */
  def resolveProxy(fileUrl: java.lang.String): java.lang.String = js.native
  /**
       * Resolves proxy based on values set
       * @param fileUrl The url to download the file.
       * @param opt_proxy The proxy to connect to to download files.
       * @return Either undefined or the proxy.
       */
  def resolveProxy(fileUrl: java.lang.String, opt_proxy: java.lang.String): java.lang.String = js.native
}

