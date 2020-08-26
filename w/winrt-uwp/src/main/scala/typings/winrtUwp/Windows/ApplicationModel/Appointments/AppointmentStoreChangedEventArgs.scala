package typings.winrtUwp.Windows.ApplicationModel.Appointments

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for a StoreChanged event. */
@js.native
trait AppointmentStoreChangedEventArgs extends js.Object {
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
  implicit class AppointmentStoreChangedEventArgsOps[Self <: AppointmentStoreChangedEventArgs] (val x: Self) extends AnyVal {
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
    def setGetDeferral(value: () => AppointmentStoreChangedDeferral): Self = this.set("getDeferral", js.Any.fromFunction0(value))
  }
  
}

