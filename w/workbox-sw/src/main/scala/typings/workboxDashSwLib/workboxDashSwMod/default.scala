package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-sw", JSImport.Default)
@js.native
class default () extends WorkboxNamespace

@JSImport("workbox-sw", JSImport.Default)
@js.native
object default extends js.Object {
  val backgroundSync: org.scalablytyped.runtime.Instantiable0[workboxDashSwLib.workboxDashSwMod.BackgroundSyncNamespace] = js.native
  val broadcastUpdate: org.scalablytyped.runtime.Instantiable0[workboxDashSwLib.workboxDashSwMod.BroadcastUpdateNamespace] = js.native
  val cacheableResponse: org.scalablytyped.runtime.Instantiable0[workboxDashSwLib.workboxDashSwMod.CacheableResponseNamespace] = js.native
  val core: org.scalablytyped.runtime.Instantiable0[workboxDashSwLib.workboxDashSwMod.CoreNamespace] = js.native
  val expiration: org.scalablytyped.runtime.Instantiable0[workboxDashSwLib.workboxDashSwMod.ExpirationNamespace] = js.native
  val googleAnalytics: org.scalablytyped.runtime.Instantiable0[workboxDashSwLib.workboxDashSwMod.GoogleAnalyticsNamespace] = js.native
  val precaching: org.scalablytyped.runtime.Instantiable0[workboxDashSwLib.workboxDashSwMod.PrecachingNamespace] = js.native
  val rangeRequests: org.scalablytyped.runtime.Instantiable0[workboxDashSwLib.workboxDashSwMod.RangeRequestsNamespace] = js.native
  val routing: org.scalablytyped.runtime.Instantiable0[workboxDashSwLib.workboxDashSwMod.RoutingNamespace] = js.native
  val strategies: org.scalablytyped.runtime.Instantiable0[workboxDashSwLib.workboxDashSwMod.StrategiesNamespace] = js.native
  val streams: org.scalablytyped.runtime.Instantiable0[workboxDashSwLib.workboxDashSwMod.StreamsNamespace] = js.native
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
  /**
  	 * Updates the configuration options. You can specify whether to treat as a debug build and whether to use a CDN or a specific path when importing other workbox-modules
  	 * @param {Partial<IConfigOptions>} config
  	 */
  def setConfig(config: stdLib.Partial[workboxDashSwLib.workboxDashSwMod.IConfigOptions]): scala.Unit = js.native
  /**
  	 * Force a service worker to become active, instead of waiting. This is normally used in conjunction with clientsClaim().
  	 */
  def skipWaiting(): scala.Unit = js.native
}

