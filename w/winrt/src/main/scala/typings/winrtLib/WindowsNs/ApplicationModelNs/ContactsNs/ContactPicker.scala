package typings
package winrtLib.WindowsNs.ApplicationModelNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Contacts.ContactPicker")
@js.native
class ContactPicker () extends IContactPicker {
  /* CompleteClass */
  override var commitButtonText: java.lang.String = js.native
  /* CompleteClass */
  override var desiredFields: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String] = js.native
  /* CompleteClass */
  override var selectionMode: ContactSelectionMode = js.native
  /* CompleteClass */
  override def pickMultipleContactsAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[ContactInformation]] = js.native
  /* CompleteClass */
  override def pickSingleContactAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[ContactInformation] = js.native
}

