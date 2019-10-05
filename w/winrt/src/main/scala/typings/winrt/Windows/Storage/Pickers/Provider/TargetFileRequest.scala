package typings.winrt.Windows.Storage.Pickers.Provider

import typings.winrt.Windows.Storage.IStorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.Pickers.Provider.TargetFileRequest")
@js.native
class TargetFileRequest () extends ITargetFileRequest {
  /* CompleteClass */
  override var targetFile: IStorageFile = js.native
  /* CompleteClass */
  override def getDeferral(): TargetFileRequestDeferral = js.native
}

