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
  
  /* 2 */ val fixed: fixed with scala.Double = js.native
  /* 0 */ val unknown: unknown with scala.Double = js.native
  /* 1 */ val unrestricted: unrestricted with scala.Double = js.native
  /* 3 */ val variable: variable with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkCostType with scala.Double] = js.native
}

