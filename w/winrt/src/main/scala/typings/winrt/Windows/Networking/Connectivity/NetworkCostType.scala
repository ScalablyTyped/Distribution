package typings.winrt.Windows.Networking.Connectivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NetworkCostType extends StObject
@JSGlobal("Windows.Networking.Connectivity.NetworkCostType")
@js.native
object NetworkCostType extends StObject {
  
  @js.native
  sealed trait fixed
    extends StObject
       with NetworkCostType
  
  @js.native
  sealed trait unknown
    extends StObject
       with NetworkCostType
  
  @js.native
  sealed trait unrestricted
    extends StObject
       with NetworkCostType
  
  @js.native
  sealed trait variable
    extends StObject
       with NetworkCostType
}
