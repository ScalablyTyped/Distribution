package typings.winrt.Windows.Storage.Pickers

import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.Collections.ValueSet
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileOpenPicker extends js.Object {
  var commitButtonText: String
  var continuationData: ValueSet
  var fileTypeFilter: IVector[String]
  var settingsIdentifier: String
  var suggestedStartLocation: PickerLocationId
  var viewMode: PickerViewMode
  def pickMultipleFilesAndContinue(): Unit
  def pickMultipleFilesAsync(): IAsyncOperation[IVectorView[StorageFile]]
  def pickSingleFileAndContinue(): Unit
  def pickSingleFileAsync(): IAsyncOperation[StorageFile]
}

object IFileOpenPicker {
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
  ): IFileOpenPicker = {
    val __obj = js.Dynamic.literal(commitButtonText = commitButtonText, continuationData = continuationData, fileTypeFilter = fileTypeFilter, pickMultipleFilesAndContinue = js.Any.fromFunction0(pickMultipleFilesAndContinue), pickMultipleFilesAsync = js.Any.fromFunction0(pickMultipleFilesAsync), pickSingleFileAndContinue = js.Any.fromFunction0(pickSingleFileAndContinue), pickSingleFileAsync = js.Any.fromFunction0(pickSingleFileAsync), settingsIdentifier = settingsIdentifier, suggestedStartLocation = suggestedStartLocation, viewMode = viewMode)
  
    __obj.asInstanceOf[IFileOpenPicker]
  }
}

