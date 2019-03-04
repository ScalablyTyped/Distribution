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
    getDeferral: js.Function0[FileUpdateRequestDeferral],
    status: FileUpdateStatus,
    updateLocalFile: js.Function1[winrtLib.WindowsNs.StorageNs.IStorageFile, scala.Unit]
  ): IFileUpdateRequest = {
    val __obj = js.Dynamic.literal(contentId = contentId, file = file, getDeferral = getDeferral, status = status, updateLocalFile = updateLocalFile)
  
    __obj.asInstanceOf[IFileUpdateRequest]
  }
}

