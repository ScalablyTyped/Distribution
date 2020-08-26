package typings.vscodeJsonrpc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TraceOptions extends js.Object {
  var sendNotification: js.UndefOr[Boolean] = js.native
  var traceFormat: js.UndefOr[TraceFormat] = js.native
}

object TraceOptions {
  @scala.inline
  def apply(): TraceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TraceOptions]
  }
  @scala.inline
  implicit class TraceOptionsOps[Self <: TraceOptions] (val x: Self) extends AnyVal {
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
    def setSendNotification(value: Boolean): Self = this.set("sendNotification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSendNotification: Self = this.set("sendNotification", js.undefined)
    @scala.inline
    def setTraceFormat(value: TraceFormat): Self = this.set("traceFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTraceFormat: Self = this.set("traceFormat", js.undefined)
  }
  
}

