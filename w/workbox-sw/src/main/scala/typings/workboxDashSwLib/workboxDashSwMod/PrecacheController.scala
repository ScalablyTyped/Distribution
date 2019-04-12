package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Performs efficient precaching of assets.
  */
@js.native
trait PrecacheController extends js.Object {
  /**
  	 * Deletes assets that are no longer present in the current precache manifest.
  	 * Call this method from the service worker activate event.
  	 * @returns {Promise<CleanupResult>}
  	 */
  def activate(): js.Promise[CleanupResult] = js.native
  /**
  	 * This method will add items to the precache list, removing duplicates
  	 * and ensuring the information is valid.
  	 * @param {(string | PrecacheEntry)[]} entries - Array of entries to precache.
  	 */
  def addToCacheList(entries: js.Array[java.lang.String | PrecacheEntry]): scala.Unit = js.native
  /**
  	 * Returns the cache key used for storing a given URL. If that URL is
  	 * unversioned, like `/index.html', then the cache key will be the original
  	 * URL with a search parameter appended to it.
  	 *
  	 * @param {string} url A URL whose cache key you want to look up.
  	 * @returns {string} The versioned URL that corresponds to a cache key
  	 * for the original URL, or undefined if that URL isn't precached.
  	 */
  def getCacheKeyForURL(url: java.lang.String): java.lang.String = js.native
  /**
  	 * Returns a list of all the URLs that have been precached by the current
  	 * service worker.
  	 * @returns {string[]} An array of URLs.
  	 */
  def getCachedUrls(): js.Array[java.lang.String] = js.native
  /**
  	 * Returns a mapping of a precached URL to the corresponding cache key, taking
  	 * into account the revision information for the URL.
  	 *
  	 * @returns {Map<string, string>} A URL to cache key mapping.
  	 */
  def getURLsToCacheKeys(): stdLib.Map[java.lang.String, java.lang.String] = js.native
  /**
  	 * Precaches new and updated assets. Call this method from the service worker
  	 * install event.
  	 * @param {Partial<InstallOptions>} options
  	 * @returns {Promise<InstallResult>}
  	 */
  def install(): js.Promise[InstallResult] = js.native
  def install(options: stdLib.Partial[InstallOptions]): js.Promise[InstallResult] = js.native
}

