package typings
package workboxDashSwLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassCoreNamespace
  extends org.scalablytyped.runtime.Instantiable0[workboxDashSwLib.workboxDashSwMod.CoreNamespace] {
  /**
  	 * Get the current cache names and prefix/suffix used by Workbox.
  	 *
  	 * `cacheNames.precache` is used for precached assets,
  	 * `cacheNames.googleAnalytics` is used by `workbox-google-analytics` to
  	 * store `analytics.js`, and `cacheNames.runtime` is used for everything else.
  	 *
  	 * `cacheNames.prefix` can be used to retrieve just the current prefix value.
  	 * `cacheNames.suffix` can be used to retrieve just the current suffix value.
  	 */
  val cacheNames: workboxDashSwLib.workboxDashSwMod.CacheNames = js.native
  /**
  	 * Claim any currently available clients once the service worker
  	 * becomes active. This is normally used in conjunction with `skipWaiting()`.
  	 */
  def clientsClaim(): scala.Unit = js.native
  /**
  	 * Adds a function to the set of callbacks that will be executed when there's
  	 * a quota error.
  	 * @param {() => *} callback
  	 */
  def registerQuotaErrorCallback(callback: js.Function0[_]): scala.Unit = js.native
  /**
  	 * Modifies the default cache names used by the Workbox packages.
  	 * Cache names are generated as `<prefix>-<Cache Name>-<suffix>`.
  	 * @param {Partial<CacheNames>} details
  	 */
  def setCacheNameDetails(details: stdLib.Partial[workboxDashSwLib.workboxDashSwMod.CacheNames]): scala.Unit = js.native
  /**
  	 * Force a service worker to become active, instead of waiting. This is
  	 * normally used in conjunction with `clientsClaim()`.
  	 */
  def skipWaiting(): scala.Unit = js.native
}

