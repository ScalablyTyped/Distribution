package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInstallResult extends js.Object {
  /**
  	 * List of entries supplied for precaching that were already precached.
  	 */
  var notUpdatedEntries: js.Array[java.lang.String | IPrecacheEntry]
  /**
  	 * List of entries supplied for precaching that were precached.
  	 */
  var updatedEntries: js.Array[java.lang.String | IPrecacheEntry]
}

