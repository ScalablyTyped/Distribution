package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ProfileMediaType extends js.Object

/** Describes network types for provisioned network connectivity profiles. */
@JSGlobal("Windows.Networking.NetworkOperators.ProfileMediaType")
@js.native
object ProfileMediaType extends js.Object {
  /** The profile is for a wireless local area network (WLAN). */
  @js.native
  sealed trait wlan
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.ProfileMediaType
  
  /** The profile is for a wireless wide area network (WWAN). */
  @js.native
  sealed trait wwan
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.ProfileMediaType
  
  /* 0 */ val wlan: wlan with scala.Double = js.native
  /* 1 */ val wwan: wwan with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.ProfileMediaType with scala.Double
  ] = js.native
}

