package typings.winrtUwp.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the ContactChanged event. */
trait ContactChangedEventArgs extends js.Object {
  /**
    * Gets the ContactChangedDeferral object to use for asynchronous operations.
    * @return The deferral object to use for asynchronous operations.
    */
  def getDeferral(): ContactChangedDeferral
}

object ContactChangedEventArgs {
  @scala.inline
  def apply(getDeferral: () => ContactChangedDeferral): ContactChangedEventArgs = {
    val __obj = js.Dynamic.literal(getDeferral = js.Any.fromFunction0(getDeferral))
    __obj.asInstanceOf[ContactChangedEventArgs]
  }
}

