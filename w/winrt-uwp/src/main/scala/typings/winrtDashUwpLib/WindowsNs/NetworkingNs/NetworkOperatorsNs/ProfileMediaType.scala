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
  
  val wlan: wlan with java.lang.String = js.native
  val wwan: wwan with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.ProfileMediaType with java.lang.String
  ] = js.native
}

