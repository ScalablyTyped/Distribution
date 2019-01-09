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
  val PrecacheController: workboxDashSwLib.workboxDashSwMod.IPrecacheControllerConstructor = js.native
  /**
  	 * Add plugins to precaching.
  	 * @param {Plugin[]} newPlugins
  	 */
  def addPlugins(newPlugins: js.Array[Plugin]): scala.Unit = js.native
  /**
  	 * Add a fetch listener to the service worker that will respond to network requests with precached assets.
  	 * Requests for assets that aren't precached, the FetchEvent will not be responded to, allowing the event to fall through to other fetch event listeners.
  	 * @param {Partial<IRouteOptions>} route
  	 */
  def addRoute(route: stdLib.Partial[workboxDashSwLib.workboxDashSwMod.IRouteOptions]): scala.Unit = js.native
  /**
  	 * Add items to the precache list, removing any duplicates and store the files in the "precache cache" when the service worker installs.
  	 * This method can be called multiple times.
  	 * Please note: This method will not serve any of the cached files for you, it only precaches files. To respond to a network request you call addRoute().
  	 * If you have a single array of files to precache, you can just call precacheAndRoute().
  	 * @param {(string | IPrecacheEntry)[]} entries
  	 */
  def precache(entries: js.Array[java.lang.String | workboxDashSwLib.workboxDashSwMod.IPrecacheEntry]): scala.Unit = js.native
  /**
  	 * This method will add entries to the precache list and add a route to respond to fetch events.
  	 * This is a convenience method that will call precache() and addRoute() in a single call.
  	 * @param {(string | IPrecacheEntry)[]} entries - Array of entries to precache.
  	 * @param {Partial<IRouteOptions>} [route] - see addRoute() options
  	 */
  def precacheAndRoute(entries: js.Array[java.lang.String | workboxDashSwLib.workboxDashSwMod.IPrecacheEntry]): scala.Unit = js.native
  def precacheAndRoute(
    entries: js.Array[java.lang.String | workboxDashSwLib.workboxDashSwMod.IPrecacheEntry],
    route: stdLib.Partial[workboxDashSwLib.workboxDashSwMod.IRouteOptions]
  ): scala.Unit = js.native
  /**
  	 * Warnings will be logged if any of the precached assets are entered without a revision property.
  	 * This is extremely dangerous if the URL's aren't revisioned.
  	 * However, the warnings can be supressed with this method.
  	 * @param {boolean} suppress
  	 */
  def suppressWarnings(suppress: scala.Boolean): scala.Unit = js.native
}

