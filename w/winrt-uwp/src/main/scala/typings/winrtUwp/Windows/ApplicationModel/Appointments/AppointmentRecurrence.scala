package typings.winrtUwp.Windows.ApplicationModel.Appointments

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents when and how often an appointment occurs. */
@js.native
trait AppointmentRecurrence extends StObject {
  
  var calendarIdentifier: js.Any = js.native
  
  /* unmapped type */
  /** Gets or sets the day on which an appointment occurs. Day is of type UInt32 , has a default value of 1, and can be a value from 1 to 31. */
  var day: Double = js.native
  
  /** Gets or sets a combination of AppointmentDaysOfWeek -typed values for all the days of the week on which an appointment occurs. */
  var daysOfWeek: AppointmentDaysOfWeek = js.native
  
  /** Gets or sets the interval between occurrences of an appointment. Interval is of type UInt32 and has a default value of 1. For daily, the interval is the number of days in between, for weekly, the number of weeks, and so on. */
  var interval: Double = js.native
  
  /** Gets or sets the month on which an appointment occurs. Month is of type UInt32 , has a default value of 1, and can be a value from 1 to 12. */
  var month: Double = js.native
  
  /** Gets or sets the number of times an appointment recurs. Occurrences is of type IReference(UInt32) and is NULL by default. Occurrences is mutually exclusive with Until . */
  var occurrences: Double = js.native
  
  /** Gets a value indicating what type of recurrence applies to the associated appointment. */
  var recurrenceType: RecurrenceType = js.native
  
  /** Gets or sets the time zone for the recurrence. */
  var timeZone: String = js.native
  
  /** Gets or sets a AppointmentRecurrenceUnit -typed value that indicates the frequency for which the appointment occurs. */
  var unit: AppointmentRecurrenceUnit = js.native
  
  /** Gets or sets the date and time until which an appointment is valid. Until is of type IReference(DateTime) and is NULL by default. Until is mutually exclusive with Occurrences . */
  var until: Date = js.native
  
  /** Gets or sets a AppointmentWeekOfMonth -typed value that indicates the week of the month for which the appointment occurs. The first week is the default. */
  var weekOfMonth: AppointmentWeekOfMonth = js.native
}
object AppointmentRecurrence {
  
  @scala.inline
  def apply(
    calendarIdentifier: js.Any,
    day: Double,
    daysOfWeek: AppointmentDaysOfWeek,
    interval: Double,
    month: Double,
    occurrences: Double,
    recurrenceType: RecurrenceType,
    timeZone: String,
    unit: AppointmentRecurrenceUnit,
    until: Date,
    weekOfMonth: AppointmentWeekOfMonth
  ): AppointmentRecurrence = {
    val __obj = js.Dynamic.literal(calendarIdentifier = calendarIdentifier.asInstanceOf[js.Any], day = day.asInstanceOf[js.Any], daysOfWeek = daysOfWeek.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], occurrences = occurrences.asInstanceOf[js.Any], recurrenceType = recurrenceType.asInstanceOf[js.Any], timeZone = timeZone.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any], until = until.asInstanceOf[js.Any], weekOfMonth = weekOfMonth.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppointmentRecurrence]
  }
  
  @scala.inline
  implicit class AppointmentRecurrenceMutableBuilder[Self <: AppointmentRecurrence] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCalendarIdentifier(value: js.Any): Self = StObject.set(x, "calendarIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDaysOfWeek(value: AppointmentDaysOfWeek): Self = StObject.set(x, "daysOfWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOccurrences(value: Double): Self = StObject.set(x, "occurrences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecurrenceType(value: RecurrenceType): Self = StObject.set(x, "recurrenceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnit(value: AppointmentRecurrenceUnit): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUntil(value: Date): Self = StObject.set(x, "until", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeekOfMonth(value: AppointmentWeekOfMonth): Self = StObject.set(x, "weekOfMonth", value.asInstanceOf[js.Any])
  }
}
