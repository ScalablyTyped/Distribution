package typings.winrtUwp.Windows.ApplicationModel.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the deferral process. */
@js.native
trait EmailMailboxChangedEventArgs extends js.Object {
  /**
    * Gets the deferral object.
    * @return The deferral object.
    */
  def getDeferral(): EmailMailboxChangedDeferral = js.native
}

object EmailMailboxChangedEventArgs {
  @scala.inline
  def apply(getDeferral: () => EmailMailboxChangedDeferral): EmailMailboxChangedEventArgs = {
    val __obj = js.Dynamic.literal(getDeferral = js.Any.fromFunction0(getDeferral))
    __obj.asInstanceOf[EmailMailboxChangedEventArgs]
  }
  @scala.inline
  implicit class EmailMailboxChangedEventArgsOps[Self <: EmailMailboxChangedEventArgs] (val x: Self) extends AnyVal {
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
    def setGetDeferral(value: () => EmailMailboxChangedDeferral): Self = this.set("getDeferral", js.Any.fromFunction0(value))
  }
  
}

