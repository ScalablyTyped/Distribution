package typings
package winrtLib.WindowsNs.StorageNs.PickersNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITargetFileRequest extends js.Object {
  var targetFile: winrtLib.WindowsNs.StorageNs.IStorageFile
  def getDeferral(): TargetFileRequestDeferral
}

object ITargetFileRequest {
  @scala.inline
  def apply(
    getDeferral: () => TargetFileRequestDeferral,
    targetFile: winrtLib.WindowsNs.StorageNs.IStorageFile
  ): ITargetFileRequest = {
    val __obj = js.Dynamic.literal(getDeferral = js.Any.fromFunction0(getDeferral), targetFile = targetFile)
  
    __obj.asInstanceOf[ITargetFileRequest]
  }
}

