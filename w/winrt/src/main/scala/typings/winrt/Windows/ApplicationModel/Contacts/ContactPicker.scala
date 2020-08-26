package typings.winrt.Windows.ApplicationModel.Contacts

import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContactPicker extends IContactPicker

object ContactPicker {
  @scala.inline
  def apply(
    commitButtonText: String,
    desiredFields: IVector[String],
    pickMultipleContactsAsync: () => IAsyncOperation[IVectorView[ContactInformation]],
    pickSingleContactAsync: () => IAsyncOperation[ContactInformation],
    selectionMode: ContactSelectionMode
  ): ContactPicker = {
    val __obj = js.Dynamic.literal(commitButtonText = commitButtonText.asInstanceOf[js.Any], desiredFields = desiredFields.asInstanceOf[js.Any], pickMultipleContactsAsync = js.Any.fromFunction0(pickMultipleContactsAsync), pickSingleContactAsync = js.Any.fromFunction0(pickSingleContactAsync), selectionMode = selectionMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactPicker]
  }
}

