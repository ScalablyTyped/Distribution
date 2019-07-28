package typings.winrt.WindowsNs.StorageNs.PickersNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IMap
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVector
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.ValueSet
import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
import typings.winrt.WindowsNs.StorageNs.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileSavePicker extends js.Object {
  var commitButtonText: String
  var continuationData: ValueSet
  var defaultFileExtension: String
  var fileTypeChoices: IMap[String, IVector[String]]
  var settingsIdentifier: String
  var suggestedFileName: String
  var suggestedSaveFile: StorageFile
  var suggestedStartLocation: PickerLocationId
  def pickSaveFileAndContinue(): Unit
  def pickSaveFileAsync(): IAsyncOperation[StorageFile]
}

object IFileSavePicker {
  @scala.inline
  def apply(
    commitButtonText: String,
    continuationData: ValueSet,
    defaultFileExtension: String,
    fileTypeChoices: IMap[String, IVector[String]],
    pickSaveFileAndContinue: () => Unit,
    pickSaveFileAsync: () => IAsyncOperation[StorageFile],
    settingsIdentifier: String,
    suggestedFileName: String,
    suggestedSaveFile: StorageFile,
    suggestedStartLocation: PickerLocationId
  ): IFileSavePicker = {
    val __obj = js.Dynamic.literal(commitButtonText = commitButtonText, continuationData = continuationData, defaultFileExtension = defaultFileExtension, fileTypeChoices = fileTypeChoices, pickSaveFileAndContinue = js.Any.fromFunction0(pickSaveFileAndContinue), pickSaveFileAsync = js.Any.fromFunction0(pickSaveFileAsync), settingsIdentifier = settingsIdentifier, suggestedFileName = suggestedFileName, suggestedSaveFile = suggestedSaveFile, suggestedStartLocation = suggestedStartLocation)
  
    __obj.asInstanceOf[IFileSavePicker]
  }
}

