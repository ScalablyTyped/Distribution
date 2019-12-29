package typings.winrtDashUwp.Windows.Networking.Connectivity

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CellularApnAuthenticationType with Double] = js.native
  /* 2 */ @js.native
  object chap extends TopLevel[chap with Double]
  
  /* 3 */ @js.native
  object mschapv2 extends TopLevel[mschapv2 with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 1 */ @js.native
  object pap extends TopLevel[pap with Double]
  
}

