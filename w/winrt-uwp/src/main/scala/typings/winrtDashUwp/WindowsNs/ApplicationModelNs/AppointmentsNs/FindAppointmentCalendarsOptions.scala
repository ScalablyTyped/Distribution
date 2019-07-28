package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.AppointmentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FindAppointmentCalendarsOptions extends js.Object

/** Specifies additional options when querying for appointment calendars. */
@JSGlobal("Windows.ApplicationModel.Appointments.FindAppointmentCalendarsOptions")
@js.native
object FindAppointmentCalendarsOptions extends js.Object {
  /** Include appointment calendars that are hidden. */
  @js.native
  sealed trait includeHidden extends FindAppointmentCalendarsOptions
  
  /** No additional options. */
  @js.native
  sealed trait none extends FindAppointmentCalendarsOptions
  
  /* 1 */ val includeHidden: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.AppointmentsNs.FindAppointmentCalendarsOptions.includeHidden with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.AppointmentsNs.FindAppointmentCalendarsOptions.none with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FindAppointmentCalendarsOptions with Double] = js.native
}

