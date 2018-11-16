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
  
  val device: device with java.lang.String = js.native
  val deviceContainer: deviceContainer with java.lang.String = js.native
  val deviceInterface: deviceInterface with java.lang.String = js.native
  val deviceInterfaceClass: deviceInterfaceClass with java.lang.String = js.native
  val unknown: unknown with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.DevicesNs.EnumerationNs.PnpNs.PnpObjectType with java.lang.String
  ] = js.native
}

