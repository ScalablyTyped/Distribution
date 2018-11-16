package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides a way to monitor and react to changes to contacts. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactChangeReader")
@js.native
abstract class ContactChangeReader () extends js.Object {
  /** Call this method to indicate that you have processed and accepted all changes and you don't want the system to show them to you again. */
  def acceptChanges(): scala.Unit = js.native
  /**
                   * Call this method to indicate that you have processed and accepted up through the specified change.
                   * @param lastChangeToAccept The last change that you want to system to track as accepted by your app.
                   */
  def acceptChangesThrough(lastChangeToAccept: ContactChange): scala.Unit = js.native
  /**
                   * Asynchronously gets a list of ContactChange objects.
                   * @return A list of ContactChange objects.
                   */
  def readBatchAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_]] = js.native
}

