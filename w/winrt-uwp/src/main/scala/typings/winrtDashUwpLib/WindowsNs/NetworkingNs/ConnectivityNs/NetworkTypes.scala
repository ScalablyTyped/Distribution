package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NetworkTypes extends js.Object

/** Defines the network connection types. */
@JSGlobal("Windows.Networking.Connectivity.NetworkTypes")
@js.native
object NetworkTypes extends js.Object {
  /** Internet. */
  @js.native
  sealed trait internet
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkTypes
  
  /** No network. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkTypes
  
  /** Private network. */
  @js.native
  sealed trait privateNetwork
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkTypes
  
  val internet: internet with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val privateNetwork: privateNetwork with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkTypes with java.lang.String
  ] = js.native
}

