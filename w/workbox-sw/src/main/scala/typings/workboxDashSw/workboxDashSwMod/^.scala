package typings.workboxDashSw.workboxDashSwMod

import typings.std.Partial
import typings.workboxDashSw.TypeofClassBackgroundSyncNamespace
import typings.workboxDashSw.TypeofClassBroadcastUpdateNamespace
import typings.workboxDashSw.TypeofClassCacheableResponseNamespace
import typings.workboxDashSw.TypeofClassCoreNamespace
import typings.workboxDashSw.TypeofClassExpirationNamespace
import typings.workboxDashSw.TypeofClassGoogleAnalyticsNamespace
import typings.workboxDashSw.TypeofClassNavigationPreloadNamespace
import typings.workboxDashSw.TypeofClassPrecachingNamespace
import typings.workboxDashSw.TypeofClassRangeRequestsNamespace
import typings.workboxDashSw.TypeofClassRoutingNamespace
import typings.workboxDashSw.TypeofClassStrategiesNamespace
import typings.workboxDashSw.TypeofClassStreamsNamespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-sw", JSImport.Namespace)
@js.native
class ^ () extends WorkboxNamespace

@JSImport("workbox-sw", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val backgroundSync: TypeofClassBackgroundSyncNamespace = js.native
  val broadcastUpdate: TypeofClassBroadcastUpdateNamespace = js.native
  val cacheableResponse: TypeofClassCacheableResponseNamespace = js.native
  val core: TypeofClassCoreNamespace = js.native
  val expiration: TypeofClassExpirationNamespace = js.native
  val googleAnalytics: TypeofClassGoogleAnalyticsNamespace = js.native
  val navigationPreload: TypeofClassNavigationPreloadNamespace = js.native
  val precaching: TypeofClassPrecachingNamespace = js.native
  val rangeRequests: TypeofClassRangeRequestsNamespace = js.native
  val routing: TypeofClassRoutingNamespace = js.native
  val strategies: TypeofClassStrategiesNamespace = js.native
  val streams: TypeofClassStreamsNamespace = js.native
  /**
  	 * Load a Workbox module by passing in the appropriate module name.
  	 *
  	 * This is not generally needed unless you know there are modules that are
  	 * dynamically used and you want to safe guard use of the module while the
  	 * user may be offline.
  	 * @param {string} moduleName
  	 */
  def loadModule(moduleName: String): Unit = js.native
  /**
  	 * Updates the configuration options. You can specify whether to treat as a
  	 * debug build and whether to use a CDN or a specific path when importing
  	 * other workbox-modules
  	 * @param {Partial<ConfigOptions>} config
  	 */
  def setConfig(): Unit = js.native
  def setConfig(config: Partial[ConfigOptions]): Unit = js.native
}

