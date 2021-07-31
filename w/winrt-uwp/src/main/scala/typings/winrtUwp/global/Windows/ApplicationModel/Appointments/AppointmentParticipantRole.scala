package typings.winrtUwp.global.Windows.ApplicationModel.Appointments

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies the role of an item concerning an appointment invitation. */
@JSGlobal("Windows.ApplicationModel.Appointments.AppointmentParticipantRole")
@js.native
object AppointmentParticipantRole extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentParticipantRole & Double
  ] = js.native
  
  /* 1 */ val optionalAttendee: typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentParticipantRole.optionalAttendee & Double = js.native
  
  /* 0 */ val requiredAttendee: typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentParticipantRole.requiredAttendee & Double = js.native
  
  /* 2 */ val resource: typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentParticipantRole.resource & Double = js.native
}
