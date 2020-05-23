package typings.winrtUwp.Windows.ApplicationModel.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the deferral process. */
trait EmailMailboxChangedEventArgs extends js.Object {
  /**
    * Gets the deferral object.
    * @return The deferral object.
    */
  def getDeferral(): EmailMailboxChangedDeferral
}

object EmailMailboxChangedEventArgs {
  @scala.inline
  def apply(getDeferral: () => EmailMailboxChangedDeferral): EmailMailboxChangedEventArgs = {
    val __obj = js.Dynamic.literal(getDeferral = js.Any.fromFunction0(getDeferral))
    __obj.asInstanceOf[EmailMailboxChangedEventArgs]
  }
}

