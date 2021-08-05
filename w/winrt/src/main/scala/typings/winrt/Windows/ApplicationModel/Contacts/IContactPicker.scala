package typings.winrt.Windows.ApplicationModel.Contacts

import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IContactPicker extends StObject {
  
  var commitButtonText: String
  
  var desiredFields: IVector[String]
  
  def pickMultipleContactsAsync(): IAsyncOperation[IVectorView[ContactInformation]]
  
  def pickSingleContactAsync(): IAsyncOperation[ContactInformation]
  
  var selectionMode: ContactSelectionMode
}
object IContactPicker {
  
  inline def apply(
    commitButtonText: String,
    desiredFields: IVector[String],
    pickMultipleContactsAsync: () => IAsyncOperation[IVectorView[ContactInformation]],
    pickSingleContactAsync: () => IAsyncOperation[ContactInformation],
    selectionMode: ContactSelectionMode
  ): IContactPicker = {
    val __obj = js.Dynamic.literal(commitButtonText = commitButtonText.asInstanceOf[js.Any], desiredFields = desiredFields.asInstanceOf[js.Any], pickMultipleContactsAsync = js.Any.fromFunction0(pickMultipleContactsAsync), pickSingleContactAsync = js.Any.fromFunction0(pickSingleContactAsync), selectionMode = selectionMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContactPicker]
  }
  
  extension [Self <: IContactPicker](x: Self) {
    
    inline def setCommitButtonText(value: String): Self = StObject.set(x, "commitButtonText", value.asInstanceOf[js.Any])
    
    inline def setDesiredFields(value: IVector[String]): Self = StObject.set(x, "desiredFields", value.asInstanceOf[js.Any])
    
    inline def setPickMultipleContactsAsync(value: () => IAsyncOperation[IVectorView[ContactInformation]]): Self = StObject.set(x, "pickMultipleContactsAsync", js.Any.fromFunction0(value))
    
    inline def setPickSingleContactAsync(value: () => IAsyncOperation[ContactInformation]): Self = StObject.set(x, "pickSingleContactAsync", js.Any.fromFunction0(value))
    
    inline def setSelectionMode(value: ContactSelectionMode): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
  }
}
