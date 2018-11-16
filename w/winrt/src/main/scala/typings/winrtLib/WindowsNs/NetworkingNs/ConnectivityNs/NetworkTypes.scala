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
  
  val internet: internet with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val privateNetwork: privateNetwork with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkTypes with java.lang.String
  ] = js.native
}

