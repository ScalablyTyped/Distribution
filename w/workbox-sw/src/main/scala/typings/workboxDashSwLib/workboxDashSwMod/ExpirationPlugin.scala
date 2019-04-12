package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This plugin can be used in the Workbox APIs to regularly enforce a
  * limit on the age and / or the number of cached requests.
  *
  * Whenever a cached request is used or updated, this plugin will look
  * at the used Cache and remove any old or extra requests.
  *
  * When using `maxAgeSeconds`, requests may be used *once* after expiring
  * because the expiration clean up will not have occurred until *after* the
  * cached request has been used. If the request has a "Date" header, then
  * a light weight expiration check is performed and the request will not be
  * used immediately.
  *
  * When using `maxEntries`, the last request to be used will be the request
  * that is removed from the Cache.
  */
trait ExpirationPlugin extends js.Object {
  /**
  	 * This is a helper method that performs two operations:
  	 *
  	 * - Deletes *all* the underlying Cache instances associated with this plugin
  	 * instance, by calling caches.delete() on your behalf.
  	 * - Deletes the metadata from IndexedDB used to keep track of expiration
  	 * details for each Cache instance.
  	 *
  	 * When using cache expiration, calling this method is preferable to calling
  	 * `caches.delete()` directly, since this will ensure that the IndexedDB
  	 * metadata is also cleanly removed and open IndexedDB instances are deleted.
  	 *
  	 * Note that if you're *not* using cache expiration for a given cache, calling
  	 * `caches.delete()` and passing in the cache's name should be sufficient.
  	 * There is no Workbox-specific method needed for cleanup in that case.
  	 * @return {Promise<void>}
  	 */
  def deleteCacheAndMetadata(): js.Promise[scala.Unit]
}

object ExpirationPlugin {
  @scala.inline
  def apply(deleteCacheAndMetadata: () => js.Promise[scala.Unit]): ExpirationPlugin = {
    val __obj = js.Dynamic.literal(deleteCacheAndMetadata = js.Any.fromFunction0(deleteCacheAndMetadata))
  
    __obj.asInstanceOf[ExpirationPlugin]
  }
}

