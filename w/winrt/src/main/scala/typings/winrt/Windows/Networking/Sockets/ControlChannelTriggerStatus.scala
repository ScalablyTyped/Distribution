package typings.winrt.Windows.Networking.Sockets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ControlChannelTriggerStatus extends StObject
@JSGlobal("Windows.Networking.Sockets.ControlChannelTriggerStatus")
@js.native
object ControlChannelTriggerStatus extends StObject {
  
  @js.native
  sealed trait hardwareSlotAllocated
    extends StObject
       with ControlChannelTriggerStatus
  
  @js.native
  sealed trait hardwareSlotRequested
    extends StObject
       with ControlChannelTriggerStatus
  
  @js.native
  sealed trait policyError
    extends StObject
       with ControlChannelTriggerStatus
  
  @js.native
  sealed trait serviceUnavailable
    extends StObject
       with ControlChannelTriggerStatus
  
  @js.native
  sealed trait softwareSlotAllocated
    extends StObject
       with ControlChannelTriggerStatus
  
  @js.native
  sealed trait systemError
    extends StObject
       with ControlChannelTriggerStatus
  
  @js.native
  sealed trait transportDisconnected
    extends StObject
       with ControlChannelTriggerStatus
}
