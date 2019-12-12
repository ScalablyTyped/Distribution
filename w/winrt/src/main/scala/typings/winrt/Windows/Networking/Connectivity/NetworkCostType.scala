package typings.winrt.Windows.Networking.Connectivity

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.Networking.Connectivity.NetworkCostType.fixed
import typings.winrt.Windows.Networking.Connectivity.NetworkCostType.unknown
import typings.winrt.Windows.Networking.Connectivity.NetworkCostType.unrestricted
import typings.winrt.Windows.Networking.Connectivity.NetworkCostType.variable
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

