package typings.webdriverio.anon

import typings.webdriver.WebDriver.DesiredCapabilities
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Capabilities extends js.Object {
  var capabilities: DesiredCapabilities
}

object Capabilities {
  @scala.inline
  def apply(capabilities: DesiredCapabilities): Capabilities = {
    val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any])
    __obj.asInstanceOf[Capabilities]
  }
}

