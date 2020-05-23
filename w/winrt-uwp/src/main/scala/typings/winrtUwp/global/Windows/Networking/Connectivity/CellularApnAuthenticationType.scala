package typings.winrtUwp.global.Windows.Networking.Connectivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines values that indicate the authentication type used for a APN. These values are referenced when providing APN details using a CellularApnContext object. */
@JSGlobal("Windows.Networking.Connectivity.CellularApnAuthenticationType")
@js.native
object CellularApnAuthenticationType extends js.Object {
  /* 2 */ val chap: typings.winrtUwp.Windows.Networking.Connectivity.CellularApnAuthenticationType.chap with Double = js.native
  /* 3 */ val mschapv2: typings.winrtUwp.Windows.Networking.Connectivity.CellularApnAuthenticationType.mschapv2 with Double = js.native
  /* 0 */ val none: typings.winrtUwp.Windows.Networking.Connectivity.CellularApnAuthenticationType.none with Double = js.native
  /* 1 */ val pap: typings.winrtUwp.Windows.Networking.Connectivity.CellularApnAuthenticationType.pap with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.Networking.Connectivity.CellularApnAuthenticationType with Double
  ] = js.native
}

