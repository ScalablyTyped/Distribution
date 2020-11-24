package typings.winrt.Windows.Networking.Sockets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ControlChannelTriggerResourceType extends js.Object
@JSGlobal("Windows.Networking.Sockets.ControlChannelTriggerResourceType")
@js.native
object ControlChannelTriggerResourceType extends js.Object {
  
  @js.native
  sealed trait requestHardwareSlot extends ControlChannelTriggerResourceType
  
  @js.native
  sealed trait requestSoftwareSlot extends ControlChannelTriggerResourceType
}
