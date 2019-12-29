package typings.winrtDashUwp.Windows.Networking.Connectivity

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NetworkCostType with Double] = js.native
  /* 2 */ @js.native
  object fixed extends TopLevel[fixed with Double]
  
  /* 0 */ @js.native
  object unknown extends TopLevel[unknown with Double]
  
  /* 1 */ @js.native
  object unrestricted extends TopLevel[unrestricted with Double]
  
  /* 3 */ @js.native
  object variable extends TopLevel[variable with Double]
  
}

