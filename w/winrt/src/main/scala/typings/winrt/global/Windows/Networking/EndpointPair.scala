package typings.winrt.global.Windows.Networking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.EndpointPair")
@js.native
class EndpointPair protected ()
  extends typings.winrt.Windows.Networking.EndpointPair {
  def this(
    localHostName: typings.winrt.Windows.Networking.HostName,
    localServiceName: String,
    remoteHostName: typings.winrt.Windows.Networking.HostName,
    remoteServiceName: String
  ) = this()
  /* CompleteClass */
  override var localHostName: typings.winrt.Windows.Networking.HostName = js.native
  /* CompleteClass */
  override var localServiceName: String = js.native
  /* CompleteClass */
  override var remoteHostName: typings.winrt.Windows.Networking.HostName = js.native
  /* CompleteClass */
  override var remoteServiceName: String = js.native
}

