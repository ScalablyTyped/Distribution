package typings.winrtDashUwp.Windows.ApplicationModel.Appointments

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AppointmentCalendarOtherAppWriteAccess extends js.Object

/** Specifies the level of write access provided to an app calendar. */
@JSGlobal("Windows.ApplicationModel.Appointments.AppointmentCalendarOtherAppWriteAccess")
@js.native
object AppointmentCalendarOtherAppWriteAccess extends js.Object {
  /** Only the app that created the calendar can write to it. */
  @js.native
  sealed trait none extends AppointmentCalendarOtherAppWriteAccess
  
  /** The operating system can write to the calendar. */
  @js.native
  sealed trait systemOnly extends AppointmentCalendarOtherAppWriteAccess
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AppointmentCalendarOtherAppWriteAccess with Double] = js.native
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 1 */ @js.native
  object systemOnly extends TopLevel[systemOnly with Double]
  
}

