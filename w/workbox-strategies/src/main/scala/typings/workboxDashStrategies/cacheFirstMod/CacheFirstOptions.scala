package typings.workboxDashStrategies.cacheFirstMod

import typings.std.CacheQueryOptions
import typings.std.RequestInit
import typings.workboxDashCore.typesWorkboxPluginMod.WorkboxPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheFirstOptions extends js.Object {
  var cacheName: js.UndefOr[String] = js.undefined
  var fetchOptions: js.UndefOr[RequestInit] = js.undefined
  var matchOptions: js.UndefOr[CacheQueryOptions] = js.undefined
  var plugins: js.UndefOr[js.Array[WorkboxPlugin]] = js.undefined
}

object CacheFirstOptions {
  @scala.inline
  def apply(
    cacheName: String = null,
    fetchOptions: RequestInit = null,
    matchOptions: CacheQueryOptions = null,
    plugins: js.Array[WorkboxPlugin] = null
  ): CacheFirstOptions = {
    val __obj = js.Dynamic.literal()
    if (cacheName != null) __obj.updateDynamic("cacheName")(cacheName)
    if (fetchOptions != null) __obj.updateDynamic("fetchOptions")(fetchOptions)
    if (matchOptions != null) __obj.updateDynamic("matchOptions")(matchOptions)
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    __obj.asInstanceOf[CacheFirstOptions]
  }
}

