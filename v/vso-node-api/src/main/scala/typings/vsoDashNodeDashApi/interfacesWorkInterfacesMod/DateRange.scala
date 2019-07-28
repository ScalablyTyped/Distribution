package typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateRange extends js.Object {
  /**
    * End of the date range.
    */
  var end: Date
  /**
    * Start of the date range.
    */
  var start: Date
}

object DateRange {
  @scala.inline
  def apply(end: Date, start: Date): DateRange = {
    val __obj = js.Dynamic.literal(end = end, start = start)
  
    __obj.asInstanceOf[DateRange]
  }
}

