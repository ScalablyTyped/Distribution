package typings.winrt.Windows.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAsyncInfo extends js.Object {
  var errorCode: Double = js.native
  var id: Double = js.native
  var status: AsyncStatus = js.native
  def cancel(): Unit = js.native
  def close(): Unit = js.native
}

object IAsyncInfo {
  @scala.inline
  def apply(cancel: () => Unit, close: () => Unit, errorCode: Double, id: Double, status: AsyncStatus): IAsyncInfo = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), close = js.Any.fromFunction0(close), errorCode = errorCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAsyncInfo]
  }
  @scala.inline
  implicit class IAsyncInfoOps[Self <: IAsyncInfo] (val x: Self) extends AnyVal {
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
    def setCancel(value: () => Unit): Self = this.set("cancel", js.Any.fromFunction0(value))
    @scala.inline
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    @scala.inline
    def setErrorCode(value: Double): Self = this.set("errorCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: AsyncStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

