package typings.winrt.Windows.Networking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.EndpointPair")
@js.native
class EndpointPair protected () extends IEndpointPair {
  def this(
    localHostName: HostName,
    localServiceName: String,
    remoteHostName: HostName,
    remoteServiceName: String
  ) = this()
  /* CompleteClass */
  override var localHostName: HostName = js.native
  /* CompleteClass */
  override var localServiceName: String = js.native
  /* CompleteClass */
  override var remoteHostName: HostName = js.native
  /* CompleteClass */
  override var remoteServiceName: String = js.native
}

