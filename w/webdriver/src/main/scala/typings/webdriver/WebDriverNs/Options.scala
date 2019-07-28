package typings.webdriver.WebDriverNs

import org.scalablytyped.runtime.StringDictionary
import typings.node.NodeJSNs.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var capabilities: js.UndefOr[DesiredCapabilities] = js.undefined
  var connectionRetryCount: js.UndefOr[Double] = js.undefined
  var connectionRetryTimeout: js.UndefOr[Double] = js.undefined
  var hostname: js.UndefOr[String] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var logLevel: js.UndefOr[WebDriverLogTypes] = js.undefined
  var logOutput: js.UndefOr[String | WritableStream] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var protocol: js.UndefOr[String] = js.undefined
  var queryParams: js.UndefOr[StringDictionary[String]] = js.undefined
  var user: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    capabilities: DesiredCapabilities = null,
    connectionRetryCount: Int | Double = null,
    connectionRetryTimeout: Int | Double = null,
    hostname: String = null,
    key: String = null,
    logLevel: WebDriverLogTypes = null,
    logOutput: String | WritableStream = null,
    path: String = null,
    port: Int | Double = null,
    protocol: String = null,
    queryParams: StringDictionary[String] = null,
    user: String = null
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

