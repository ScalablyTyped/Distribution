package typings.winrt.Windows.Networking.Sockets

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.Networking.Sockets.ControlChannelTriggerResourceType.requestHardwareSlot
import typings.winrt.Windows.Networking.Sockets.ControlChannelTriggerResourceType.requestSoftwareSlot
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ControlChannelTriggerResourceType with Double] = js.native
  /* 1 */ @js.native
  object requestHardwareSlot extends TopLevel[requestHardwareSlot with Double]
  
  /* 0 */ @js.native
  object requestSoftwareSlot extends TopLevel[requestSoftwareSlot with Double]
  
}

