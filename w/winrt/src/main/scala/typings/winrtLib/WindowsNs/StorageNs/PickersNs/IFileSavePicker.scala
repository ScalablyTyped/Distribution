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

