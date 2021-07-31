package typings.winrtUwp.Windows.ApplicationModel.Appointments

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AppointmentBusyStatus extends StObject
/** Specifies the busy status for a participant of an appointment. */
@JSGlobal("Windows.ApplicationModel.Appointments.AppointmentBusyStatus")
@js.native
object AppointmentBusyStatus extends StObject {
  
  /** The participant is busy and so can't attend the appointment. */
  @js.native
  sealed trait busy
    extends StObject
       with AppointmentBusyStatus
  
  /** The participant is free and so can attend the appointment. */
  @js.native
  sealed trait free
    extends StObject
       with AppointmentBusyStatus
  
  /** The participant is out of office. */
  @js.native
  sealed trait outOfOffice
    extends StObject
       with AppointmentBusyStatus
  
  /** The participant might be able to attend the appointment. */
  @js.native
  sealed trait tentative
    extends StObject
       with AppointmentBusyStatus
  
  /** The participant is working elsewhere. */
  @js.native
  sealed trait workingElsewhere
    extends StObject
       with AppointmentBusyStatus
}
