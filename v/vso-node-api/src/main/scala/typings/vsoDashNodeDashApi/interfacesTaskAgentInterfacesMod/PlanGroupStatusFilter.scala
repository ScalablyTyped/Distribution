package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PlanGroupStatusFilter extends js.Object

@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "PlanGroupStatusFilter")
@js.native
object PlanGroupStatusFilter extends js.Object {
  @js.native
  sealed trait All extends PlanGroupStatusFilter
  
  @js.native
  sealed trait Queued extends PlanGroupStatusFilter
  
  @js.native
  sealed trait Running extends PlanGroupStatusFilter
  
  /* 3 */ val All: typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.PlanGroupStatusFilter.All with Double = js.native
  /* 2 */ val Queued: typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.PlanGroupStatusFilter.Queued with Double = js.native
  /* 1 */ val Running: typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.PlanGroupStatusFilter.Running with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PlanGroupStatusFilter with Double] = js.native
}

