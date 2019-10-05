package typings.winrtDashUwp.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The deferral object to use while asynchronously processing ContactChanged events. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactChangedDeferral")
@js.native
abstract class ContactChangedDeferral () extends js.Object {
  /** Call this method in order to release the deferral object when all asynchronous processing has finished. */
  def complete(): Unit = js.native
}

