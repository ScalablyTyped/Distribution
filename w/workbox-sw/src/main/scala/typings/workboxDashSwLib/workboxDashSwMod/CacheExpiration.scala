package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * The CacheExpiration class allows you define an expiration and / or limit on the number of responses stored in a Cache.
 */

trait CacheExpiration extends js.Object {
  /**
  	 * Expires entries for the given cache and given criteria.
  	 * @returns {Promise<void>}
  	 */
  def expireEntries(): js.Promise[scala.Unit]
  /**
  	 * Can be used to check if a URL has expired or not before it's used.
  	 * This requires a look up from IndexedDB, so can be slow.
  	 * Note: This method will not remove the cached entry, call expireEntries() to remove indexedDB and Cache entries.
  	 * @param {string} url
  	 * @returns {Promise<boolean>}
  	 */
  def isURLExpired(url: java.lang.String): js.Promise[scala.Boolean]
  /**
  	 * Update the timestamp for the given URL.
  	 * This ensures the when removing entries based on maximum entries, most recently used is accurate or when expiring, the timestamp is up-to-date.
  	 * @param {string} url
  	 * @returns {Promise<void>}
  	 */
  def updateTimestamp(url: java.lang.String): js.Promise[scala.Unit]
}

