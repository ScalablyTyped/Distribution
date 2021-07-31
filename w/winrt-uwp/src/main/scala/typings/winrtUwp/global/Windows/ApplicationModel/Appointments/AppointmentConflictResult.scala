package typings.winrtUwp.global.Windows.ApplicationModel.Appointments

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a conflict between appointments. */
@JSGlobal("Windows.ApplicationModel.Appointments.AppointmentConflictResult")
@js.native
abstract class AppointmentConflictResult ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentConflictResult {
  
  /** Gets the date of the appointment conflict. */
  /* CompleteClass */
  var date: Date = js.native
  
  /** Gets a value indicating the type of appointment conflict. */
  /* CompleteClass */
  var `type`: typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentConflictType = js.native
}
