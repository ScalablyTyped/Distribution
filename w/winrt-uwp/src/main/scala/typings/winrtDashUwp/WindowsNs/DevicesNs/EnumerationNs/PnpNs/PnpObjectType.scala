package typings.winrtDashUwp.WindowsNs.DevicesNs.EnumerationNs.PnpNs

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
  sealed trait associationEndpoint extends PnpObjectType
  
  /** The PnpObject represents an association endpoint container. */
  @js.native
  sealed trait associationEndpointContainer extends PnpObjectType
  
  /** The PnpObject represents an association endpoint service. */
  @js.native
  sealed trait associationEndpointService extends PnpObjectType
  
  /** The PnpObject represents a device. */
  @js.native
  sealed trait device extends PnpObjectType
  
  /** The PnpObject represents a device container. */
  @js.native
  sealed trait deviceContainer extends PnpObjectType
  
  /** The PnpObject represents a device interface. */
  @js.native
  sealed trait deviceInterface extends PnpObjectType
  
  /** The PnpObject represents a device interface class. */
  @js.native
  sealed trait deviceInterfaceClass extends PnpObjectType
  
  /** The object is of an unknown type. This value is not used. */
  @js.native
  sealed trait unknown extends PnpObjectType
  
  /* 5 */ val associationEndpoint: typings.winrtDashUwp.WindowsNs.DevicesNs.EnumerationNs.PnpNs.PnpObjectType.associationEndpoint with Double = js.native
  /* 6 */ val associationEndpointContainer: typings.winrtDashUwp.WindowsNs.DevicesNs.EnumerationNs.PnpNs.PnpObjectType.associationEndpointContainer with Double = js.native
  /* 7 */ val associationEndpointService: typings.winrtDashUwp.WindowsNs.DevicesNs.EnumerationNs.PnpNs.PnpObjectType.associationEndpointService with Double = js.native
  /* 3 */ val device: typings.winrtDashUwp.WindowsNs.DevicesNs.EnumerationNs.PnpNs.PnpObjectType.device with Double = js.native
  /* 2 */ val deviceContainer: typings.winrtDashUwp.WindowsNs.DevicesNs.EnumerationNs.PnpNs.PnpObjectType.deviceContainer with Double = js.native
  /* 1 */ val deviceInterface: typings.winrtDashUwp.WindowsNs.DevicesNs.EnumerationNs.PnpNs.PnpObjectType.deviceInterface with Double = js.native
  /* 4 */ val deviceInterfaceClass: typings.winrtDashUwp.WindowsNs.DevicesNs.EnumerationNs.PnpNs.PnpObjectType.deviceInterfaceClass with Double = js.native
  /* 0 */ val unknown: typings.winrtDashUwp.WindowsNs.DevicesNs.EnumerationNs.PnpNs.PnpObjectType.unknown with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PnpObjectType with Double] = js.native
}

