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
  
  val accountNotActivated: accountNotActivated with java.lang.String = js.native
  val badSim: badSim with java.lang.String = js.native
  val deviceBlocked: deviceBlocked with java.lang.String = js.native
  val deviceHardwareFailure: deviceHardwareFailure with java.lang.String = js.native
  val deviceLocked: deviceLocked with java.lang.String = js.native
  val deviceNotReady: deviceNotReady with java.lang.String = js.native
  val deviceReady: deviceReady with java.lang.String = js.native
  val simNotInserted: simNotInserted with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkDeviceStatus with java.lang.String
  ] = js.native
}

