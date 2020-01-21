package typings.winrtUwp.Windows.ApplicationModel.Appointments

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AppointmentCalendarOtherAppReadAccess extends js.Object

/** Specifies the level of read access provided to an app calendar. */
@JSGlobal("Windows.ApplicationModel.Appointments.AppointmentCalendarOtherAppReadAccess")
@js.native
object AppointmentCalendarOtherAppReadAccess extends js.Object {
  /** Other apps on the device can read all properties of appointments in the calendar. */
  @js.native
  sealed trait full extends AppointmentCalendarOtherAppReadAccess
  
  /** Other apps on the device can read the Subject , StartTime , Duration , AllDay , LocalId properties of appointments in the calendar and the LocalId property of the calendar */
  @js.native
  sealed trait limited extends AppointmentCalendarOtherAppReadAccess
  
  /** Only the operating system can read data from the app calendar. */
  @js.native
  sealed trait systemOnly extends AppointmentCalendarOtherAppReadAccess
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AppointmentCalendarOtherAppReadAccess with Double] = js.native
  /* 2 */ @js.native
  object full extends TopLevel[full with Double]
  
  /* 1 */ @js.native
  object limited extends TopLevel[limited with Double]
  
  /* 0 */ @js.native
  object systemOnly extends TopLevel[systemOnly with Double]
  
}

