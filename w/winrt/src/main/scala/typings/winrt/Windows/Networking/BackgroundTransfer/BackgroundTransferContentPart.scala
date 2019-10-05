package typings.winrt.Windows.Networking.BackgroundTransfer

import typings.winrt.Windows.Storage.IStorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundTransferContentPart")
@js.native
class BackgroundTransferContentPart () extends IBackgroundTransferContentPart {
  def this(name: String) = this()
  def this(name: String, fileName: String) = this()
  /* CompleteClass */
  override def setFile(value: IStorageFile): Unit = js.native
  /* CompleteClass */
  override def setHeader(headerName: String, headerValue: String): Unit = js.native
  /* CompleteClass */
  override def setText(value: String): Unit = js.native
}

