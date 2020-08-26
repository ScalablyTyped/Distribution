package typings.winrtUwp.Windows.Networking.Sockets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides socket information on a StreamSocketListener object. */
@js.native
trait StreamSocketListenerInformation extends js.Object {
  /** Get the local TCP port number associated with a StreamSocketListener object. */
  var localPort: String = js.native
}

object StreamSocketListenerInformation {
  @scala.inline
  def apply(localPort: String): StreamSocketListenerInformation = {
    val __obj = js.Dynamic.literal(localPort = localPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamSocketListenerInformation]
  }
  @scala.inline
  implicit class StreamSocketListenerInformationOps[Self <: StreamSocketListenerInformation] (val x: Self) extends AnyVal {
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
    def setLocalPort(value: String): Self = this.set("localPort", value.asInstanceOf[js.Any])
  }
  
}

