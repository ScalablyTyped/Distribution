package typings.webdriver.WebDriver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProxyObject extends js.Object {
  var ftpProxy: js.UndefOr[String] = js.undefined
  var ftpProxyPort: js.UndefOr[Double] = js.undefined
  var httpProxy: js.UndefOr[String] = js.undefined
  var httpProxyPort: js.UndefOr[Double] = js.undefined
  var proxyAutoconfigUrl: js.UndefOr[String] = js.undefined
  var proxyType: js.UndefOr[ProxyTypes] = js.undefined
  var socksPassword: js.UndefOr[String] = js.undefined
  var socksProxy: js.UndefOr[String] = js.undefined
  var socksProxyPort: js.UndefOr[Double] = js.undefined
  var socksUsername: js.UndefOr[String] = js.undefined
  var socksVersion: js.UndefOr[String] = js.undefined
  var sslProxy: js.UndefOr[String] = js.undefined
  var sslProxyPort: js.UndefOr[Double] = js.undefined
}

object ProxyObject {
  @scala.inline
  def apply(
    ftpProxy: String = null,
    ftpProxyPort: js.UndefOr[Double] = js.undefined,
    httpProxy: String = null,
    httpProxyPort: js.UndefOr[Double] = js.undefined,
    proxyAutoconfigUrl: String = null,
    proxyType: ProxyTypes = null,
    socksPassword: String = null,
    socksProxy: String = null,
    socksProxyPort: js.UndefOr[Double] = js.undefined,
    socksUsername: String = null,
    socksVersion: String = null,
    sslProxy: String = null,
    sslProxyPort: js.UndefOr[Double] = js.undefined
  ): ProxyObject = {
    val __obj = js.Dynamic.literal()
    if (ftpProxy != null) __obj.updateDynamic("ftpProxy")(ftpProxy.asInstanceOf[js.Any])
    if (!js.isUndefined(ftpProxyPort)) __obj.updateDynamic("ftpProxyPort")(ftpProxyPort.get.asInstanceOf[js.Any])
    if (httpProxy != null) __obj.updateDynamic("httpProxy")(httpProxy.asInstanceOf[js.Any])
    if (!js.isUndefined(httpProxyPort)) __obj.updateDynamic("httpProxyPort")(httpProxyPort.get.asInstanceOf[js.Any])
    if (proxyAutoconfigUrl != null) __obj.updateDynamic("proxyAutoconfigUrl")(proxyAutoconfigUrl.asInstanceOf[js.Any])
    if (proxyType != null) __obj.updateDynamic("proxyType")(proxyType.asInstanceOf[js.Any])
    if (socksPassword != null) __obj.updateDynamic("socksPassword")(socksPassword.asInstanceOf[js.Any])
    if (socksProxy != null) __obj.updateDynamic("socksProxy")(socksProxy.asInstanceOf[js.Any])
    if (!js.isUndefined(socksProxyPort)) __obj.updateDynamic("socksProxyPort")(socksProxyPort.get.asInstanceOf[js.Any])
    if (socksUsername != null) __obj.updateDynamic("socksUsername")(socksUsername.asInstanceOf[js.Any])
    if (socksVersion != null) __obj.updateDynamic("socksVersion")(socksVersion.asInstanceOf[js.Any])
    if (sslProxy != null) __obj.updateDynamic("sslProxy")(sslProxy.asInstanceOf[js.Any])
    if (!js.isUndefined(sslProxyPort)) __obj.updateDynamic("sslProxyPort")(sslProxyPort.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProxyObject]
  }
}

