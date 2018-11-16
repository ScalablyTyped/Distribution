package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.VpnNs

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
  sealed trait receive
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.VpnNs.VpnDataPathType
  
  /** Not supported. */
  @js.native
  sealed trait send
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.VpnNs.VpnDataPathType
  
  val receive: receive with java.lang.String = js.native
  val send: send with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.NetworkingNs.VpnNs.VpnDataPathType with java.lang.String
  ] = js.native
}

