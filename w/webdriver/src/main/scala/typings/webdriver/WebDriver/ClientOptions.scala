package typings.webdriver.WebDriver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientOptions extends js.Object {
  var capabilities: DesiredCapabilities
  var isAndroid: Boolean
  var isChrome: Boolean
  var isIOS: Boolean
  var isMobile: Boolean
  var isW3C: Boolean
  var sessionId: String
}

object ClientOptions {
  @scala.inline
  def apply(
    capabilities: DesiredCapabilities,
    isAndroid: Boolean,
    isChrome: Boolean,
    isIOS: Boolean,
    isMobile: Boolean,
    isW3C: Boolean,
    sessionId: String
  ): ClientOptions = {
    val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any], isAndroid = isAndroid.asInstanceOf[js.Any], isChrome = isChrome.asInstanceOf[js.Any], isIOS = isIOS.asInstanceOf[js.Any], isMobile = isMobile.asInstanceOf[js.Any], isW3C = isW3C.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOptions]
  }
}

