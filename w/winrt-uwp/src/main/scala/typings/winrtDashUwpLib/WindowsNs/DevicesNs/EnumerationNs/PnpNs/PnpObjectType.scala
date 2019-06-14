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
  
  /* 5 */ val associationEndpoint: associationEndpoint with scala.Double = js.native
  /* 6 */ val associationEndpointContainer: associationEndpointContainer with scala.Double = js.native
  /* 7 */ val associationEndpointService: associationEndpointService with scala.Double = js.native
  /* 3 */ val device: device with scala.Double = js.native
  /* 2 */ val deviceContainer: deviceContainer with scala.Double = js.native
  /* 1 */ val deviceInterface: deviceInterface with scala.Double = js.native
  /* 4 */ val deviceInterfaceClass: deviceInterfaceClass with scala.Double = js.native
  /* 0 */ val unknown: unknown with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.PnpNs.PnpObjectType with scala.Double
  ] = js.native
}

