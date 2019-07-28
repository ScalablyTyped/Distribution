package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait QueryResultType extends js.Object

@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "QueryResultType")
@js.native
object QueryResultType extends js.Object {
  /**
    * A list of work items (for flat queries).
    */
  @js.native
  sealed trait WorkItem extends QueryResultType
  
  /**
    * A list of work item links (for OneHop and Tree queries).
    */
  @js.native
  sealed trait WorkItemLink extends QueryResultType
  
  /* 1 */ val WorkItem: typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.QueryResultType.WorkItem with Double = js.native
  /* 2 */ val WorkItemLink: typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.QueryResultType.WorkItemLink with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[QueryResultType with Double] = js.native
}

