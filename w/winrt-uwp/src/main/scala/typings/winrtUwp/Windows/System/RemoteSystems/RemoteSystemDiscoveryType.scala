package typings.winrtUwp.Windows.System.RemoteSystems

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RemoteSystemDiscoveryType extends js.Object

/** Contains the values that describe how remote systems are able to be discovered. */
@JSGlobal("Windows.System.RemoteSystems.RemoteSystemDiscoveryType")
@js.native
object RemoteSystemDiscoveryType extends js.Object {
  /** Remote systems are discoverable both through a proximal connection and through cloud connection. */
  @js.native
  sealed trait any extends RemoteSystemDiscoveryType
  
  /** Remote systems are only discoverable through cloud connection. */
  @js.native
  sealed trait cloud extends RemoteSystemDiscoveryType
  
  /** Remote systems are only discoverable through a proximal connection, such as a local network or Bluetooth connection. */
  @js.native
  sealed trait proximal extends RemoteSystemDiscoveryType
  
  /** Remote systems are discoverable through a proximal connection and are expected to be spatially near to the client device. */
  @js.native
  sealed trait spatiallyProximal extends RemoteSystemDiscoveryType
  
}

