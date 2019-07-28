package typings.winrt.WindowsNs.DevicesNs.EnumerationNs.PnpNs

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
  
  /* 3 */ val device: typings.winrt.WindowsNs.DevicesNs.EnumerationNs.PnpNs.PnpObjectType.device with Double = js.native
  /* 2 */ val deviceContainer: typings.winrt.WindowsNs.DevicesNs.EnumerationNs.PnpNs.PnpObjectType.deviceContainer with Double = js.native
  /* 1 */ val deviceInterface: typings.winrt.WindowsNs.DevicesNs.EnumerationNs.PnpNs.PnpObjectType.deviceInterface with Double = js.native
  /* 4 */ val deviceInterfaceClass: typings.winrt.WindowsNs.DevicesNs.EnumerationNs.PnpNs.PnpObjectType.deviceInterfaceClass with Double = js.native
  /* 0 */ val unknown: typings.winrt.WindowsNs.DevicesNs.EnumerationNs.PnpNs.PnpObjectType.unknown with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PnpObjectType with Double] = js.native
}

