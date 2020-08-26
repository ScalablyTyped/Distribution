package typings.webdriver.anon

import typings.webdriver.WebDriver.LoggingPreferences
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Browser extends js.Object {
  var browser: js.UndefOr[LoggingPreferences] = js.native
  var client: js.UndefOr[LoggingPreferences] = js.native
  var driver: js.UndefOr[LoggingPreferences] = js.native
  var server: js.UndefOr[LoggingPreferences] = js.native
}

object Browser {
  @scala.inline
  def apply(): Browser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Browser]
  }
  @scala.inline
  implicit class BrowserOps[Self <: Browser] (val x: Self) extends AnyVal {
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
    def setBrowser(value: LoggingPreferences): Self = this.set("browser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrowser: Self = this.set("browser", js.undefined)
    @scala.inline
    def setClient(value: LoggingPreferences): Self = this.set("client", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClient: Self = this.set("client", js.undefined)
    @scala.inline
    def setDriver(value: LoggingPreferences): Self = this.set("driver", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDriver: Self = this.set("driver", js.undefined)
    @scala.inline
    def setServer(value: LoggingPreferences): Self = this.set("server", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServer: Self = this.set("server", js.undefined)
  }
  
}

