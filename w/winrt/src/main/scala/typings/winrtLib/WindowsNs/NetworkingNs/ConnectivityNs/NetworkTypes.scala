package typings
package winrtLib.WindowsNs.NetworkingNs.ConnectivityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NetworkTypes extends js.Object

@JSGlobal("Windows.Networking.Connectivity.NetworkTypes")
@js.native
object NetworkTypes extends js.Object {
  @js.native
  sealed trait internet
    extends winrtLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkTypes
  
  @js.native
  sealed trait none
    extends winrtLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkTypes
  
  @js.native
  sealed trait privateNetwork
    extends winrtLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkTypes
  
  /* 1 */ val internet: internet with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 2 */ val privateNetwork: privateNetwork with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkTypes with scala.Double] = js.native
}

