package typings
package winrtLib.WindowsNs.NetworkingNs.SocketsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.Sockets.StreamSocketListener")
@js.native
class StreamSocketListener () extends IStreamSocketListener {
  /* CompleteClass */
  override var control: StreamSocketListenerControl = js.native
  /* CompleteClass */
  override var information: StreamSocketListenerInformation = js.native
  /* CompleteClass */
  override var onconnectionreceived: js.Any = js.native
  /* CompleteClass */
  override def bindEndpointAsync(localHostName: winrtLib.WindowsNs.NetworkingNs.HostName, localServiceName: java.lang.String): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  /* CompleteClass */
  override def bindServiceNameAsync(localServiceName: java.lang.String): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  /* CompleteClass */
  override def close(): scala.Unit = js.native
  def dispose(): scala.Unit = js.native
}

