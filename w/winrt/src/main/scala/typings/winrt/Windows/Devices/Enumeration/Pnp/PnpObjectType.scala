package typings.winrt.Windows.Devices.Enumeration.Pnp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PnpObjectType extends js.Object

@JSGlobal("Windows.Devices.Enumeration.Pnp.PnpObjectType")
@js.native
object PnpObjectType extends js.Object {
  @js.native
  sealed trait device extends PnpObjectType
  
  @js.native
  sealed trait deviceContainer extends PnpObjectType
  
  @js.native
  sealed trait deviceInterface extends PnpObjectType
  
  @js.native
  sealed trait deviceInterfaceClass extends PnpObjectType
  
  @js.native
  sealed trait unknown extends PnpObjectType
  
  /* 3 */ val device: typings.winrt.Windows.Devices.Enumeration.Pnp.PnpObjectType.device with Double = js.native
  /* 2 */ val deviceContainer: typings.winrt.Windows.Devices.Enumeration.Pnp.PnpObjectType.deviceContainer with Double = js.native
  /* 1 */ val deviceInterface: typings.winrt.Windows.Devices.Enumeration.Pnp.PnpObjectType.deviceInterface with Double = js.native
  /* 4 */ val deviceInterfaceClass: typings.winrt.Windows.Devices.Enumeration.Pnp.PnpObjectType.deviceInterfaceClass with Double = js.native
  /* 0 */ val unknown: typings.winrt.Windows.Devices.Enumeration.Pnp.PnpObjectType.unknown with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PnpObjectType with Double] = js.native
}

