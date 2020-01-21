package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PlanGroupStatusFilter with Double] = js.native
  /* 3 */ @js.native
  object All extends TopLevel[All with Double]
  
  /* 2 */ @js.native
  object Queued extends TopLevel[Queued with Double]
  
  /* 1 */ @js.native
  object Running extends TopLevel[Running with Double]
  
}

