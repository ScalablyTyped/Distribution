package typings.winrtUwp.Windows.Devices.AllJoyn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AllJoynBusAttachmentState extends StObject
/** Defines values used to indicate the state of a connection with an AllJoyn bus that is managed by an AllJoynBusAttachment object. */
@JSGlobal("Windows.Devices.AllJoyn.AllJoynBusAttachmentState")
@js.native
object AllJoynBusAttachmentState extends StObject {
  
  /** Currently connected to the bus. */
  @js.native
  sealed trait connected
    extends StObject
       with AllJoynBusAttachmentState
  
  /** Connecting to the bus. */
  @js.native
  sealed trait connecting
    extends StObject
       with AllJoynBusAttachmentState
  
  /** Disconnected from the bus. */
  @js.native
  sealed trait disconnected
    extends StObject
       with AllJoynBusAttachmentState
  
  /** Currently disconnecting from the bus. */
  @js.native
  sealed trait disconnecting
    extends StObject
       with AllJoynBusAttachmentState
}
