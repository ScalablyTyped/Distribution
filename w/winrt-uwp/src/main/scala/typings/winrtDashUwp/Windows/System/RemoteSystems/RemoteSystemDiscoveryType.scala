package typings.winrtDashUwp.Windows.System.RemoteSystems

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
  
  /* 0 */ val any: typings.winrtDashUwp.Windows.System.RemoteSystems.RemoteSystemDiscoveryType.any with Double = js.native
  /* 2 */ val cloud: typings.winrtDashUwp.Windows.System.RemoteSystems.RemoteSystemDiscoveryType.cloud with Double = js.native
  /* 1 */ val proximal: typings.winrtDashUwp.Windows.System.RemoteSystems.RemoteSystemDiscoveryType.proximal with Double = js.native
  /* 3 */ val spatiallyProximal: typings.winrtDashUwp.Windows.System.RemoteSystems.RemoteSystemDiscoveryType.spatiallyProximal with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RemoteSystemDiscoveryType with Double] = js.native
}

