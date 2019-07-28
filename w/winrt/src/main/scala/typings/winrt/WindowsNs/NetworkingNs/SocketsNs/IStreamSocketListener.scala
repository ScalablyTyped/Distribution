package typings.winrt.WindowsNs.NetworkingNs.SocketsNs

import typings.winrt.WindowsNs.FoundationNs.IAsyncAction
import typings.winrt.WindowsNs.FoundationNs.IClosable
import typings.winrt.WindowsNs.NetworkingNs.HostName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStreamSocketListener extends IClosable {
  var control: StreamSocketListenerControl
  var information: StreamSocketListenerInformation
  var onconnectionreceived: js.Any
  def bindEndpointAsync(localHostName: HostName, localServiceName: String): IAsyncAction
  def bindServiceNameAsync(localServiceName: String): IAsyncAction
}

object IStreamSocketListener {
  @scala.inline
  def apply(
    bindEndpointAsync: (HostName, String) => IAsyncAction,
    bindServiceNameAsync: String => IAsyncAction,
    close: () => Unit,
    control: StreamSocketListenerControl,
    information: StreamSocketListenerInformation,
    onconnectionreceived: js.Any
  ): IStreamSocketListener = {
    val __obj = js.Dynamic.literal(bindEndpointAsync = js.Any.fromFunction2(bindEndpointAsync), bindServiceNameAsync = js.Any.fromFunction1(bindServiceNameAsync), close = js.Any.fromFunction0(close), control = control, information = information, onconnectionreceived = onconnectionreceived)
  
    __obj.asInstanceOf[IStreamSocketListener]
  }
}

