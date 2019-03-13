package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-sw", JSImport.Namespace)
@js.native
class namespaced () extends WorkboxNamespace

/* static members */
@JSImport("workbox-sw", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  val backgroundSync: workboxDashSwLib.Anon_Plugin = js.native
  val broadcastUpdate: workboxDashSwLib.Anon_BroadCastUpdate = js.native
  val cacheableResponse: workboxDashSwLib.Anon_CacheableResponse = js.native
  val core: workboxDashSwLib.Anon_0 = js.native
  val expiration: workboxDashSwLib.Anon_CacheExpiration = js.native
  val googleAnalytics: workboxDashSwLib.Anon_Initialize = js.native
  val precaching: workboxDashSwLib.Anon_AddPlugins = js.native
  val rangeRequests: workboxDashSwLib.Anon_CreatePartialResponse = js.native
  val routing: workboxDashSwLib.Anon_CachedAssetUrl = js.native
  val strategies: workboxDashSwLib.Anon_CacheFirst = js.native
  val streams: workboxDashSwLib.Anon_Concatenate = js.native
  /**
  	 * Claim any currently available clients once the service worker becomes active. This is normally used in conjunction with skipWaiting().
  	 */
  def clientsClaim(): scala.Unit = js.native
  /**
  	 * Load a Workbox module by passing in the appropriate module name.
  	 * This is not generally needed unless you know there are modules that are dynamically used and you want to safe guard use of the module while the user may be offline.
  	 * @param {string} moduleName
  	 */
  def loadModule(moduleName: java.lang.String): scala.Unit = js.native
  /**
  	 * Updates the configuration options. You can specify whether to treat as a debug build and whether to use a CDN or a specific path when importing other workbox-modules
  	 * @param {Partial<IConfigOptions>} config
  	 */
  def setConfig(): scala.Unit = js.native
  def setConfig(config: stdLib.Partial[workboxDashSwLib.workboxDashSwMod.IConfigOptions]): scala.Unit = js.native
  /**
  	 * Force a service worker to become active, instead of waiting. This is normally used in conjunction with clientsClaim().
  	 */
  def skipWaiting(): scala.Unit = js.native
}

