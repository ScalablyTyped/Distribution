package typings.webdriver.WebDriverNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Capabilities extends js.Object {
  var acceptInsecureCerts: js.UndefOr[Boolean] = js.undefined
  var browserName: js.UndefOr[String] = js.undefined
  var browserVersion: js.UndefOr[String] = js.undefined
  var pageLoadStrategy: js.UndefOr[PageLoadingStrategy] = js.undefined
  var platformName: js.UndefOr[String] = js.undefined
  var proxy: js.UndefOr[ProxyObject] = js.undefined
  var setWindowRect: js.UndefOr[Boolean] = js.undefined
  var timeouts: js.UndefOr[Timeouts] = js.undefined
  var unhandledPromptBehavior: js.UndefOr[String] = js.undefined
}

object Capabilities {
  @scala.inline
  def apply(
    acceptInsecureCerts: js.UndefOr[Boolean] = js.undefined,
    browserName: String = null,
    browserVersion: String = null,
    pageLoadStrategy: PageLoadingStrategy = null,
    platformName: String = null,
    proxy: ProxyObject = null,
    setWindowRect: js.UndefOr[Boolean] = js.undefined,
    timeouts: Timeouts = null,
    unhandledPromptBehavior: String = null
  ): Capabilities = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(acceptInsecureCerts)) __obj.updateDynamic("acceptInsecureCerts")(acceptInsecureCerts)
    if (browserName != null) __obj.updateDynamic("browserName")(browserName)
    if (browserVersion != null) __obj.updateDynamic("browserVersion")(browserVersion)
    if (pageLoadStrategy != null) __obj.updateDynamic("pageLoadStrategy")(pageLoadStrategy)
    if (platformName != null) __obj.updateDynamic("platformName")(platformName)
    if (proxy != null) __obj.updateDynamic("proxy")(proxy)
    if (!js.isUndefined(setWindowRect)) __obj.updateDynamic("setWindowRect")(setWindowRect)
    if (timeouts != null) __obj.updateDynamic("timeouts")(timeouts)
    if (unhandledPromptBehavior != null) __obj.updateDynamic("unhandledPromptBehavior")(unhandledPromptBehavior)
    __obj.asInstanceOf[Capabilities]
  }
}

