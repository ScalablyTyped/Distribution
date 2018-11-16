package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Dictionary containing either `endDate` or `occurrenceCount` property.
 */

trait recurrenceEndDictionary extends js.Object {
  /**
  	 * End date of the recurrence end, or undefined if the recurrence end is count-based.
  	 */
  var endDate: js.UndefOr[stdLib.Date] = js.undefined
  /**
  	 * Occurrence count of the recurrence end, or 0 if the recurrence end is date-based.
  	 */
  var occurrenceCount: js.UndefOr[scala.Double] = js.undefined
}

