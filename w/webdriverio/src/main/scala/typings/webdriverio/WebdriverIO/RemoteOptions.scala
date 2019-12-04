package typings.webdriverio.WebdriverIO

import org.scalablytyped.runtime.StringDictionary
import typings.node.NodeJS.WritableStream
import typings.webdriver.WebDriver.DesiredCapabilities
import typings.webdriver.WebDriver.WebDriverLogTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof webdriverio.WebdriverIO.Options, 'capabilities'> ]: webdriverio.WebdriverIO.Options[P]} */ trait RemoteOptions
  extends typings.webdriver.WebDriver.Options

object RemoteOptions {
  @scala.inline
  def apply(
    capabilities: DesiredCapabilities = null,
    connectionRetryCount: Int | Double = null,
    connectionRetryTimeout: Int | Double = null,
    headers: StringDictionary[String] = null,
    hostname: String = null,
    key: String = null,
    logLevel: WebDriverLogTypes = null,
    logOutput: String | WritableStream = null,
    path: String = null,
    port: Int | Double = null,
    protocol: String = null,
    queryParams: StringDictionary[String] = null,
    user: String = null
  ): RemoteOptions = {
    val __obj = js.Dynamic.literal()
    if (capabilities != null) __obj.updateDynamic("capabilities")(capabilities.asInstanceOf[js.Any])
    if (connectionRetryCount != null) __obj.updateDynamic("connectionRetryCount")(connectionRetryCount.asInstanceOf[js.Any])
    if (connectionRetryTimeout != null) __obj.updateDynamic("connectionRetryTimeout")(connectionRetryTimeout.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (hostname != null) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    if (logOutput != null) __obj.updateDynamic("logOutput")(logOutput.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (queryParams != null) __obj.updateDynamic("queryParams")(queryParams.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteOptions]
  }
}

