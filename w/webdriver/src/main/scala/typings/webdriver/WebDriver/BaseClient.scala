package typings.webdriver.WebDriver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseClient extends js.Object {
  // assigned capabilities by the browser driver / WebDriver server
  var capabilities: DesiredCapabilities
  // true if mobile session runs on Android
  var isAndroid: Boolean
  // true if mobile session runs on iOS
  var isIOS: Boolean
  /**
    * browser flags
    */
  // true if session runs on a mobile device
  var isMobile: Boolean
  // original requested capabilities
  var requestedCapabilities: DesiredCapabilities
  // id of WebDriver session
  var sessionId: String
}

object BaseClient {
  @scala.inline
  def apply(
    capabilities: DesiredCapabilities,
    isAndroid: Boolean,
    isIOS: Boolean,
    isMobile: Boolean,
    requestedCapabilities: DesiredCapabilities,
    sessionId: String
  ): BaseClient = {
    val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any], isAndroid = isAndroid.asInstanceOf[js.Any], isIOS = isIOS.asInstanceOf[js.Any], isMobile = isMobile.asInstanceOf[js.Any], requestedCapabilities = requestedCapabilities.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseClient]
  }
}

