package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.PnpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PnpObjectType extends js.Object

/** Indicates the device type of a PnpObject . */
@JSGlobal("Windows.Devices.Enumeration.Pnp.PnpObjectType")
@js.native
object PnpObjectType extends js.Object {
  /** The PnpObject represents an association endpoint. */
  @js.native
  sealed trait associationEndpoint
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.PnpNs.PnpObjectType
  
  /** The PnpObject represents an association endpoint container. */
  @js.native
  sealed trait associationEndpointContainer
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.PnpNs.PnpObjectType
  
  /** The PnpObject represents an association endpoint service. */
  @js.native
  sealed trait associationEndpointService
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.PnpNs.PnpObjectType
  
  /** The PnpObject represents a device. */
  @js.native
  sealed trait device
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.PnpNs.PnpObjectType
  
  /** The PnpObject represents a device container. */
  @js.native
  sealed trait deviceContainer
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.PnpNs.PnpObjectType
  
  /** The PnpObject represents a device interface. */
  @js.native
  sealed trait deviceInterface
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.PnpNs.PnpObjectType
  
  /** The PnpObject represents a device interface class. */
  @js.native
  sealed trait deviceInterfaceClass
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.PnpNs.PnpObjectType
  
  /** The object is of an unknown type. This value is not used. */
  @js.native
  sealed trait unknown
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.PnpNs.PnpObjectType
  
  val associationEndpoint: associationEndpoint with java.lang.String = js.native
  val associationEndpointContainer: associationEndpointContainer with java.lang.String = js.native
  val associationEndpointService: associationEndpointService with java.lang.String = js.native
  val device: device with java.lang.String = js.native
  val deviceContainer: deviceContainer with java.lang.String = js.native
  val deviceInterface: deviceInterface with java.lang.String = js.native
  val deviceInterfaceClass: deviceInterfaceClass with java.lang.String = js.native
  val unknown: unknown with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.PnpNs.PnpObjectType with java.lang.String
  ] = js.native
}

