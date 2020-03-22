package typings.webdriver.WebDriver

import org.scalablytyped.runtime.StringDictionary
import typings.node.NodeJS.WritableStream
import typings.webdriver.HTTPRequestOptions
import typings.webdriver.HTTPResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachSessionOptions extends Options {
  var isW3C: js.UndefOr[Boolean] = js.undefined
  var sessionId: String
}

object AttachSessionOptions {
  @scala.inline
  def apply(
    sessionId: String,
    capabilities: DesiredCapabilities = null,
    connectionRetryCount: Int | Double = null,
    connectionRetryTimeout: Int | Double = null,
    headers: StringDictionary[String] = null,
    hostname: String = null,
    isW3C: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    logLevel: WebDriverLogTypes = null,
    logOutput: String | WritableStream = null,
    path: String = null,
    port: Int | Double = null,
    protocol: String = null,
    queryParams: StringDictionary[String] = null,
    transformRequest: /* requestOptions */ HTTPRequestOptions => HTTPRequestOptions = null,
    transformResponse: (/* response */ HTTPResponse, /* requestOptions */ HTTPRequestOptions) => HTTPResponse = null,
    user: String = null
  ): AttachSessionOptions = {
    val __obj = js.Dynamic.literal(sessionId = sessionId.asInstanceOf[js.Any])
    if (capabilities != null) __obj.updateDynamic("capabilities")(capabilities.asInstanceOf[js.Any])
    if (connectionRetryCount != null) __obj.updateDynamic("connectionRetryCount")(connectionRetryCount.asInstanceOf[js.Any])
    if (connectionRetryTimeout != null) __obj.updateDynamic("connectionRetryTimeout")(connectionRetryTimeout.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (hostname != null) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    if (!js.isUndefined(isW3C)) __obj.updateDynamic("isW3C")(isW3C.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    if (logOutput != null) __obj.updateDynamic("logOutput")(logOutput.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (queryParams != null) __obj.updateDynamic("queryParams")(queryParams.asInstanceOf[js.Any])
    if (transformRequest != null) __obj.updateDynamic("transformRequest")(js.Any.fromFunction1(transformRequest))
    if (transformResponse != null) __obj.updateDynamic("transformResponse")(js.Any.fromFunction2(transformResponse))
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachSessionOptions]
  }
}

