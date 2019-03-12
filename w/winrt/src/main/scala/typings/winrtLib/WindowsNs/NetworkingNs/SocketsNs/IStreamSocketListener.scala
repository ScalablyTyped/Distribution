package typings
package winrtLib.WindowsNs.NetworkingNs.SocketsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStreamSocketListener
  extends winrtLib.WindowsNs.FoundationNs.IClosable {
  var control: StreamSocketListenerControl
  var information: StreamSocketListenerInformation
  var onconnectionreceived: js.Any
  def bindEndpointAsync(localHostName: winrtLib.WindowsNs.NetworkingNs.HostName, localServiceName: java.lang.String): winrtLib.WindowsNs.FoundationNs.IAsyncAction
  def bindServiceNameAsync(localServiceName: java.lang.String): winrtLib.WindowsNs.FoundationNs.IAsyncAction
}

object IStreamSocketListener {
  @scala.inline
  def apply(
    bindEndpointAsync: (winrtLib.WindowsNs.NetworkingNs.HostName, java.lang.String) => winrtLib.WindowsNs.FoundationNs.IAsyncAction,
    bindServiceNameAsync: java.lang.String => winrtLib.WindowsNs.FoundationNs.IAsyncAction,
    close: () => scala.Unit,
    control: StreamSocketListenerControl,
    information: StreamSocketListenerInformation,
    onconnectionreceived: js.Any
  ): IStreamSocketListener = {
    val __obj = js.Dynamic.literal(bindEndpointAsync = js.Any.fromFunction2(bindEndpointAsync), bindServiceNameAsync = js.Any.fromFunction1(bindServiceNameAsync), close = js.Any.fromFunction0(close), control = control, information = information, onconnectionreceived = onconnectionreceived)
  
    __obj.asInstanceOf[IStreamSocketListener]
  }
}

