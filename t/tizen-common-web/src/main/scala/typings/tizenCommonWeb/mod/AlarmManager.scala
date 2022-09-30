package typings.tizenCommonWeb.mod

import typings.tizenCommonWeb.tizenCommonWebInts.`3600`
import typings.tizenCommonWeb.tizenCommonWebInts.`604800`
import typings.tizenCommonWeb.tizenCommonWebInts.`60`
import typings.tizenCommonWeb.tizenCommonWebInts.`86400`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlarmManager extends StObject {
  
  /**
    * The period of a day.
    * It defines the number of seconds per day.
    */
  val PERIOD_DAY: `86400` = js.native
  
  /**
    * The period of an hour.
    * It defines the number of seconds per hour.
    */
  val PERIOD_HOUR: `3600` = js.native
  
  /**
    * The period of a minute.
    * It defines the number of seconds per minute.
    */
  val PERIOD_MINUTE: `60` = js.native
  
  /**
    * The period of a week.
    * It defines the number of seconds in a week.
    */
  val PERIOD_WEEK: `604800` = js.native
  
  /**
    * Adds an alarm to the storage.
    *
    * Sets an alarm with the application ID to be run. You should definitely provide the application ID to run
    * and the [application control](/application/web/guides/app-management/app-controls#application-control-request) information if it is necessary.
    * For more information about the application control, see [The Application API](application.html).
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/alarm
    *
    * @param alarm An alarm to add. It can be either _AlarmRelative_ or _AlarmAbsolute_.
    * @param applicationId The application ID to run when the alarm is triggered.
    * @param appControl The data structure describing application control details.
    *
    * @throw WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type InvalidValuesError, if any input parameter does not contain a valid value.
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  def add(alarm: Alarm_, applicationId: ApplicationId): Unit = js.native
  def add(alarm: Alarm_, applicationId: ApplicationId, appControl: ApplicationControl): Unit = js.native
  
  /**
    * Returns an alarm as per the specified identifier.
    *
    * @param id The alarm ID to retrieve.
    *
    * @returns An alarm object with the specified ID.
    *
    * @throw WebAPIException with error type NotFoundError, if this alarm identifier cannot be found in the storage.
    * @throw WebAPIException with error type InvalidValuesError, if any input parameter does not contain a valid value.
    * @throw WebAPIException with error type UnknownError, if the method cannot be completed because of an unknown error.
    */
  def get(id: AlarmId): Alarm_ = js.native
  
  /**
    * Retrieves all alarms in an application storage.
    *
    * Alarms that have already been triggered are removed automatically from the storage.
    *
    * @returns All Alarm objects.
    *
    * @throw WebAPIException with error type UnknownError, if the method cannot be completed because of an unknown error.
    */
  def getAll(): js.Array[Alarm_] = js.native
  
  /**
    * Removes an alarm from the storage.
    *
    * If an alarm goes off, it will be removed from the storage automatically.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/alarm
    *
    * @param id The ID of the alarm to remove.
    *
    * @throw WebAPIException with error type NotFoundError, if this alarm identifier cannot be found in the storage.
    * @throw WebAPIException with error type InvalidValuesError, if any input parameter does not contain a valid value.
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throw WebAPIException with error type UnknownError, if the method cannot be completed because of an unknown error.
    */
  def remove(id: AlarmId): Unit = js.native
  
  /**
    * Removes all alarms added by an application.
    *
    * Because each application has its own alarm storage, this method removes alarms only added by the calling application.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/alarm
    *
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throw WebAPIException with error type UnknownError, if the method cannot be completed because of an unknown error.
    */
  def removeAll(): Unit = js.native
}
