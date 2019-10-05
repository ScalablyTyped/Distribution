package typings.winrt.Windows.Networking.Sockets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ControlChannelTriggerResourceType extends js.Object

@JSGlobal("Windows.Networking.Sockets.ControlChannelTriggerResourceType")
@js.native
object ControlChannelTriggerResourceType extends js.Object {
  @js.native
  sealed trait requestHardwareSlot extends ControlChannelTriggerResourceType
  
  @js.native
  sealed trait requestSoftwareSlot extends ControlChannelTriggerResourceType
  
  /* 1 */ val requestHardwareSlot: typings.winrt.Windows.Networking.Sockets.ControlChannelTriggerResourceType.requestHardwareSlot with Double = js.native
  /* 0 */ val requestSoftwareSlot: typings.winrt.Windows.Networking.Sockets.ControlChannelTriggerResourceType.requestSoftwareSlot with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ControlChannelTriggerResourceType with Double] = js.native
}

