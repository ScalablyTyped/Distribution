package typings.webdriverio.anon

import typings.webdriver.WebDriver.DesiredCapabilities
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Capabilities extends js.Object {
  var capabilities: DesiredCapabilities = js.native
}

object Capabilities {
  @scala.inline
  def apply(capabilities: DesiredCapabilities): Capabilities = {
    val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any])
    __obj.asInstanceOf[Capabilities]
  }
  @scala.inline
  implicit class CapabilitiesOps[Self <: Capabilities] (val x: Self) extends AnyVal {
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
  }
  
}

