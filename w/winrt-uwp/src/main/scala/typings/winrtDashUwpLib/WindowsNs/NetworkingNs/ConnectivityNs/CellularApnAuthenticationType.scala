package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CellularApnAuthenticationType extends js.Object

/** Defines values that indicate the authentication type used for a APN. These values are referenced when providing APN details using a CellularApnContext object. */
@JSGlobal("Windows.Networking.Connectivity.CellularApnAuthenticationType")
@js.native
object CellularApnAuthenticationType extends js.Object {
  /** Challenge-Handshake authentication. */
  @js.native
  sealed trait chap
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.CellularApnAuthenticationType
  
  /** Microsoft Challenge-Handshake authentication (v2) */
  @js.native
  sealed trait mschapv2
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.CellularApnAuthenticationType
  
  /** No authentication. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.CellularApnAuthenticationType
  
  /** Password authentication. */
  @js.native
  sealed trait pap
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.CellularApnAuthenticationType
  
  val chap: chap with java.lang.String = js.native
  val mschapv2: mschapv2 with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val pap: pap with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.CellularApnAuthenticationType with java.lang.String
  ] = js.native
}

