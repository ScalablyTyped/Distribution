package typings.winrt.Windows.Storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStreamedFileDataRequest extends js.Object {
  def failAndClose(failureMode: StreamedFileFailureMode): Unit = js.native
}

object IStreamedFileDataRequest {
  @scala.inline
  def apply(failAndClose: StreamedFileFailureMode => Unit): IStreamedFileDataRequest = {
    val __obj = js.Dynamic.literal(failAndClose = js.Any.fromFunction1(failAndClose))
    __obj.asInstanceOf[IStreamedFileDataRequest]
  }
  @scala.inline
  implicit class IStreamedFileDataRequestOps[Self <: IStreamedFileDataRequest] (val x: Self) extends AnyVal {
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
    def setFailAndClose(value: StreamedFileFailureMode => Unit): Self = this.set("failAndClose", js.Any.fromFunction1(value))
  }
  
}

