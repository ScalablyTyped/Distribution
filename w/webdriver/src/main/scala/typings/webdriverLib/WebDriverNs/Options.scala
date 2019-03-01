package typings
package webdriverLib.WebDriverNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var capabilities: js.UndefOr[DesiredCapabilities] = js.undefined
  var connectionRetryCount: js.UndefOr[scala.Double] = js.undefined
  var connectionRetryTimeout: js.UndefOr[scala.Double] = js.undefined
  var hostname: js.UndefOr[java.lang.String] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
  var logLevel: js.UndefOr[WebDriverLogTypes] = js.undefined
  var logOutput: js.UndefOr[java.lang.String | nodeLib.NodeJSNs.WritableStream] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  var protocol: js.UndefOr[java.lang.String] = js.undefined
  var queryParams: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var user: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    capabilities: DesiredCapabilities = null,
    connectionRetryCount: scala.Int | scala.Double = null,
    connectionRetryTimeout: scala.Int | scala.Double = null,
    hostname: java.lang.String = null,
    key: java.lang.String = null,
    logLevel: WebDriverLogTypes = null,
    logOutput: java.lang.String | nodeLib.NodeJSNs.WritableStream = null,
    path: java.lang.String = null,
    port: scala.Int | scala.Double = null,
    protocol: java.lang.String = null,
    queryParams: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    user: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (capabilities != null) __obj.updateDynamic("capabilities")(capabilities)
    if (connectionRetryCount != null) __obj.updateDynamic("connectionRetryCount")(connectionRetryCount.asInstanceOf[js.Any])
    if (connectionRetryTimeout != null) __obj.updateDynamic("connectionRetryTimeout")(connectionRetryTimeout.asInstanceOf[js.Any])
    if (hostname != null) __obj.updateDynamic("hostname")(hostname)
    if (key != null) __obj.updateDynamic("key")(key)
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel)
    if (logOutput != null) __obj.updateDynamic("logOutput")(logOutput.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    if (queryParams != null) __obj.updateDynamic("queryParams")(queryParams)
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[Options]
  }
}

