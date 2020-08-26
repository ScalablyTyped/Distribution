package typings.winston.transportsMod

import typings.node.NodeJS.WritableStream
import typings.winstonTransport.mod.TransportStreamOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamTransportOptions extends TransportStreamOptions {
  var eol: js.UndefOr[String] = js.native
  var stream: WritableStream = js.native
}

object StreamTransportOptions {
  @scala.inline
  def apply(stream: WritableStream): StreamTransportOptions = {
    val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamTransportOptions]
  }
  @scala.inline
  implicit class StreamTransportOptionsOps[Self <: StreamTransportOptions] (val x: Self) extends AnyVal {
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
    def setStream(value: WritableStream): Self = this.set("stream", value.asInstanceOf[js.Any])
    @scala.inline
    def setEol(value: String): Self = this.set("eol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEol: Self = this.set("eol", js.undefined)
  }
  
}

