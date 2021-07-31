package typings.winrt.Windows.Storage.Pickers

import typings.winrt.Windows.Foundation.Collections.IMap
import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Foundation.Collections.ValueSet
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Storage.StorageFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileSavePicker
  extends StObject
     with IFileSavePicker
object FileSavePicker {
  
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
  ): FileSavePicker = {
    val __obj = js.Dynamic.literal(commitButtonText = commitButtonText.asInstanceOf[js.Any], continuationData = continuationData.asInstanceOf[js.Any], defaultFileExtension = defaultFileExtension.asInstanceOf[js.Any], fileTypeChoices = fileTypeChoices.asInstanceOf[js.Any], pickSaveFileAndContinue = js.Any.fromFunction0(pickSaveFileAndContinue), pickSaveFileAsync = js.Any.fromFunction0(pickSaveFileAsync), settingsIdentifier = settingsIdentifier.asInstanceOf[js.Any], suggestedFileName = suggestedFileName.asInstanceOf[js.Any], suggestedSaveFile = suggestedSaveFile.asInstanceOf[js.Any], suggestedStartLocation = suggestedStartLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSavePicker]
  }
}
