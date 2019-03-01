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
    getDeferral: js.Function0[TargetFileRequestDeferral],
    targetFile: winrtLib.WindowsNs.StorageNs.IStorageFile
  ): ITargetFileRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getDeferral")(getDeferral)
    __obj.updateDynamic("targetFile")(targetFile)
    __obj.asInstanceOf[ITargetFileRequest]
  }
}

