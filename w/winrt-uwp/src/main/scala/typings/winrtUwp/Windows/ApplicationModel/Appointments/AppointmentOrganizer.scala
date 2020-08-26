package typings.winrtUwp.Windows.ApplicationModel.Appointments

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the organizer of an appointment in a calendar. */
@js.native
trait AppointmentOrganizer extends js.Object {
  /** Gets or sets a string that communicates the address of the organizer of an appointment. The address is required, inherited from IAppointmentParticipant , and a Simple Mail Transfer Protocol (SMTP) e-mail address. It is also of type String and between 1 and 321 characters in length (non-empty). */
  var address: String = js.native
  /** Gets or sets a string that communicates the display name of the organizer of an appointment. The display name is optional, inherited from IAppointmentParticipant , of type String , and a maximum of 256 characters in length. */
  var displayName: String = js.native
}

object AppointmentOrganizer {
  @scala.inline
  def apply(address: String, displayName: String): AppointmentOrganizer = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppointmentOrganizer]
  }
  @scala.inline
  implicit class AppointmentOrganizerOps[Self <: AppointmentOrganizer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
  }
  
}

