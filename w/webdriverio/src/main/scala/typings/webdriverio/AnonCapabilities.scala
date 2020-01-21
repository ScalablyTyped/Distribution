package typings.webdriverio

import typings.webdriver.WebDriver.DesiredCapabilities
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCapabilities extends js.Object {
  var capabilities: DesiredCapabilities
}

object AnonCapabilities {
  @scala.inline
  def apply(capabilities: DesiredCapabilities): AnonCapabilities = {
    val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCapabilities]
  }
}

