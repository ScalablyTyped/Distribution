package typings.winrtDashUwp.Windows.System.RemoteSystems

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.System.RemoteSystems.RemoteSystemDiscoveryType.any
import typings.winrtDashUwp.Windows.System.RemoteSystems.RemoteSystemDiscoveryType.cloud
import typings.winrtDashUwp.Windows.System.RemoteSystems.RemoteSystemDiscoveryType.proximal
import typings.winrtDashUwp.Windows.System.RemoteSystems.RemoteSystemDiscoveryType.spatiallyProximal
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RemoteSystemDiscoveryType with Double] = js.native
  /* 0 */ @js.native
  object any extends TopLevel[any with Double]
  
  /* 2 */ @js.native
  object cloud extends TopLevel[cloud with Double]
  
  /* 1 */ @js.native
  object proximal extends TopLevel[proximal with Double]
  
  /* 3 */ @js.native
  object spatiallyProximal extends TopLevel[spatiallyProximal with Double]
  
}

