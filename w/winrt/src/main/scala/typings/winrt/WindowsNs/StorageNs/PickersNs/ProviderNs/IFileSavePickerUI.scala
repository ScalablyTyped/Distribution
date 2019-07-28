package typings.winrt.WindowsNs.StorageNs.PickersNs.ProviderNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileSavePickerUI extends js.Object {
  var allowedFileTypes: IVectorView[String]
  var fileName: String
  var onfilenamechanged: js.Any
  var ontargetfilerequested: js.Any
  var settingsIdentifier: String
  var title: String
  def trySetFileName(value: String): SetFileNameResult
}

object IFileSavePickerUI {
  @scala.inline
  def apply(
    allowedFileTypes: IVectorView[String],
    fileName: String,
    onfilenamechanged: js.Any,
    ontargetfilerequested: js.Any,
    settingsIdentifier: String,
    title: String,
    trySetFileName: String => SetFileNameResult
  ): IFileSavePickerUI = {
    val __obj = js.Dynamic.literal(allowedFileTypes = allowedFileTypes, fileName = fileName, onfilenamechanged = onfilenamechanged, ontargetfilerequested = ontargetfilerequested, settingsIdentifier = settingsIdentifier, title = title, trySetFileName = js.Any.fromFunction1(trySetFileName))
  
    __obj.asInstanceOf[IFileSavePickerUI]
  }
}

