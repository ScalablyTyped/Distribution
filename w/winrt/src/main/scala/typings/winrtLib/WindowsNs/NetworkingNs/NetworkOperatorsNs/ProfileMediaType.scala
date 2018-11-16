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
  
  val wlan: wlan with java.lang.String = js.native
  val wwan: wwan with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.ProfileMediaType with java.lang.String
  ] = js.native
}

