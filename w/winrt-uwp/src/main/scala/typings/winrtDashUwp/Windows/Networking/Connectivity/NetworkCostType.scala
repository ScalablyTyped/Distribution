package typings.winrtDashUwp.Windows.Networking.Connectivity

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
  sealed trait fixed extends NetworkCostType
  
  /** Cost information is not available. */
  @js.native
  sealed trait unknown extends NetworkCostType
  
  /** The connection is unlimited and has unrestricted usage charges and capacity constraints. */
  @js.native
  sealed trait unrestricted extends NetworkCostType
  
  /** The connection is costed on a per-byte basis. */
  @js.native
  sealed trait variable extends NetworkCostType
  
  /* 2 */ val fixed: typings.winrtDashUwp.Windows.Networking.Connectivity.NetworkCostType.fixed with Double = js.native
  /* 0 */ val unknown: typings.winrtDashUwp.Windows.Networking.Connectivity.NetworkCostType.unknown with Double = js.native
  /* 1 */ val unrestricted: typings.winrtDashUwp.Windows.Networking.Connectivity.NetworkCostType.unrestricted with Double = js.native
  /* 3 */ val variable: typings.winrtDashUwp.Windows.Networking.Connectivity.NetworkCostType.variable with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NetworkCostType with Double] = js.native
}

