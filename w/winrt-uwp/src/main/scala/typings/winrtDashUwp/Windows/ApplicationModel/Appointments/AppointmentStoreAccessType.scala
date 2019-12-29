package typings.winrtDashUwp.Windows.ApplicationModel.Appointments

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AppointmentStoreAccessType extends js.Object

/** Specifies the level of access granted to an AppointmentStore . */
@JSGlobal("Windows.ApplicationModel.Appointments.AppointmentStoreAccessType")
@js.native
object AppointmentStoreAccessType extends js.Object {
  /** The appointment store has read-only access to all calendars on the device. */
  @js.native
  sealed trait allCalendarsReadOnly extends AppointmentStoreAccessType
  
  /** The appointment store has read and write access to all calendars created by the calling app. */
  @js.native
  sealed trait allCalendarsReadWrite extends AppointmentStoreAccessType
  
  /** The appointment store has read and write access to appointment calendars created by the calling app. */
  @js.native
  sealed trait appCalendarsReadWrite extends AppointmentStoreAccessType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AppointmentStoreAccessType with Double] = js.native
  /* 1 */ @js.native
  object allCalendarsReadOnly extends TopLevel[allCalendarsReadOnly with Double]
  
  /* 2 */ @js.native
  object allCalendarsReadWrite extends TopLevel[allCalendarsReadWrite with Double]
  
  /* 0 */ @js.native
  object appCalendarsReadWrite extends TopLevel[appCalendarsReadWrite with Double]
  
}

