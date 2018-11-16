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
  	 * Takes the current set of temporary files and moves them to the final cache, deleting the temporary cache once copying is complete.
  	 * @param {IActivateOptions} options
  	 * @returns {Promise<ICleanupResult>} Resolves with an object containing details of the deleted cache requests and precache revision details.
  	 */
  def activate(options: stdLib.Partial[IActivateOptions]): stdLib.Promise[ICleanupResult] = js.native
  /**
  	 * This method will add items to the precache list, removing duplicates and ensuring the information is valid.
  	 * @param {(string | IPrecacheEntry)[]} entries - Array of entries to precache.
  	 */
  def addToCacheList(entries: js.Array[java.lang.String | IPrecacheEntry]): scala.Unit = js.native
  /**
  	 * Returns an array of fully qualified URL's that will be precached.
  	 * @returns {string[]} An array of URLs.
  	 */
  def getCachedUrls(): js.Array[java.lang.String] = js.native
  /**
  	 * Call this method from a service work install event to start precaching assets.
  	 * @param {Partial<IInstallOptions>} options
  	 * @returns {Promise<IInstallResult>}
  	 */
  def install(): stdLib.Promise[IInstallResult] = js.native
  /**
  	 * Call this method from a service work install event to start precaching assets.
  	 * @param {Partial<IInstallOptions>} options
  	 * @returns {Promise<IInstallResult>}
  	 */
  def install(options: stdLib.Partial[IInstallOptions]): stdLib.Promise[IInstallResult] = js.native
}

