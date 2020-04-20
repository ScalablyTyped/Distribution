package typings.winrt.Windows.Networking.BackgroundTransfer

import typings.winrt.Windows.Storage.IStorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBackgroundTransferContentPart extends js.Object {
  def setFile(value: IStorageFile): Unit
  def setHeader(headerName: String, headerValue: String): Unit
  def setText(value: String): Unit
}

object IBackgroundTransferContentPart {
  @scala.inline
  def apply(setFile: IStorageFile => Unit, setHeader: (String, String) => Unit, setText: String => Unit): IBackgroundTransferContentPart = {
    val __obj = js.Dynamic.literal(setFile = js.Any.fromFunction1(setFile), setHeader = js.Any.fromFunction2(setHeader), setText = js.Any.fromFunction1(setText))
    __obj.asInstanceOf[IBackgroundTransferContentPart]
  }
}

