package typings.winrtUwp.Windows.Devices.Enumeration.Pnp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
