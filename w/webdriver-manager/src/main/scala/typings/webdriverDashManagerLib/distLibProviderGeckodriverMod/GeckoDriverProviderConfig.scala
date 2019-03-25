package typings
package webdriverDashManagerLib.distLibProviderGeckodriverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeckoDriverProviderConfig
  extends webdriverDashManagerLib.distLibProviderProviderMod.ProviderConfig {
  var oauthToken: js.UndefOr[java.lang.String] = js.undefined
}

object GeckoDriverProviderConfig {
  @scala.inline
  def apply(
    cacheFileName: java.lang.String = null,
    configFileName: java.lang.String = null,
    ignoreSSL: js.UndefOr[scala.Boolean] = js.undefined,
    oauthToken: java.lang.String = null,
    osArch: java.lang.String = null,
    osType: java.lang.String = null,
    outDir: java.lang.String = null,
    proxy: java.lang.String = null,
    requestUrl: java.lang.String = null
  ): GeckoDriverProviderConfig = {
    val __obj = js.Dynamic.literal()
    if (cacheFileName != null) __obj.updateDynamic("cacheFileName")(cacheFileName)
    if (configFileName != null) __obj.updateDynamic("configFileName")(configFileName)
    if (!js.isUndefined(ignoreSSL)) __obj.updateDynamic("ignoreSSL")(ignoreSSL)
    if (oauthToken != null) __obj.updateDynamic("oauthToken")(oauthToken)
    if (osArch != null) __obj.updateDynamic("osArch")(osArch)
    if (osType != null) __obj.updateDynamic("osType")(osType)
    if (outDir != null) __obj.updateDynamic("outDir")(outDir)
    if (proxy != null) __obj.updateDynamic("proxy")(proxy)
    if (requestUrl != null) __obj.updateDynamic("requestUrl")(requestUrl)
    __obj.asInstanceOf[GeckoDriverProviderConfig]
  }
}

