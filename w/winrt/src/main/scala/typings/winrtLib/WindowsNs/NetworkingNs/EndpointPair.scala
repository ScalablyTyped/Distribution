package typings
package winrtLib.WindowsNs.NetworkingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.EndpointPair")
@js.native
class EndpointPair protected () extends IEndpointPair {
  def this(localHostName: HostName, localServiceName: java.lang.String, remoteHostName: HostName, remoteServiceName: java.lang.String) = this()
  /* CompleteClass */
  override var localHostName: HostName = js.native
  /* CompleteClass */
  override var localServiceName: java.lang.String = js.native
  /* CompleteClass */
  override var remoteHostName: HostName = js.native
  /* CompleteClass */
  override var remoteServiceName: java.lang.String = js.native
}

