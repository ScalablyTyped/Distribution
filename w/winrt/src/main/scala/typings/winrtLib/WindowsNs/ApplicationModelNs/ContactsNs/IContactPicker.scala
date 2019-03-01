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
    pickMultipleContactsAsync: js.Function0[
      winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[ContactInformation]]
    ],
    pickSingleContactAsync: js.Function0[winrtLib.WindowsNs.FoundationNs.IAsyncOperation[ContactInformation]],
    selectionMode: ContactSelectionMode
  ): IContactPicker = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("commitButtonText")(commitButtonText)
    __obj.updateDynamic("desiredFields")(desiredFields)
    __obj.updateDynamic("pickMultipleContactsAsync")(pickMultipleContactsAsync)
    __obj.updateDynamic("pickSingleContactAsync")(pickSingleContactAsync)
    __obj.updateDynamic("selectionMode")(selectionMode)
    __obj.asInstanceOf[IContactPicker]
  }
}

