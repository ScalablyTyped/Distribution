package typings.workboxStrategies.cacheOnlyMod

import typings.std.CacheQueryOptions
import typings.workboxCore.workboxPluginMod.WorkboxPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheOnlyOptions extends js.Object {
  var cacheName: js.UndefOr[String] = js.undefined
  var matchOptions: js.UndefOr[CacheQueryOptions] = js.undefined
  var plugins: js.UndefOr[js.Array[WorkboxPlugin]] = js.undefined
}

object CacheOnlyOptions {
  @scala.inline
  def apply(
    cacheName: String = null,
    matchOptions: CacheQueryOptions = null,
    plugins: js.Array[WorkboxPlugin] = null
  ): CacheOnlyOptions = {
    val __obj = js.Dynamic.literal()
    if (cacheName != null) __obj.updateDynamic("cacheName")(cacheName.asInstanceOf[js.Any])
    if (matchOptions != null) __obj.updateDynamic("matchOptions")(matchOptions.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheOnlyOptions]
  }
}

