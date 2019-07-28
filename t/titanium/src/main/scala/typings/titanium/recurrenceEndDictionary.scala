package typings.titanium

import typings.std.Date
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
  var endDate: js.UndefOr[Date] = js.undefined
  /**
  	 * Occurrence count of the recurrence end, or 0 if the recurrence end is date-based.
  	 */
  var occurrenceCount: js.UndefOr[Double] = js.undefined
}

object recurrenceEndDictionary {
  @scala.inline
  def apply(endDate: Date = null, occurrenceCount: Int | Double = null): recurrenceEndDictionary = {
    val __obj = js.Dynamic.literal()
    if (endDate != null) __obj.updateDynamic("endDate")(endDate)
    if (occurrenceCount != null) __obj.updateDynamic("occurrenceCount")(occurrenceCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[recurrenceEndDictionary]
  }
}

