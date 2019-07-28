package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait QueryRecursionOption extends js.Object

@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "QueryRecursionOption")
@js.native
object QueryRecursionOption extends js.Object {
  /**
    * Returns work items that satisfy the target criteria, even if no work item satisfies the source and link criteria.
    */
  @js.native
  sealed trait ChildFirst extends QueryRecursionOption
  
  /**
    * Returns work items that satisfy the source, even if no linked work item satisfies the target and link criteria.
    */
  @js.native
  sealed trait ParentFirst extends QueryRecursionOption
  
  /* 1 */ val ChildFirst: typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.QueryRecursionOption.ChildFirst with Double = js.native
  /* 0 */ val ParentFirst: typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.QueryRecursionOption.ParentFirst with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[QueryRecursionOption with Double] = js.native
}

