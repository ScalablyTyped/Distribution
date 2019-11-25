package typings.workboxDashPrecaching.typesCleanupResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CleanupResult extends js.Object {
  var deletedCacheRequests: js.Array[String]
}

object CleanupResult {
  @scala.inline
  def apply(deletedCacheRequests: js.Array[String]): CleanupResult = {
    val __obj = js.Dynamic.literal(deletedCacheRequests = deletedCacheRequests.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CleanupResult]
  }
}

