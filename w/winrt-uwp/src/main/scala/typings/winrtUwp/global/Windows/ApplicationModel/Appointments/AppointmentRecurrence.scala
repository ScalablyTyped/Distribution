package typings.winrtUwp.global.Windows.ApplicationModel.Appointments

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents when and how often an appointment occurs. */
@JSGlobal("Windows.ApplicationModel.Appointments.AppointmentRecurrence")
@js.native
/** Initializes a new instance of the AppointmentRecurrence class. */
class AppointmentRecurrence ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentRecurrence {
  
  /* CompleteClass */
  var calendarIdentifier: js.Any = js.native
  
  /* unmapped type */
  /** Gets or sets the day on which an appointment occurs. Day is of type UInt32 , has a default value of 1, and can be a value from 1 to 31. */
  /* CompleteClass */
  var day: Double = js.native
  
  /** Gets or sets a combination of AppointmentDaysOfWeek -typed values for all the days of the week on which an appointment occurs. */
  /* CompleteClass */
  var daysOfWeek: typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentDaysOfWeek = js.native
  
  /** Gets or sets the interval between occurrences of an appointment. Interval is of type UInt32 and has a default value of 1. For daily, the interval is the number of days in between, for weekly, the number of weeks, and so on. */
  /* CompleteClass */
  var interval: Double = js.native
  
  /** Gets or sets the month on which an appointment occurs. Month is of type UInt32 , has a default value of 1, and can be a value from 1 to 12. */
  /* CompleteClass */
  var month: Double = js.native
  
  /** Gets or sets the number of times an appointment recurs. Occurrences is of type IReference(UInt32) and is NULL by default. Occurrences is mutually exclusive with Until . */
  /* CompleteClass */
  var occurrences: Double = js.native
  
  /** Gets a value indicating what type of recurrence applies to the associated appointment. */
  /* CompleteClass */
  var recurrenceType: typings.winrtUwp.Windows.ApplicationModel.Appointments.RecurrenceType = js.native
  
  /** Gets or sets the time zone for the recurrence. */
  /* CompleteClass */
  var timeZone: String = js.native
  
  /** Gets or sets a AppointmentRecurrenceUnit -typed value that indicates the frequency for which the appointment occurs. */
  /* CompleteClass */
  var unit: typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentRecurrenceUnit = js.native
  
  /** Gets or sets the date and time until which an appointment is valid. Until is of type IReference(DateTime) and is NULL by default. Until is mutually exclusive with Occurrences . */
  /* CompleteClass */
  var until: Date = js.native
  
  /** Gets or sets a AppointmentWeekOfMonth -typed value that indicates the week of the month for which the appointment occurs. The first week is the default. */
  /* CompleteClass */
  var weekOfMonth: typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentWeekOfMonth = js.native
}
