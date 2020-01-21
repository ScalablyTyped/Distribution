package typings.workboxStrategies.networkOnlyMod

import typings.std.RequestInit
import typings.workboxCore.workboxPluginMod.WorkboxPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkOnlyOptions extends js.Object {
  var cacheName: js.UndefOr[String] = js.undefined
  var fetchOptions: js.UndefOr[RequestInit] = js.undefined
  var plugins: js.UndefOr[js.Array[WorkboxPlugin]] = js.undefined
}

object NetworkOnlyOptions {
  @scala.inline
  def apply(
    cacheName: String = null,
    fetchOptions: RequestInit = null,
    plugins: js.Array[WorkboxPlugin] = null
  ): NetworkOnlyOptions = {
    val __obj = js.Dynamic.literal()
    if (cacheName != null) __obj.updateDynamic("cacheName")(cacheName.asInstanceOf[js.Any])
    if (fetchOptions != null) __obj.updateDynamic("fetchOptions")(fetchOptions.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkOnlyOptions]
  }
}

