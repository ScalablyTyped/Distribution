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

