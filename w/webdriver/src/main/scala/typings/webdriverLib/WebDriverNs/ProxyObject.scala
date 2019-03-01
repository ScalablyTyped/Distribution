package typings
package webdriverLib.WebDriverNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProxyObject extends js.Object {
  var ftpProxy: js.UndefOr[java.lang.String] = js.undefined
  var ftpProxyPort: js.UndefOr[scala.Double] = js.undefined
  var httpProxy: js.UndefOr[java.lang.String] = js.undefined
  var httpProxyPort: js.UndefOr[scala.Double] = js.undefined
  var proxyAutoconfigUrl: js.UndefOr[java.lang.String] = js.undefined
  var proxyType: js.UndefOr[ProxyTypes] = js.undefined
  var socksPassword: js.UndefOr[java.lang.String] = js.undefined
  var socksProxy: js.UndefOr[java.lang.String] = js.undefined
  var socksProxyPort: js.UndefOr[scala.Double] = js.undefined
  var socksUsername: js.UndefOr[java.lang.String] = js.undefined
  var socksVersion: js.UndefOr[java.lang.String] = js.undefined
  var sslProxy: js.UndefOr[java.lang.String] = js.undefined
  var sslProxyPort: js.UndefOr[scala.Double] = js.undefined
}

object ProxyObject {
  @scala.inline
  def apply(
    ftpProxy: java.lang.String = null,
    ftpProxyPort: scala.Int | scala.Double = null,
    httpProxy: java.lang.String = null,
    httpProxyPort: scala.Int | scala.Double = null,
    proxyAutoconfigUrl: java.lang.String = null,
    proxyType: ProxyTypes = null,
    socksPassword: java.lang.String = null,
    socksProxy: java.lang.String = null,
    socksProxyPort: scala.Int | scala.Double = null,
    socksUsername: java.lang.String = null,
    socksVersion: java.lang.String = null,
    sslProxy: java.lang.String = null,
    sslProxyPort: scala.Int | scala.Double = null
  ): ProxyObject = {
    val __obj = js.Dynamic.literal()
    if (ftpProxy != null) __obj.updateDynamic("ftpProxy")(ftpProxy)
    if (ftpProxyPort != null) __obj.updateDynamic("ftpProxyPort")(ftpProxyPort.asInstanceOf[js.Any])
    if (httpProxy != null) __obj.updateDynamic("httpProxy")(httpProxy)
    if (httpProxyPort != null) __obj.updateDynamic("httpProxyPort")(httpProxyPort.asInstanceOf[js.Any])
    if (proxyAutoconfigUrl != null) __obj.updateDynamic("proxyAutoconfigUrl")(proxyAutoconfigUrl)
    if (proxyType != null) __obj.updateDynamic("proxyType")(proxyType)
    if (socksPassword != null) __obj.updateDynamic("socksPassword")(socksPassword)
    if (socksProxy != null) __obj.updateDynamic("socksProxy")(socksProxy)
    if (socksProxyPort != null) __obj.updateDynamic("socksProxyPort")(socksProxyPort.asInstanceOf[js.Any])
    if (socksUsername != null) __obj.updateDynamic("socksUsername")(socksUsername)
    if (socksVersion != null) __obj.updateDynamic("socksVersion")(socksVersion)
    if (sslProxy != null) __obj.updateDynamic("sslProxy")(sslProxy)
    if (sslProxyPort != null) __obj.updateDynamic("sslProxyPort")(sslProxyPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProxyObject]
  }
}

