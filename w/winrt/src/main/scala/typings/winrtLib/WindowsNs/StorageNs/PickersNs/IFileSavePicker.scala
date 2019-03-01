package typings
package winrtLib.WindowsNs.StorageNs.PickersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileSavePicker extends js.Object {
  var commitButtonText: java.lang.String
  var continuationData: winrtLib.WindowsNs.FoundationNs.CollectionsNs.ValueSet
  var defaultFileExtension: java.lang.String
  var fileTypeChoices: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IMap[
    java.lang.String, 
    winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String]
  ]
  var settingsIdentifier: java.lang.String
  var suggestedFileName: java.lang.String
  var suggestedSaveFile: winrtLib.WindowsNs.StorageNs.StorageFile
  var suggestedStartLocation: PickerLocationId
  def pickSaveFileAndContinue(): scala.Unit
  def pickSaveFileAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.StorageNs.StorageFile]
}

object IFileSavePicker {
  @scala.inline
  def apply(
    commitButtonText: java.lang.String,
    continuationData: winrtLib.WindowsNs.FoundationNs.CollectionsNs.ValueSet,
    defaultFileExtension: java.lang.String,
    fileTypeChoices: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IMap[
      java.lang.String, 
      winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String]
    ],
    pickSaveFileAndContinue: js.Function0[scala.Unit],
    pickSaveFileAsync: js.Function0[
      winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.StorageNs.StorageFile]
    ],
    settingsIdentifier: java.lang.String,
    suggestedFileName: java.lang.String,
    suggestedSaveFile: winrtLib.WindowsNs.StorageNs.StorageFile,
    suggestedStartLocation: PickerLocationId
  ): IFileSavePicker = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("commitButtonText")(commitButtonText)
    __obj.updateDynamic("continuationData")(continuationData)
    __obj.updateDynamic("defaultFileExtension")(defaultFileExtension)
    __obj.updateDynamic("fileTypeChoices")(fileTypeChoices)
    __obj.updateDynamic("pickSaveFileAndContinue")(pickSaveFileAndContinue)
    __obj.updateDynamic("pickSaveFileAsync")(pickSaveFileAsync)
    __obj.updateDynamic("settingsIdentifier")(settingsIdentifier)
    __obj.updateDynamic("suggestedFileName")(suggestedFileName)
    __obj.updateDynamic("suggestedSaveFile")(suggestedSaveFile)
    __obj.updateDynamic("suggestedStartLocation")(suggestedStartLocation)
    __obj.asInstanceOf[IFileSavePicker]
  }
}

