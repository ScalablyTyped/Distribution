package typings.workboxBuild.typesMod

import typings.workboxBuild.AnonChannelName
import typings.workboxBuild.AnonHeaders
import typings.workboxBuild.AnonMaxAgeSeconds
import typings.workboxBuild.AnonName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuntimeCachingEntryOptions extends js.Object {
  var backgroundSync: js.UndefOr[AnonName] = js.undefined
  var broadcastUpdate: js.UndefOr[AnonChannelName] = js.undefined
  /**
    * The `cacheName` to use when constructing one of the [Workbox strategy classes](https://developers.google.com/web/tools/workbox/reference-docs/latest/module-workbox-strategies.html).
    */
  var cacheName: js.UndefOr[String] = js.undefined
  var cacheableResponse: js.UndefOr[AnonHeaders] = js.undefined
  var expiration: js.UndefOr[AnonMaxAgeSeconds] = js.undefined
  /**
    * The `fetchOptions` property value to use when constructing one of the
    * [Workbox strategy classes](https://developers.google.com/web/tools/workbox/reference-docs/latest/module-workbox-strategies.html).
    */
  var fetchOptions: js.UndefOr[js.Object] = js.undefined
  /**
    * The `matchOptions` property value to use when constructing one of the
    * [Workbox strategy classes](https://developers.google.com/web/tools/workbox/reference-docs/latest/module-workbox-strategies.html).
    */
  var matchOptions: js.UndefOr[js.Object] = js.undefined
  /**
    * The `networkTimeoutSeconds` property value to use when creating a
    * [`NetworkFirst`](https://developers.google.com/web/tools/workbox/reference-docs/latest/module-workbox-strategies.NetworkFirst) strategy.
    */
  var networkTimeoutSeconds: js.UndefOr[Double] = js.undefined
  /**
    * One or more [additional plugins](https://developers.google.com/web/tools/workbox/guides/using-plugins#custom_plugins)
    * to apply to the handler. Useful when you want a plugin that doesn't have a
    * "shortcut" configuration.
    */
  var plugins: js.UndefOr[js.Array[js.Object]] = js.undefined
}

object RuntimeCachingEntryOptions {
  @scala.inline
  def apply(
    backgroundSync: AnonName = null,
    broadcastUpdate: AnonChannelName = null,
    cacheName: String = null,
    cacheableResponse: AnonHeaders = null,
    expiration: AnonMaxAgeSeconds = null,
    fetchOptions: js.Object = null,
    matchOptions: js.Object = null,
    networkTimeoutSeconds: Int | Double = null,
    plugins: js.Array[js.Object] = null
  ): RuntimeCachingEntryOptions = {
    val __obj = js.Dynamic.literal()
    if (backgroundSync != null) __obj.updateDynamic("backgroundSync")(backgroundSync.asInstanceOf[js.Any])
    if (broadcastUpdate != null) __obj.updateDynamic("broadcastUpdate")(broadcastUpdate.asInstanceOf[js.Any])
    if (cacheName != null) __obj.updateDynamic("cacheName")(cacheName.asInstanceOf[js.Any])
    if (cacheableResponse != null) __obj.updateDynamic("cacheableResponse")(cacheableResponse.asInstanceOf[js.Any])
    if (expiration != null) __obj.updateDynamic("expiration")(expiration.asInstanceOf[js.Any])
    if (fetchOptions != null) __obj.updateDynamic("fetchOptions")(fetchOptions.asInstanceOf[js.Any])
    if (matchOptions != null) __obj.updateDynamic("matchOptions")(matchOptions.asInstanceOf[js.Any])
    if (networkTimeoutSeconds != null) __obj.updateDynamic("networkTimeoutSeconds")(networkTimeoutSeconds.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuntimeCachingEntryOptions]
  }
}

