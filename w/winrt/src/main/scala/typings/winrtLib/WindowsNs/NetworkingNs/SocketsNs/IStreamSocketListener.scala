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

