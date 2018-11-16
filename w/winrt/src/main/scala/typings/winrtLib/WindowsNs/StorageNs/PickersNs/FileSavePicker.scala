package typings
package winrtLib.WindowsNs.StorageNs.PickersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.Pickers.FileSavePicker")
@js.native
class FileSavePicker () extends IFileSavePicker {
  /* CompleteClass */
  override var commitButtonText: java.lang.String = js.native
  /* CompleteClass */
  override var continuationData: winrtLib.WindowsNs.FoundationNs.CollectionsNs.ValueSet = js.native
  /* CompleteClass */
  override var defaultFileExtension: java.lang.String = js.native
  /* CompleteClass */
  override var fileTypeChoices: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IMap[
    java.lang.String, 
    winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String]
  ] = js.native
  /* CompleteClass */
  override var settingsIdentifier: java.lang.String = js.native
  /* CompleteClass */
  override var suggestedFileName: java.lang.String = js.native
  /* CompleteClass */
  override var suggestedSaveFile: winrtLib.WindowsNs.StorageNs.StorageFile = js.native
  /* CompleteClass */
  override var suggestedStartLocation: PickerLocationId = js.native
  /* CompleteClass */
  override def pickSaveFileAndContinue(): scala.Unit = js.native
  /* CompleteClass */
  override def pickSaveFileAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.StorageNs.StorageFile] = js.native
}

