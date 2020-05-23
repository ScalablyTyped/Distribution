package typings.winrtUwp.Windows.ApplicationModel.Appointments

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a set of options that modifies a query for appointments. */
trait FindAppointmentsOptions extends js.Object {
  var calendarIds: js.Any
   /* unmapped type */ var fetchProperties: js.Any
   /* unmapped type */ var includeHidden: js.Any
   /* unmapped type */ var maxCount: js.Any
}

object FindAppointmentsOptions {
  @scala.inline
  def apply(calendarIds: js.Any, fetchProperties: js.Any, includeHidden: js.Any, maxCount: js.Any): FindAppointmentsOptions = {
    val __obj = js.Dynamic.literal(calendarIds = calendarIds.asInstanceOf[js.Any], fetchProperties = fetchProperties.asInstanceOf[js.Any], includeHidden = includeHidden.asInstanceOf[js.Any], maxCount = maxCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindAppointmentsOptions]
  }
}

