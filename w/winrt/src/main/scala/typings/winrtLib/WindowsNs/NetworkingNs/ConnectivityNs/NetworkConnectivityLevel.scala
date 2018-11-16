package typings
package winrtLib.WindowsNs.NetworkingNs.ConnectivityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NetworkConnectivityLevel extends js.Object

@JSGlobal("Windows.Networking.Connectivity.NetworkConnectivityLevel")
@js.native
object NetworkConnectivityLevel extends js.Object {
  @js.native
  sealed trait constrainedInternetAccess
    extends winrtLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkConnectivityLevel
  
  @js.native
  sealed trait internetAccess
    extends winrtLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkConnectivityLevel
  
  @js.native
  sealed trait localAccess
    extends winrtLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkConnectivityLevel
  
  @js.native
  sealed trait none
    extends winrtLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkConnectivityLevel
  
  val constrainedInternetAccess: constrainedInternetAccess with java.lang.String = js.native
  val internetAccess: internetAccess with java.lang.String = js.native
  val localAccess: localAccess with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkConnectivityLevel with java.lang.String
  ] = js.native
}

