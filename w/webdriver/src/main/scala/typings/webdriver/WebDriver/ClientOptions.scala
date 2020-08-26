package typings.webdriver.WebDriver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientOptions extends js.Object {
  var capabilities: DesiredCapabilities = js.native
  var isAndroid: Boolean = js.native
  var isChrome: Boolean = js.native
  var isIOS: Boolean = js.native
  var isMobile: Boolean = js.native
  var isW3C: Boolean = js.native
  var sessionId: String = js.native
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
  @scala.inline
  implicit class ClientOptionsOps[Self <: ClientOptions] (val x: Self) extends AnyVal {
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
    def setIsChrome(value: Boolean): Self = this.set("isChrome", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsIOS(value: Boolean): Self = this.set("isIOS", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsMobile(value: Boolean): Self = this.set("isMobile", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsW3C(value: Boolean): Self = this.set("isW3C", value.asInstanceOf[js.Any])
    @scala.inline
    def setSessionId(value: String): Self = this.set("sessionId", value.asInstanceOf[js.Any])
  }
  
}

