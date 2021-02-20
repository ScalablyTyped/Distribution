package typings.winrtUwp.Windows.ApplicationModel.Appointments

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AppointmentDetailsKind extends StObject
/** Defines the type of content in appointment details. */
@JSGlobal("Windows.ApplicationModel.Appointments.AppointmentDetailsKind")
@js.native
object AppointmentDetailsKind extends StObject {
  
  /** Content is in HTML markup. */
  @js.native
  sealed trait html extends AppointmentDetailsKind
  
  /** Content is in plain text. */
  @js.native
  sealed trait plainText extends AppointmentDetailsKind
}
