package typings
package winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ProfileMediaType extends js.Object

@JSGlobal("Windows.Networking.NetworkOperators.ProfileMediaType")
@js.native
object ProfileMediaType extends js.Object {
  @js.native
  sealed trait wlan
    extends winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.ProfileMediaType
  
  @js.native
  sealed trait wwan
    extends winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.ProfileMediaType
  
  /* 0 */ val wlan: wlan with scala.Double = js.native
  /* 1 */ val wwan: wwan with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.ProfileMediaType with scala.Double
  ] = js.native
}

