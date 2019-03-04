package typings
package winrtLib.WindowsNs.StorageNs.PickersNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileSavePickerUI extends js.Object {
  var allowedFileTypes: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String]
  var fileName: java.lang.String
  var onfilenamechanged: js.Any
  var ontargetfilerequested: js.Any
  var settingsIdentifier: java.lang.String
  var title: java.lang.String
  def trySetFileName(value: java.lang.String): SetFileNameResult
}

object IFileSavePickerUI {
  @scala.inline
  def apply(
    allowedFileTypes: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String],
    fileName: java.lang.String,
    onfilenamechanged: js.Any,
    ontargetfilerequested: js.Any,
    settingsIdentifier: java.lang.String,
    title: java.lang.String,
    trySetFileName: js.Function1[java.lang.String, SetFileNameResult]
  ): IFileSavePickerUI = {
    val __obj = js.Dynamic.literal(allowedFileTypes = allowedFileTypes, fileName = fileName, onfilenamechanged = onfilenamechanged, ontargetfilerequested = ontargetfilerequested, settingsIdentifier = settingsIdentifier, title = title, trySetFileName = trySetFileName)
  
    __obj.asInstanceOf[IFileSavePickerUI]
  }
}

