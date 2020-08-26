package typings.winrt.Windows.Storage.Pickers.Provider

import typings.winrt.Windows.Storage.IStorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetFileRequest extends ITargetFileRequest

object TargetFileRequest {
  @scala.inline
  def apply(getDeferral: () => TargetFileRequestDeferral, targetFile: IStorageFile): TargetFileRequest = {
    val __obj = js.Dynamic.literal(getDeferral = js.Any.fromFunction0(getDeferral), targetFile = targetFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetFileRequest]
  }
}

