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
  
  /* 2 */ val chap: chap with scala.Double = js.native
  /* 3 */ val mschapv2: mschapv2 with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 1 */ val pap: pap with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.CellularApnAuthenticationType with scala.Double
  ] = js.native
}

