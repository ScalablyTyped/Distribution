package typings.winrt.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
