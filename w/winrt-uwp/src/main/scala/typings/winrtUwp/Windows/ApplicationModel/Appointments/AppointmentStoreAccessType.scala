package typings.winrtUwp.Windows.ApplicationModel.Appointments

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AppointmentStoreAccessType extends StObject
/** Specifies the level of access granted to an AppointmentStore . */
@JSGlobal("Windows.ApplicationModel.Appointments.AppointmentStoreAccessType")
@js.native
object AppointmentStoreAccessType extends StObject {
  
  /** The appointment store has read-only access to all calendars on the device. */
  @js.native
  sealed trait allCalendarsReadOnly
    extends StObject
       with AppointmentStoreAccessType
  
  /** The appointment store has read and write access to all calendars created by the calling app. */
  @js.native
  sealed trait allCalendarsReadWrite
    extends StObject
       with AppointmentStoreAccessType
  
  /** The appointment store has read and write access to appointment calendars created by the calling app. */
  @js.native
  sealed trait appCalendarsReadWrite
    extends StObject
       with AppointmentStoreAccessType
}
