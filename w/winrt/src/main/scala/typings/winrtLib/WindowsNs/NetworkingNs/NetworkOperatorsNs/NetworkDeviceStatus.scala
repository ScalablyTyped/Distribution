package typings
package winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NetworkDeviceStatus extends js.Object

@JSGlobal("Windows.Networking.NetworkOperators.NetworkDeviceStatus")
@js.native
object NetworkDeviceStatus extends js.Object {
  @js.native
  sealed trait accountNotActivated
    extends winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkDeviceStatus
  
  @js.native
  sealed trait badSim
    extends winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkDeviceStatus
  
  @js.native
  sealed trait deviceBlocked
    extends winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkDeviceStatus
  
  @js.native
  sealed trait deviceHardwareFailure
    extends winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkDeviceStatus
  
  @js.native
  sealed trait deviceLocked
    extends winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkDeviceStatus
  
  @js.native
  sealed trait deviceNotReady
    extends winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkDeviceStatus
  
  @js.native
  sealed trait deviceReady
    extends winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkDeviceStatus
  
  @js.native
  sealed trait simNotInserted
    extends winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkDeviceStatus
  
  /* 5 */ val accountNotActivated: accountNotActivated with scala.Double = js.native
  /* 3 */ val badSim: badSim with scala.Double = js.native
  /* 7 */ val deviceBlocked: deviceBlocked with scala.Double = js.native
  /* 4 */ val deviceHardwareFailure: deviceHardwareFailure with scala.Double = js.native
  /* 6 */ val deviceLocked: deviceLocked with scala.Double = js.native
  /* 0 */ val deviceNotReady: deviceNotReady with scala.Double = js.native
  /* 1 */ val deviceReady: deviceReady with scala.Double = js.native
  /* 2 */ val simNotInserted: simNotInserted with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkDeviceStatus with scala.Double
  ] = js.native
}

