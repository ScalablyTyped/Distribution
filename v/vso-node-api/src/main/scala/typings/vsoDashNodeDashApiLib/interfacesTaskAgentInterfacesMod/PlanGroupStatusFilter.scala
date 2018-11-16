package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PlanGroupStatusFilter extends js.Object

@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "PlanGroupStatusFilter")
@js.native
object PlanGroupStatusFilter extends js.Object {
  @js.native
  sealed trait All
    extends vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.PlanGroupStatusFilter
  
  @js.native
  sealed trait Queued
    extends vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.PlanGroupStatusFilter
  
  @js.native
  sealed trait Running
    extends vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.PlanGroupStatusFilter
  
  /* 3 */ val All: All with scala.Double = js.native
  /* 2 */ val Queued: Queued with scala.Double = js.native
  /* 1 */ val Running: Running with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.PlanGroupStatusFilter with scala.Double
  ] = js.native
}

