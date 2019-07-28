package typings.winrt.WindowsNs.StorageNs.PickersNs.ProviderNs

import typings.winrt.WindowsNs.StorageNs.IStorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITargetFileRequest extends js.Object {
  var targetFile: IStorageFile
  def getDeferral(): TargetFileRequestDeferral
}

object ITargetFileRequest {
  @scala.inline
  def apply(getDeferral: () => TargetFileRequestDeferral, targetFile: IStorageFile): ITargetFileRequest = {
    val __obj = js.Dynamic.literal(getDeferral = js.Any.fromFunction0(getDeferral), targetFile = targetFile)
  
    __obj.asInstanceOf[ITargetFileRequest]
  }
}

