package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PlanGroupStatusFilter extends StObject
@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "PlanGroupStatusFilter")
@js.native
object PlanGroupStatusFilter extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PlanGroupStatusFilter with Double] = js.native
  
  @js.native
  sealed trait All extends PlanGroupStatusFilter
  /* 3 */ val All: typings.vsoNodeApi.taskAgentInterfacesMod.PlanGroupStatusFilter.All with Double = js.native
  
  @js.native
  sealed trait Queued extends PlanGroupStatusFilter
  /* 2 */ val Queued: typings.vsoNodeApi.taskAgentInterfacesMod.PlanGroupStatusFilter.Queued with Double = js.native
  
  @js.native
  sealed trait Running extends PlanGroupStatusFilter
  /* 1 */ val Running: typings.vsoNodeApi.taskAgentInterfacesMod.PlanGroupStatusFilter.Running with Double = js.native
}
