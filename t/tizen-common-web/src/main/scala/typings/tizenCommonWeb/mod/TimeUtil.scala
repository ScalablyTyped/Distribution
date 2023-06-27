package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeUtil extends StObject {
  
  /**
    * Gets synchronously the identifiers of the timezones supported by the device.
    *
    * Zero or more slashes separate different components of a timezone identifier,
    * with the most general descriptor first and the most specific one last. For example,
    * "Europe/Berlin", "America/Argentina/Buenos\_Aires".
    *
    * @returns Array of time zone identifiers.
    *
    * @throws WebAPIException with error type UnknownError, if the call failed due to an unknown error.
    */
  def getAvailableTimezones(): js.Array[String] = js.native
  
  /**
    * Gets the current date/time.
    *
    * @returns The current TZDate object.
    * @throws WebAPIException with error type UnknownError, if the call failed due to an unknown error.
    */
  def getCurrentDateTime(): TZDate = js.native
  
  /**
    * Gets the date format according to the system's locale settings.
    *
    * These expressions may be used in the returned string:
    *
    * *   "d" = day number (1 to 31)
    * *   "D" = day name
    * *   "m" = month number (1 to 12)
    * *   "M" = month name
    * *   "y" = year
    *
    *
    * Examples of string formats include: "d/m/y", "y-d-m", "D, M d y".
    *
    * @param shortformat The flag indicating whether the user is interested in the short.
    * date format (23/10/2011) instead of a long date format ("Monday, October 23 2011")
    * By default, this attribute is set to false.
    *
    * @returns The date format according to the system's locale settings.
    *
    * @throws WebAPIException with error type UnknownError, if the call failed due to an unknown error.
    */
  def getDateFormat(): String = js.native
  def getDateFormat(shortformat: Boolean): String = js.native
  
  /**
    * Gets the identifier of the local system timezone.
    *
    * @returns The local timezone.
    * @throws WebAPIException with error type UnknownError, if the call failed due to an unknown error.
    */
  def getLocalTimezone(): String = js.native
  
  /**
    * Gets the time format according to the system's locale settings.
    *
    * These expressions may be used in the returned string:
    *
    * *   "h" = hours (0 to 23 or 1 to 12 if AM/PM display)
    * *   "m" = minutes (0 to 59)
    * *   "s" = seconds (0 to 59)
    * *   "ap" = AM/PM display
    *
    *
    * Examples of string formats include: "h:m:s ap", "h:m:s".
    *
    * @returns The time format according to the system's locale settings.
    * @throws WebAPIException with error type UnknownError, if the call failed due to an unknown error.
    */
  def getTimeFormat(): String = js.native
  
  /**
    * Checks whether the given year is a leap year.
    *
    * @param year The year to check.
    *
    * @returns true, if the year is a leap year.
    *
    * @throws WebAPIException with error type TypeMismatchError, if the input parameter
    * is not compatible with the expected type for that parameter.
    * @throws WebAPIException with error type InvalidValuesError, if any of the input
    * parameters contain an invalid value.
    * @throws WebAPIException with error type UnknownError, if the call failed due to an unknown error.
    */
  def isLeapYear(year: Double): Boolean = js.native
  
  /**
    * Sets a listener to receive notification of changes to the time/date on a device.
    *
    * Listener set with _setTimezoneChangeListener()_ method is called when device time was set by the user.
    *
    * @since 2.3
    *
    * @param changeCallback Callback method to be invoked when device time was set
    * It is not invoked when time passes naturally.
    *
    * @throws WebAPIException with error type TypeMismatchError, if the input parameter is not compatible with the expected type for that parameter.
    * @throws WebAPIException with error type UnknownError, if the call failed due to an unknown error.
    */
  def setDateTimeChangeListener(changeCallback: SuccessCallback): Unit = js.native
  
  /**
    * Sets a listener to receive notification of changes to the time zone on a device.
    *
    * Listener set with _setTimezoneChangeListener()_ method is called when device time zone has changed.
    *
    * @since 2.3
    *
    * @param changeCallback Callback method that is invoked when the time zone has changed.
    *
    * @throws WebAPIException with error type TypeMismatchError, if the input parameter
    * is not compatible with the expected type for that parameter.
    * @throws WebAPIException with error type UnknownError, if the call failed due to an unknown error.
    */
  def setTimezoneChangeListener(changeCallback: SuccessCallback): Unit = js.native
  
  /**
    * Unsets the listener to stop receiving notification of changes to the time/date on a device.
    *
    * Calling this function has no effect if listener is not set.
    *
    * @since 2.3
    *
    * @throws WebAPIException with error type UnknownError, if the call failed due to an unknown error.
    */
  def unsetDateTimeChangeListener(): Unit = js.native
  
  /**
    * Unsets the listener to stop receiving notification of changes to the time zone on a device.
    *
    * Calling this function has no effect if listener is not set.
    *
    * @since 2.3
    *
    * @throws WebAPIException with error type UnknownError, if the call failed due to an unknown error.
    */
  def unsetTimezoneChangeListener(): Unit = js.native
}
