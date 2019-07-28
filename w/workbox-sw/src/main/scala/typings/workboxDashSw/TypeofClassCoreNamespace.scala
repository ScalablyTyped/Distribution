package typings.workboxDashSw

import org.scalablytyped.runtime.Instantiable0
import typings.std.Partial
import typings.workboxDashSw.workboxDashSwMod.CacheNames
import typings.workboxDashSw.workboxDashSwMod.CoreNamespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassCoreNamespace extends Instantiable0[CoreNamespace] {
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
  val cacheNames: CacheNames = js.native
  /**
  	 * Claim any currently available clients once the service worker
  	 * becomes active. This is normally used in conjunction with `skipWaiting()`.
  	 */
  def clientsClaim(): Unit = js.native
  /**
  	 * Adds a function to the set of callbacks that will be executed when there's
  	 * a quota error.
  	 * @param {() => *} callback
  	 */
  def registerQuotaErrorCallback(callback: js.Function0[_]): Unit = js.native
  /**
  	 * Modifies the default cache names used by the Workbox packages.
  	 * Cache names are generated as `<prefix>-<Cache Name>-<suffix>`.
  	 * @param {Partial<CacheNames>} details
  	 */
  def setCacheNameDetails(details: Partial[CacheNames]): Unit = js.native
  /**
  	 * Force a service worker to become active, instead of waiting. This is
  	 * normally used in conjunction with `clientsClaim()`.
  	 */
  def skipWaiting(): Unit = js.native
}

