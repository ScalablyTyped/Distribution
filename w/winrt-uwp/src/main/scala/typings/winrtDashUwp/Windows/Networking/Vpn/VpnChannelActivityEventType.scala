package typings.winrtDashUwp.Windows.Networking.Vpn

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VpnChannelActivityEventType extends js.Object

/** Specifies the type of activity events. */
@JSGlobal("Windows.Networking.Vpn.VpnChannelActivityEventType")
@js.native
object VpnChannelActivityEventType extends js.Object {
  /** Mode in which traffic is currently being sent over the VPN channel. */
  @js.native
  sealed trait active extends VpnChannelActivityEventType
  
  /** Mode in which no traffic is being sent over the VPN channel. */
  @js.native
  sealed trait idle extends VpnChannelActivityEventType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VpnChannelActivityEventType with Double] = js.native
  /* 1 */ @js.native
  object active extends TopLevel[active with Double]
  
  /* 0 */ @js.native
  object idle extends TopLevel[idle with Double]
  
}

