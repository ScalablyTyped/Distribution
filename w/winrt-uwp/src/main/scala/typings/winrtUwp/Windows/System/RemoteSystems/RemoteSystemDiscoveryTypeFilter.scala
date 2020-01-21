package typings.winrtUwp.Windows.System.RemoteSystems

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An IRemoteSystemFilter that limits the set of discoverable remote systems by allowing only those of a specific discovery type. */
@JSGlobal("Windows.System.RemoteSystems.RemoteSystemDiscoveryTypeFilter")
@js.native
class RemoteSystemDiscoveryTypeFilter protected () extends IRemoteSystemFilter {
  /** Initializes an instance of the RemoteSystemDiscoveryTypeFilter class. */
  def this(discoveryType: RemoteSystemDiscoveryType) = this()
  /** String representation(s) of the device type(s) that the containing RemoteSystemKindFilter object targets. */
  var remoteSystemKinds: IVectorView[String] = js.native
}

