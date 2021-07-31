package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PlanGroupStatusFilter extends StObject
@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "PlanGroupStatusFilter")
@js.native
object PlanGroupStatusFilter extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PlanGroupStatusFilter & Double] = js.native
  
  @js.native
  sealed trait All
    extends StObject
       with PlanGroupStatusFilter
  /* 3 */ val All: typings.vsoNodeApi.taskAgentInterfacesMod.PlanGroupStatusFilter.All & Double = js.native
  
  @js.native
  sealed trait Queued
    extends StObject
       with PlanGroupStatusFilter
  /* 2 */ val Queued: typings.vsoNodeApi.taskAgentInterfacesMod.PlanGroupStatusFilter.Queued & Double = js.native
  
  @js.native
  sealed trait Running
    extends StObject
       with PlanGroupStatusFilter
  /* 1 */ val Running: typings.vsoNodeApi.taskAgentInterfacesMod.PlanGroupStatusFilter.Running & Double = js.native
}
