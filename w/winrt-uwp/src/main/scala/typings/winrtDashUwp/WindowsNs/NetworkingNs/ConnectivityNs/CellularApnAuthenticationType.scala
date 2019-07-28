package typings.winrtDashUwp.WindowsNs.NetworkingNs.ConnectivityNs

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
  sealed trait chap extends CellularApnAuthenticationType
  
  /** Microsoft Challenge-Handshake authentication (v2) */
  @js.native
  sealed trait mschapv2 extends CellularApnAuthenticationType
  
  /** No authentication. */
  @js.native
  sealed trait none extends CellularApnAuthenticationType
  
  /** Password authentication. */
  @js.native
  sealed trait pap extends CellularApnAuthenticationType
  
  /* 2 */ val chap: typings.winrtDashUwp.WindowsNs.NetworkingNs.ConnectivityNs.CellularApnAuthenticationType.chap with Double = js.native
  /* 3 */ val mschapv2: typings.winrtDashUwp.WindowsNs.NetworkingNs.ConnectivityNs.CellularApnAuthenticationType.mschapv2 with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.WindowsNs.NetworkingNs.ConnectivityNs.CellularApnAuthenticationType.none with Double = js.native
  /* 1 */ val pap: typings.winrtDashUwp.WindowsNs.NetworkingNs.ConnectivityNs.CellularApnAuthenticationType.pap with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CellularApnAuthenticationType with Double] = js.native
}

