package typings.winrtUwp.global.Windows.System.RemoteSystems

import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An IRemoteSystemFilter that limits the set of discoverable remote systems by allowing only those of specific device types. */
@JSGlobal("Windows.System.RemoteSystems.RemoteSystemKindFilter")
@js.native
class RemoteSystemKindFilter protected ()
  extends typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemKindFilter {
  /** Initializes an instance of the RemoteSystemKindFilter class with a list of string representations of device types to target. These strings should conform to the values of the properties of the RemoteSystemKinds class. */
  def this(remoteSystemKinds: IIterable[String]) = this()
  /** String representation(s) of the device type(s) that the containing RemoteSystemKindFilter object targets. */
  /* CompleteClass */
  override var remoteSystemKinds: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemKinds = js.native
}

