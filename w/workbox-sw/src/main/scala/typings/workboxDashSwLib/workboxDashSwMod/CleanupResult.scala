package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ===== PrecacheController =====
  */
trait CleanupResult extends js.Object {
  /**
  	 * List of URLs that were deleted from the precache cache.
  	 */
  var deletedCacheRequests: js.Array[java.lang.String]
  /**
  	 * List of URLs that were deleted from the precache cache.
  	 */
  var deletedRevisionDetails: js.Array[java.lang.String]
}

object CleanupResult {
  @scala.inline
  def apply(
    deletedCacheRequests: js.Array[java.lang.String],
    deletedRevisionDetails: js.Array[java.lang.String]
  ): CleanupResult = {
    val __obj = js.Dynamic.literal(deletedCacheRequests = deletedCacheRequests, deletedRevisionDetails = deletedRevisionDetails)
  
    __obj.asInstanceOf[CleanupResult]
  }
}

