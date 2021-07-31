package typings.winrtUwp.Windows.ApplicationModel.Appointments

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AppointmentSensitivity extends StObject
/** Specifies the sensitivity of an appointment. */
@JSGlobal("Windows.ApplicationModel.Appointments.AppointmentSensitivity")
@js.native
object AppointmentSensitivity extends StObject {
  
  /** The appointment is private and can't be viewed publicly. */
  @js.native
  sealed trait `private`
    extends StObject
       with AppointmentSensitivity
  
  /** The appointment is publicly available to view. */
  @js.native
  sealed trait public
    extends StObject
       with AppointmentSensitivity
}
