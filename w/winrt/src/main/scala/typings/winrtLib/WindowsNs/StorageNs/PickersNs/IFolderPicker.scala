package typings
package winrtLib.WindowsNs.StorageNs.PickersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFolderPicker extends js.Object {
  var commitButtonText: java.lang.String
  var continuationData: winrtLib.WindowsNs.FoundationNs.CollectionsNs.ValueSet
  var fileTypeFilter: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String]
  var settingsIdentifier: java.lang.String
  var suggestedStartLocation: PickerLocationId
  var viewMode: PickerViewMode
  def pickFolderAndContinue(): scala.Unit
  def pickSingleFolderAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.StorageNs.StorageFolder]
}

object IFolderPicker {
  @scala.inline
  def apply(
    commitButtonText: java.lang.String,
    continuationData: winrtLib.WindowsNs.FoundationNs.CollectionsNs.ValueSet,
    fileTypeFilter: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String],
    pickFolderAndContinue: js.Function0[scala.Unit],
    pickSingleFolderAsync: js.Function0[
      winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.StorageNs.StorageFolder]
    ],
    settingsIdentifier: java.lang.String,
    suggestedStartLocation: PickerLocationId,
    viewMode: PickerViewMode
  ): IFolderPicker = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("commitButtonText")(commitButtonText)
    __obj.updateDynamic("continuationData")(continuationData)
    __obj.updateDynamic("fileTypeFilter")(fileTypeFilter)
    __obj.updateDynamic("pickFolderAndContinue")(pickFolderAndContinue)
    __obj.updateDynamic("pickSingleFolderAsync")(pickSingleFolderAsync)
    __obj.updateDynamic("settingsIdentifier")(settingsIdentifier)
    __obj.updateDynamic("suggestedStartLocation")(suggestedStartLocation)
    __obj.updateDynamic("viewMode")(viewMode)
    __obj.asInstanceOf[IFolderPicker]
  }
}

