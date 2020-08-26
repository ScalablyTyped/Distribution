package typings.webdriver.WebDriver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoggingPreferences extends js.Object {
  var browser: js.UndefOr[LoggingPreferenceType] = js.native
  var client: js.UndefOr[LoggingPreferenceType] = js.native
  var driver: js.UndefOr[LoggingPreferenceType] = js.native
  var server: js.UndefOr[LoggingPreferenceType] = js.native
}

object LoggingPreferences {
  @scala.inline
  def apply(): LoggingPreferences = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoggingPreferences]
  }
  @scala.inline
  implicit class LoggingPreferencesOps[Self <: LoggingPreferences] (val x: Self) extends AnyVal {
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
    def setBrowser(value: LoggingPreferenceType): Self = this.set("browser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrowser: Self = this.set("browser", js.undefined)
    @scala.inline
    def setClient(value: LoggingPreferenceType): Self = this.set("client", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClient: Self = this.set("client", js.undefined)
    @scala.inline
    def setDriver(value: LoggingPreferenceType): Self = this.set("driver", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDriver: Self = this.set("driver", js.undefined)
    @scala.inline
    def setServer(value: LoggingPreferenceType): Self = this.set("server", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServer: Self = this.set("server", js.undefined)
  }
  
}

