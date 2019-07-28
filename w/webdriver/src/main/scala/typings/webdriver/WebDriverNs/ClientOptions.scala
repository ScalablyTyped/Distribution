package typings.webdriver.WebDriverNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientOptions extends js.Object {
  var capabilities: DesiredCapabilities
  var isAndroid: Boolean
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
    isIOS: Boolean,
    isMobile: Boolean,
    isW3C: Boolean,
    sessionId: String
  ): ClientOptions = {
    val __obj = js.Dynamic.literal(capabilities = capabilities, isAndroid = isAndroid, isIOS = isIOS, isMobile = isMobile, isW3C = isW3C, sessionId = sessionId)
  
    __obj.asInstanceOf[ClientOptions]
  }
}

