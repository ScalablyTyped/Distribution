package typings.winrtUwp.global.Windows.Devices.AllJoyn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a connection to the underlying communication pipeline (transport agnostic) that AllJoyn uses to communicate with other endpoints regardless of the transport. */
@JSGlobal("Windows.Devices.AllJoyn.AllJoynBusAttachment")
@js.native
/** Generates an AllJoynBusAttachment object using the default named pipe connection specification. */
class AllJoynBusAttachment ()
  extends typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynBusAttachment {
  /**
    * Generates an AllJoynBusAttachment object using the provided connection specification.
    * @param connectionSpecification Specification used to initiate and maintain connections to a router node (bus). Windows 10 supports the 'npipe:' transport, formatted according to the D-Bus Specification.
    */
  def this(connectionSpecification: String) = this()
}
