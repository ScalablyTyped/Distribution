package typings
package winrtLib.WindowsNs.StorageNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IFileUpdateRequest extends js.Object {
  var contentId: java.lang.String
  var file: winrtLib.WindowsNs.StorageNs.StorageFile
  var status: FileUpdateStatus
  def getDeferral(): FileUpdateRequestDeferral
  def updateLocalFile(value: winrtLib.WindowsNs.StorageNs.IStorageFile): scala.Unit
}

