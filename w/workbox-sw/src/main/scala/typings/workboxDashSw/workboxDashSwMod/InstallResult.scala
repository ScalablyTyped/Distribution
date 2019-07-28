package typings.workboxDashSw.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstallResult extends js.Object {
  /**
  	 * List of entries supplied for precaching that were already precached.
  	 */
  var notUpdatedEntries: js.Array[String | PrecacheEntry]
  /**
  	 * List of entries supplied for precaching that were precached.
  	 */
  var updatedEntries: js.Array[String | PrecacheEntry]
}

object InstallResult {
  @scala.inline
  def apply(
    notUpdatedEntries: js.Array[String | PrecacheEntry],
    updatedEntries: js.Array[String | PrecacheEntry]
  ): InstallResult = {
    val __obj = js.Dynamic.literal(notUpdatedEntries = notUpdatedEntries, updatedEntries = updatedEntries)
  
    __obj.asInstanceOf[InstallResult]
  }
}

