package typings.winrt.Windows.Networking.Sockets

import typings.winrt.Windows.Foundation.IAsyncAction
import typings.winrt.Windows.Networking.HostName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamSocketListener extends IStreamSocketListener {
  def dispose(): Unit = js.native
}

object StreamSocketListener {
  @scala.inline
  def apply(
    bindEndpointAsync: (HostName, String) => IAsyncAction,
    bindServiceNameAsync: String => IAsyncAction,
    close: () => Unit,
    control: StreamSocketListenerControl,
    dispose: () => Unit,
    information: StreamSocketListenerInformation,
    onconnectionreceived: js.Any
  ): StreamSocketListener = {
    val __obj = js.Dynamic.literal(bindEndpointAsync = js.Any.fromFunction2(bindEndpointAsync), bindServiceNameAsync = js.Any.fromFunction1(bindServiceNameAsync), close = js.Any.fromFunction0(close), control = control.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), information = information.asInstanceOf[js.Any], onconnectionreceived = onconnectionreceived.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamSocketListener]
  }
  @scala.inline
  implicit class StreamSocketListenerOps[Self <: StreamSocketListener] (val x: Self) extends AnyVal {
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
    def setDispose(value: () => Unit): Self = this.set("dispose", js.Any.fromFunction0(value))
  }
  
}

