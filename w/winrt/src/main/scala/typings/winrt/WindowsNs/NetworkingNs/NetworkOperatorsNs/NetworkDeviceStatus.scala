package typings.winrt.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NetworkDeviceStatus extends js.Object

@JSGlobal("Windows.Networking.NetworkOperators.NetworkDeviceStatus")
@js.native
object NetworkDeviceStatus extends js.Object {
  @js.native
  sealed trait accountNotActivated extends NetworkDeviceStatus
  
  @js.native
  sealed trait badSim extends NetworkDeviceStatus
  
  @js.native
  sealed trait deviceBlocked extends NetworkDeviceStatus
  
  @js.native
  sealed trait deviceHardwareFailure extends NetworkDeviceStatus
  
  @js.native
  sealed trait deviceLocked extends NetworkDeviceStatus
  
  @js.native
  sealed trait deviceNotReady extends NetworkDeviceStatus
  
  @js.native
  sealed trait deviceReady extends NetworkDeviceStatus
  
  @js.native
  sealed trait simNotInserted extends NetworkDeviceStatus
  
  /* 5 */ val accountNotActivated: typings.winrt.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkDeviceStatus.accountNotActivated with Double = js.native
  /* 3 */ val badSim: typings.winrt.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkDeviceStatus.badSim with Double = js.native
  /* 7 */ val deviceBlocked: typings.winrt.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkDeviceStatus.deviceBlocked with Double = js.native
  /* 4 */ val deviceHardwareFailure: typings.winrt.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkDeviceStatus.deviceHardwareFailure with Double = js.native
  /* 6 */ val deviceLocked: typings.winrt.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkDeviceStatus.deviceLocked with Double = js.native
  /* 0 */ val deviceNotReady: typings.winrt.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkDeviceStatus.deviceNotReady with Double = js.native
  /* 1 */ val deviceReady: typings.winrt.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkDeviceStatus.deviceReady with Double = js.native
  /* 2 */ val simNotInserted: typings.winrt.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkDeviceStatus.simNotInserted with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NetworkDeviceStatus with Double] = js.native
}

