package typings.winrt.Windows.Networking.BackgroundTransfer

import typings.winrt.Windows.Storage.IStorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBackgroundTransferContentPart extends js.Object {
  def setFile(value: IStorageFile): Unit = js.native
  def setHeader(headerName: String, headerValue: String): Unit = js.native
  def setText(value: String): Unit = js.native
}

object IBackgroundTransferContentPart {
  @scala.inline
  def apply(setFile: IStorageFile => Unit, setHeader: (String, String) => Unit, setText: String => Unit): IBackgroundTransferContentPart = {
    val __obj = js.Dynamic.literal(setFile = js.Any.fromFunction1(setFile), setHeader = js.Any.fromFunction2(setHeader), setText = js.Any.fromFunction1(setText))
    __obj.asInstanceOf[IBackgroundTransferContentPart]
  }
  @scala.inline
  implicit class IBackgroundTransferContentPartOps[Self <: IBackgroundTransferContentPart] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSetFile(value: IStorageFile => Unit): Self = this.set("setFile", js.Any.fromFunction1(value))
    @scala.inline
    def setSetHeader(value: (String, String) => Unit): Self = this.set("setHeader", js.Any.fromFunction2(value))
    @scala.inline
    def setSetText(value: String => Unit): Self = this.set("setText", js.Any.fromFunction1(value))
  }
  
}

