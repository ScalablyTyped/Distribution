package typings.webdriver

import typings.webdriver.WebDriver.LoggingPreferences
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Browser extends js.Object {
  var browser: js.UndefOr[LoggingPreferences] = js.undefined
  var client: js.UndefOr[LoggingPreferences] = js.undefined
  var driver: js.UndefOr[LoggingPreferences] = js.undefined
  var server: js.UndefOr[LoggingPreferences] = js.undefined
}

object Anon_Browser {
  @scala.inline
  def apply(
    browser: LoggingPreferences = null,
    client: LoggingPreferences = null,
    driver: LoggingPreferences = null,
    server: LoggingPreferences = null
  ): Anon_Browser = {
    val __obj = js.Dynamic.literal()
    if (browser != null) __obj.updateDynamic("browser")(browser)
    if (client != null) __obj.updateDynamic("client")(client)
    if (driver != null) __obj.updateDynamic("driver")(driver)
    if (server != null) __obj.updateDynamic("server")(server)
    __obj.asInstanceOf[Anon_Browser]
  }
}

