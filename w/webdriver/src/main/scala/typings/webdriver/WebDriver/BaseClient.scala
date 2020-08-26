package typings.webdriver.WebDriver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseClient extends js.Object {
  // assigned capabilities by the browser driver / WebDriver server
  var capabilities: DesiredCapabilities = js.native
  // true if mobile session runs on Android
  var isAndroid: Boolean = js.native
  // true if mobile session runs on iOS
  var isIOS: Boolean = js.native
  /**
    * browser flags
    */
  // true if session runs on a mobile device
  var isMobile: Boolean = js.native
  // original requested capabilities
  var requestedCapabilities: DesiredCapabilities = js.native
  // id of WebDriver session
  var sessionId: String = js.native
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
  @scala.inline
  implicit class BaseClientOps[Self <: BaseClient] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCapabilities(value: DesiredCapabilities): Self = this.set("capabilities", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsAndroid(value: Boolean): Self = this.set("isAndroid", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsIOS(value: Boolean): Self = this.set("isIOS", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsMobile(value: Boolean): Self = this.set("isMobile", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestedCapabilities(value: DesiredCapabilities): Self = this.set("requestedCapabilities", value.asInstanceOf[js.Any])
    @scala.inline
    def setSessionId(value: String): Self = this.set("sessionId", value.asInstanceOf[js.Any])
  }
  
}

