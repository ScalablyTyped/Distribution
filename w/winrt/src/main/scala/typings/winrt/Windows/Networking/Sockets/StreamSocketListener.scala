package typings.winrt.Windows.Networking.Sockets

import typings.winrt.Windows.Foundation.IAsyncAction
import typings.winrt.Windows.Networking.HostName
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
  override def bindEndpointAsync(localHostName: HostName, localServiceName: String): IAsyncAction = js.native
  /* CompleteClass */
  override def bindServiceNameAsync(localServiceName: String): IAsyncAction = js.native
  /* CompleteClass */
  override def close(): Unit = js.native
  def dispose(): Unit = js.native
}

