package typings.winrt.Windows.Storage.Pickers

import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.Collections.ValueSet
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Storage.StorageFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileOpenPicker
  extends StObject
     with IFileOpenPicker
object FileOpenPicker {
  
  @scala.inline
  def apply(
    commitButtonText: String,
    continuationData: ValueSet,
    fileTypeFilter: IVector[String],
    pickMultipleFilesAndContinue: () => Unit,
    pickMultipleFilesAsync: () => IAsyncOperation[IVectorView[StorageFile]],
    pickSingleFileAndContinue: () => Unit,
    pickSingleFileAsync: () => IAsyncOperation[StorageFile],
    settingsIdentifier: String,
    suggestedStartLocation: PickerLocationId,
    viewMode: PickerViewMode
  ): FileOpenPicker = {
    val __obj = js.Dynamic.literal(commitButtonText = commitButtonText.asInstanceOf[js.Any], continuationData = continuationData.asInstanceOf[js.Any], fileTypeFilter = fileTypeFilter.asInstanceOf[js.Any], pickMultipleFilesAndContinue = js.Any.fromFunction0(pickMultipleFilesAndContinue), pickMultipleFilesAsync = js.Any.fromFunction0(pickMultipleFilesAsync), pickSingleFileAndContinue = js.Any.fromFunction0(pickSingleFileAndContinue), pickSingleFileAsync = js.Any.fromFunction0(pickSingleFileAsync), settingsIdentifier = settingsIdentifier.asInstanceOf[js.Any], suggestedStartLocation = suggestedStartLocation.asInstanceOf[js.Any], viewMode = viewMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileOpenPicker]
  }
}
