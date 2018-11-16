package typings
package winrtLib.WindowsNs.StorageNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.Provider.FileUpdateRequest")
@js.native
class FileUpdateRequest () extends IFileUpdateRequest {
  /* CompleteClass */
  override var contentId: java.lang.String = js.native
  /* CompleteClass */
  override var file: winrtLib.WindowsNs.StorageNs.StorageFile = js.native
  /* CompleteClass */
  override var status: FileUpdateStatus = js.native
  /* CompleteClass */
  override def getDeferral(): FileUpdateRequestDeferral = js.native
  /* CompleteClass */
  override def updateLocalFile(value: winrtLib.WindowsNs.StorageNs.IStorageFile): scala.Unit = js.native
}

