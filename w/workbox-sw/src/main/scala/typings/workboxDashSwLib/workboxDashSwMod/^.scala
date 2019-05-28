package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-sw", JSImport.Namespace)
@js.native
class ^ () extends WorkboxNamespace

@JSImport("workbox-sw", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val backgroundSync: workboxDashSwLib.TypeofClassBackgroundSyncNamespace = js.native
  val broadcastUpdate: workboxDashSwLib.TypeofClassBroadcastUpdateNamespace = js.native
  val cacheableResponse: workboxDashSwLib.TypeofClassCacheableResponseNamespace = js.native
  val core: workboxDashSwLib.TypeofClassCoreNamespace = js.native
  val expiration: workboxDashSwLib.TypeofClassExpirationNamespace = js.native
  val googleAnalytics: workboxDashSwLib.TypeofClassGoogleAnalyticsNamespace = js.native
  val navigationPreload: workboxDashSwLib.TypeofClassNavigationPreloadNamespace = js.native
  val precaching: workboxDashSwLib.TypeofClassPrecachingNamespace = js.native
  val rangeRequests: workboxDashSwLib.TypeofClassRangeRequestsNamespace = js.native
  val routing: workboxDashSwLib.TypeofClassRoutingNamespace = js.native
  val strategies: workboxDashSwLib.TypeofClassStrategiesNamespace = js.native
  val streams: workboxDashSwLib.TypeofClassStreamsNamespace = js.native
  /**
  	 * Load a Workbox module by passing in the appropriate module name.
  	 *
  	 * This is not generally needed unless you know there are modules that are
  	 * dynamically used and you want to safe guard use of the module while the
  	 * user may be offline.
  	 * @param {string} moduleName
  	 */
  def loadModule(moduleName: java.lang.String): scala.Unit = js.native
  /**
  	 * Updates the configuration options. You can specify whether to treat as a
  	 * debug build and whether to use a CDN or a specific path when importing
  	 * other workbox-modules
  	 * @param {Partial<ConfigOptions>} config
  	 */
  def setConfig(): scala.Unit = js.native
  def setConfig(config: stdLib.Partial[ConfigOptions]): scala.Unit = js.native
}

