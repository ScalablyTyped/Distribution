package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents when and how often an appointment occurs. */
@JSGlobal("Windows.ApplicationModel.Appointments.AppointmentRecurrence")
@js.native
class AppointmentRecurrence () extends js.Object {
  var calendarIdentifier: js.Any = js.native
   /* unmapped type *//** Gets or sets the day on which an appointment occurs. Day is of type UInt32 , has a default value of 1, and can be a value from 1 to 31. */
  var day: scala.Double = js.native
  /** Gets or sets a combination of AppointmentDaysOfWeek -typed values for all the days of the week on which an appointment occurs. */
  var daysOfWeek: AppointmentDaysOfWeek = js.native
  /** Gets or sets the interval between occurrences of an appointment. Interval is of type UInt32 and has a default value of 1. For daily, the interval is the number of days in between, for weekly, the number of weeks, and so on. */
  var interval: scala.Double = js.native
  /** Gets or sets the month on which an appointment occurs. Month is of type UInt32 , has a default value of 1, and can be a value from 1 to 12. */
  var month: scala.Double = js.native
  /** Gets or sets the number of times an appointment recurs. Occurrences is of type IReference(UInt32) and is NULL by default. Occurrences is mutually exclusive with Until . */
  var occurrences: scala.Double = js.native
  /** Gets a value indicating what type of recurrence applies to the associated appointment. */
  var recurrenceType: RecurrenceType = js.native
  /** Gets or sets the time zone for the recurrence. */
  var timeZone: java.lang.String = js.native
  /** Gets or sets a AppointmentRecurrenceUnit -typed value that indicates the frequency for which the appointment occurs. */
  var unit: AppointmentRecurrenceUnit = js.native
  /** Gets or sets the date and time until which an appointment is valid. Until is of type IReference(DateTime) and is NULL by default. Until is mutually exclusive with Occurrences . */
  var until: stdLib.Date = js.native
  /** Gets or sets a AppointmentWeekOfMonth -typed value that indicates the week of the month for which the appointment occurs. The first week is the default. */
  var weekOfMonth: AppointmentWeekOfMonth = js.native
}

