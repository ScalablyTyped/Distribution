package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the ContactChanged event. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactChangedEventArgs")
@js.native
abstract class ContactChangedEventArgs () extends js.Object {
  /**
    * Gets the ContactChangedDeferral object to use for asynchronous operations.
    * @return The deferral object to use for asynchronous operations.
    */
  def getDeferral(): ContactChangedDeferral = js.native
}

