package typings
package winrtLib.WindowsNs.DevicesNs.EnumerationNs.PnpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PnpObjectType extends js.Object

@JSGlobal("Windows.Devices.Enumeration.Pnp.PnpObjectType")
@js.native
object PnpObjectType extends js.Object {
  @js.native
  sealed trait device
    extends winrtLib.WindowsNs.DevicesNs.EnumerationNs.PnpNs.PnpObjectType
  
  @js.native
  sealed trait deviceContainer
    extends winrtLib.WindowsNs.DevicesNs.EnumerationNs.PnpNs.PnpObjectType
  
  @js.native
  sealed trait deviceInterface
    extends winrtLib.WindowsNs.DevicesNs.EnumerationNs.PnpNs.PnpObjectType
  
  @js.native
  sealed trait deviceInterfaceClass
    extends winrtLib.WindowsNs.DevicesNs.EnumerationNs.PnpNs.PnpObjectType
  
  @js.native
  sealed trait unknown
    extends winrtLib.WindowsNs.DevicesNs.EnumerationNs.PnpNs.PnpObjectType
  
  /* 3 */ val device: device with scala.Double = js.native
  /* 2 */ val deviceContainer: deviceContainer with scala.Double = js.native
  /* 1 */ val deviceInterface: deviceInterface with scala.Double = js.native
  /* 4 */ val deviceInterfaceClass: deviceInterfaceClass with scala.Double = js.native
  /* 0 */ val unknown: unknown with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.DevicesNs.EnumerationNs.PnpNs.PnpObjectType with scala.Double] = js.native
}

