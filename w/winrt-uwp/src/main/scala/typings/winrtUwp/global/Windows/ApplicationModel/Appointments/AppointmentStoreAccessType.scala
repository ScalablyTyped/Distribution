package typings.winrtUwp.global.Windows.ApplicationModel.Appointments

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies the level of access granted to an AppointmentStore . */
@JSGlobal("Windows.ApplicationModel.Appointments.AppointmentStoreAccessType")
@js.native
object AppointmentStoreAccessType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentStoreAccessType with Double
  ] = js.native
  
  /* 1 */ val allCalendarsReadOnly: typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentStoreAccessType.allCalendarsReadOnly with Double = js.native
  
  /* 2 */ val allCalendarsReadWrite: typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentStoreAccessType.allCalendarsReadWrite with Double = js.native
  
  /* 0 */ val appCalendarsReadWrite: typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentStoreAccessType.appCalendarsReadWrite with Double = js.native
}
