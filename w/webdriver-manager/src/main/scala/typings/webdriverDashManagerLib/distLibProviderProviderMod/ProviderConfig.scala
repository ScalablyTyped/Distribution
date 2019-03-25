package typings
package webdriverDashManagerLib.distLibProviderProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProviderConfig
  extends /* key */ org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Boolean | scala.Double] {
  var cacheFileName: js.UndefOr[java.lang.String] = js.undefined
  var configFileName: js.UndefOr[java.lang.String] = js.undefined
  var ignoreSSL: js.UndefOr[scala.Boolean] = js.undefined
  var osArch: js.UndefOr[java.lang.String] = js.undefined
  var osType: js.UndefOr[java.lang.String] = js.undefined
  var outDir: js.UndefOr[java.lang.String] = js.undefined
  var proxy: js.UndefOr[java.lang.String] = js.undefined
  var requestUrl: js.UndefOr[java.lang.String] = js.undefined
}

object ProviderConfig {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Boolean | scala.Double] = null,
    cacheFileName: java.lang.String = null,
    configFileName: java.lang.String = null,
    ignoreSSL: js.UndefOr[scala.Boolean] = js.undefined,
    osArch: java.lang.String = null,
    osType: java.lang.String = null,
    outDir: java.lang.String = null,
    proxy: java.lang.String = null,
    requestUrl: java.lang.String = null
  ): ProviderConfig = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (cacheFileName != null) __obj.updateDynamic("cacheFileName")(cacheFileName)
    if (configFileName != null) __obj.updateDynamic("configFileName")(configFileName)
    if (!js.isUndefined(ignoreSSL)) __obj.updateDynamic("ignoreSSL")(ignoreSSL)
    if (osArch != null) __obj.updateDynamic("osArch")(osArch)
    if (osType != null) __obj.updateDynamic("osType")(osType)
    if (outDir != null) __obj.updateDynamic("outDir")(outDir)
    if (proxy != null) __obj.updateDynamic("proxy")(proxy)
    if (requestUrl != null) __obj.updateDynamic("requestUrl")(requestUrl)
    __obj.asInstanceOf[ProviderConfig]
  }
}

