package typings.webdriverDashJsDashExtender.webdriverDashJsDashExtenderMod

import typings.seleniumDashWebdriver.seleniumDashWebdriverMod.WebDriver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webdriver-js-extender", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def extend(baseDriver: WebDriver): ExtendedWebDriver = js.native
  def extend(baseDriver: WebDriver, fallbackGracefully: Boolean): ExtendedWebDriver = js.native
}

