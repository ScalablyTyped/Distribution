package typings
package webdriverLib.WebDriverNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Capabilities extends js.Object {
  var acceptInsecureCerts: js.UndefOr[scala.Boolean] = js.undefined
  var browserName: js.UndefOr[java.lang.String] = js.undefined
  var browserVersion: js.UndefOr[java.lang.String] = js.undefined
  var pageLoadStrategy: js.UndefOr[PageLoadingStrategy] = js.undefined
  var platformName: js.UndefOr[java.lang.String] = js.undefined
  var proxy: js.UndefOr[ProxyObject] = js.undefined
  var setWindowRect: js.UndefOr[scala.Boolean] = js.undefined
  var timeouts: js.UndefOr[Timeouts] = js.undefined
  var unhandledPromptBehavior: js.UndefOr[java.lang.String] = js.undefined
}

object Capabilities {
  @scala.inline
  def apply(
    acceptInsecureCerts: js.UndefOr[scala.Boolean] = js.undefined,
    browserName: java.lang.String = null,
    browserVersion: java.lang.String = null,
    pageLoadStrategy: PageLoadingStrategy = null,
    platformName: java.lang.String = null,
    proxy: ProxyObject = null,
    setWindowRect: js.UndefOr[scala.Boolean] = js.undefined,
    timeouts: Timeouts = null,
    unhandledPromptBehavior: java.lang.String = null
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

