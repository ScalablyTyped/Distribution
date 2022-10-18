package typings.winrtUwp.global.Windows.ApplicationModel.Appointments

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for a StoreChanged event. */
/* note: abstract class */ @JSGlobal("Windows.ApplicationModel.Appointments.AppointmentStoreChangedEventArgs")
@js.native
open class AppointmentStoreChangedEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentStoreChangedEventArgs {
  
  /**
    * Gets the deferral object for the StoreChanged event.
    * @return The deferral object for the StoreChanged event.
    */
  /* CompleteClass */
  override def getDeferral(): typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentStoreChangedDeferral = js.native
}
