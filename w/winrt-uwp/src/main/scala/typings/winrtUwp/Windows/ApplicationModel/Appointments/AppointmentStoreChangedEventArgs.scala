package typings.winrtUwp.Windows.ApplicationModel.Appointments

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for a StoreChanged event. */
@js.native
trait AppointmentStoreChangedEventArgs extends StObject {
  
  /**
    * Gets the deferral object for the StoreChanged event.
    * @return The deferral object for the StoreChanged event.
    */
  def getDeferral(): AppointmentStoreChangedDeferral = js.native
}
object AppointmentStoreChangedEventArgs {
  
  @scala.inline
  def apply(getDeferral: () => AppointmentStoreChangedDeferral): AppointmentStoreChangedEventArgs = {
    val __obj = js.Dynamic.literal(getDeferral = js.Any.fromFunction0(getDeferral))
    __obj.asInstanceOf[AppointmentStoreChangedEventArgs]
  }
  
  @scala.inline
  implicit class AppointmentStoreChangedEventArgsMutableBuilder[Self <: AppointmentStoreChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetDeferral(value: () => AppointmentStoreChangedDeferral): Self = StObject.set(x, "getDeferral", js.Any.fromFunction0(value))
  }
}
