package typings
package workboxDashSwLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AddPlugins
  extends org.scalablytyped.runtime.Instantiable0[workboxDashSwLib.workboxDashSwMod.PrecachingNamespace] {
  /**
  	 * Performs efficient precaching of assets.
  	 */
  val PrecacheController: workboxDashSwLib.workboxDashSwMod.PrecacheControllerConstructor = js.native
  /**
  	 * Add plugins to precaching.
  	 * @param {Plugin[]} newPlugins
  	 */
  def addPlugins(newPlugins: js.Array[Plugin]): scala.Unit = js.native
  /**
  	 * Add a `fetch` listener to the service worker that will respond to
  	 * [network requests]{@link https://developer.mozilla.org/en-US/docs/Web/API/Service_Worker_API/Using_Service_Workers#Custom_responses_to_requests}
  	 * with precached assets.
  	 *
  	 * Requests for assets that aren't precached, the `FetchEvent` will not be
  	 * responded to, allowing the event to fall through to other `fetch` event
  	 * listeners.
  	 * @param {Partial<RouteOptions>} [route]
  	 */
  def addRoute(): scala.Unit = js.native
  def addRoute(route: stdLib.Partial[workboxDashSwLib.workboxDashSwMod.RouteOptions]): scala.Unit = js.native
  /**
  	 * Adds an `activate` event listener which will clean up incompatible
  	 * precaches that were created by older versions of Workbox.
  	 */
  def cleanupOutdatedCaches(): scala.Unit = js.native
  /**
  	 * Takes in a URL, and returns the corresponding URL that could be used to
  	 * lookup the entry in the precache.
  	 *
  	 * If a relative URL is provided, the location of the service worker file will
  	 * be used as the base.
  	 *
  	 * For precached entries without revision information, the cache key will be the
  	 * same as the original URL.
  	 *
  	 * For precached entries with revision information, the cache key will be the
  	 * original URL with the addition of a query parameter used for keeping track of
  	 * the revision info.
  	 * @param {string} url - The URL whose cache key to look up.
  	 * @returns {string} The cache key that corresponds to that URL.
  	 */
  def getCacheKeyForURL(url: java.lang.String): java.lang.String = js.native
  /**
  	 * Adds items to the precache list, removing any duplicates and
  	 * stores the files in the
  	 * "precache cache" when the service
  	 * worker installs.
  	 *
  	 * This method can be called multiple times.
  	 *
  	 * Please note: This method **will not** serve any of the cached files for you.
  	 * It only precaches files. To respond to a network request you call
  	 * addRoute().
  	 *
  	 * If you have a single array of files to precache, you can just call
  	 * precacheAndRoute().
  	 * @param {(string | PrecacheEntry)[]} entries - Array of entries to precache.
  	 */
  def precache(entries: js.Array[java.lang.String | workboxDashSwLib.workboxDashSwMod.PrecacheEntry]): scala.Unit = js.native
  /**
  	 * This method will add entries to the precache list and add a route to
  	 * respond to fetch events.
  	 *
  	 * This is a convenience method that will call precache() and
  	 * addRoute() in a single call.
  	 * @param {(string | PrecacheEntry)[]} entries - Array of entries to precache.
  	 * @param {Partial<RouteOptions>} [options] - see addRoute() options
  	 */
  def precacheAndRoute(entries: js.Array[java.lang.String | workboxDashSwLib.workboxDashSwMod.PrecacheEntry]): scala.Unit = js.native
  def precacheAndRoute(
    entries: js.Array[java.lang.String | workboxDashSwLib.workboxDashSwMod.PrecacheEntry],
    options: stdLib.Partial[workboxDashSwLib.workboxDashSwMod.RouteOptions]
  ): scala.Unit = js.native
}

