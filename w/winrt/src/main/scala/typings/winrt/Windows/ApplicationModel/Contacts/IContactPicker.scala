package typings.winrt.Windows.ApplicationModel.Contacts

import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContactPicker extends js.Object {
  var commitButtonText: String
  var desiredFields: IVector[String]
  var selectionMode: ContactSelectionMode
  def pickMultipleContactsAsync(): IAsyncOperation[IVectorView[ContactInformation]]
  def pickSingleContactAsync(): IAsyncOperation[ContactInformation]
}

object IContactPicker {
  @scala.inline
  def apply(
    commitButtonText: String,
    desiredFields: IVector[String],
    pickMultipleContactsAsync: () => IAsyncOperation[IVectorView[ContactInformation]],
    pickSingleContactAsync: () => IAsyncOperation[ContactInformation],
    selectionMode: ContactSelectionMode
  ): IContactPicker = {
    val __obj = js.Dynamic.literal(commitButtonText = commitButtonText, desiredFields = desiredFields, pickMultipleContactsAsync = js.Any.fromFunction0(pickMultipleContactsAsync), pickSingleContactAsync = js.Any.fromFunction0(pickSingleContactAsync), selectionMode = selectionMode)
  
    __obj.asInstanceOf[IContactPicker]
  }
}

