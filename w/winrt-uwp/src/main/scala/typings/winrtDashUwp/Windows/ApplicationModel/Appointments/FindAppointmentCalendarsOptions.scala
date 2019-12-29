package typings.winrtDashUwp.Windows.ApplicationModel.Appointments

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FindAppointmentCalendarsOptions with Double] = js.native
  /* 1 */ @js.native
  object includeHidden extends TopLevel[includeHidden with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
}

