package typings
package winrtLib.WindowsNs.StorageNs.PickersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileOpenPicker extends js.Object {
  var commitButtonText: java.lang.String
  var continuationData: winrtLib.WindowsNs.FoundationNs.CollectionsNs.ValueSet
  var fileTypeFilter: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String]
  var settingsIdentifier: java.lang.String
  var suggestedStartLocation: PickerLocationId
  var viewMode: PickerViewMode
  def pickMultipleFilesAndContinue(): scala.Unit
  def pickMultipleFilesAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[
    winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtLib.WindowsNs.StorageNs.StorageFile]
  ]
  def pickSingleFileAndContinue(): scala.Unit
  def pickSingleFileAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.StorageNs.StorageFile]
}

object IFileOpenPicker {
  @scala.inline
  def apply(
    commitButtonText: java.lang.String,
    continuationData: winrtLib.WindowsNs.FoundationNs.CollectionsNs.ValueSet,
    fileTypeFilter: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String],
    pickMultipleFilesAndContinue: js.Function0[scala.Unit],
    pickMultipleFilesAsync: js.Function0[
      winrtLib.WindowsNs.FoundationNs.IAsyncOperation[
        winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtLib.WindowsNs.StorageNs.StorageFile]
      ]
    ],
    pickSingleFileAndContinue: js.Function0[scala.Unit],
    pickSingleFileAsync: js.Function0[
      winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.StorageNs.StorageFile]
    ],
    settingsIdentifier: java.lang.String,
    suggestedStartLocation: PickerLocationId,
    viewMode: PickerViewMode
  ): IFileOpenPicker = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("commitButtonText")(commitButtonText)
    __obj.updateDynamic("continuationData")(continuationData)
    __obj.updateDynamic("fileTypeFilter")(fileTypeFilter)
    __obj.updateDynamic("pickMultipleFilesAndContinue")(pickMultipleFilesAndContinue)
    __obj.updateDynamic("pickMultipleFilesAsync")(pickMultipleFilesAsync)
    __obj.updateDynamic("pickSingleFileAndContinue")(pickSingleFileAndContinue)
    __obj.updateDynamic("pickSingleFileAsync")(pickSingleFileAsync)
    __obj.updateDynamic("settingsIdentifier")(settingsIdentifier)
    __obj.updateDynamic("suggestedStartLocation")(suggestedStartLocation)
    __obj.updateDynamic("viewMode")(viewMode)
    __obj.asInstanceOf[IFileOpenPicker]
  }
}

