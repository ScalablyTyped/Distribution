package typings.workboxDashSw.workboxDashSwMod

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
  var deletedCacheRequests: js.Array[String]
  /**
  	 * List of URLs that were deleted from the precache cache.
  	 */
  var deletedRevisionDetails: js.Array[String]
}

object CleanupResult {
  @scala.inline
  def apply(deletedCacheRequests: js.Array[String], deletedRevisionDetails: js.Array[String]): CleanupResult = {
    val __obj = js.Dynamic.literal(deletedCacheRequests = deletedCacheRequests, deletedRevisionDetails = deletedRevisionDetails)
  
    __obj.asInstanceOf[CleanupResult]
  }
}

