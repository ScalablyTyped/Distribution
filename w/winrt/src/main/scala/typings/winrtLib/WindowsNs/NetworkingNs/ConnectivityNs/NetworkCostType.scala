package typings
package winrtLib.WindowsNs.NetworkingNs.ConnectivityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NetworkCostType extends js.Object

@JSGlobal("Windows.Networking.Connectivity.NetworkCostType")
@js.native
object NetworkCostType extends js.Object {
  @js.native
  sealed trait fixed
    extends winrtLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkCostType
  
  @js.native
  sealed trait unknown
    extends winrtLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkCostType
  
  @js.native
  sealed trait unrestricted
    extends winrtLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkCostType
  
  @js.native
  sealed trait variable
    extends winrtLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkCostType
  
  val fixed: fixed with java.lang.String = js.native
  val unknown: unknown with java.lang.String = js.native
  val unrestricted: unrestricted with java.lang.String = js.native
  val variable: variable with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkCostType with java.lang.String
  ] = js.native
}

