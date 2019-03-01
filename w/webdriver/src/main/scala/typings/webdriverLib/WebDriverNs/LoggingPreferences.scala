package typings
package webdriverLib.WebDriverNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoggingPreferences extends js.Object {
  var browser: js.UndefOr[LoggingPreferenceType] = js.undefined
  var client: js.UndefOr[LoggingPreferenceType] = js.undefined
  var driver: js.UndefOr[LoggingPreferenceType] = js.undefined
  var server: js.UndefOr[LoggingPreferenceType] = js.undefined
}

object LoggingPreferences {
  @scala.inline
  def apply(
    browser: LoggingPreferenceType = null,
    client: LoggingPreferenceType = null,
    driver: LoggingPreferenceType = null,
    server: LoggingPreferenceType = null
  ): LoggingPreferences = {
    val __obj = js.Dynamic.literal()
    if (browser != null) __obj.updateDynamic("browser")(browser)
    if (client != null) __obj.updateDynamic("client")(client)
    if (driver != null) __obj.updateDynamic("driver")(driver)
    if (server != null) __obj.updateDynamic("server")(server)
    __obj.asInstanceOf[LoggingPreferences]
  }
}

