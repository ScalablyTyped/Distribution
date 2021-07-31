package typings.winrt.Windows.Networking.Sockets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ControlChannelTriggerResourceType extends StObject
@JSGlobal("Windows.Networking.Sockets.ControlChannelTriggerResourceType")
@js.native
object ControlChannelTriggerResourceType extends StObject {
  
  @js.native
  sealed trait requestHardwareSlot
    extends StObject
       with ControlChannelTriggerResourceType
  
  @js.native
  sealed trait requestSoftwareSlot
    extends StObject
       with ControlChannelTriggerResourceType
}
