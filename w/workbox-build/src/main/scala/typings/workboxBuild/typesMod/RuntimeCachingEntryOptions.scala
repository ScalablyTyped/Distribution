package typings.workboxBuild.typesMod

import typings.workboxBuild.anon.ChannelName
import typings.workboxBuild.anon.Headers
import typings.workboxBuild.anon.MaxAgeSeconds
import typings.workboxBuild.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuntimeCachingEntryOptions extends js.Object {
  var backgroundSync: js.UndefOr[Name] = js.native
  var broadcastUpdate: js.UndefOr[ChannelName] = js.native
  /**
    * The `cacheName` to use when constructing one of the [Workbox strategy classes](https://developers.google.com/web/tools/workbox/reference-docs/latest/module-workbox-strategies.html).
    */
  var cacheName: js.UndefOr[String] = js.native
  var cacheableResponse: js.UndefOr[Headers] = js.native
  var expiration: js.UndefOr[MaxAgeSeconds] = js.native
  /**
    * The `fetchOptions` property value to use when constructing one of the
    * [Workbox strategy classes](https://developers.google.com/web/tools/workbox/reference-docs/latest/module-workbox-strategies.html).
    */
  var fetchOptions: js.UndefOr[js.Object] = js.native
  /**
    * The `matchOptions` property value to use when constructing one of the
    * [Workbox strategy classes](https://developers.google.com/web/tools/workbox/reference-docs/latest/module-workbox-strategies.html).
    */
  var matchOptions: js.UndefOr[js.Object] = js.native
  /**
    * The `networkTimeoutSeconds` property value to use when creating a
    * [`NetworkFirst`](https://developers.google.com/web/tools/workbox/reference-docs/latest/module-workbox-strategies.NetworkFirst) strategy.
    */
  var networkTimeoutSeconds: js.UndefOr[Double] = js.native
  /**
    * One or more [additional plugins](https://developers.google.com/web/tools/workbox/guides/using-plugins#custom_plugins)
    * to apply to the handler. Useful when you want a plugin that doesn't have a
    * "shortcut" configuration.
    */
  var plugins: js.UndefOr[js.Array[js.Object]] = js.native
}

object RuntimeCachingEntryOptions {
  @scala.inline
  def apply(): RuntimeCachingEntryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuntimeCachingEntryOptions]
  }
  @scala.inline
  implicit class RuntimeCachingEntryOptionsOps[Self <: RuntimeCachingEntryOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBackgroundSync(value: Name): Self = this.set("backgroundSync", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundSync: Self = this.set("backgroundSync", js.undefined)
    @scala.inline
    def setBroadcastUpdate(value: ChannelName): Self = this.set("broadcastUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBroadcastUpdate: Self = this.set("broadcastUpdate", js.undefined)
    @scala.inline
    def setCacheName(value: String): Self = this.set("cacheName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheName: Self = this.set("cacheName", js.undefined)
    @scala.inline
    def setCacheableResponse(value: Headers): Self = this.set("cacheableResponse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheableResponse: Self = this.set("cacheableResponse", js.undefined)
    @scala.inline
    def setExpiration(value: MaxAgeSeconds): Self = this.set("expiration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpiration: Self = this.set("expiration", js.undefined)
    @scala.inline
    def setFetchOptions(value: js.Object): Self = this.set("fetchOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFetchOptions: Self = this.set("fetchOptions", js.undefined)
    @scala.inline
    def setMatchOptions(value: js.Object): Self = this.set("matchOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatchOptions: Self = this.set("matchOptions", js.undefined)
    @scala.inline
    def setNetworkTimeoutSeconds(value: Double): Self = this.set("networkTimeoutSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkTimeoutSeconds: Self = this.set("networkTimeoutSeconds", js.undefined)
    @scala.inline
    def setPluginsVarargs(value: js.Object*): Self = this.set("plugins", js.Array(value :_*))
    @scala.inline
    def setPlugins(value: js.Array[js.Object]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
  }
  
}

