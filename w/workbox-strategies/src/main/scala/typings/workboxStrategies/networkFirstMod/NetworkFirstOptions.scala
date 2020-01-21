package typings.workboxStrategies.networkFirstMod

import typings.std.CacheQueryOptions
import typings.std.RequestInit
import typings.workboxCore.workboxPluginMod.WorkboxPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkFirstOptions extends js.Object {
  var cacheName: js.UndefOr[String] = js.undefined
  var fetchOptions: js.UndefOr[RequestInit] = js.undefined
  var matchOptions: js.UndefOr[CacheQueryOptions] = js.undefined
  var networkTimeoutSeconds: js.UndefOr[Double] = js.undefined
  var plugins: js.UndefOr[js.Array[WorkboxPlugin]] = js.undefined
}

object NetworkFirstOptions {
  @scala.inline
  def apply(
    cacheName: String = null,
    fetchOptions: RequestInit = null,
    matchOptions: CacheQueryOptions = null,
    networkTimeoutSeconds: Int | Double = null,
    plugins: js.Array[WorkboxPlugin] = null
  ): NetworkFirstOptions = {
    val __obj = js.Dynamic.literal()
    if (cacheName != null) __obj.updateDynamic("cacheName")(cacheName.asInstanceOf[js.Any])
    if (fetchOptions != null) __obj.updateDynamic("fetchOptions")(fetchOptions.asInstanceOf[js.Any])
    if (matchOptions != null) __obj.updateDynamic("matchOptions")(matchOptions.asInstanceOf[js.Any])
    if (networkTimeoutSeconds != null) __obj.updateDynamic("networkTimeoutSeconds")(networkTimeoutSeconds.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkFirstOptions]
  }
}

