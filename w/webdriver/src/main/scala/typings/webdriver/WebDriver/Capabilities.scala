package typings.webdriver.WebDriver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Capabilities extends js.Object {
  /**
    * Indicates whether untrusted and self-signed TLS certificates are implicitly trusted on navigation for the duration of the session.
    */
  var acceptInsecureCerts: js.UndefOr[Boolean] = js.native
  /**
    * Identifies the user agent.
    */
  var browserName: js.UndefOr[String] = js.native
  /**
    * 	Identifies the version of the user agent.
    */
  var browserVersion: js.UndefOr[String] = js.native
  /**
    * Defines the current session’s page load strategy.
    */
  var pageLoadStrategy: js.UndefOr[PageLoadingStrategy] = js.native
  /**
    * Identifies the operating system of the endpoint node.
    */
  var platformName: js.UndefOr[String] = js.native
  /**
    * Defines the current session’s proxy configuration.
    */
  var proxy: js.UndefOr[ProxyObject] = js.native
  /**
    * Indicates whether the remote end supports all of the resizing and repositioning commands.
    */
  var setWindowRect: js.UndefOr[Boolean] = js.native
  /**
    * Defines the current session’s strict file interactability.
    */
  var strictFileInteractability: js.UndefOr[Boolean] = js.native
  /**
    * Describes the timeouts imposed on certain session operations.
    */
  var timeouts: js.UndefOr[Timeouts] = js.native
  /**
    * Describes the current session’s user prompt handler. Defaults to the dismiss and notify state.
    */
  var unhandledPromptBehavior: js.UndefOr[String] = js.native
}

object Capabilities {
  @scala.inline
  def apply(): Capabilities = {
    val __obj = js.Dynamic.literal()
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
    def setAcceptInsecureCerts(value: Boolean): Self = this.set("acceptInsecureCerts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcceptInsecureCerts: Self = this.set("acceptInsecureCerts", js.undefined)
    @scala.inline
    def setBrowserName(value: String): Self = this.set("browserName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrowserName: Self = this.set("browserName", js.undefined)
    @scala.inline
    def setBrowserVersion(value: String): Self = this.set("browserVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrowserVersion: Self = this.set("browserVersion", js.undefined)
    @scala.inline
    def setPageLoadStrategy(value: PageLoadingStrategy): Self = this.set("pageLoadStrategy", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageLoadStrategy: Self = this.set("pageLoadStrategy", js.undefined)
    @scala.inline
    def setPlatformName(value: String): Self = this.set("platformName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatformName: Self = this.set("platformName", js.undefined)
    @scala.inline
    def setProxy(value: ProxyObject): Self = this.set("proxy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProxy: Self = this.set("proxy", js.undefined)
    @scala.inline
    def setSetWindowRect(value: Boolean): Self = this.set("setWindowRect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetWindowRect: Self = this.set("setWindowRect", js.undefined)
    @scala.inline
    def setStrictFileInteractability(value: Boolean): Self = this.set("strictFileInteractability", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrictFileInteractability: Self = this.set("strictFileInteractability", js.undefined)
    @scala.inline
    def setTimeouts(value: Timeouts): Self = this.set("timeouts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeouts: Self = this.set("timeouts", js.undefined)
    @scala.inline
    def setUnhandledPromptBehavior(value: String): Self = this.set("unhandledPromptBehavior", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnhandledPromptBehavior: Self = this.set("unhandledPromptBehavior", js.undefined)
  }
  
}

