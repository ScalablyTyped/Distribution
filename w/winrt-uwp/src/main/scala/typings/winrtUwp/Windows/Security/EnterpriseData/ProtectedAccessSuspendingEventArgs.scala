package typings.winrtUwp.Windows.Security.EnterpriseData

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.Deferral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data when content protection is being suspended. */
@js.native
trait ProtectedAccessSuspendingEventArgs extends js.Object {
  /** DateTime at which content protection will be suspended. The app can subtract DateTime.Now from this value to determine how much time there is to perform any processing before the suspension occurs. */
  var deadline: Date = js.native
  /** Contains the enterprise identities for which content protection is being suspended. */
  var identities: IVectorView[String] = js.native
  /**
    * Gets the Deferral object that manages the protection suspension. The app must call Deferral.Complete before it returns from the event handler.
    * @return The Deferral object.
    */
  def getDeferral(): Deferral = js.native
}

object ProtectedAccessSuspendingEventArgs {
  @scala.inline
  def apply(deadline: Date, getDeferral: () => Deferral, identities: IVectorView[String]): ProtectedAccessSuspendingEventArgs = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral), identities = identities.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtectedAccessSuspendingEventArgs]
  }
  @scala.inline
  implicit class ProtectedAccessSuspendingEventArgsOps[Self <: ProtectedAccessSuspendingEventArgs] (val x: Self) extends AnyVal {
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
    def setDeadline(value: Date): Self = this.set("deadline", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetDeferral(value: () => Deferral): Self = this.set("getDeferral", js.Any.fromFunction0(value))
    @scala.inline
    def setIdentities(value: IVectorView[String]): Self = this.set("identities", value.asInstanceOf[js.Any])
  }
  
}

