package typings
package winrtLib.WindowsNs.StorageNs.PickersNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileOpenPickerUI extends js.Object {
  var allowedFileTypes: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String]
  var onclosing: js.Any
  var onfileremoved: js.Any
  var selectionMode: FileSelectionMode
  var settingsIdentifier: java.lang.String
  var title: java.lang.String
  def addFile(id: java.lang.String, file: winrtLib.WindowsNs.StorageNs.IStorageFile): AddFileResult
  def canAddFile(file: winrtLib.WindowsNs.StorageNs.IStorageFile): scala.Boolean
  def containsFile(id: java.lang.String): scala.Boolean
  def removeFile(id: java.lang.String): scala.Unit
}

