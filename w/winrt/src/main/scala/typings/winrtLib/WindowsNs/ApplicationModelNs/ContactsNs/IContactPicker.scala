package typings
package winrtLib.WindowsNs.ApplicationModelNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContactPicker extends js.Object {
  var commitButtonText: java.lang.String
  var desiredFields: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String]
  var selectionMode: ContactSelectionMode
  def pickMultipleContactsAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[ContactInformation]]
  def pickSingleContactAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[ContactInformation]
}

object IContactPicker {
  @scala.inline
  def apply(
    commitButtonText: java.lang.String,
    desiredFields: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String],
    pickMultipleContactsAsync: () => winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[ContactInformation]],
    pickSingleContactAsync: () => winrtLib.WindowsNs.FoundationNs.IAsyncOperation[ContactInformation],
    selectionMode: ContactSelectionMode
  ): IContactPicker = {
    val __obj = js.Dynamic.literal(commitButtonText = commitButtonText, desiredFields = desiredFields, pickMultipleContactsAsync = js.Any.fromFunction0(pickMultipleContactsAsync), pickSingleContactAsync = js.Any.fromFunction0(pickSingleContactAsync), selectionMode = selectionMode)
  
    __obj.asInstanceOf[IContactPicker]
  }
}

