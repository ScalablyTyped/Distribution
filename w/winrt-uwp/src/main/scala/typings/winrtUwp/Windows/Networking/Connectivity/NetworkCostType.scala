package typings.winrtUwp.Windows.Networking.Connectivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NetworkCostType extends StObject
/** Defines the network cost types. */
@JSGlobal("Windows.Networking.Connectivity.NetworkCostType")
@js.native
object NetworkCostType extends StObject {
  
  /** The use of this connection is unrestricted up to a specific limit. */
  @js.native
  sealed trait fixed
    extends StObject
       with NetworkCostType
  
  /** Cost information is not available. */
  @js.native
  sealed trait unknown
    extends StObject
       with NetworkCostType
  
  /** The connection is unlimited and has unrestricted usage charges and capacity constraints. */
  @js.native
  sealed trait unrestricted
    extends StObject
       with NetworkCostType
  
  /** The connection is costed on a per-byte basis. */
  @js.native
  sealed trait variable
    extends StObject
       with NetworkCostType
}
