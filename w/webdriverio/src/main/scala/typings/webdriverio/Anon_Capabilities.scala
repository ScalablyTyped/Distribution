package typings.webdriverio

import typings.webdriver.WebDriver.DesiredCapabilities
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Capabilities extends js.Object {
  var capabilities: DesiredCapabilities
}

object Anon_Capabilities {
  @scala.inline
  def apply(capabilities: DesiredCapabilities): Anon_Capabilities = {
    val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Capabilities]
  }
}

