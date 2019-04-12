package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstallResult extends js.Object {
  /**
  	 * List of entries supplied for precaching that were already precached.
  	 */
  var notUpdatedEntries: js.Array[java.lang.String | PrecacheEntry]
  /**
  	 * List of entries supplied for precaching that were precached.
  	 */
  var updatedEntries: js.Array[java.lang.String | PrecacheEntry]
}

object InstallResult {
  @scala.inline
  def apply(
    notUpdatedEntries: js.Array[java.lang.String | PrecacheEntry],
    updatedEntries: js.Array[java.lang.String | PrecacheEntry]
  ): InstallResult = {
    val __obj = js.Dynamic.literal(notUpdatedEntries = notUpdatedEntries, updatedEntries = updatedEntries)
  
    __obj.asInstanceOf[InstallResult]
  }
}

