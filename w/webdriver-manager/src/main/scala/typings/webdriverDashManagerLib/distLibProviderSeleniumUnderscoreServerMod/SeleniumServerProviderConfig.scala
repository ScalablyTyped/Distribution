package typings
package webdriverDashManagerLib.distLibProviderSeleniumUnderscoreServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeleniumServerProviderConfig
  extends webdriverDashManagerLib.distLibProviderProviderMod.ProviderConfig {
  var port: js.UndefOr[scala.Double] = js.undefined
  var runAsDetach: js.UndefOr[scala.Boolean] = js.undefined
  var runAsNode: js.UndefOr[scala.Boolean] = js.undefined
}

object SeleniumServerProviderConfig {
  @scala.inline
  def apply(
    cacheFileName: java.lang.String = null,
    configFileName: java.lang.String = null,
    ignoreSSL: js.UndefOr[scala.Boolean] = js.undefined,
    osArch: java.lang.String = null,
    osType: java.lang.String = null,
    outDir: java.lang.String = null,
    port: scala.Int | scala.Double = null,
    proxy: java.lang.String = null,
    requestUrl: java.lang.String = null,
    runAsDetach: js.UndefOr[scala.Boolean] = js.undefined,
    runAsNode: js.UndefOr[scala.Boolean] = js.undefined
  ): SeleniumServerProviderConfig = {
    val __obj = js.Dynamic.literal()
    if (cacheFileName != null) __obj.updateDynamic("cacheFileName")(cacheFileName)
    if (configFileName != null) __obj.updateDynamic("configFileName")(configFileName)
    if (!js.isUndefined(ignoreSSL)) __obj.updateDynamic("ignoreSSL")(ignoreSSL)
    if (osArch != null) __obj.updateDynamic("osArch")(osArch)
    if (osType != null) __obj.updateDynamic("osType")(osType)
    if (outDir != null) __obj.updateDynamic("outDir")(outDir)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy)
    if (requestUrl != null) __obj.updateDynamic("requestUrl")(requestUrl)
    if (!js.isUndefined(runAsDetach)) __obj.updateDynamic("runAsDetach")(runAsDetach)
    if (!js.isUndefined(runAsNode)) __obj.updateDynamic("runAsNode")(runAsNode)
    __obj.asInstanceOf[SeleniumServerProviderConfig]
  }
}

