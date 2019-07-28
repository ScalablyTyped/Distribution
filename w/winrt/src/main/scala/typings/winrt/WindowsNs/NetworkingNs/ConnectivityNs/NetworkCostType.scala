package typings.winrt.WindowsNs.NetworkingNs.ConnectivityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NetworkCostType extends js.Object

@JSGlobal("Windows.Networking.Connectivity.NetworkCostType")
@js.native
object NetworkCostType extends js.Object {
  @js.native
  sealed trait fixed extends NetworkCostType
  
  @js.native
  sealed trait unknown extends NetworkCostType
  
  @js.native
  sealed trait unrestricted extends NetworkCostType
  
  @js.native
  sealed trait variable extends NetworkCostType
  
  /* 2 */ val fixed: typings.winrt.WindowsNs.NetworkingNs.ConnectivityNs.NetworkCostType.fixed with Double = js.native
  /* 0 */ val unknown: typings.winrt.WindowsNs.NetworkingNs.ConnectivityNs.NetworkCostType.unknown with Double = js.native
  /* 1 */ val unrestricted: typings.winrt.WindowsNs.NetworkingNs.ConnectivityNs.NetworkCostType.unrestricted with Double = js.native
  /* 3 */ val variable: typings.winrt.WindowsNs.NetworkingNs.ConnectivityNs.NetworkCostType.variable with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NetworkCostType with Double] = js.native
}

