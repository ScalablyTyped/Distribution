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

object IFileUpdateRequest {
  @scala.inline
  def apply(
    contentId: java.lang.String,
    file: winrtLib.WindowsNs.StorageNs.StorageFile,
    getDeferral: () => FileUpdateRequestDeferral,
    status: FileUpdateStatus,
    updateLocalFile: winrtLib.WindowsNs.StorageNs.IStorageFile => scala.Unit
  ): IFileUpdateRequest = {
    val __obj = js.Dynamic.literal(contentId = contentId, file = file, getDeferral = js.Any.fromFunction0(getDeferral), status = status, updateLocalFile = js.Any.fromFunction1(updateLocalFile))
  
    __obj.asInstanceOf[IFileUpdateRequest]
  }
}

