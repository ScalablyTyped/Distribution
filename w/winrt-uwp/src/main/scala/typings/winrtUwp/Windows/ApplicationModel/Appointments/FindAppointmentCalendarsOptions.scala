package typings.winrtUwp.Windows.ApplicationModel.Appointments

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FindAppointmentCalendarsOptions extends StObject
/** Specifies additional options when querying for appointment calendars. */
@JSGlobal("Windows.ApplicationModel.Appointments.FindAppointmentCalendarsOptions")
@js.native
object FindAppointmentCalendarsOptions extends StObject {
  
  /** Include appointment calendars that are hidden. */
  @js.native
  sealed trait includeHidden extends FindAppointmentCalendarsOptions
  
  /** No additional options. */
  @js.native
  sealed trait none extends FindAppointmentCalendarsOptions
}
