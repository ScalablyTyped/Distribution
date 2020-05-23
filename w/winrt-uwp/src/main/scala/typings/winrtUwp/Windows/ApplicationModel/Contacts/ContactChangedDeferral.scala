package typings.winrtUwp.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The deferral object to use while asynchronously processing ContactChanged events. */
trait ContactChangedDeferral extends js.Object {
  /** Call this method in order to release the deferral object when all asynchronous processing has finished. */
  def complete(): Unit
}

object ContactChangedDeferral {
  @scala.inline
  def apply(complete: () => Unit): ContactChangedDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[ContactChangedDeferral]
  }
}

