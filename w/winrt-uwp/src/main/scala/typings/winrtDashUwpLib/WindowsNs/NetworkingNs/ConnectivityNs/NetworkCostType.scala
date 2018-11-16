package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NetworkCostType extends js.Object

/** Defines the network cost types. */
@JSGlobal("Windows.Networking.Connectivity.NetworkCostType")
@js.native
object NetworkCostType extends js.Object {
  /** The use of this connection is unrestricted up to a specific limit. */
  @js.native
  sealed trait fixed
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkCostType
  
  /** Cost information is not available. */
  @js.native
  sealed trait unknown
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkCostType
  
  /** The connection is unlimited and has unrestricted usage charges and capacity constraints. */
  @js.native
  sealed trait unrestricted
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkCostType
  
  /** The connection is costed on a per-byte basis. */
  @js.native
  sealed trait variable
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkCostType
  
  val fixed: fixed with java.lang.String = js.native
  val unknown: unknown with java.lang.String = js.native
  val unrestricted: unrestricted with java.lang.String = js.native
  val variable: variable with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkCostType with java.lang.String
  ] = js.native
}

