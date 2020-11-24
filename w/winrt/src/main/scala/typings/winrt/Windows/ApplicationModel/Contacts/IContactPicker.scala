package typings.winrt.Windows.ApplicationModel.Contacts

import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IContactPicker extends js.Object {
  
  var commitButtonText: String = js.native
  
  var desiredFields: IVector[String] = js.native
  
  def pickMultipleContactsAsync(): IAsyncOperation[IVectorView[ContactInformation]] = js.native
  
  def pickSingleContactAsync(): IAsyncOperation[ContactInformation] = js.native
  
  var selectionMode: ContactSelectionMode = js.native
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
    val __obj = js.Dynamic.literal(commitButtonText = commitButtonText.asInstanceOf[js.Any], desiredFields = desiredFields.asInstanceOf[js.Any], pickMultipleContactsAsync = js.Any.fromFunction0(pickMultipleContactsAsync), pickSingleContactAsync = js.Any.fromFunction0(pickSingleContactAsync), selectionMode = selectionMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContactPicker]
  }
  
  @scala.inline
  implicit class IContactPickerOps[Self <: IContactPicker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCommitButtonText(value: String): Self = this.set("commitButtonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredFields(value: IVector[String]): Self = this.set("desiredFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPickMultipleContactsAsync(value: () => IAsyncOperation[IVectorView[ContactInformation]]): Self = this.set("pickMultipleContactsAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPickSingleContactAsync(value: () => IAsyncOperation[ContactInformation]): Self = this.set("pickSingleContactAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSelectionMode(value: ContactSelectionMode): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
  }
}
