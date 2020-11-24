package typings.winrtUwp.Windows.ApplicationModel.Appointments

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a background task deferral returned by the AppointmentStoreChangedEventArgs.GetDeferral method. */
@js.native
trait AppointmentStoreChangedDeferral extends js.Object {
  
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
  implicit class AppointmentStoreChangedDeferralOps[Self <: AppointmentStoreChangedDeferral] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setComplete(value: () => Unit): Self = this.set("complete", js.Any.fromFunction0(value))
  }
}
