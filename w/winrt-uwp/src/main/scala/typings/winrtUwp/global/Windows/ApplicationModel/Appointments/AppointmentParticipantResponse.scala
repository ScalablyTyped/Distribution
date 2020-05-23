package typings.winrtUwp.global.Windows.ApplicationModel.Appointments

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies the response from a participant concerning an appointment invitation. */
@JSGlobal("Windows.ApplicationModel.Appointments.AppointmentParticipantResponse")
@js.native
object AppointmentParticipantResponse extends js.Object {
  /* 2 */ val accepted: typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentParticipantResponse.accepted with Double = js.native
  /* 3 */ val declined: typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentParticipantResponse.declined with Double = js.native
  /* 0 */ val none: typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentParticipantResponse.none with Double = js.native
  /* 1 */ val tentative: typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentParticipantResponse.tentative with Double = js.native
  /* 4 */ val unknown: typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentParticipantResponse.unknown with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentParticipantResponse with Double
  ] = js.native
}

