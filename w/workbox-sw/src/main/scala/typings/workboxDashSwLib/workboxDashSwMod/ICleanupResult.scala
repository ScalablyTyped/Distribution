package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ===== PrecacheController =====
  */
trait ICleanupResult extends js.Object {
  /**
  	 * List of URLs that were deleted from the precache cache.
  	 */
  var deletedCacheRequests: js.Array[java.lang.String]
  /**
  	 * List of URLs that were deleted from the precache cache.
  	 */
  var deletedRevisionDetails: js.Array[java.lang.String]
}

object ICleanupResult {
  @scala.inline
  def apply(
    deletedCacheRequests: js.Array[java.lang.String],
    deletedRevisionDetails: js.Array[java.lang.String]
  ): ICleanupResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deletedCacheRequests")(deletedCacheRequests)
    __obj.updateDynamic("deletedRevisionDetails")(deletedRevisionDetails)
    __obj.asInstanceOf[ICleanupResult]
  }
}

