package typings.winrtUwp.Windows.ApplicationModel.Appointments

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a background task deferral returned by the AppointmentStoreChangedEventArgs.GetDeferral method. */
@js.native
trait AppointmentStoreChangedDeferral extends StObject {
  
  /** Informs the system that an asynchronous operation associated with an AppointmentStore has finished. */
  def complete(): Unit = js.native
}
object AppointmentStoreChangedDeferral {
  
  @scala.inline
  def apply(complete: () => Unit): AppointmentStoreChangedDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[AppointmentStoreChangedDeferral]
  }
  
  @scala.inline
  implicit class AppointmentStoreChangedDeferralMutableBuilder[Self <: AppointmentStoreChangedDeferral] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
  }
}
