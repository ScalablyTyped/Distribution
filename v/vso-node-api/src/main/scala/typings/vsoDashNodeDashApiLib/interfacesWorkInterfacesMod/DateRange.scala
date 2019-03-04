package typings
package vsoDashNodeDashApiLib.interfacesWorkInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateRange extends js.Object {
  /**
    * End of the date range.
    */
  var end: stdLib.Date
  /**
    * Start of the date range.
    */
  var start: stdLib.Date
}

object DateRange {
  @scala.inline
  def apply(end: stdLib.Date, start: stdLib.Date): DateRange = {
    val __obj = js.Dynamic.literal(end = end, start = start)
  
    __obj.asInstanceOf[DateRange]
  }
}

