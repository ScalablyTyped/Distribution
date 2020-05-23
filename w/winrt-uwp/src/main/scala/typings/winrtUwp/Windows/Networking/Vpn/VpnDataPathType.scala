package typings.winrtUwp.Windows.Networking.Vpn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VpnDataPathType extends js.Object

/** VpnDataPathType is not supported and may be altered or unavailable in the future. */
@JSGlobal("Windows.Networking.Vpn.VpnDataPathType")
@js.native
object VpnDataPathType extends js.Object {
  /** Not supported. */
  @js.native
  sealed trait receive extends VpnDataPathType
  
  /** Not supported. */
  @js.native
  sealed trait send extends VpnDataPathType
  
}

