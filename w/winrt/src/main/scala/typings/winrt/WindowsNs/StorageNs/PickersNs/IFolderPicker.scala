package typings.winrt.WindowsNs.StorageNs.PickersNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVector
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.ValueSet
import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
import typings.winrt.WindowsNs.StorageNs.StorageFolder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFolderPicker extends js.Object {
  var commitButtonText: String
  var continuationData: ValueSet
  var fileTypeFilter: IVector[String]
  var settingsIdentifier: String
  var suggestedStartLocation: PickerLocationId
  var viewMode: PickerViewMode
  def pickFolderAndContinue(): Unit
  def pickSingleFolderAsync(): IAsyncOperation[StorageFolder]
}

object IFolderPicker {
  @scala.inline
  def apply(
    commitButtonText: String,
    continuationData: ValueSet,
    fileTypeFilter: IVector[String],
    pickFolderAndContinue: () => Unit,
    pickSingleFolderAsync: () => IAsyncOperation[StorageFolder],
    settingsIdentifier: String,
    suggestedStartLocation: PickerLocationId,
    viewMode: PickerViewMode
  ): IFolderPicker = {
    val __obj = js.Dynamic.literal(commitButtonText = commitButtonText, continuationData = continuationData, fileTypeFilter = fileTypeFilter, pickFolderAndContinue = js.Any.fromFunction0(pickFolderAndContinue), pickSingleFolderAsync = js.Any.fromFunction0(pickSingleFolderAsync), settingsIdentifier = settingsIdentifier, suggestedStartLocation = suggestedStartLocation, viewMode = viewMode)
  
    __obj.asInstanceOf[IFolderPicker]
  }
}

